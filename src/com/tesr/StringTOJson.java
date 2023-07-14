package com.tesr;

import com.tesr.packgaeA.Message;

public class StringTOJson extends Message
{
    String getMessage()
    {
        return "Alpha-text";

    }
    public static void main(String[] args) {

        System.out.println(new StringTOJson().getMessage());

    }
}
