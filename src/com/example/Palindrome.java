package com.example;

import javax.swing.*;
import java.awt.*;

public class Palindrome {
    JFrame f;
    JLabel l1,l2;
    JButton b1,b2,b3,b4;
    JTextField t1,t2,t3;
    public Palindrome()
    {
        f=new JFrame("login page");
        f.setBackground(Color.GREEN);
        t3=new JTextField();
        t3.setBounds(120,50,170,30);
        t3.setForeground(Color.RED);
        t3.setFont(new Font("Arial",Font.BOLD,12));

        l2=new JLabel("String:");
        l2.setBounds(50,100,100,30);
        l2.setForeground(Color.black);
        l2.setFont(new Font("Arial",Font.BOLD,14));
        t2=new JTextField("");
        t2.setBounds(120,100,170,30);
        t2.setForeground(Color.RED);
        t2.setFont(new Font("Arial",Font.BOLD,12));


        b1=new JButton("palindrome");
        b1.setBounds(120,150,80,30);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setFont(new Font("Arial",Font.BOLD,12));

        b2=new JButton("reverse");
        b2.setBounds(210,150,80,30);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setFont(new Font("Arial",Font.BOLD,12));

        b3=new JButton("vowel");
        b3.setBounds(120,200,80,30);
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.setFont(new Font("Arial",Font.BOLD,12));

        b4=new JButton("clear");
        b4.setBounds(210,200,80,30);
        b4.setBackground(Color.BLACK);
        b4.setForeground(Color.WHITE);
        b4.setFont(new Font("Arial",Font.BOLD,12));

        b1.addActionListener(e -> {
            String  reverse = ""; // Objects of String class
            String original=t2.getText();
            int length = original.length();
            for ( int i = length - 1; i >= 0; i-- )
                reverse = reverse + original.charAt(i);
            if (original.equals(reverse))
                t3.setText("palindrome.");
            else
                t3.setText("not palindrome.");
        });
        b2.addActionListener(e -> {
            String string = t2.getText();
            String reversedStr = "";

            for(int i = string.length()-1; i >= 0; i--){
                reversedStr = reversedStr + string.charAt(i);
            }
            t3.setText( reversedStr);

            });
        b3.addActionListener(e -> {
            String str =  t2.getText();
            str = str.toLowerCase();
            System.out.print("Vowels in the given String are:");
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                        || str.charAt(i) == 'u') {
                    String s=String.valueOf(str.charAt(i));
                    t3.setText(s);

                }
            }});
        b4.addActionListener(e -> {
            t2.setText(null);
            t3.setText(null);
        });
        f.add(l2);
        f.add(t2);
        f.add(t3);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public  static  void  main(String args[])
    {

Palindrome obj=new Palindrome();
}
}
