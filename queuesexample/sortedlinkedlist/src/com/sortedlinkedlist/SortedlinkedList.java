package com.sortedlinkedlist;

import java.util.Scanner;

public class SortedlinkedList {

	class Node {
		int data;
		Node next;

		public Node(int data) {
			super();
			this.data = data;
			this.next = null;
		}

	}

	private Node head = null;
	private Node tail = null;

	void sortedInsert(int data) {
		Node current = head;
		Node new_node = new Node(data);
		// Case 1 of the above algo
		if (current == null) {
			new_node.next = new_node;
			head = new_node;

		}

		// Case 2 of the above algo
		else if (current.data >= new_node.data) {

			/*
			 * If value is smaller than head's value then we need to change next of last
			 * node
			 */
			while (current.next != head)
				current = current.next;

			current.next = new_node;
			new_node.next = head;
			head = new_node;
		}

		// Case 3 of the above algo
		else {

			/* Locate the node before the point of insertion */
			while (current.next != head && current.next.data < new_node.data)
				current = current.next;

			new_node.next = current.next;
			current.next = new_node;
		}
	}

	void display() {
		if (head == null) {
			System.out.println("List is empty");
		} else {
			Node temp = head;
			System.out.println("Values");

			do {
				System.out.println(temp.data);

				temp = temp.next;

			} while (temp != head);

		}
	}

	void delete(int data) {
		if (head == null) {
			System.out.println("List is empty");
		} else {
			if (head == null) {
				System.out.println("List empty");
			} else {
				Node temp = head;
				Node prev = null;
				while (temp != null && temp.data != data) {
					prev = temp;
					temp = temp.next;
				}

				// If key was not present in linked list
				if (temp == null)
					return;

				// Unlink the node from linked list
				prev.next = temp.next;
			}
		}
	}

	public static void main(String[] args) {
		SortedlinkedList srList = new SortedlinkedList();

		
		  srList.sortedInsert(10); srList.sortedInsert(5); srList.sortedInsert(26);
		  srList.sortedInsert(55); srList.sortedInsert(36); srList.display();srList.delete(55);srList.display();
		 

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
				srList.sortedInsert(val);
				break;
			}
			case 2: {
				srList.display();
				break;
				
			}
			case 3: {
				System.out.println("enter the value to delete ");
				srList.delete(sc.nextInt());
				srList.display();
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
