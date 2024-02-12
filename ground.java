package example;
import java.util.Scanner;
public class ground 
{
	public static void main(String args[])
	{
	Scanner sc= new Scanner(System.in);
	int n,m,total=0;
	n=sc.nextInt();
	m=sc.nextInt();
	int a[]= new int[n];
	int b[]= new int[m];
	for(int i=0;i<a.length;i++) {
		a[i]=sc.nextInt();
	}
	for(int j=0;j<b.length;j++) {
		b[j]=sc.nextInt();
	}
	sc.close();
	 for (int k = 0; k < a.length; k++) {
         int count = 0;
         for (int p = 0; p < b.length; p++) {
             if (a[k] == b[p]) {
                 count++;
                 break;
             }
         }
         if (count == 0) {
             System.out.println(a[k]);
             total++;
         }
     }	 for (int k = 0; k < b.length; k++) {
         int count = 0;

         for (int p = 0; p < a.length; p++) {
             if (b[k] == a[p]) {
                 count++;
                 break;
             }
         }
         if (count == 0) {
             System.out.println(b[k]);
             total++;
         }
     }
     System.out.println(total);
 }
}

