package com.arrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone
{
    Scanner scanner = new Scanner(System.in);
    //String myNUmber;
    ArrayList<Contacts> contactsArrayList;

    public MobilePhone() {
       /* this.myNUmber = myNUmber;*/
        this.contactsArrayList = new ArrayList<>();


    }
    //store ,modify,remove,qwery
    public   void  modifyContact(String phoneNumber)
    {
       for(int i= 0;i<contactsArrayList.size();i++)
       {
           if(contactsArrayList.get(i).getPhoneNumber().equalsIgnoreCase(phoneNumber))
           {

               System.out.println("Enter the new Name For the contact number");
               String  newName = scanner.next();
               Contacts contacts = contactsArrayList.get(i);
               contacts.setName(newName );
               contactsArrayList.set(i,contacts);
               for(Contacts contacts1: this.contactsArrayList)
                   System.out.println(contacts1.getName()+"  "+contacts1.getPhoneNumber());
                   break;

           }else
               System.out.println("no such entry available here !!");
       }

    }


    public void addContactstoList(String name,String phoneNumber)
    {
        Contacts contacts = new Contacts().createContact(name,phoneNumber);
        this.contactsArrayList.add(0,contacts);
       for(Contacts contacts1: this.contactsArrayList)
           System.out.println(contacts1.getName()+"  "+contacts1.getPhoneNumber());

    }

    public void getAllContactList()
    {
        System.out.println("size here is"+ this.contactsArrayList.size());
        if(this.contactsArrayList.size()>0)
        {
           for (Contacts contacts : this.contactsArrayList)
               System.out.println(contacts.getName()+"  "+contacts.getPhoneNumber());
        }
    }


    public Contacts getRequiredbean(int nameIndex)
    {
        return this.contactsArrayList.get(nameIndex);
    }
    public int searchContact(String name)
    {
        int val = -1;
        for(int k = 0;k< this.contactsArrayList.size();k++)
        {
            if(this.contactsArrayList.get(k).getName().equalsIgnoreCase(name))
            {
                return val = k;
            }else
                System.out.println("sorry !! no such user available");
        }
        return val;
    }
    public ArrayList<Contacts> removeThatBean(Contacts contacts)
    {
        this.contactsArrayList.remove(contacts);
        return  this.contactsArrayList;
    }
}