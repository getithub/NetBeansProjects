
package javaapplication2;

import java.util.*;
import java.lang.*;

public class time {
private int hours,mins,secs;
public time(){
    this(0,0,0);
}
public time(int h){
   this(h,0,0);
}
public time(int h,int m){
   this(h,m,0);
}
public time(int h,int m,int s)
    {
    hours=h;
    mins=m;
    secs=s;
    }
public String toString(){
   return String.format("%02d:%02d:%02d", hours,mins,secs);
}

}
