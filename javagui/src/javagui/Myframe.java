/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javagui;
import javax.swing.*;               
/**
 *
 * @author anil
 */
public class Myframe extends JFrame {
  public void createframe(){
       Myframe jf=new Myframe();
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(100,100);
        JButton b=new JButton("exit");
        jf.add(b);
        jf.add(new datelabel());
        jf.setVisible(true);
    }
}
