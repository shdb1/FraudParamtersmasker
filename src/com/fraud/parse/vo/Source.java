package com.fraud.parse.vo;

public class Source
{
    private RequestOrigin requestOrigin;

    private Client client;

    public RequestOrigin getRequestOrigin ()
    {
        return requestOrigin;
    }

    public void setRequestOrigin (RequestOrigin requestOrigin)
    {
        this.requestOrigin = requestOrigin;
    }

    public Client getClient ()
    {
        return client;
    }

    public void setClient (Client client)
    {
        this.client = client;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [requestOrigin = "+requestOrigin+", client = "+client+"]";
    }
}
			
		