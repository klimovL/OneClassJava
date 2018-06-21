/* Сложение строк имеет тот же приоритет, что и обыкновенное сложение чисел. Исправьте ошибку, 
связанную с приоритетом операций, в представленном коде. */
public class Rows2{
	public static void main (String[] args){

int first = 100;
int second = 500;

System.out.println("Сумма: " + (first + second) + "; полусумма: " + ((first + second) / 2) + ".");

	}
}