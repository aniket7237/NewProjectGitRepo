package com.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;

public class TryWithRes {

	public static void main(String[] args) {
	
		try(
				BufferedReader br = new BufferedReader(new FileReader("example.txt")) ){
			System.out.println("Try");
			
		} catch (FileNotFoundException e) {
			System.out.println("Catch1");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Catch2");
			e.printStackTrace();
		}
		finally {
			
			System.out.println("Finally");
		}

	}

}
