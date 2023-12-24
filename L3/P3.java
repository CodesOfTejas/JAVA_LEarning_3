import java.io.*;

class P3

{
public static void main(String args[])



{
Console c=System.console();
int num=Integer.parseInt(c.readLine("enter the number "));
switch(num%2)

{
case 0 : System.out.println("even");
           break;
case 1 : System.out.println("odd");
            break;
case -1 : System.out.println("odd");
           break;
}

}



}