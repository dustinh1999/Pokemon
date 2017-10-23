

import javax.swing.*;

//import com.sun.prism.paint.Color;

import java.awt.event.*;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

public class Map extends JPanel implements KeyListener, ActionListener 
{
   JTextField typingArea;
   JButton button = new JButton();
   JLabel label = new JLabel("Press space to start");
   static int hLoc = 0;
   static int vLoc = 0;
   static JFrame frame;
   boolean start = false;
   
   ImageIcon image1 = new ImageIcon((getClass().getResource("grass_tile.png")));
   ImageIcon image2 = new ImageIcon((getClass().getResource("trainerNormal.png")));
   ImageIcon image3 = new ImageIcon((getClass().getResource("trainerNormal.png")));
   ImageIcon image4 = new ImageIcon((getClass().getResource("trainerUp.png")));
   ImageIcon image5 = new ImageIcon((getClass().getResource("trainerLeft.png")));
   
   
   public Map() 
   {
       super(new BorderLayout());
       
       button.setBorderPainted(false);
       button.setBorder(null);
       //button.setFocusable(false);
       button.setContentAreaFilled(false);
       button.setIcon(image3);
       button.addActionListener(this);
       //button.setVisible(true);
       
       typingArea = new JTextField(40);
       typingArea.addKeyListener(this);

       add(typingArea, BorderLayout.PAGE_START);
       //vLoc += 40;
	   button.setLocation(hLoc, vLoc);
       button.setSize(32, 32);
       //button.setForeground(Color.RED);
       add(button, BorderLayout.BEFORE_FIRST_LINE);
       //button.setLocation(hLoc, vLoc+50);
       //button.setLocation(hLoc, vLoc+50);
      // Color color= new Color(GREEN);	   
      //button.setB()//backgroundImage = (new ImageIcon("C:\\ishaan\\grassback.png"));
       
       add(label, BorderLayout.SOUTH);
   }

   /** Handle the key typed event from the text field. */
   public void keyTyped(KeyEvent e) 
   {
       displayInfo(e, "KEY TYPED: ");
   }

   /** Handle the key pressed event from the text field. */
   public void keyPressed(KeyEvent e) 
   {
       displayInfo(e, "KEY PRESSED: ");
   }

   public void keyReleased(KeyEvent e) 
   {
   }

   /** Handle the button click. */
   public void actionPerformed(ActionEvent e) 
   {
       typingArea.setText("");
       typingArea.requestFocusInWindow();
   }

   protected void displayInfo(KeyEvent e, String s)
   {
       int id = e.getID();
       int keyCode1 = e.getKeyCode();
       if (keyCode1 == KeyEvent.VK_LEFT && start == true)
       {
    	   button.setIcon(image5);
    	   if (hLoc >= -340)
    	   {
    		   hLoc -= 37;
    		   int rand = (int)(Math.random() * 10 + 1);
    		   if (rand == 1)
    		   {
    			   //frame.dispose();
    			   PokemonGUI battle = new PokemonGUI();
    			   //createAndShowGUI();
    		   }
    	   }
       }
       else if (keyCode1 == KeyEvent.VK_RIGHT && start == true)
       {
    	   button.setIcon(image4);
    	   if (hLoc < 340)
    	   {
    		   hLoc += 37;
    		   int rand = (int)(Math.random() * 10 + 1);
    		   if (rand == 1)
    		   {
    			   //frame.dispose();
    			   PokemonGUI battle = new PokemonGUI();
    			   //createAndShowGUI();
    		   }
    	   }
       }
       else if (keyCode1 == KeyEvent.VK_UP && start == true)
       {
    	   button.setIcon(image2);
    	   if (vLoc > 80)
    	   {
    		   vLoc -= 40;
    		   int rand = (int)(Math.random() * 10 + 1);
    		   if (rand == 1)
    		   {
    			   //frame.dispose();
    			   PokemonGUI battle = new PokemonGUI();
    			   //createAndShowGUI();
    		   }
    	   }
       }
       else if (keyCode1 == KeyEvent.VK_DOWN && start == true)
       {
    	   button.setIcon(image3);
    	   if (vLoc < 540)
    	   {
    		   vLoc += 40;
    		   int rand = (int)(Math.random() * 10 + 1);
    		   if (rand == 1)
    		   {
    			   //frame.dispose();
    			   PokemonGUI battle = new PokemonGUI();
    			   //createAndShowGUI();
    		   }
    	   }
       }
       else if (keyCode1 == KeyEvent.VK_SPACE && start == false)
       {
    	   start = true;
    	   button.setIcon(image3);
    	   if (vLoc < 540)
    		   vLoc += 80;
       }
	   button.setLocation(hLoc, vLoc);
	   
   }

   public static void createAndShowGUI() 
   {
       JFrame.setDefaultLookAndFeelDecorated(true);
 
       //Create and set up the window.
       frame = new JFrame("Pokemon");
       frame.setBounds(0, 0, 850, 680);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       //Create and set up the content pane.
       JComponent newContentPane = new Map();
       //newContentPane.setOpaque(true); //content panes must be opaque
       frame.setContentPane(newContentPane);
       
       JLabel background=new JLabel(new ImageIcon(Map.class.getResource("grass_tile.png")));
       frame.add(background);
       JLabel l1 = new JLabel();
       background.add(l1);

       //Display the window.
       //frame.pack();
       frame.setVisible(true);
   }

   public static void main(String[] args) 
   {
       javax.swing.SwingUtilities.invokeLater(new Runnable() 
       {
           public void run() 
           {
               createAndShowGUI();
           }
       });
	   Map g1=new Map();
   }
}