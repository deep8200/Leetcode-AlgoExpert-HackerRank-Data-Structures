package com.stack;

import java.util.Scanner;

public class DynamicStackUsingArray
{
    public static void main(String[] args) {
        int choice=0;
        Scanner sc = new Scanner(System.in);
        DynamicStack dmstack = new DynamicStack(3);
        System.out.println("*********Stack operations using array*********\n");
        System.out.println("\n------------------------------------------------\n");
        while(choice != 5)
        {
            System.out.println("\nChose one from the below options...\n");
            System.out.println("\n1.Push\n2.Pop\n3.Show\n4.Size\n5.Exit");
            System.out.println("\n Enter your choice \n");
            choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                {
                    dmstack.push(sc);
                    break;
                }
                case 2:
                {
                    dmstack.pop();
                    break;
                }
                case 3:
                {
                    dmstack.display();
                    break;
                }
                case 4:
                {
                    System.out.println("Stack Size is...."+  dmstack.size());
                    break;
                } case 5:
            {
                System.out.println("Exiting....");
                System.exit(0);
                break;
            }
                default:
                {
                    System.out.println("Please Enter valid choice ");
                }
            }
        }
    }

}
