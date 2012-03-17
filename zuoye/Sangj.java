import java.util.Scanner;
public class Sangj {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int j, nspace = 0, bak, i;

		System.out.print("Please enter the num: ");
		int n = sc.nextInt();
		bak = n;

		System.out.println();
		for (n = n*2; n >= 2; n -= 2, nspace += 1) {
			for (j = 0; j < nspace; j++)
				System.out.print(" ");
			for (j = 0; j < n; j++)
				System.out.print("*");
			System.out.println();
		}
		System.out.println();

		for (i = 1; i <= bak; i++) {
			for (nspace = bak -i; nspace > 0; nspace--)
					  System.out.print(" ");
			for (j = 0; j < i; j++)
					  System.out.print("*");
			System.out.println();
		}
		System.out.println();
	}

}
