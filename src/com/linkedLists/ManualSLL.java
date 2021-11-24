package com.linkedLists;

import java.util.Scanner;

public class ManualSLL
{


    public static  void testLinkedList(LinkedList linkedList)
    {
        for(Node i = linkedList.head; i!= null ;i = i.getNextNodeReference())
        {
            System.out.println(i.getData());
        }
        System.out.println("============================");
        System.out.println(linkedList.size);
        System.out.println("============================");
        if(linkedList.size >0)
        {
            System.out.println(linkedList.tail.getData());
        }
        System.out.println("============================");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int totalNodes =  scanner.nextInt();
        LinkedList linkedList = new LinkedList();
        for(int i = 1;i<= totalNodes;i++)
        {
            linkedList.addInLast(scanner.nextInt());
        }
        testLinkedList(linkedList);

       /* linkedList.addInLast(100);
        testLinkedList(linkedList);
        linkedList.removeFirst();
        testLinkedList(linkedList);
        System.out.println("getting value at index 3 :  "+ linkedList.getValueAt(3));
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&");
        linkedList.addInFirst(66);
        testLinkedList(linkedList);

        linkedList.removeAtLast(linkedList);
        testLinkedList(linkedList);

        linkedList.AddValueAtIndex(3,999);
        testLinkedList(linkedList);
        linkedList.removeValueAtIndex(3,linkedList);
        testLinkedList(linkedList);*/

        //linkedList.ReverseDataOfLinkLIst(linkedList);
        linkedList.reverseAddressOfLinkList(linkedList);

        testLinkedList(linkedList);

    }


}
