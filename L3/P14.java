//wajp to read a string from the user 
// and print on the screen 

import java.io.*;


class P14
{

public static void main(String args[])

{
Console c=System.console();
String str=c.readLine("enter the string ");

System.out.println(str);

For(int i=0; i<str.length(); i++)
System.out.print(str.charAt(i));


}


}