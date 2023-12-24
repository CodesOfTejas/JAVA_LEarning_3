// Wajp to read array of numbers and count 
//number of +ve ,-ve and 0's



import java.io.*;

class P11
{
public static void main(String args[])

{
Console c=System.console();



//ARRAY KA SIZE

int n=Integer.parseInt(c.readLine("enter the size of array "));

// Array ko create karna 

double data[]= new double[n];


//Array ko read karna
for(int i=0; i<n; i++)
data[i]=Double.parseDouble(c.readLine("enter the data ")); 


int c1=0,c2=0,c3=0;
for(double d:data )
{
if (d>0)        c1++;
else if (d<0)   c2++;
else            c3++;
}

System.out.println(c1+""+c2+""+c3);
}

}