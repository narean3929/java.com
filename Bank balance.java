import java.util.Scanner;
public class cond1
{
	public static void main(String[] args) {
	    Scanner kbd=new Scanner(System.in);
	    char choice=kbd.next().charAt(0);
        switch(choice){
            case 'A': System.out.println("Withdraw"); break;
            case 'B': System.out.println("Deposit"); break;
            case 'C': System.out.println("Balance Check"); break;
            default: System.out.println("Thank you please enter A-C");
        }
        
	}
}
