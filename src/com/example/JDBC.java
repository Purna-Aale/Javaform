package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC {
    public static void main(String args[])
    {
        try{
            String url="jdbc:mysql//localhost:3306/firstdb";
            String name="root";
            String pass="root";
            Class.forName("com.mysqldb.Driver");
            Connection conn= DriverManager.getConnection(url,name,pass);
            String query= "create table student (id int primary key,name varchar(50) not null,add varchar(50) not null";
            Statement stmt=conn.createStatement();
            ResultSet rs= stmt.executeQuery("select * from student");
            while(rs.next())
            {
                System.out.println(rs.getInt(1)+""+rs.getString(2));
                conn.close();
            }


        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
