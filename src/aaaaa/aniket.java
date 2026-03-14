package aaaaa;

import java.io.*;
import java.sql.*;
class insert {
    public static void main(String[] args) throws IOException{
        DataInputStream ds=new DataInputStream(System.in);
        System.out.println("Enter empid");
        String eno=ds.readLine();
        System.out.println("Enter emp name");
        String ename=ds.readLine();
        System.out.println("Enter emp contack");
        String cno=ds.readLine();
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","manager");
            Statement stmt=con.createStatement();
            String ql="inset into t75 values('"+eno+"','"+ename+"','"+cno+"')";
            int x=stmt.executeUpdate(ql);
            if(x>0){
                System.out.println("Insert Success");
            }
            else{
                System.out.println("Insert UnSuccess");
            }
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
