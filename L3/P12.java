import java.io.*;   //console class
import java.util.*;  // arrays class

class P12
{
public static void main(String args[])
{
Console c=System.console();
//array ka size 
int n=Integer.parseInt(c.readLine("enter array size "));

//array ko create karna 

String names[]=new String[n];

//array k read 
for (int i=0;i<n;i++)

names[i]=c.readLine("enter the name ");

//array ko process karna 

Arrays.sort(names);
for(String m:names)
System.out.print(m + "");
System.out.println();

}




}