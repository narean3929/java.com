import java.util.Scanner;
import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
	
	Scanner kbd=new Scanner(System.in);
	int size=kbd.nextInt();
	int arr[]=new int[size];
	for(int i=0;i<size;i++)
	arr[i]=kbd.nextInt();
System.out.print(Arrays.toString(arr));	}
}
