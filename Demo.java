
package demo;

import java.util.*;
public class Demo {

    
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      
      int t=sc.nextInt();
      int sum=0;
      int p=(int)Math.floor(Math.sqrt(t));
      for(int i=1;i<=p;i++){
          sum+=Math.floor(t/i)-(i-1);
       }
      System.out.println(sum);
    }
    
}
