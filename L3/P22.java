import java.io.*;



class P22

{

public static void main(String args[])


{
Console c=System.console();

int num=Integer.parseInt(c.readLine("can u pls give us the number so we can decide "));

if (num%4==0)
System.out.println("this is even number ");

else 
System.out.println("this is odd number ");


}


}