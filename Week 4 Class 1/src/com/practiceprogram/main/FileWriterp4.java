	package com.practiceprogram.main;
import java.io.*;
public class FileWriterp4 
{
	public static void main(String[] args) 
	{
		FileWriter writer=null;
			try 
			{
				writer= new FileWriter("E:\\Devesh\\CDAC Course\\Classwork\\data1.txt");
				writer.write("Change of data");
				
				System.out.println("Data saved into the file");
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
			finally
			{
				try 
				{
					writer.close();
				} 
				catch (IOException e) 
				{
					e.printStackTrace();
				}
			}
	}
}
