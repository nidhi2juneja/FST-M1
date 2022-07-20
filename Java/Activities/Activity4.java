package Activities;
import java.util.Arrays;

class Activity4 {
	static void dataSortInsertion(int arr[]) {
		int len_array = arr.length, i;

		for (i = 1; i < len_array; i++) {
			int val = arr[i];
			int j = i - 1;

			while (j >= 0 && val < arr[j]) {
				arr[j + 1] = arr[j];
				--j;
			}
			arr[j + 1] = val;
		}
	}

	public static void main(String args[]) {
		int[] arr_data = { 3, 6, 4, 1, 8 };
		dataSortInsertion(arr_data);
		System.out.println("Data sorted in ascending order" + Arrays.toString(arr_data));
	}

}