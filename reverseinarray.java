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

	for(int i=size-1;i>=0;i--)
	System.out.print(arr[i]+" ");

System.out.print(Arrays.toString(arr));	
}}
