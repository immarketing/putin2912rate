package ru.algo.putin2012.client;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.google.gwt.junit.client.GWTTestCase;

public class Putin2012Test extends GWTTestCase {

	public String getModuleName() {
		return "ru.algo.putin2012.Putin2012";
	}
	
	public void test1(){
		System.out.println("test1");
		try {
			FileOutputStream fos = new FileOutputStream("c:/ttt.ttt");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
