package com.masai.Problem3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		class A{
			synchronized static void fun(){ //----- (1), (2)
				
			}
		}

		class B implements Runnable{
			A a = new A();
			
			public void run(){
				synchronized(A.class){ //---- (3)
					
				}
				
				//say wait method is called somewhere for this thread
				notify();	//---- (4)
			}
		}

	}

}


//(1) Which keyword is to be used to make sure that only one thread from an object of class A should enter in the method fun?
//(2) Which keyword is to be used to make sure that only one thread from an class A should enter in the method fun?
//(3) What is is written here to make sure that only one thread from an class A should enter in the synchronized block?
//(4) Is that code okay? If no, suggest improvement?  -----Okay-----