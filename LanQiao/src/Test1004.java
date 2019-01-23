import java.util.Scanner;

public class Test1004 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int[] a=new int[55];
		//123;
		a[0]=0;
		a[1]=1;
		a[2]=2;
		a[3]=3;
		a[4]=4;
		for(int i=5;i<55;i++) {
			a[i]=a[i-1]+a[i-3];
		}
		int j;
		while((j=in.nextInt())!=0) {
			System.out.println(a[j]);
		}
	}
}
