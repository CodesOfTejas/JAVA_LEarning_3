//wajp to check the giveninter is even or odd



import java.io.*;

class P1 
{

public static void main(String args[])

{
Console c = System.console();

int num=Integer.parseInt(c.readLine("can u pls enter the number "));
String res=num%2==0?"even":"odd";
System.out.println(res);


}

}
