package com.student;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class display {

	public static void main(String[] args) {
		Student arr[]=new Student[3];
		
		arr[0] = new Student(7, "jaid","kolhapur", 99);
		
		arr[1] = new Student(1, "shreyansh","abdul lat", 98);
		
		arr[2] = new Student(5, "atharv","solapur", 97);
		
		
		int choice = 0;
        
        Scanner sc = new Scanner(System.in);
        
        do {
        	System.out.println("1. sorted on their city (asc)");
        	
        	System.out.println("2.sorted on their on marks (desc) ");
        	
        	System.out.println("3.sorted on their on name (asc) ");
        	
        	System.out.println("enter your choice");
        	
        	choice = sc.nextInt();
        	
        	switch(choice)
      	  {
      	  case 1: 
      	  {
      		  class StudentNameCoparator implements Comparator<Student> {

				@Override
				public int compare(Student o1, Student o2) {
					int value = o1.city.compareTo(o2.city);
					return value;
				}}
      		Comparator<Student> stNameComparator = new StudentNameCoparator();

    		Arrays.sort(arr, stNameComparator);
    		System.out.println("After Sorting -");
    		for (Student stu : arr)
    			System.out.println(stu);
      	  }
      	  break;
      	  
      	case 2: 
    	  {
    		  
    		  class StudentMarkComparator implements Comparator<Student> {
    				@Override
    				public int compare(Student o1, Student o2) {
    					int value =Double.compare(o2.marks, o1.marks) ;
    					return value;
    				}
    			}

    			Comparator<Student> stuMarkComparator = new StudentMarkComparator();

    			Arrays.sort(arr, stuMarkComparator);

    			
    			System.out.println("After Sorting -");
        		for (Student stu : arr)
        			System.out.println(stu);
    	  }
    	  break;
    	  
      	case 3: 
    	  {
    		  class StudentNameCoparator implements Comparator<Student> {

  				@Override
  				public int compare(Student o1, Student o2) {
  					int value = o1.name.compareTo(o2.name);
  					return value;
  				}}
        		Comparator<Student> stNameComparator = new StudentNameCoparator();

      		Arrays.sort(arr, stNameComparator);
      		System.out.println("After Sorting -");
      		for (Student stu : arr)
      			System.out.println(stu); 
    	  }
    	  break;
    	  
      	default:
   		 System.out.println("Wrong choice.....");
   		 break;
      	  }
        	
        }while(choice!=0);
		
		
		
				

	}

}
