package com.beans;

public class VipCustomerOfBank
{
    String mUserName,mEmailAddress;
    float creditLimt;


    public VipCustomerOfBank()
    {
        this("dummyUser","dummy@gmail.com",5000.0f);
    }

    public VipCustomerOfBank(String mUserName, String mEmailAddress) {
        /*this.mUserName = mUserName;
        this.mEmailAddress = mEmailAddress;*/
        this(mUserName,mEmailAddress,6000.0f);
    }

    public VipCustomerOfBank(String mUserName, String mEmailAddress, float creditLimt) {
        this.mUserName = mUserName;
        this.mEmailAddress = mEmailAddress;
        this.creditLimt = creditLimt;
    }

    public String getmUserName() {
         return mUserName;
    }

    public String getmEmailAddress() {
        return mEmailAddress;
    }

    public float getCreditLimt() {
        return creditLimt;
    }
}
