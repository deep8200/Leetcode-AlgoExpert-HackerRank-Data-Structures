package com.stack;

import java.util.Scanner;

public class BuildCustomStack
{

    public static void main(String[] args) {
        int choice=0;
        Scanner sc = new Scanner(System.in);
        CustomStack customstack = new CustomStack(5);
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
                    customstack.push(sc);
                    break;
                }
                case 2:
                {
                    customstack.pop();
                    break;
                }
                case 3:
                {
                    customstack.display();
                    break;
                }
                case 4:
                {
                    System.out.println("Stack Size is...."+  customstack.size());
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
