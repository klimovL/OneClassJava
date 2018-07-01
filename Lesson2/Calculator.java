/* Реализовать калькулятор, который выполняет следующие действия
+, -, *, /, ^, %
над целыми числами
вывести результат работы */

public class Calculator {
	public static void main(String args []){
		int a = 45;
		int b = 34;
		char znak = '^';
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
		else if (znak == '%') { 
			System.out.println(a % b);
		}
		else if (znak == '^') {
			int c = a; // c=45
			for (int i = b; i == 1; i--) {
				// 1 иттерация. i = 34; i не равно 1 значит выполняю i--, после с = 2025 
				c = c * c; 
			} System.out.println(c);
		}
	}
}

