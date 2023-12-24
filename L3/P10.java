//wajp to read array of integers from the user and display


import java.io.*;



class P10
{

public static void main(String args[])


{
Console c=System.console();

//array ka size

int n=Integer.parseInt(c.readLine("enter the array size "));


//array ko create 
int data[]=new int[n];

//array ko read
for (int i=0;i<n;i++)
data [i]=Integer.parseInt(c.readLine("enter the data "));

//array ko display 
for(int j : data)
System.out.println(j+"");

System.out.println();

}

}