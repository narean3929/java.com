import java.util.Scanner;
public class cond1
{
	public static void main(String[] args) {
	    Scanner kbd=new Scanner(System.in);
	    int year=kbd.nextInt();
        if(year%400==0 || year%100!=0&&year%4==0)
        System.out.println("leap year");
        else
        System.out.println("non leap year");
	}
}
