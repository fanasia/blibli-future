public class Factorial {
	public static void main(String[] args) {
		int angka = Integer.parseInt(args[0]);
		int fact = 1;
		for(int i = angka; i > 0; i--) {
			fact *= i;
		}
		System.out.println("Nilai faktorial dari " + angka + " adalah " + fact);

		System.out.println("-----Metode Rekursif-----");
		System.out.println("Nilai faktorial dari " + angka + " adalah " + factorial(angka));

		System.out.println("-----Metode Tail Rekursif-----");
		System.out.println("Nilai faktorial dari " + angka + " adalah " + tail_factorial(1, angka));
	}

	// Metode Recursive
	public static int factorial(int n) {
		if(n == 0 || n == 1) {
			return 1;
		}
		else {
			return n*factorial(n-1);
		}
	}

	//Metode Tail Recursive >> Gaada backtrack, jadi ga bakal stack overflow
	public static int tail_factorial(int result, int n) {
		if(n == 0 || n == 1) {
			return result;
		}
		else {
			return tail_factorial(result*n, n-1);
		}
	}
}