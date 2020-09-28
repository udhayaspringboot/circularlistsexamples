package com.headerlinkedlist;

import java.util.Scanner;

public class HeaderLinkedList {
	
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
	
	private Node head = null;
	
	void insert(int data)
	{
		Node node = new Node(data);
		Node temp = head;
		node.next = null;
		
		// If it is the first node 
	    if (head == null) { 
	  
	        // Initialize the start 
	        head = node;
	      
	    } 
	    else { 
	  
	        // Insert the node in the end 
	         
	        while (temp.next != null) { 
	            temp = temp.next; 
	        } 
	        temp.next = node; 
	    } 
	   
	} 
	
	void delete(int data)
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
	
	void display()
	{
		if(head == null)
		{
			System.out.println("List is empty");
		}else
		{
			Node temp =head;
			System.out.println("values are ");
			while(temp != null)
			{
				System.out.println(temp.data);
				temp =temp.next;
			}
		}
	}
public static void main(String[] args)
{
	HeaderLinkedList headLis = new HeaderLinkedList();
	
		/*
		 * headLis.insert(12); headLis.insert(9); headLis.insert(26);
		 * headLis.insert(76); headLis.insert(56); headLis.display();
		 * headLis.delete(76); headLis.display();
		 */
	
	char ch;
	int choice;
	System.out.println("********* Circular Linked List operations *********\n");
	System.out.println("\n------------------------------------------------\n");
	do {
		System.out.println("\nChose one from the below options...\n");
		System.out.println("\n1.insert\n2.Show\n3.delete");
		System.out.println("\n Enter your choice \n");
		Scanner sc = new Scanner(System.in);
		choice = sc.nextInt();
		switch (choice) {
		case 1: {
			System.out.println("Enter the element to Enqueue");
			int val = sc.nextInt();
			headLis.insert(val);
			break;
		}
		case 2: {
			headLis.display();
			break;
			
		}
		case 3: {
			System.out.println("enter the value to delete ");
			headLis.delete(sc.nextInt());
			headLis.display();
			break;
		}

		default: {
			System.out.println("Please Enter valid choice ");
		}
		}
		System.out.println("\nDo you want to continue ? (Y/N)");
		Scanner acb = new Scanner(System.in);
		ch = acb.next().charAt(0);

	} while (ch == 'y' || ch == 'Y');

}
	

}
