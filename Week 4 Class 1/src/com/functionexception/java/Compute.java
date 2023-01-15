package com.functionexception.java;
import java.io.IOException;
public class Compute {
public double x=1;
private int y=0;
public void check()throws IndefiniteException
{
while(x<=5)
{
double p=((x*x)-(y*y));
if(x==y)
{
try {
throw new
IndefiniteException("denominator must be non zero");
}
catch(IndefiniteException e ) {
System.out.println(e.getMessage());
}
}
else
{
double f=x/(p);
System.out.println(f);
}
x=x+0.5;
y=y+1;
}
}
}