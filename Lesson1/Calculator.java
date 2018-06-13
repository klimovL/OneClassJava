/* Реализовать калькулятор, который выполняет следующие действия
+, -, *, /, ^, %
над целыми числами
вывести результат работы */

public class Calculator {
	public static void main(String args []){
		int a = 45;
		int b = 34;
		char znak = '/';
			if (znak == '+'){
				System.out.print(a + b);
			
		} 
		else if (znak == '-') {
			System.out.println(a - b);
		}
		else if (znak == '/') {
			System.out.println(a / b);
		}
		else if (znak == '*') {
			System.out.println(a * b);
		}
		else {System.out.println(a % b);
		}
	}
}