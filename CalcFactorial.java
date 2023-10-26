class CalcFactorial{
	public static int factorial(int num){
		int f = 1;
		while(num > 0){
			f = f * num;
			num--;
		}
		return f;
	}
	public static void main(String[] args){
		int num = Integer.parseInt(args[0]);
		int fact = factorial(num);
		System.out.println("Factorial : "+ fact);
	}
}