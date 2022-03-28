package autoproject;


import java.util.ArrayList;
import java.util.Arrays;

public class Punch {

	public static void main(String[] args) {
		/*var cards = ['Jack', 8, 2, 6, 'King', 5, 3, 'Queen']
		<!-- Requried Output = [2,3,5,6,8,'Jack','Queen','King']
		Q: Sort the array as per the rules of card game using generic method.
		Choose language of your choice.
		Sample output is attached.*/
		
		
		
		String cards[] =  {"Jack", "8", "2", "6", "King", "5", "3", "Queen"};
		Arrays.sort(cards);
		
			String temp;
			temp = cards[cards.length-1];
			cards[cards.length-1] = cards[cards.length-2];
			cards[cards.length-2] = temp;			
		
		System.out.println(Arrays.toString(cards));

		ArrayList<String> Cards = new ArrayList<String>();
		Cards.add(cards[0]);
		Cards.add(cards[1]);
		Cards.add(cards[2]);
		Cards.add(cards[3]);
		Cards.add(cards[4]);
		Cards.add(cards[5]);
		
		System.out.println(Cards);
		
		}
		
	}



