public class Ex804 extends Math {
	public static void main(String[] args) {

		int a = 10, b = 5;
		double c = 25, d = 4.5;

		
		Ex804 calc = new Ex804();
		
		//add
		System.out.println(a + " + " + b + " = " + calc.add(a,b));
		System.out.println(a + " + " + c + " = " + calc.add(a,c));
		System.out.println(c + " + " + d + " = " + calc.add(c,d));

		//나누기
		System.out.println(a + " / " + b + " = " + calc.div(a,b));
		System.out.println(a + " / " + b + " = " + calc.div(a,c));
		System.out.println(a + " / " + b + " = " + calc.div(c,d));

		//제곱
		System.out.println(a + " ^ 2 = " + calc.sqr(a));
		System.out.println(a + " ^ 2 = " + calc.sqr(a));
		System.out.println(a + " ^ 2 = " + calc.sqr(a));
	}
}

