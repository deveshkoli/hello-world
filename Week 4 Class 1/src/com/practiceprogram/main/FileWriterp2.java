package com.practiceprogram.main;
import java.io.*;
public class FileWriterp2 
{

	public static void main(String[] args) 
	{
			try (FileWriter writer= new FileWriter("E:\\Devesh\\CDAC Course\\Classwork\\Java Programs\\data.txt"))
			{
				writer.write("Change of data1");
				System.out.println("Data saved into the file");
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
	}
}
