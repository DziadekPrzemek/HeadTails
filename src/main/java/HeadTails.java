import java.util.Scanner;

public class HeadTails {

	private static Scanner in;

	public static void main(String[] args) {
		String[] coin = {"Head", "Tails"};
		System.out.println("How much times you want to throw the coin?");		
		in = new Scanner(System.in);
		int liczba = in.nextInt();
		int countHead = 0;
		int countTail = 0;
		int i = 0;
		
		do{
			
			int position = (int)(Math.random() * coin.length);
			System.out.println(coin[position]);
			i++;
		
			if(position==0) {
				
					countHead++;
					
				}else {
								
					countTail++;
						}
		}while(i<liczba);
		
		System.out.println("You throw Head " + countHead +" times");
		System.out.println("You throw Tail " + countTail +" times");
		
			

	}

}
