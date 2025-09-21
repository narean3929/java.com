import java.util.Scanner;
public class Main {
   void factorial(int n)
   {
       int fact=1;
        for(int i=1;i<=n;i++)
        fact=fact*i;
        System.out.println(fact);
   }
        public static void main(String[] args) {
           Scanner oj=new Scanner (System.in);
           int limit=oj.nextInt();
           Main ob=new Main();
           ob.factorial(limit);
           
    }
}
