package com.example;

import javax.swing.*;
import java.awt.*;

public class Button {
    JFrame f;
    JTextField t1;


    JButton b1;
    public Button()
    {
        f=new JFrame("welcome to login page");
        f.setBackground(Color.GREEN);

        t1=new JTextField("");
        t1.setBounds(30,50,150,30);
        t1.setForeground(Color.RED);
        t1.setFont(new Font("Arial",Font.BOLD,12));


        b1=new JButton("click button");
        b1.setBounds(30,100,100,30);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setFont(new Font("Arial",Font.BOLD,12));
        b1.addActionListener(e -> {
            t1.setText("i am click");

        });



        f.add(t1);
        f.add(b1);
        f.setSize(200,200);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String args[])
    {

        Button obj1=new Button();
    }
}


