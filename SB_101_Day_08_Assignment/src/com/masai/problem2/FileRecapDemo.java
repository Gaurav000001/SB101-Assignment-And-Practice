package com.masai.problem2;

import java.io.*;
import java.time.LocalDate;

class Employee{
	int employeeId;
	
	public Employee(){}
	
	Employee(int employeeId){
		this.employeeId = employeeId;
	}
}

class PermanentEmployee extends Employee implements Serializable{ //---- (i)
	transient int epfoNumber; //---- (ii)
	static String epfoOrganization;
	LocalDate joiningDate;
	float balance;
	
	static {
		epfoOrganization = "EPFO, Govt. of India";
	}
	
	PermanentEmployee(int employeeId, int epfoNumber, float balance) {
		super(employeeId);
		this.epfoNumber = epfoNumber;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "PermanentEmployee [epfoNumber=" + epfoNumber + ", joiningDate=" + joiningDate + ", balance=" + balance
				+ ", employeeId=" + employeeId+ "]";
	}
	
	
}

public class FileRecapDemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		PermanentEmployee pmOne = new PermanentEmployee(101, 1001, 10001.0f);
		ObjectOutput oo = new ObjectOutputStream(new FileOutputStream("Employee.ser")); //---- (iv)
		oo.writeObject(pmOne); //---- (v)
		oo.close();
		
		System.out.println();
		
		ObjectInput oi = new ObjectInputStream(new FileInputStream("Employee.ser")); //---- (vi)
		PermanentEmployee pmTwo = (PermanentEmployee)oi.readObject(); //---- (vii)
		System.out.println(pmTwo.toString());
		oi.close();
	}
}

//(i) Write name of interface to serialize object of class PermanentEmployee?
//(ii) Write appropriate keyword to skip epfoNumber to get serialized?
//(iii) How many variable will be serialized for object of class PermanentEmployee?  --- 2 ---
//(iv) Write suitable interface name here for reference variable oo.
//(v) Write suitable method call to serialize object pmOne.
//(vi) Write suitable class name here.
//(vii) Suggest improvement in this statement. if any, otherwise say "no improvement required"
//(viii) At the time of deserialization, some problem is going to occur, can you suggest improvement to avoid the same?

//Super class (Employee) should have a default constructor or it will throw error
