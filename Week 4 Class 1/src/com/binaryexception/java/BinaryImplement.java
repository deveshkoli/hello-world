package com.binaryexception.java;
import java.util.Scanner;
public class BinaryImplement {
public void check()throws BinaryException{
int len;
double sum=0;
System.out.println("enter the lenth of binary number");
Scanner sc=new Scanner(System.in);
len=sc.nextInt();
int a[]=new int[len];
System.out.println("enter the digit of binary number");
for(int i=0;i<len;i++)
{
a[i]=sc.nextInt();
if(a[i]!=0&&a[i]!=1)
{
throw new BinaryException("enter 0 and 1 only");
}
}
int k= (len-1);
while(k>=0)
{
for(int j=0;j<len;j++)
{
sum=(sum+(Math.pow(2,j))*a[k]);
k--;
}
}
System.out.println(sum);
}
}
