package lab2;

public class CP4Fibonacci {

	static int Fibonacci(int n) {                 //operation
		if (n<=2) {
			return 1;
		}
		int f1 = 1;
		int f2 = 1;
		int f3 = 0;
		for (int i = 3; i <= n ; i++) {          // n - 2	
			f3 = f1 + f2;                        // 1
			f1 = f2;                             // 1
			f2 = f3;                             // 1
		}
		// T(n) = n + 1 = O(n);
		return f3;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Fibonacci(5));
		System.out.println(Fibonacci(6));
	}

}
