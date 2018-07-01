public class GuessNumber1 {
	public static void main(String[] args){
		int a = 46;
		int number = 23;
		System.out.println("Сыграем в игру 'Угадай число'");
		System.out.println("Введите число от 0 до 100");
			 
			if (number == a){
			System.out.println("Вы угадали!");
			}
			else if (number > a){
			System.out.println("Введенное вами число больше того, что загадал компьютер");
			}			
			
			else { 
			System.out.println("Введенное вами число меньше того, что загадал компьютер"); 
		}	
		while (number < a) {
			number++;
		} 
		while (number > a){
			number--;
		}
		System.out.println("Вы угадали");
	}
}
