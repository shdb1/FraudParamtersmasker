package com.fraud.parse.vo;


public class RequestOrigin
{
private String channelType;

public String getChannelType ()
{
return channelType;
}

public void setChannelType (String channelType)
{
this.channelType = channelType;
}

@Override
public String toString()
{
return "ClassPojo [channelType = "+channelType+"]";
}
}