

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class PokemonGUI extends JFrame implements ActionListener
{
	JFrame nextOutput;
	static String s1;
	Charizard p1=new Charizard();
	Blastoise p2=new Blastoise();
	Venasaur p3=new Venasaur();
	Feraligatr p4=new Feraligatr();
	Typhlosion p5=new Typhlosion();
	Mewtwo p6=new Mewtwo();
	Pokemon active;
	Pokemon enemy;
	 
	public PokemonGUI()
	{
		super ("Choose your pokemon!");

		setVisible(true);
		setLayout(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		setSize(300,300);
		setLocationRelativeTo(null);
		if(p1.alive == true)
		{
			JButton b1=new JButton("Charizard");
			b1.setActionCommand("1");
			b1.addActionListener(this);
			add(b1);
			b1.setBounds(10,20,100,50);
		}
		if(p2.alive == true)
		{
			JButton p2=new JButton("Blastoise");
			p2.setActionCommand("2");
			p2.addActionListener(this);
			add(p2);
			p2.setBounds(170,20,100,50);
		}
		if(p3.alive == true)
		{
			JButton p3=new JButton("Venusaur");
			p3.setActionCommand("3");
			p3.addActionListener(this);
			add(p3);
			p3.setBounds(10,100,100,50);
		}
		if(p4.alive == true)
		{
			JButton p4=new JButton("Feraligatr");
			p4.setActionCommand("4");
			p4.addActionListener(this);
			add(p4);
			p4.setBounds(170,100,100,50);
		}
		if(p5.alive == true)
		{
			JButton p5=new JButton("Typhlosion");
			p5.setActionCommand("5");
			p5.setBounds(10,180,100,50);
			p5.addActionListener(this);
			add(p5);
		}
		if(p6.alive == true)
		{
			JButton p6=new JButton("Mewtwo");
			p6.setActionCommand("6");
			p6.addActionListener(this);
			add(p6);
			p6.setBounds(170,180,100,50);
		}
	}
	
	public void actionPerformed(ActionEvent a) 
	{
		if (a.getActionCommand()=="1")
		{
			active=p1;
		}
		else if (a.getActionCommand()=="2")
		{
			active=p2;
		}
		else if (a.getActionCommand()=="3")
		{
			active=p3;
		}
		else if (a.getActionCommand()=="4")
		{
			active=p4;
		}
		else if (a.getActionCommand()=="5")
		{
			active=p5;
		}
		else if (a.getActionCommand()=="6")
		{
			active=p6;
		}
		int en=(int)(Math.random()*6+1);
		//en=3;
		if (en==1)
			enemy=p1;
		else if (en==2)
			enemy=p2;
		else if (en==3)
			enemy=p3;
		else if (en==4)
			enemy=p4;
		else if (en==5)
			enemy=p5;
		else if (en==6)
			enemy=p6;
		dispose();
		Battle next=new Battle(active,enemy);
	}
}