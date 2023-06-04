package com.example;
import javax.swing.*;
import java.awt.*;
public class Calculator {
    JFrame f;
    JLabel l1,l2;
    JTextField t1,t2,t3;
       JButton b1,b2,b3,b4,b5;
    public  Calculator()
    {
        f=new JFrame("welcome to login page");
        f.setBackground(Color.GREEN);
        t3=new JTextField();
        t3.setBounds(120,50,100,30);
        t3.setForeground(Color.RED);
        t3.setFont(new Font("Arial",Font.BOLD,12));

        l1=new JLabel("1st num:");
        l1.setBounds(50,100,100,30);
        l1.setForeground(Color.RED);
        l1.setFont(new Font("Arial",Font.BOLD,12));
        t1=new JTextField("");
        t1.setBounds(120,100,170,30);
        t1.setForeground(Color.RED);
        t1.setFont(new Font("Arial",Font.BOLD,12));

        l2=new JLabel("2nd num:");
        l2.setBounds(50,150,100,30);
        l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,12));
        t2=new JTextField("");
        t2.setBounds(120,150,170,30);
        t2.setForeground(Color.RED);
        t2.setFont(new Font("Arial",Font.BOLD,12));


        b1=new JButton("/");
        b1.setBounds(120,200,60,30);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setFont(new Font("Arial",Font.BOLD,12));

        b2=new JButton("+");
        b2.setBounds(230,200,60,30);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setFont(new Font("Arial",Font.BOLD,12));

        b3=new JButton("-");
        b3.setBounds(120,250,60,30);
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.setFont(new Font("Arial",Font.BOLD,12));

        b4=new JButton("*");
        b4.setBounds(230,250,60,30);
        b4.setBackground(Color.BLACK);
        b4.setForeground(Color.WHITE);
        b4.setFont(new Font("Arial",Font.BOLD,12));
        b1.addActionListener(e -> {
            try {
                double i = Double.parseDouble(t1.getText());
                double i1 = Double.parseDouble(t2.getText());
                double d1 = i / i1;
                String res1 = String.valueOf(d1);
                t3.setText(res1);

                //Print out the data
                System.out.println("division");
                System.out.println("1st num:" + i);
                System.out.println("2nd num:" + i1);
                System.out.println("result:" + d1);
            } catch(NumberFormatException e1)
            {
                JOptionPane.showMessageDialog(null,"invalid input.");
            }


        });

        b2.addActionListener(e -> {
            try {
                double i3 = Double.parseDouble(t1.getText());
                double i4 = Double.parseDouble(t2.getText());
                double s1 = i3 + i4;
                String res2 = String.valueOf(s1);
                t3.setText(res2);
                System.out.println("addation");
                System.out.println("1st num:" + i3);
                System.out.println("2nd num:" + i4);
                System.out.println("result:" + s1);
            } catch(NumberFormatException e1)
            {
                JOptionPane.showMessageDialog(null,"invalid input.");
            }

        });

        b3.addActionListener(e -> {
            try {
                double i5 = Double.parseDouble(t1.getText());
                double i6 = Double.parseDouble(t2.getText());
                double s2 = i5 - i6;
                String res3 = String.valueOf(s2);
                t3.setText(res3);
                System.out.println("subtraction");
                System.out.println("1st num:" + i5);
                System.out.println("2nd num:" + i6);
                System.out.println("result:" + s2);
            } catch(NumberFormatException e1)
            {
                JOptionPane.showMessageDialog(null,"invalid input.");
            }



        });

        b4.addActionListener(e -> {
            try {
                double i7 = Double.parseDouble(t1.getText());
                double i8 = Double.parseDouble(t2.getText());
                double m = i7 * i8;
                String res4 = String.valueOf(m);
                t3.setText(res4);
                System.out.println("multiplication");
                System.out.println("1st num:" + i7);
                System.out.println("2nd num:" + i8);
                System.out.println("output:" + m);
            } catch(NumberFormatException e1)
            {
                JOptionPane.showMessageDialog(null,"invalid input.");
            }



        });


    b5=new JButton("AC");
    b5.setBounds(230,50,60,30);
    b5.setBackground(Color.BLACK);
    b5.setForeground(Color.WHITE);
    b5.setFont(new Font("Arial",Font.BOLD,12));

    b5.addActionListener(e1 -> {
        t1.setText(null);
        t2.setText(null);
        t3.setText(null);
    });

        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(t3);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static  void  main(String args[])
    {
        Calculator obj1=new Calculator();
    }
}

