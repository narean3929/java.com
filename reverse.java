import java.util.Scanner;
public class cond1
{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
        char n = scan.next().charAt(0);
        for(char i='Z';i>=n;i--)
        System.out.print(i+" ");
    }
}
