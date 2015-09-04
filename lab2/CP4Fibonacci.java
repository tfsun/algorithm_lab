package lab2;

public class CP4Fibonacci {
	static int Fibonacci1(int n) {                 
		if(0 == n) return 0;									//c1+c2
		if(1 == n) return 1;									//c1+c2
		int f1 = 0, f2 = 1;										//c3
		
		for (int i = 2; i <= n ; i++) {          			//c3+c1*n+c4*(n-1)
			f2 = f1 + f2;                        				//c5*(n-1)
			f1 = f2 - f1;                           				//c5*(n-1)
		}
		return f2;												//c2
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Fibonacci1(0));
		System.out.println(Fibonacci1(1));
		System.out.println(Fibonacci1(2));
		System.out.println(Fibonacci1(3));
		System.out.println(Fibonacci1(4));
		System.out.println(Fibonacci1(5));
		System.out.println(Fibonacci1(6));
	}

}
