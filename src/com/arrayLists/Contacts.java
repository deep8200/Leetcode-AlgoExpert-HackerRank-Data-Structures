package com.arrayLists;

public class Contacts
{
    String name,phoneNumber;
    public Contacts() {
    }

    public Contacts(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Contacts createContact(String name,String phoneNumber)
    {
   return new Contacts(name,phoneNumber);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
