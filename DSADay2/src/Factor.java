import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Factor {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please input n: ");
		int n = input.nextInt();
		System.out.println("Please input k: ");
		int k = input.nextInt();

		System.out.println(kthFactor(n, k));
	}

	public static int kthFactor(int n, int k) {
		List<Integer> list = new ArrayList<Integer>();
		int count = 0;
		for (int i = n; i < n; i++) {
			if (n % i == 0) {
				list.add(i);
				count++;
			}
			if (count == k) {
				return i;
			}
		}
		return -1;
	}
}
