package example;
import java.util.Scanner;
public class binary {
	public static void main(String args[]) {
		int n,s;
		String b="";
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		sc.close();
		while(n>0) {
		s=n%2;
		b=s+b;
		n=n/2;
		}
		System.out.println(b);
	}

}
