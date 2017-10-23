import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.Border;
public class Battle extends JFrame implements ActionListener
{
	boolean x=false;
	static boolean ko1 = false, ko2 = false, ko3 = false, ko4 = false, ko5 = false, ko6 = false;
	JLabel out3=new JLabel();
	JLabel out4=new JLabel();
	JLabel out=new JLabel();
	JLabel out2=new JLabel();
	JFrame second;
	JFrame win = new JFrame();
	JFrame ko = new JFrame();
	JButton alive1, alive2, alive3, alive4, alive5, alive6;
	JScrollPane scrollPane;
	JTextField displayArea=new JTextField(100);
	JLabel displayText;
	static Charizard p=new Charizard(),e1=new Charizard();
	static Blastoise p2=new Blastoise(),e2=new Blastoise();
	static Venasaur p3=new Venasaur(),e3=new Venasaur();
	static Feraligatr p4=new Feraligatr(),e4=new Feraligatr();
	static Typhlosion p5=new Typhlosion(),e5=new Typhlosion();
	static Mewtwo p6=new Mewtwo(),e6=new Mewtwo();;
	Pokemon active;
	Pokemon globEnemy;
	JProgressBar progressBar = new JProgressBar();
	JProgressBar progressBar2 = new JProgressBar();
	JButton pA=new JButton("Charizard");
	JButton pB=new JButton("Venasaur");
	JButton pC=new JButton("Typhlosion");
	JButton pD=new JButton("Feraligatr");
	JButton pE=new JButton("Mewtwo");
	JButton pF=new JButton("Blastoise");
	JButton f=new JButton("Switch");
	JLabel label1,label2,label3,label4,label5,label6,label7,label8,label9,label10,label11,label12;
	boolean as=false,ad=false,af=false,ag=false,ah=false,aj=false,ak=false,al=false,az=false,ax=false,ac=false,av=false;
	int xy=0;
	public Battle()
	{
		
	}
	public Battle(Pokemon p1,Pokemon enemy)
	{		
		super("Battle!");

		if (p1.compareTo(p3))
		{
			
			p1=p3;
			as=true;
		}
		else if (p1.compareTo(p))
		{
			
			p1=p;
			ad=true;
		}
		else if (p1.compareTo(p2))
		{
			p1=p2;
			af=true;
		}
		else if (p1.compareTo(p4))
		{
			p1=p4;
			ag=true;
		}
		else if (p1.compareTo(p5))
		{
			p1=p5;
			ah=true;
		}
		else if (p1.compareTo(p6))
		{
			p1=p6;
			aj=true;
		}
		if (enemy.compareTo(e3))
		{
			enemy=e3;
			ak=true;
		}
		else if (enemy.compareTo(e1))
		{
			enemy=e1;
			al=true;
		}
		else if (enemy.compareTo(e2))
		{
			enemy=e2;
			az=true;
		}
		else if (enemy.compareTo(e4))
		{
			enemy=e4;
			ax=true;
		}
		else if (enemy.compareTo(e5))
		{
			enemy=e5;
			ac=true;
		}
		else if (enemy.compareTo(e6))
		{
			enemy=e6;
			av=true;
		}
	
		f.setActionCommand("switch");
		f.addActionListener(this);

		active=p1;
		globEnemy=enemy;
	
		setLayout(null);
		setSize(525,500);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
		JButton b=new JButton(p1.moves[0][0]);
		b.setActionCommand("m1");
		b.addActionListener(this);
		b.setBounds(10,350,100,50);
		add(b);
		b.setVisible(true);
	
		JButton c=new JButton(p1.moves[1][0]);
		c.setBounds(120,350,100,50);
		c.setActionCommand("m2");
		c.addActionListener(this);
		add(c);
		c.setVisible(true);
		
		JButton d=new JButton(p1.moves[2][0]);
		d.setBounds(10,400,100,50);
		d.setActionCommand("m3");
		d.addActionListener(this);
		add(d);
		d.setVisible(true);

		JButton e=new JButton(p1.moves[3][0]);
		e.setBounds(120,400,100,50);
		e.setActionCommand("m4");
		e.addActionListener(this);
		add(e);
		e.setVisible(true);
		
		pA.setVisible(false);
		pB.setVisible(false);
		pC.setVisible(false);
		pD.setVisible(false);
		pE.setVisible(false);
		pF.setVisible(false);
		
		if(ko2 == false)
		{
			pA.setBounds(300,100,100,50);
			add(pA);
			pA.setActionCommand("char");
			pA.addActionListener(this);
		}
		if(ko1 == false)
		{
			pB.setBounds(400,100,100,50);
			add(pB);
			pB.setActionCommand("ven");
			pB.addActionListener(this);
		}
		if(ko5 == false)
		{
			pC.setBounds(300,150,100,50);
			add(pC);
			pC.setActionCommand("typh");
			pC.addActionListener(this);		
		}
		if(ko4 == false)
		{
			pD.setBounds(400,150,100,50);
			add(pD);
			pD.setActionCommand("fera");
			pD.addActionListener(this);
		}
		if(ko6 == false)
		{
			pE.setBounds(300,200,100,50);
			add(pE);
			pE.setActionCommand("mew");
			pE.addActionListener(this);
		}
		if(ko3 == false)
		{
			pF.setBounds(400,200,100,50);
			add(pF);
			pF.setActionCommand("blast");
			pF.addActionListener(this);
		}
		f.setBounds(350,50,100,50);
		add(f);
		f.setVisible(true);	
		
		if(ko1 == false)
		{
			ImageIcon image1 = new ImageIcon(getClass().getResource("/Venasaur.png"));
			JLabel label1 = new JLabel(image1);
			label1.setBounds(10,200,200,200);
			add(label1);
			label1.setVisible(as);
		}
		if(ko2 == false)
		{
			ImageIcon image2 = new ImageIcon(getClass().getResource("/Charizard.png"));
			JLabel label2 = new JLabel(image2);
			label2.setBounds(10,200,200,200);
			add(label2);
			label2.setVisible(ad);
		}
		if(ko3 == false)
		{
			ImageIcon image3 = new ImageIcon(getClass().getResource("/Blastoise.png"));
			JLabel label3= new JLabel(image3);
			label3.setBounds(10,200,200,200);
			add(label3);
			label3.setVisible(af);
		}
		if(ko4 == false)
		{
			ImageIcon image4 = new ImageIcon(getClass().getResource("/feraligatr.png"));
			JLabel label4 = new JLabel(image4);
			label4.setBounds(10,200,200,200);
			add(label4);
			label4.setVisible(ag);
		}
		if(ko5 == false)
		{
			ImageIcon image5 = new ImageIcon(getClass().getResource("/typhlosion.png"));
			JLabel label5 = new JLabel(image5);
			label5.setBounds(10,200,200,200);
			add(label5);
			label5.setVisible(ah);
		}
		if(ko6 == false)
		{
			ImageIcon image6 = new ImageIcon(getClass().getResource("/Metwo.png"));
			JLabel label6 = new JLabel(image6);
			label6.setBounds(10,200,200,200);
			add(label6);
			label6.setVisible(aj);
		}
		ImageIcon image7=new ImageIcon(getClass().getResource("/Venasaur2.png"));
		JLabel label7=new JLabel(image7);
		label7.setBounds(200,10,200,200);
		add(label7);
		label7.setVisible(ak);
			
		ImageIcon image8=new ImageIcon(getClass().getResource("/Charizard2.png"));
		JLabel label8=new JLabel(image8);
		label8.setBounds(200,10,200,200);
		add(label8);
		label8.setVisible(al);
			
		ImageIcon image9 = new ImageIcon(getClass().getResource("/Blastoise2.png"));
		JLabel label9= new JLabel(image9);
		label9.setBounds(200,10,200,200);
		add(label9);
		label9.setVisible(az);			

		ImageIcon image10 = new ImageIcon(getClass().getResource("/feraligatr2.png"));
		JLabel label10 = new JLabel(image10);
		label10.setBounds(200,10,200,200);
		add(label10);
		label10.setVisible(ax);

		ImageIcon image11 = new ImageIcon(getClass().getResource("/typhlosion2.png"));
		JLabel label11 = new JLabel(image11);
		label11.setBounds(200,10,200,200);
		add(label11);
		label11.setVisible(ac);
		
		ImageIcon image12 = new ImageIcon(getClass().getResource("/Mewtwo2.png"));
		JLabel label12 = new JLabel(image12);
		label12.setBounds(200,10,200,200);
		add(label12);
		label12.setVisible(av);
		
		add(out);
		add(out2);
		add(out3);
		add(out4);
		out.setBounds(250,100,400,400);
		out2.setBounds(250,150,400,400);
		out3.setBounds(250,125,400,400);
		out4.setBounds(250,175,400,400);
		out3.setVisible(false);
		out4.setVisible(false);
		out2.setVisible(false);
		out.setVisible(false);
		
		
		
		progressBar.setValue((int)(active.HP / active.HP2 * 100));
	    progressBar.setStringPainted(true);
	    progressBar.setBounds(10, 190, 200, 10);
//	    Border border = BorderFactory.createTitledBorder("Reading...");
//	    progressBar.setBorder(border);
	    add(progressBar);
	    progressBar.setVisible(true);
	    
	    
		progressBar2.setValue((int)(globEnemy.HP / globEnemy.HP2 * 100));    
	    progressBar2.setStringPainted(true);
	    progressBar2.setBounds(230, 10, 200, 10);
//	    Border border = BorderFactory.createTitledBorder("Reading...");
//	    progressBar.setBorder(border);
	    add(progressBar2);
	    progressBar2.setVisible(true);
	}
	
	public void setBar()
	{
			progressBar.setValue((int)(active.HP / active.HP2 * 100));	
			progressBar2.setValue((int)(globEnemy.HP / globEnemy.HP2 * 100));
	}
	
	public void actionPerformed(ActionEvent attack) 
	{
		int b = 0;
		if (attack.getActionCommand().equals("switch"))
		{
			if(ko2 == false)
				pA.setVisible(true);
			if(ko1 == false)
				pB.setVisible(true);
			if(ko5 == false)
				pC.setVisible(true);
			if(ko4 == false)
				pD.setVisible(true);
			if(ko6 == false)
				pE.setVisible(true);
			if(ko3 == false)
				pF.setVisible(true);
			f.setVisible(false);	
		}
		if (attack.getActionCommand().equals("char"))
		{
			this.dispose();
			Battle x=new Battle(p,globEnemy);
		}
		if (attack.getActionCommand().equals("ven"))
		{
			this.dispose();
			Battle x=new Battle(p3,globEnemy);
		}
		if (attack.getActionCommand().equals("blast"))
		{
			this.dispose();
			Battle x=new Battle(p2,globEnemy);
		}
		if (attack.getActionCommand().equals("typh"))
		{
			this.dispose();
			Battle x=new Battle(p5,globEnemy);
		}
		if (attack.getActionCommand().equals("fera"))
		{
			this.dispose();
			Battle x=new Battle(p4,globEnemy);
		}
		if (attack.getActionCommand().equals("mew"))
		{
			this.dispose();
			Battle x=new Battle(p6,globEnemy);
		}
		if (attack.getActionCommand().equals("m1"))
		{
			out.setVisible(false);
			out2.setVisible(false);

			b=(int) (Math.random()*4);
			globEnemy.HP = globEnemy.HP - active.calculateDamage(globEnemy, 0);
			out.setText(active.output());
			out.setVisible(true);
			active.HP=active.HP-globEnemy.calculateDamage(active,b);
			out2.setText(globEnemy.output());
			out2.setVisible(true);
			out3.setText(active.output2());
			out3.setVisible(true);
			out4.setText(globEnemy.output2());
			out4.setVisible(true);
			
			
			
			setBar();
			faint();
		}
		if (attack.getActionCommand().equals("m2"))
		{
			out.setVisible(false);
			out2.setVisible(false);

			b=(int) (Math.random()*4);
			globEnemy.HP = globEnemy.HP - active.calculateDamage(globEnemy, 1);
			out.setText(active.output());
			out.setVisible(true);
			active.HP=active.HP-globEnemy.calculateDamage(active,b);
			out2.setText(globEnemy.output());
			out2.setVisible(true);
			out3.setText(active.output2());
			out3.setVisible(true);
			out4.setText(globEnemy.output2());
			out4.setVisible(true);
	
			setBar();
			faint();
		}
		if (attack.getActionCommand().equals("m3"))
		{
			out.setVisible(false);
			out2.setVisible(false);

			b=(int) (Math.random()*4);
			globEnemy.HP = globEnemy.HP - active.calculateDamage(globEnemy, 2);
			out.setText(active.output());
			out.setVisible(true);
			active.HP=active.HP-globEnemy.calculateDamage(active,b);
			out2.setText(globEnemy.output());
			out2.setVisible(true);
			out3.setText(active.output2());
			out3.setVisible(true);
			out4.setText(globEnemy.output2());
			out4.setVisible(true);

			setBar();
			faint();
		}
		if (attack.getActionCommand().equals("m4"))
		{
			out.setVisible(false);
			out2.setVisible(false);
			b=(int) (Math.random()*4);
			globEnemy.HP = globEnemy.HP - active.calculateDamage(globEnemy, 3);
			out.setText(active.output());
			out.setVisible(true);
			active.HP=active.HP-globEnemy.calculateDamage(active,b);
			out2.setText(globEnemy.output());
			out2.setVisible(true);
			out3.setText(active.output2());
			out3.setVisible(true);
			out4.setText(globEnemy.output2());
			out4.setVisible(true);
	
			setBar();
			faint();
		}
		if (attack.getActionCommand().equals("ok"))
		{
			this.dispose();
			e1 = new Charizard();
			e2 = new Blastoise();
			e3 = new Venasaur();
			e4 = new Feraligatr();
			e5 = new Typhlosion();
			e6 = new Mewtwo();
			win.dispose();
		}
		if (attack.getActionCommand()=="1")
		{
			Battle x=new Battle(p,globEnemy);
			ko.dispose();
		}
		else if (attack.getActionCommand()=="2")
		{
			Battle x=new Battle(p2,globEnemy);
			ko.dispose();
		}
		else if (attack.getActionCommand()=="3")
		{
			Battle x=new Battle(p3,globEnemy);
			ko.dispose();
		}
		else if (attack.getActionCommand()=="4")
		{
			Battle x=new Battle(p4,globEnemy);
			ko.dispose();
		}
		else if (attack.getActionCommand()=="5")
		{
			Battle x=new Battle(p5,globEnemy);
			ko.dispose();
		}
		else if (attack.getActionCommand()=="6")
		{
			Battle x=new Battle(p6,globEnemy);
			ko.dispose();
		}
	}
	
	public void faint()
	{
		boolean end = false;
		if(globEnemy.HP <= 0)
		{
			win.setLayout(null);
			win.setBounds(100, 100, 400, 300);
			JLabel winS = new JLabel("You won!");
			winS.setBounds(100, 100, 100, 20);
			win.add(winS);
			JButton ok = new JButton("Ok");
			ok.setBounds(100, 200, 100, 20);
			ok.setActionCommand("ok");
			ok.addActionListener(this);
			win.add(ok);
			win.setVisible(true);
			win.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
			end = true;
		
		}
		if(active.HP <= 0)
		{
			this.dispose();
			if (active.compareTo(p3))
			{
				remove(pB);
				ko1 = true;
				p3.alive = false;
				
			}
			else if (active.compareTo(p))
			{				
				remove(pA);
				ko2 = true;
				p.alive = false;
			}
			else if (active.compareTo(p2))
			{
				remove(pF);
				ko3 = true;
				p2.alive = false;
			}
			else if (active.compareTo(p4))
			{
				remove(pD);
				ko4 = true;
				p4.alive = false;
			}
			else if (active.compareTo(p5))
			{
				remove(pC);
				ko5 = true;
				p5.alive = false;
			}
			else if (active.compareTo(p6))
			{
				remove(pE);
				ko6 = true;
				p6.alive = false;
			}
			if (end == false)
			{
				ko.setVisible(true);
				ko.setBounds(100, 100, 500, 500);
				ko.setLayout(null);
				ko.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				ko.setLocationRelativeTo(null);
				if(p.alive == true)
				{
					alive1 = new JButton("Charizard");
					alive1.setActionCommand("1");
					alive1.addActionListener(this);
					ko.add(alive1);
					alive1.setBounds(10,20,100,50);
				}
				if(p2.alive == true)
				{
					alive2=new JButton("Blastoise");
					alive2.setActionCommand("2");
					alive2.addActionListener(this);
					ko.add(alive2);
					alive2.setBounds(170,20,100,50);
				}
				if(p3.alive == true)
				{
					alive3=new JButton("Venusaur");
					alive3.setActionCommand("3");
					alive3.addActionListener(this);
					ko.add(alive3);
					alive3.setBounds(10,100,100,50);
				}
				if(p4.alive == true)
				{
					alive4=new JButton("Feraligatr");
					alive4.setActionCommand("4");
					alive4.addActionListener(this);
					ko.add(alive4);
					alive4.setBounds(170,100,100,50);
				}
				if(p5.alive == true)
				{
					alive5=new JButton("Typhlosion");
					alive5.setActionCommand("5");
					alive5.addActionListener(this);
					ko.add(alive5);
					alive5.setBounds(10,180,100,50);
				}
				if(p6.alive == true)
				{
					alive6=new JButton("Mewtwo");
					alive6.setActionCommand("6");
					alive6.addActionListener(this);
					ko.add(alive6);
					alive6.setBounds(170,180,100,50);
				}
			}
		}
	}
	public static void main(String[] args)
{
		Battle battle = new Battle(p, p2);
	}
}