package com.arrayLists;

import java.util.Scanner;

public class Contact_in_mobile_Implementation
{


   static Scanner scanner = new Scanner(System.in);
    static  MobilePhone mobilePhone = new MobilePhone();
    public static void main(String[] args)
    {
        while(true)
        {
            int userChoice = scanner.nextInt();
            Contact_in_mobile_Implementation  contact_in_mobile_implementation = new Contact_in_mobile_Implementation();
            contact_in_mobile_implementation.inoutUserChoice(userChoice);
        }

    }

    private  void inoutUserChoice( int userChoice)
    {
        switch (userChoice) {
            case 1 -> {
                System.out.println("enter the name of user");
                String userName = scanner.next();
                System.out.println("enter the number of user");
                String mobileNumber = scanner.next();
                mobilePhone.addContactstoList(userName, mobileNumber);
            }
            case 2 -> {
                System.out.println("enter the mobile number which you  want to modify");
                String userInput = scanner.next();
                mobilePhone.modifyContact(userInput);
            }

            case 3 -> gettingTheData();
            case 4->toQuit();

            case 5 ->
                    {
                        System.out.println("okay !!! so we are removing one contact ???");
                        System.out.println("Cool !!Enter the name of contact to be removed");
                        String toBERemovedUser = scanner.next();
                       if(mobilePhone.searchContact(toBERemovedUser) >-1){
                           mobilePhone.removeThatBean(mobilePhone.getRequiredbean(mobilePhone.searchContact(toBERemovedUser)));
                       }
                      gettingTheData();

                    }
        }
    }

    public void  gettingTheData()
    {
        System.out.println("getting the whole contacts for you !!");
        mobilePhone.getAllContactList();
    }


    private static void toQuit()
    {

        System.out.println("will be exiting now !!!!");
        scanner.nextLine(); System.exit(0);
    }
}
