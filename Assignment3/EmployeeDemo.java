package Assingment;

import java.util.ArrayList;
import java.util.List;


class Employee { //Parameterless constructor
	
     private int id;
     private String name;
     private double salary;


public Employee(int id,String name,double salary){ //Parameterized constructor

     this.id=id;
     this.name=name;
     this.salary=salary;

    }

public void displayDetails(){ // Method to display employee details

     System.out.println("ID :"+id+",Name:"+name+",Salary :$"+salary);

   }
}

class EmployeeDemo {
	 
	 public static void main(String[] args) {
		 // Creating Employee objects
		Employee emp1= new Employee(101,"Gauri",50000);
		Employee emp2= new Employee(102,"Pratik",60000);
		Employee emp3= new Employee(103,"pooja",70000);
			
		
       List<Employee> employees=new ArrayList<>();
       employees.add(emp1);
       employees.add(emp2);
       employees.add(emp3);
 
       //Displaying employee details
       System.out.println("Employee Details:");
       for(Employee emp :employees){
  
	   emp.displayDetails();
	 
       }
 
    }
 
 }
 
 
