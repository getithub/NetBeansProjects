/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication2;
import java.util.*;
import java.lang.*;
/**
 *
 * @author anil
 */
public enum enu {
    anil("good" , "29" , "m"),
    ravi("best" , "28" , "m"),
    praveen("excellent" , "30" , "m"),
    ani("goo" , "29" , "m"),
    rav("bes" , "28" , "m"),
    pra("exc" , "30" , "m");

    private final String desc;
    private final String year;
    private final String sex;

    enu(String description,String birthday,String gen){
        desc=description;
        year=birthday;
        sex=gen;
    }
    public String getDesc()
    {
        return desc;
        }
    public String getYear()
    {
        return year;
    }
    public String getSex(){
        return sex;
    }
}
