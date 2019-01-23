import java.util.Scanner;
import java.util.*;
public class Test1083 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		char c=(char)scanner.nextInt();
		String s=""+c;
//		int n;
		while(scanner.hasNext()) {
			c=(char)scanner.nextInt();
			s=s+c;
		}
		System.out.print(s);
	}
}
