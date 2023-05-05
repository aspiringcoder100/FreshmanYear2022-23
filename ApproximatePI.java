public class ApproximatePI {
	public static void main (String[] args) {
	double pi = 0;
	
	for (int i = 0; i <= 100000; i++) {
	pi += Math.pow(-1,i+1)/(2*i - 1);
	if (i % 10000 == 0) 
		
	System.out.println("i=" + i + " PI approximate: " + (4*pi));

	}

	}
}
