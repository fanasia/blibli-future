public class Bubble {
	public static void main(String[] args) {
		int[] nums = new int[args.length];
		int len = args.length;

		//Ubah Array of String args jd Array of int nums
		for (int i = 0; i < args.length; i++) {
			int angka = Integer.parseInt(args[i]);
			nums[i] = angka;
		}

		for(int i = 0; i < len; i++) {
			for(int j = 1; j < len; j++) {
				if(nums[j-1] > nums[j]) {
					int temp = nums[j-1];
					nums[j-1] = nums[j];
					nums[j] = temp;
				}
			}
		}

		//Ascending
		System.out.println("Hasil bubble sort adalah : ");
		for(int i = 0; i < len; i++) {
			System.out.print(nums[i] + " ");
		}
	}
}