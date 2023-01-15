package com.binaryexception.java;
public class MainBinary {
public static void main(String[] args) {
// TODO Auto-generated method stub
BinaryImplement b1=new BinaryImplement();
try
{
b1.check();
}
catch(BinaryException e) {
System.out.println(e.getMessage());
}
}
}