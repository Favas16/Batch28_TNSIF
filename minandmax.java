package example;
import java.util.Scanner;
import java.util.Arrays;



public class minandmax {
	public static void main(String []args) {
		
	
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++)
		arr[i]=sc.nextInt();
	Arrays.sort(arr);
	System.out.print(arr[0]+" "+arr[n-1]);
	sc.close();
	

}}
