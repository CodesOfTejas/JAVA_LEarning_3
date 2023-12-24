//wajp to read user name and password 
//if username is kaml and password is classes then out put success or else failure 

import java.io.*;

class P15

{
public static void main(String args[])

{
Console c=System.console();
String username = new String(c.readPassword("enter username "));
String password = new String(c.readPassword("enter the password "));

if ( (username.equals("Tejas")) && (password.equals("tkgreat")) )


    System.out.println("success");
else

    System.out.println("failure frod");
}

}
