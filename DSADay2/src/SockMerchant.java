import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SockMerchant {
	public static void main(String[] args) {
		List<Integer> array2 = new ArrayList<Integer>();
		array2.add(1);
		array2.add(1);
		array2.add(2);
		array2.add(2);
		array2.add(3);
		array2.add(1);
		
		System.out.println(sockMerchant(6,array2));
	}

	public static int sockMerchant(int n, List<Integer> array) {
		Set<Integer> array1 = new HashSet<Integer>();
		int numPair = 0;
		for (int i = 0; i < array1.size(); i++) {
			if (array1.contains(array.get(i))) {
				array1.add(array.get(i));
			} else {
				array1.remove(array.get(i));
				numPair++;
			}
		}
		return numPair;
	}
}
