public class Sigma {
	public static void main(String[] args){
		int sigma = 0;
		System.out.println("Semua angka yang dimasukkan adalah :");
		for (int i = 0; i < args.length; i++) {
			System.out.print(args[i] + " ");
		}
		System.out.println();

		//Bisa juga ngeprint String Array angka :) -> angka yg dimasukkan adalah + args[i]

		for (int i = 0; i < args.length; i++) {
			int angka = Integer.parseInt(args[i]);
			sigma += angka;
		}

		System.out.println("Maka totalnya adalah " + sigma);
	}
}