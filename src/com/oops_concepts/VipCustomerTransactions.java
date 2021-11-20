package com.oops_concepts;

import com.beans.VipCustomerOfBank;

public class VipCustomerTransactions
{
    public static void main(String[] args) {

        VipCustomerOfBank vipCustomerOfBank = new VipCustomerOfBank();
        System.out.println(vipCustomerOfBank.getmUserName()+ " "+ vipCustomerOfBank.getmEmailAddress()+ " "+ vipCustomerOfBank.getCreditLimt());
        VipCustomerOfBank vipCustomerOfBank1 = new VipCustomerOfBank("Deep Singh","deep@gmail.com");
        System.out.println(vipCustomerOfBank1.getmUserName()+ " "+ vipCustomerOfBank1.getmEmailAddress()+ " "+ vipCustomerOfBank1.getCreditLimt());


    }
}
