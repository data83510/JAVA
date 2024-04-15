package com.sunbeam;

import java.util.Comparator;

public class Program {
	public static void main(String[] args) 
	{
		
		
		Employee arr[] = new Employee[5];
		arr[0] = new Employee(3, "vrushab", 3500);
		arr[1] = new Employee(1, "rahul", 4000);
		arr[2] = new Employee(2, "prashant", 5000);
		arr[3] = new Employee(5, "pratik", 3000);
		arr[4] = new Employee(4, "onkar", 3500);

		System.out.println("Before Sorting -");
		for (Employee employee : arr)
			System.out.println(employee);
		System.out.println("==============================================================");

		// sorting on name in asc order
		class EmployeeSalComparator implements Comparator<Employee> {
			@Override
			public int compare(Employee o1, Employee o2) {
				int value = Double.compare(o1.salary, o2.salary);
				return value;
			}
		}

		Selectionsort.selectionSort(arr, new EmployeeSalComparator());
		
		System.out.println("After Sorting -");
		for (Employee employee : arr)
			System.out.println("Sorting using salary - "+employee);
		System.out.println("===============================================================");
		
		class EmployeeNameComparator implements Comparator<Employee> {

			@Override
			public int compare(Employee o1, Employee o2) {
				int value = o1.name.compareTo(o2.name);
				return value;
			}
		}
		
		Selectionsort.selectionSort(arr, new EmployeeNameComparator());
		System.out.println("After Sorting -");
		for (Employee employee : arr)
			System.out.println("Sorting using name - "+employee);
	}

}
