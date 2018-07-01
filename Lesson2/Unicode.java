public class Unicode{
	public static void main(String args[]){
		char[] ca = {33} {126};
for (int i = 0; i < 5; i++) {
    for (int j = 0; j < 20; j++) {
        String sc = new String(ca);
        System.out.print(sc + " ");
        ca[0]++; 
    }
    System.out.println();
}
	}
}