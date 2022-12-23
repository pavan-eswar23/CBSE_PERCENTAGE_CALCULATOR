import java.util.Scanner;
public class cbsepercentagecalculator {
   /**
 * @param args
 */
public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        System.out.print("enter hindi marks out of 100:");
        int h=sc.nextInt();
        System.out.print("enter english marks out of 100:");
        int e=sc.nextInt();  
        System.out.print("enter Maths marks out of 100:");
        int m=sc.nextInt();  
        System.out.print("enter Science marks out of 100:");
        int si=sc.nextInt();  
        System.out.print("enter social marks out of 100:");
        int so=sc.nextInt();   
        final float percentage = (((h+e+m+si+so)/500.0f)*100.0f);
        System.out.println("percentage of student is:"+percentage);
    } 
   }
    
    
}
