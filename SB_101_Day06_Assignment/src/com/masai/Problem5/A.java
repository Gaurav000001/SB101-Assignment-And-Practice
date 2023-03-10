package com.masai.Problem5;

public class A{
	  public void sayHello(String name){
	    System.out.print("Welcome : ");
	    try{
	      Thread.sleep(2000);
	    }catch(Exception e){
	      e.printStackTrace();
	    }
	    System.out.println(name);
	  }
}