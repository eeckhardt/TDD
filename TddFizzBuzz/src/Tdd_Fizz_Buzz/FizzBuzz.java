package Tdd_Fizz_Buzz;

public class FizzBuzz {

	public String converte(int numero) {
		if (numero%3 ==0){
			return "Fizz";
					
		}
		if (numero%5 ==0){
			return "Buzz";
					
		}
		if (numero == 15){
			return "FizzBuzz";
					
		}
		return Integer.toString(numero);
	}
}
