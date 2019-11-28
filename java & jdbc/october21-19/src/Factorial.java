public class Factorial {

	long fact(int num) {
		long fact = 1;
		for(int i = num; i > 0; i--) {
			fact = fact * i;
		}
		return fact;
	}
}