import java.io.*;


class P8
{
public static void main(String args[])

{
Console c=System.console();
int rating=Integer.parseInt(c.readLine("enter the rating "));
switch(rating)
{
case 5,4 -> System.out.println("excellent");
            
case 3,2 -> System.out.println("superb");
            
case 1 -> System.out.println("ok");
            
default-> System.out.println("invalid rating");
            
}

}

}