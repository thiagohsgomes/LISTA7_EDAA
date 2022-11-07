
public class recursiva {
	
	public static int Recursiva(int n) {
		int x;
		if(n <= 0){
			x = 1;
		}
		else
			x = Recursiva(n-1) + Recursiva(n-1);
		return x;
	}


	public static void main(String[] args) {
		
		int n = 0;
		int n1 = 1;
		int n2 = 2;
		int n3 = 3;
		int n4 = 4;
		int n5 = 10;
		
		System.out.println(recursiva.Recursiva(n));
		System.out.println(recursiva.Recursiva(n1));
		System.out.println(recursiva.Recursiva(n2));
		System.out.println(recursiva.Recursiva(n3));
		System.out.println(recursiva.Recursiva(n4));
		System.out.println(recursiva.Recursiva(n5));

		
	}

}
