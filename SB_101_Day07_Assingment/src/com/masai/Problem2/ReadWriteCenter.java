package com.masai.Problem2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ReadWriteCenter {

	File file;
	String contentToWrite;
	String contentToAppend;
	
	public ReadWriteCenter(String filename, String contentToWrite, String contentToUpload) {
		this.file = new File(filename);
		this.contentToWrite = contentToWrite;
		this.contentToAppend = contentToUpload;
	}
	
	
	public void writeToFile(){
		
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(file));
			
			bw.write(contentToWrite);
			
			bw.flush();
			bw.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void appendToFile() {
		
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));
			
			bw.append(contentToAppend);
			
			bw.flush();
			bw.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public List<Integer> getAnalysis(){
		
		int digit = 0, letter = 0, special = 0;
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			
			String s = br.readLine();
			
			char[] arr = s.toCharArray();
			
			for(int i=0;i<arr.length;i++) {
				 
				if(Character.isDigit(arr[i])) {
					digit++;
				}
				else if(arr[i]>=65 && arr[i]<=122){
					letter++;
				}
				else {
					special++;
				}
			}
			
			br.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		List<Integer> list = new ArrayList<>();
		list.add(digit);
		list.add(letter);
		list.add(special);
		
		return list;
	}

}
