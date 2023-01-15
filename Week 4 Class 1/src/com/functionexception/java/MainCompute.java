package com.functionexception.java;
public class MainCompute {
public static void main(String[] args) {
Compute c1=new Compute();
try
{
c1.check();
}
catch(IndefiniteException e) {
System.out.println(e.getMessage());
}
}
}
