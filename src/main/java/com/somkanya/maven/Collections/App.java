package com.somkanya.maven.Collections;

import java.io.*; 
import java.util.*; 

public class App 
{
	public static void printList(ArrayList<Integer> list) {
		int n =list.size();
		for(int i=0;i<n;i++)
		{
			System.out.print(list.get(i)+ " ");
		}
		System.out.println("");
	}
	public static ArrayList<Integer> addElements(ArrayList<Integer> list,int input){
		
		list.add(input);
		System.out.println("Element added successfully");
		return list;
	}
	
	public static void fetch(ArrayList<Integer> list,int key) {
		boolean ans;
		ans = list.contains(key);
		if(ans)
			System.out.println("element found!");
		else
			System.out.println("element not found");
		
	}
	
	public static void erase(ArrayList<Integer> list,int del) {
		boolean b;
		b = list.contains(del);
		if(b) {
			list.remove(new Integer(del));
			int n = list.size();
			System.out.println("new size of list after deletion is "+n);
		}else {
			System.out.println("element to be deleted is not in list");
		}
		
	}
	
    public static void main( String[] args )
    {
    	Scanner sc = new Scanner(System.in);
    	
       System.out.print("Custom list ");
       ArrayList<Integer>list = new ArrayList();
       
       //Initializing list with 10 elements
       for(int i=0;i<10;i++)
       {
    	   list.add(i);
    	   System.out.print(list.get(i)+ " ");
       }
       
       //"Adding elements to Custom list"
       System.out.println("Enter element to add in your custom list");
       int input = sc.nextInt();
       addElements(list,input);
       printList(list);
       
       //"fetching list item"
       System.out.println("Enter element to fetch");
       int key = sc.nextInt();
       fetch(list,key);
       
       //"removing list item"
       System.out.println("Enter element to remove");
       int del = sc.nextInt();
       erase(list,del);
       printList(list);
       
    }
}
