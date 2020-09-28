package com.circularlinkedlist;

import java.util.Scanner;

public class CircularLinkedList {
	
	class Node {
		
		int data;
		Node next;
		public Node(int data) {
			super();
			this.data = data;
			this.next = null;
		}
		
		
	}
	
	private Node head =null;
	private Node tail = null;
	
	void insertToCircular(int data)
	{
		Node node = new Node(data);
		
		if(head == null)
		{
			head= node;
			tail = node;
			tail.next = head;
			System.out.println("Element is inserted");
		}
		
		else
		{
			//Node temp = tail;
			tail.next = node;
			tail = node;
			tail.next = head;
			System.out.println("Element is addded");
		}
	}

	void display()
	{
		if(head == null)
		{
			System.out.println("List is empty");
		}
		
		else
		{
			Node temp = head;
			System.out.println("vales are \n" + temp.data);
			while(temp.next != head)
			{
				System.out.println(temp.next.data);
				
				temp = temp.next;
			}
			
			
		}
	}
	
	
void circularTwo(int data)
{
	Node currentNode = head;
	 
    if (head != null) {
        if (head.data == data) {
            head = head.next;
            tail.next = head;
        } else {
            do {
            	int i=2;
                Node nextNode = currentNode.next;
                if (nextNode.data == data) {
                    currentNode.next = nextNode.next;
                    break;
                }
                currentNode = currentNode.next;
                i++;
            } while (currentNode != head );
        }
    }
}
	void search(int data)
	{
		Node currentNode = head;
		boolean val =false;
	    if (head == null) {
	    	System.out.println("List is empty");
	        
	    } else {
	        do {
	            if (currentNode.data == data) {
	              
	              val =true;
	            }
	            currentNode = currentNode.next;
	        } while (currentNode != head);
	      
	    }
	    if(val)
	    {
	    	System.out.println("Element found");
	    }else
	    {
	    	System.out.println("Element not found");
	    }
	}
	 void deleteCircular(int position)
	{
		 if (head == null) {
				System.out.println("list is empty");
			}
		 else
		 {
			 if(position == 1)
			 {
				 head = head.next;
				 tail.next = head;
			 }else
			 {
				 int i=2;
				 Node temp =head;
				 while(temp.next !=head && i<=position)
				 {
					 if(position == i)
					 {
						 temp.next = temp.next.next;
						 
					 }temp = temp.next.next;
					 i++;
					 
				 }
				
			 }
		 }

		/*
		 * Node temp = head;
		 * 
		 * if (position == 1) { head = temp.next;
		 * 
		 * 
		 * }
		 * 
		 * for (int i = 2; temp != head && i < position; i++) { temp = temp.next; }
		 * 
		 * if (temp == null || temp.next == null)
		 * 
		 * { System.err.println("position is more than number of nodes "); } else {
		 * 
		 * //Node next = head;
		 * 
		 * temp.next = head;
		 * 
		 * }
		 */
	}
	
	public static void main(String[] args)
	{
		CircularLinkedList cir = new CircularLinkedList();
		/*
		 * cir.insertToCircular(15); cir.insertToCircular(20); cir.insertToCircular(30);
		 * cir.insertToCircular(60); cir.display(); cir.circularTwo(60); cir.display();
		 * cir.search(30);
		 */
		
		char ch ;
		int choice;
		  System.out.println("********* Priority Queue operations *********\n");  
		    System.out.println("\n------------------------------------------------\n");  
		    do
		    {  
		        System.out.println("\nChose one from the below options...\n");  
		        System.out.println("\n1.insert\n2.delete\n3.Show\n4.Search");  
		        System.out.println("\n Enter your choice \n");     
		        Scanner sc = new Scanner(System.in);
		        choice = sc.nextInt();  
		        switch(choice)  
		        {  
		            case 1:  
		            {   System.out.println("Enter the element to Enqueue");
	                 int val =  sc.nextInt();
	                 cir.insertToCircular(val);
	                break;  
	            }  
	            case 2:  
	            {   System.out.println("Enter the position to delete");
                
	            	cir.deleteCircular( sc.nextInt()); 
	                break;  
	            }  
	            case 3:  
	            {  
	            	 cir.display();
	                break;  
	            }  
	            case 4:  
	            {  
	            	System.out.println("Enter the element to search");
	            	
	            	cir.search(sc.nextInt());
	                break;  
	            }  
	            default:  
	            {  
	                System.out.println("Please Enter valid choice ");  
	            }  
	        }
	            System.out.println("\nDo you want to continue ? (Y/N)");
				Scanner acb = new Scanner(System.in);
				ch = acb.next().charAt(0);
			
	    }while (ch == 'y' || ch == 'Y');
	        
	}
	
}
