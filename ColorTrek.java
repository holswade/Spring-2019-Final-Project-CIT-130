/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lcars;
import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
/**
 *
 * @author laure
 */
public class ColorTrek {
    /*
<applet code="ChangeButtonBackgroundExample" width=200 height=200>
</applet>
*/
public class ChangeButtonBackgroundExample extends Applet{
 
	public void init(){
		
		//create buttons
		Button button1 = new Button("Button 1");
		Button button2 = new Button("Button 2");
		
		/*
		 * To change background color of a button use
		 * setBackground(Color c) method.
		 */
		
		button1.setBackground(Color.red);
		button2.setBackground(Color.green);
		
		//add buttons
		add(button1);
		add(button2);
	}
}