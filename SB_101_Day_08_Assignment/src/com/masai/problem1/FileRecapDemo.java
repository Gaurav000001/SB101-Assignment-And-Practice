package com.masai.problem1;
import java.io.*;
public class FileRecapDemo {
	public static void main(String[] args) throws IOException { //---- (i)
		File f = new File("myfolder");
		if(f.exists()) { //---- (ii)
			System.out.println("No folder named myfolder");
			return;
		}
		if(f.isDirectory()) { //---- (iii)
			System.out.println("myfolder is a file not a folder");
			return;
		}
		String str[] = f.list(); //---- (iv)
		
		Reader r = new BufferedReader(new FileReader("A.txt")); //---- (v)
		Writer w = new BufferedWriter(new FileWriter("B.txt", true)); //---- (vi)
		
		while(true) {
			int c = r.read();
			if(c == -1)
				break;
			w.write(c);
		}
		
		w.write("content to write to file B.txt"); //---- (vii)
		w.close();
		r.close();
	}
}

//(i) Write name of the suitable Exception class Here.
//(ii) Write Suitable method name to check if this file/folder named "myfolder" is already there or not.
//(iii) Write Suitable method name to check if "myfolder" is a file or not.
//(iv) Write Suitable method name to get all files that are in folder "myfolder".
//(v) Write Suitable statement to open file A.txt for reading.
//(vi) Write Suitable statement to open file B.txt for writing such that previous content should not be overwritten.
//(vii) Write Suitable method name to write all buffered content to file B.txt.
//(viii) The byte stream process data in the chunk of __8__ bits but the character stream process data in the chunk of __16__.
//(ix) What is buffer?

//buffer is a temporary storage area in memory that is used to hold data while it is being transferred 
//from one location to another. Buffers are commonly used in many areas of computing, such as networking,
//input/output (I/O) operations, and image processing.

//(x) Which class is used to write primitive data type to file?  ---- PrintWriter ----




