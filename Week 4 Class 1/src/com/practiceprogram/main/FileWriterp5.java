	package com.practiceprogram.main;
import java.io.*;
public class FileWriterp5 
{
	public static void main(String[] args) throws IOException
	{
				FileWriter writer= new FileWriter("E:\\Devesh\\CDAC Course\\Classwork\\data1.txt");
				writer.write("Change of okay");
				writer.close();
				System.out.println("Data saved into the file");
				
	}
}
