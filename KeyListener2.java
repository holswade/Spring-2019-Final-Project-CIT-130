/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lcars;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author laure
 */
// create panel
public class KeyListener2 {
    private static JFrame frame;
    private static KeyboardPanel keyboardPanel = new KeyboardPanel();
    
    /** Initalize UI*/
    public KeyListener2(){
        //Add the keyboard panel to to accept and display user input      
        // Set Focus
        keyboardPanel.setFocusable(true);
    }
    
    public static void main(String[] args){
        frame = new JFrame ("Star Trek");  
        frame.setSize(300,300);
        
        frame.add(keyboardPanel);
        
        frame.setLocationRelativeTo(null);// Center the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        
    }

    
     
    // Inner class: KeyboardPanel for receiving key input
    static class KeyboardPanel extends JPanel{
        private int x = 100;
        private int y = 100;
        private char keyChar = 'A'; //Default key
        
        public KeyboardPanel(){
            addKeyListener(new KeyAdapter(){
                @Override
                public void keyPressed(KeyEvent e){
                    System.out.println("Inside ListenerMethod");
                switch (e.getKeyCode()){
                    case KeyEvent.VK_DOWN: y += 10; break;
                    case KeyEvent.VK_UP: y -= 10; break;
                    case KeyEvent.VK_LEFT: x -=10; break;
                    case KeyEvent.VK_RIGHT: x +=10; break;
                    default: keyChar = e.getKeyChar();
                }
                repaint();
                }
            });
        }
        @Override/**Draw the character */
        protected void paintComponent(Graphics g){
            super.paintComponent(g);
            
            g.setFont(new Font("TimesRoman",Font.PLAIN, 24));
            g.drawString(String.valueOf(keyChar),x,y);
        }
    }
}
