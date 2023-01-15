package com.practiceprogram.main;
import java.io.*;
public class FileWriterp3 
{
	public static void main(String[] args) 
	{
			try 
			{
				FileWriter writer= new FileWriter("E:\\Devesh\\CDAC Course\\Classwork\\data1.txt");
				writer.write("Change of data");
				writer.close();
				System.out.println("Data saved into the file");
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
	}
}
