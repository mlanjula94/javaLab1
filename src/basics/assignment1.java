package basics;

public class assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumN(5));
		System.out.println(sumN(6));
		System.out.println(fact(3));
		System.out.println(fact(4));
		
		int a[]={33,3,4,5};
		
		System.out.println(minArr(a));
		System.out.println(maxArr(a));
		int summ = 196;
		summ /=1;
		System.out.println(summ);
	}

	
	
	public static int sumN(int n) {
		int sum = 0;
		while(n > 0) {
			sum = sum + n;
			n--;
		}
		return sum;
	}
	
	public static int fact(int n) {
		if(n == 1) {
			return 1;
		}
		else if(n == 0) {
			return 1;
		}
		return n*(fact(n-1));	
	}
	
	public static int minArr(int n[]) {
		int min = n[0]; 
		for(int i = 1; i< n.length; i++) {
			if(min > n[i]) {
				min = n[i];
			}
		}
		return min;
	}
	public static int maxArr(int n[]) {
		int max = n[0]; 
		for(int i = 1; i< n.length; i++) {
			if(max < n[i]) {
				max = n[i];
			}
		}
		return max;
	}
	public static double avgArr(int n[]) {
		double sum = 0; 
		for(int i = 0; i< n.length; i++) {
			sum = sum + n[i];
		}
		double avg = sum/n.length;
		return avg;
	}
		
}
	
	
		

                                                                                                                                                                                                                                                                                                                                                                                                                    
