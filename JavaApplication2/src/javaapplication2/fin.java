package javaapplication2;

public class fin {
private final int ad ;
int sum;
public fin(int x){
    ad=x;
}
      public String toString(){
          sum+=ad;
          return String.format("the sum is %d",sum);
      }

}
