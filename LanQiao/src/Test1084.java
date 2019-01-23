import java.util.Scanner;

public class Test1084 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		for(int i=2;i<n;i++) {
			int j;
			for(j=2;j<i;j++) {
				if(i%j==0) break;
			}
			if(j==i) {
				System.out.println(i);
			}
		}
	}
}
