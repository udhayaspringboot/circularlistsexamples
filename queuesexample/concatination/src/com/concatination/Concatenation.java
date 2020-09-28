package com.concatination;

import java.util.Scanner;


public class Concatenation {
	
	class Node
	{
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
	
	//mergetwo
	
	public Node mergeTwoLinkLists(Node lis1, Node lis2) {
		if (lis1 == null) {
			return lis2;

		}
		if (lis2 == null) {
			return lis1;

		}
		
		Node temp = null;
	   Node r = null;
	    r = lis1;
	    temp = lis1;
	    while (temp.next != lis1)
	    
	        temp = temp.next;
	    System.out.println("first data "+temp.data);
	    
	    temp.next = lis2;
	    temp = lis2;
	    
	    System.out.println("second data "+temp.data);
	    while (temp.next != lis2)
	    
	        temp = temp.next;
	    System.out.println("third data "+temp.data);
	    temp.next = r;
	    
	    
	    return r;
	    

		
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
		
		void delete(int data)
		{
			if(head == null)
			{
				System.out.println("List is empty");
			}else
			{
				if(head == null)
				{
					System.out.println("List empty");
				}else
				{
					Node temp = head;
					Node prev =null;
					while (temp != null && temp.data != data) 
			        { 
			            prev = temp; 
			            temp = temp.next; 
			        }     
			  
			        // If key was not present in linked list 
			        if (temp == null) return; 
			  
			        // Unlink the node from linked list 
			        prev.next = temp.next; 
				}
			}
		}
		
		public static void main(String[] args)
		{
			Concatenation con = new Concatenation();
		/*
		 * con.insertToCircular(225); con.insertToCircular(335);
		 * con.insertToCircular(15); con.insertToCircular(25); con.insertToCircular(35);
		 * con.insertToCircular(115);
		 */
			
			Concatenation con1 = new Concatenation();
		/*
		 * con1.insertToCircular(26); con1.insertToCircular(16);
		 * con1.insertToCircular(36); con1.insertToCircular(76);
		 * con1.insertToCircular(86); //con.head = con.mergeTwoLinkList(con.head,
		 * con1.head); con.display(); con1.display();
		 * 
		 * con.head = con.mergeTwoLinkLists(con.head, con1.head);
		 * 
		 * con.display();
		 */
			char ch;
			 System.out.println("********* Circular Linked List operations *********\n");  
			    System.out.println("\n------------------------------------------------\n");  
			    do
			    {  
			        System.out.println("\nChose one from the below options...\n");  
			        System.out.println("\n1.insert list 1 \n2.insert list 2 \n3.Show list 1  \n4.concatinated list \n5.delete \n6.show list2");  
			        System.out.println("\n Enter your choice \n");     
			        Scanner sc = new Scanner(System.in);
			      int  choice = sc.nextInt();  
			        switch(choice)  
			        {  
			            case 1:  
			            {   System.out.println("Enter the element to insert for list 1");
		                 int val =  sc.nextInt();
		                 con.insertToCircular(val);
		                break;  
		            }  
		            case 2:  
		            {   System.out.println("Enter the element to insert for list 2");
	                 int val =  sc.nextInt();
	                 con1.insertToCircular(val);
		                break;  
		            }  
		            case 3:  
		            {  
		            	con.display();
		                break;  
		            }  
		            case 4:  
		            {  
		            	System.out.println("Merged list is");
		            	
		            	con.head = con.mergeTwoLinkLists(con.head, con1.head);
		    			
		    			con.display();
		                break;  
		            }  
		            case 5:  
		            {  
		            	System.out.println("Enter  element to deleted ");
		            	
		            	
		    			con.delete(sc.nextInt());
		    			
		                break;  
		            }  
		            case 6:  
		            {  
		            	con1.display();
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
