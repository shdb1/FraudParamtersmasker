package com.fraud.parse;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fraud.parse.vo.FraudParameters;
import com.fraud.parse.vo.JsonDataObject;
import com.fraud.parse.vo.Parameters;

public class Parser {
	private static final String GROUP_IDENTIFICATION_GROUP = "identification_info";
	private static final String GROUP_BILLING_INFO = "billing_info";

	public static void main(String[] args) {

		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);

		try {
			// reading json file
			JsonDataObject jsonDataObject = mapper.readValue(new File("./resources/input/input.json"),
					JsonDataObject.class);

			// reading identification/billing info parameters to mask
			FraudParameters[] fraudParametersArray = jsonDataObject.getRequestDetails().getFraudDescriptor()
					.getFraudParameters();
			for (FraudParameters fraudParameters : fraudParametersArray) {
				if (fraudParameters.getParameterGroupName().equalsIgnoreCase(GROUP_IDENTIFICATION_GROUP)
						|| fraudParameters.getParameterGroupName().equalsIgnoreCase(GROUP_BILLING_INFO)) {
					Parameters[] parametersArray = fraudParameters.getParameters();
					for (Parameters parameter : parametersArray) {
						parameter.setValue(maskString(parameter.getValue(), '*'));

					}
				}
			}
			// write output
			mapper.writeValue(new File("./resources/output/output.json"), jsonDataObject);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static String maskString(String data, char maskChar) {

		StringBuilder sbMaskString = new StringBuilder();

		for (int i = 0; i < data.length(); i++) {
			sbMaskString.append(maskChar);
		}

		return sbMaskString.toString();
	}
}
