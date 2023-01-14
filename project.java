package com.mycompany.area;

import java.awt.*;
import java.awt.event.*;
 
class Area implements ActionListener
{
//Declaring Objects

Frame f=new Frame();
Label l1=new Label("Value in metre sq");
//Label l2=new Label("Second Number");
Label l3=new Label("Result");
TextField t1=new TextField();
//TextField t2=new TextField();
TextField t3=new TextField();
Button b1=new Button("cm sq");
Button b2=new Button("mm sq");
//Button b3=new Button("km sq");
Button b4=new Button("inch sq");
Button b5=new Button("foot sq");
Button b6=new Button("Cancel");

Area()
{
//Giving Coordinates
l1.setBounds(50,100,100,20);
//l2.setBounds(50,140,100,20);
l3.setBounds(50,140,100,20);
t1.setBounds(200,100,100,20);
//t2.setBounds(200,140,100,20);
t3.setBounds(200,140,100,20);
b1.setBounds(50,250,50,20);
b2.setBounds(110,250,50,20);
//b3.setBounds(170,250,50,20);
b4.setBounds(170,250,50,20);
b5.setBounds(230,250,50,20);
b6.setBounds(290,250,50,20);
//Adding components to the frame
f.add(l1);
//f.add(l2);
f.add(l3);
f.add(t1);
//f.add(t2);
f.add(t3);
f.add(b1);
f.add(b2);
//f.add(b3);
f.add(b4);
f.add(b5);
f.add(b6);
b1.addActionListener(this);
b2.addActionListener(this);
//b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
f.setLayout(null);
f.setVisible(true);
f.setSize(400,350);
}
public void actionPerformed(ActionEvent e)
{
int n1=Integer.parseInt(t1.getText());
//int n2=Integer.parseInt(t2.getText());
if(e.getSource()==b1)
{
t3.setText(String.valueOf(n1/0.0001));
}
if(e.getSource()==b2)
{
t3.setText(String.valueOf(n1/0.000001));
}
//if(e.getSource()==b3)
//{
//t3.setText(String.valueOf(n1/1000000));
//}
if(e.getSource()==b4)
{
t3.setText(String.valueOf(n1/0.00064516));
}
if(e.getSource()==b5)
{
t3.setText(String.valueOf(n1/0.09290304));
//System.exit(0);
}
if(e.getSource()==b6)
    System.exit(0);
    
}
public static void main(String...s)
{
new Area();
}