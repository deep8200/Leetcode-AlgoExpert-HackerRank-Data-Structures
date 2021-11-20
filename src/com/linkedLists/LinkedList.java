package com.linkedLists;

public class LinkedList
{
 Node head;
 Node tail;
 int size;



 public void removeFirst()
 {
     if(size == 0)
     {
         System.out.println("no nodes available to remove");
     }
     if(head == tail)
     {
         tail.setNextNodeReference(null);
         size--;
     }else {
       Node temp =   head.getNextNodeReference();
       head = temp;
       size--;

     }

 }

 public  void removeAtLast(LinkedList linkedList)
 {
     if(size == 0)
         System.out.println("no nodes available to remove");
     if(head == tail)
     {
         tail.setNextNodeReference(null);
         size--;
     }else {
         Node temp = head;
         for(int j = 0;j< linkedList.size-2;j++)
         {
              temp = temp.getNextNodeReference();
         }
         tail = temp;
         temp.setNextNodeReference(null);
         size--;
     }
 }
 public int getValueAt(int index)
 {
     if(size == 0)
     {
         System.out.println("there's nothing in linkedlist");
         return  -1;

     }else if(index <0 || index >=size)
     {
         System.out.println("invalid index for value retreival");
         return  -2;
     }else {
         Node temp = head;
         for(int i = 0;i< index ;i++)
         {
             temp = temp.getNextNodeReference();
         }
         return  temp.getData();
     }
 }

 public void addInFirst(int value)
 {
     Node temp = new Node();
     temp.setData(value);

     if (size == 0)
     {
         temp.setNextNodeReference(null);
         head  = tail= temp;


     }else {
         temp.setNextNodeReference(head);
        head = temp;
     }
     size++;
 }

    public void addInLast(int value)
    {
        Node temp = new Node();
        temp.setData(value);
        temp.setNextNodeReference(null);
        if(size == 0)
        {

            head = tail = temp;

        }else {
            //purani wali tail k nextReference me ab temp ka reference add kardo ,,coz temp is going to be last
            tail.setNextNodeReference(temp);

            //aur yaha temp ko tail bana do;
           tail = temp;
        }
        size++;
    }


    public void AddValueAtIndex(int index, int data)
    {
        if(index < 0 || index >= size )
        {
            System.out.println("invalid index for value retreival");
        }else  if(index == 0)
            addInFirst(data);
        else if(index == size-1)
            addInLast(data);
        else
        {
            Node newNode = new Node();
            newNode.setData(data);
            Node temp = head;
            for(int i = 0;i< index -1 ;i++)
            {
                temp = temp.getNextNodeReference();
            }
            newNode.setNextNodeReference(temp.getNextNodeReference());
            temp.setNextNodeReference(newNode);
            size++;
        }
    }
    public void removeValueAtIndex(int index,LinkedList linkedList)
    {
        if(index < 0 || index >= size )
        {
            System.out.println("invalid index for value retreival");
        }else  if(index == 0)
            removeFirst();
        else if(index == size-1)
            removeAtLast(linkedList);
        else
        {
            Node temp = head;
            Node prevBeforeTemp = head;
            for(int i = 0;i< index ;i++)
            {
                temp = temp.getNextNodeReference();
            }
            for (int j = 0;j < index -1;j++)
            {
                prevBeforeTemp = prevBeforeTemp.getNextNodeReference();
            }
            prevBeforeTemp.setNextNodeReference(temp.getNextNodeReference());
            temp.setNextNodeReference(null);
            size--;
        }
    }
}
