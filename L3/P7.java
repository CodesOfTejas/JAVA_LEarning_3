import java.io.*;


class P7
{
public static void main(String args[])

{
Console c=System.console();
int rating=Integer.parseInt(c.readLine("enter the rating "));
switch(rating)
{
case 5,4 : System.out.println("excellent");
            break;
case 3,2 : System.out.println("superb");
            break;
case 1 : System.out.println("ok");
            break;
default: System.out.println("invalid rating");
            break;

}

}

}