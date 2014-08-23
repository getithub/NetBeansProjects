/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javagui;
import java.awt.*;
import java.util.*;
import java.text.*;
import javax.swing.*;

/**
 *
 * @author anil
 */
public class datelabel extends JLabel{
    datelabel(){
    Date today=new Date();
    DateFormat df=DateFormat.getDateInstance(DateFormat.SHORT,Locale.US);
    String str=df.format(today);
    setText(str);
    }
}
