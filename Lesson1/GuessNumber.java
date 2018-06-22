import java.util.Scanner; // идёт импорт сканера

public class GuessNumber {
	public static void main(String[] args){
		int number;
		int a = (int) ( Math.random() * 100 );
		System.out.println("Сыграем в игру 'Угадай число'");
		System.out.println("Введите число от 0 до 100");
		Scanner scan = new Scanner(System.in);
		do {
			 number = scan.nextInt();
			if (number == a){
			System.out.println("Вы угадали!");
			}
			else if (number > a){
			System.out.println("Введенное вами число больше того, что загадал компьютер");
			}
			else {
			System.out.println("Введенное вами число меньше того, что загадал компьютер");
		}
		} while (number != a);
	}
}
