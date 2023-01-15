package com.practiceprogram.main;
import java.io.*;
public class FileWriterp1 
{
	public static void main(String[] args) 
	{
			try 
			{
				FileWriter writer= new FileWriter("E:\\Devesh\\CDAC Course\\Classwork\\Java Programs\\data.txt");
				writer.write("I love my country");
				System.out.println("Data saved into the file");
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
	}
}
