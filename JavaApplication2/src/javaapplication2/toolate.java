import java.util.*;
import java.lang.*;
public class toolate
{
    int i;
    String s=new String();
    public <T> void disp(T any){
        System.out.println(any);
    }
    public static void main(String[] args){
        toolate tl=new toolate();
        tl.disp("anil");
    }
}