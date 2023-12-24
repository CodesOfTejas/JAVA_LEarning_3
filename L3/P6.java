import java.io.*;


class P6

{
public static void main(String args[])

{
Console c=System.console();
int rating=Integer.parseInt(c.readLine("can u pls enter your rating "));

if ((rating<1)||(rating>5))
System.out.println("invalid rating");

else if ((rating==5)||(rating==4))
System.out.println("excellent");

else if ((rating==3)||(rating==2))
       System.out.println("superb");

else 
     System.out.println("ok");






}


}





