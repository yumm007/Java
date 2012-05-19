
import java.util.*;

class my_cmp implements Comparator {
	public int compare(Object o1, Object o2) {
		int i1 = ((Integer)o1).intValue();
		int i2 = ((Integer)o2).intValue();
		if (i1 < i2){
			return 1;
		}
		if (i1 > i2){
			return -1;
		}
		return 0;
	}
}

public class InputAndSort  {

	public static void main(String[] argv) {
		int arr[]={88,2, 65, 43, 90, 23};
		java.util.Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
