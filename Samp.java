/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lcars;
import java.awt.*;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.border;
/**
 *
 * @author laure
 */


public class Samp extends Frame {
   private final Button[] starNumbers; 
    private final Button trekHash;
    private final Button btnStar;
   private final TextField tfDisplay;
 
   // Constructor to setup GUI components and event handlers
   public Samp () {
      // Set up display panel
      Panel panelDisplay = new Panel(new FlowLayout());
      tfDisplay = new TextField("WELCOME TO LCARS", 30);
      panelDisplay.add(tfDisplay);
 
      JButton button = new JButton();
      button.setBackground(Color.red);
      button.setOpaque(true);
      button.setBorderPainted(false);
      
      // Set up button panel
      Panel panelButtons = new Panel(new GridLayout(4, 3));
      panelButtons.setBackground(Color.red);
      starNumbers = new Button[10];  // make 10 Buttons
      starNumbers[1] = new Button("CPU/MEM");  // Construct Button "cpu"
      starNumbers[1].setBackground(Color.red);
      starNumbers[1].setForeground(Color.white);
      panelButtons.add(starNumbers[1]);  // The Panel adds this Button
      starNumbers[2] = new Button("PRIMARY");
      starNumbers[2].setBackground(Color.yellow);
      starNumbers[2].setForeground(Color.white);
      panelButtons.add(starNumbers[2]);
      starNumbers[3] = new Button("INFO");
      starNumbers[3].setBackground(Color.cyan);
      starNumbers[3].setForeground(Color.white);
      panelButtons.add(starNumbers[3]);
      starNumbers[4] = new Button("DATABASE");
      starNumbers[4].setBackground(Color.blue);
      starNumbers[4].setForeground(Color.white);
      panelButtons.add(starNumbers[4]);
      starNumbers[5] = new Button("BATTERY");
      starNumbers[5].setBackground(Color.cyan);
      starNumbers[5].setForeground(Color.white);
      panelButtons.add(starNumbers[5]);
      starNumbers[6] = new Button("SECONDARY");
      starNumbers[6].setBackground(Color.green);
      starNumbers[6].setForeground(Color.white);
      panelButtons.add(starNumbers[6]);
      starNumbers[7] = new Button("VISUALIZATION");
      starNumbers[7].setBackground(Color.magenta);
      starNumbers[7].setForeground(Color.white);
      panelButtons.add(starNumbers[7]);
      starNumbers[8] = new Button("NEWS");
      starNumbers[8].setBackground(Color.orange);
      starNumbers[8].setForeground(Color.white);
      panelButtons.add(starNumbers[8]);
      starNumbers[9] = new Button("NORMAL");
      starNumbers[9].setBackground(Color.gray);
      starNumbers[9].setForeground(Color.white);
      panelButtons.add(starNumbers[9]);
            //maybe add a loop
      btnStar = new Button("STEAM");
      panelButtons.add(btnStar);
      starNumbers[0] = new Button("ADDITIVE");
      panelButtons.add(starNumbers[0]);
      trekHash = new Button("TOGGLE MENUS");
      panelButtons.add(trekHash);
 
      setLayout(new BorderLayout());  // "super" Frame sets to BorderLayout
      add(panelDisplay, BorderLayout.NORTH);
      add(panelButtons, BorderLayout.CENTER);
 
      setTitle("BorderLayout Demo"); // "super" Frame sets title
      setSize(4000, 4000);             // "super" Frame sets initial size
      setVisible(true);              // "super" Frame
      
   }
 
   // The entry main() method
   public static void main(String[] args) {
      new Samp ();  // Let the constructor do the job
   }
}
   
