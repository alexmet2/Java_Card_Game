import java.util.*;

public class Java_Card_Game {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		Scanner card_scan = new Scanner (System.in);
		int heart,diamond,club,spade;
		int player_1_points = 0,player_2_points = 0;
		Integer[] heart_cards = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		Integer[] diamond_cards = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		Integer[] club_cards = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		Integer[] spade_cards = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		System.out.println("Hello");
		System.out.println("Player 1, please say your name: ");
		String player1 = scan.nextLine();
		System.out.println();
		System.out.println("Player 2, please say your name: ");
		String player2 = scan.nextLine();
		System.out.println();
		System.out.println("Ok " + player1 + " and " + player2 + ", let's begin!\n");
		System.out.println("Now we have to shuffle the cards, and give you 5 cards each.");
		System.out.println("The player with the biggest card, wins. Good luck!");
		System.out.println();
		//shuffle for hearts
		List<Integer> list_heart =Arrays.asList(heart_cards);
		Collections.shuffle(list_heart);
		list_heart.toArray(heart_cards);
		//shuffle for diamond
		List<Integer> list_diamond =Arrays.asList(diamond_cards);
		Collections.shuffle(list_diamond);
		list_diamond.toArray(diamond_cards);
		//shuffle for club
		List<Integer> list_club =Arrays.asList(club_cards);
		Collections.shuffle(list_club);
		list_club.toArray(club_cards);
		//shuffle for spade
		List<Integer> list_spade =Arrays.asList(spade_cards);
		Collections.shuffle(list_spade);
		list_spade.toArray(spade_cards);
		
		scan.close();
		//1st round
		System.out.println("Heart round\n");
		heart = heart(heart_cards,card_scan,player1,player2);
		if (heart == 1) {
			System.out.println(player1 + " you won this round!\n");
			player_1_points++;
		}
		else if (heart == 0) {
			System.out.println(player2 + " you won this round!\n");
			player_2_points++;
		}
		
		//2nd round
		System.out.println("Diamond round\n");
		diamond = diamond(diamond_cards,card_scan,player1,player2);
		if (diamond == 1) {
			System.out.println(player1 + " you won this round!\n");
			player_1_points++;
		}
		else if (diamond == 0) {
			System.out.println(player2 + " you won this round!\n");
			player_2_points++;
		}
		
		//3rd round
		System.out.println("Club round\n");
		club = club(club_cards,card_scan,player1,player2);
		if (club == 1) {
			System.out.println(player1 + " you won this round!\n");
			player_1_points++;
		}
		else if (club == 0) {
			System.out.println(player2 + " you won this round!\n");
			player_2_points++;
		}
		
		//4th round
		System.out.println("Spade round\n");
		spade = spade(spade_cards,card_scan,player1,player2);
		if (spade == 1) {
			System.out.println(player1 + " you won this round!\n");
			player_1_points++;
		}
		else if (spade == 0) {
			System.out.println(player2 + " you won this round!");
			player_2_points++;
		}
		
		//Results
		if (player_1_points > player_2_points) {
			System.out.println("Congratulations " + player1 + "! You won!");
		}
		else if (player_1_points < player_2_points) {
			System.out.println("Congratulations " + player2 + "! You won!");
		}
		else if (player_1_points == player_2_points) {
			System.out.println("It ended in a tie!");
		}
		
	}
	static int heart(Integer[] heart_cards, Scanner card_scan,String player1,String player2) {
		Integer[] heart_cards_player_1 = new Integer [5];
		Integer[] heart_cards_player_2 = new Integer [5];
		int help = 0;
		int final_heart1 = 0,final_heart2 = 0;
		int final_heart = 0;
		for(int i11 = 0;i11<5;i11++) {
			heart_cards_player_1[i11] = heart_cards[i11];
		}
		for(int i12 = 5;i12<10;i12++) {
			heart_cards_player_2[help] = heart_cards[i12];
			help++;
		}
		
		//first player 1
		
		if (heart_cards_player_1[0] > heart_cards_player_2[0]) {
			if (heart_cards_player_1[0] == 11) {
				System.out.println(player1 + " had J which is bigger than " + heart_cards_player_2[0]);
			}
			else if (heart_cards_player_1[0] == 12) {
				System.out.print(player1 + " had Q which is bigger than ");
				if (heart_cards_player_2[0] == 11) {
					System.out.println(" J");
				}
				else {
					System.out.println(heart_cards_player_2[0]);
				}
			}
			else if (heart_cards_player_1[0] == 13) {
				System.out.print(player1 + " had K which is bigger than ");
				if (heart_cards_player_2[0] == 12) {
					System.out.println(" Q");
				}
				else if (heart_cards_player_2[0] == 11) {
					System.out.println(" J");
				}
				else {
					System.out.println(heart_cards_player_2[0]);
				}
			}
			else {
				System.out.println(player1 + " had " + heart_cards_player_1[0] + " which is bigger than " + heart_cards_player_2[0]);
			}
			System.out.println(player1 + " won a point!");
			System.out.println();
			final_heart1++;
		}
		
		//first player 2
		
		else if (heart_cards_player_1[0] < heart_cards_player_2[0]) {
			if (heart_cards_player_2[0] == 11) {
				System.out.println(player2 + " had J which is bigger than " + heart_cards_player_1[0]);
			}
			else if (heart_cards_player_2[0] == 12) {
				System.out.print(player2 + " had Q which is bigger than ");
				if (heart_cards_player_1[0] == 11) {
					System.out.println(" J");
				}
				else {
					System.out.println(heart_cards_player_1[0]);
				}
			}
			else if (heart_cards_player_2[0] == 13) {
				System.out.print(player2 + " had K which is bigger than ");
				if (heart_cards_player_1[0] == 12) {
					System.out.println(" Q");
				}
				else if (heart_cards_player_1[0] == 11) {
					System.out.println(" J");
				}
				else {
					System.out.println(heart_cards_player_1[0]);
				}
			}
			else {
				System.out.println(player2 + " had " + heart_cards_player_2[0] + " which is bigger than " + heart_cards_player_1[0]);
			}
			System.out.println(player2 + " won a point!");
			System.out.println();
			final_heart2++;
		}
		
		//second player 1
		
		if (heart_cards_player_1[1] > heart_cards_player_2[1]) {
			if (heart_cards_player_1[1] == 11) {
				System.out.println(player1 + " had J which is bigger than " + heart_cards_player_2[1]);
			}
			else if (heart_cards_player_1[1] == 12) {
				System.out.print(player1 + " had Q which is bigger than ");
				if (heart_cards_player_2[1] == 11) {
					System.out.println(" J");
				}
				else {
					System.out.println(heart_cards_player_2[1]);
				}
			}
			else if (heart_cards_player_1[1] == 13) {
				System.out.print(player1 + " had K which is bigger than ");
				if (heart_cards_player_2[1] == 12) {
					System.out.println(" Q");
				}
				else if (heart_cards_player_2[1] == 11) {
					System.out.println(" J");
				}
				else {
					System.out.println(heart_cards_player_2[1]);
				}
			}
			else {
				System.out.println(player1 + " had " + heart_cards_player_1[1] + " which is bigger than " + heart_cards_player_2[1]);
			}
			System.out.println(player1 + " won a point!");
			System.out.println();
			final_heart1++;
		}
		
		//second player 2
		
		else if (heart_cards_player_1[1] < heart_cards_player_2[1]) {
			if (heart_cards_player_2[1] == 11) {
				System.out.println(player2 + " had J which is bigger than " + heart_cards_player_1[1]);
			}
			else if (heart_cards_player_2[1] == 12) {
				System.out.print(player2 + " had Q which is bigger than ");
				if (heart_cards_player_1[1] == 11) {
					System.out.println(" J");
				}
				else {
					System.out.println(heart_cards_player_1[1]);
				}
			}
			else if (heart_cards_player_2[1] == 13) {
				System.out.print(player2 + " had K which is bigger than ");
				if (heart_cards_player_1[1] == 12) {
					System.out.println(" Q");
				}
				else if (heart_cards_player_1[1] == 11) {
					System.out.println(" J");
				}
				else {
					System.out.println(heart_cards_player_1[1]);
				}
			}
			else {
				System.out.println(player2 + " had " + heart_cards_player_2[1] + " which is bigger than " + heart_cards_player_1[1]);
			}
			System.out.println(player2 + " won a point!");
			System.out.println();
			final_heart2++;
		}
		
		//third player 1
		
		if (heart_cards_player_1[2] > heart_cards_player_2[2]) {
			if (heart_cards_player_1[2] == 11) {
				System.out.println(player1 + " had J which is bigger than " + heart_cards_player_2[2]);
			}
			else if (heart_cards_player_1[2] == 12) {
				System.out.print(player1 + " had Q which is bigger than ");
				if (heart_cards_player_2[2] == 11) {
					System.out.println(" J");
				}
				else {
					System.out.println(heart_cards_player_2[2]);
				}
			}
			else if (heart_cards_player_1[2] == 13) {
				System.out.print(player1 + " had K which is bigger than ");
				if (heart_cards_player_2[2] == 12) {
					System.out.println(" Q");
				}
				else if (heart_cards_player_2[2] == 11) {
					System.out.println(" J");
				}
				else {
					System.out.println(heart_cards_player_2[2]);
				}
			}
			else {
				System.out.println(player1 + " had " + heart_cards_player_1[2] + " which is bigger than " + heart_cards_player_2[2]);
			}
			System.out.println(player1 + " won a point!");
			System.out.println();
			final_heart1++;
		}
		
		//third player 2
		
		if (heart_cards_player_1[2] < heart_cards_player_2[2]) {
			if (heart_cards_player_2[2] == 11) {
				System.out.println(player2 + " had J which is bigger than " + heart_cards_player_1[2]);
			}
			else if (heart_cards_player_2[2] == 12) {
				System.out.print(player2 + " had Q which is bigger than ");
				if (heart_cards_player_1[2] == 11) {
					System.out.println(" J");
				}
				else {
					System.out.println(heart_cards_player_1[2]);
				}
			}
			else if (heart_cards_player_2[2] == 13) {
				System.out.print(player2 + " had K which is bigger than ");
				if (heart_cards_player_1[2] == 12) {
					System.out.println(" Q");
				}
				else if (heart_cards_player_1[2] == 11) {
					System.out.println(" J");
				}
				else {
					System.out.println(heart_cards_player_1[2]);
				}
			}
			else {
				System.out.println(player2 + " had " + heart_cards_player_2[2] + " which is bigger than " + heart_cards_player_1[2]);
			}
			System.out.println(player2 + " won a point!");
			System.out.println();
			final_heart2++;
		}
		
		//fourth player 1
		
		if (heart_cards_player_1[3] > heart_cards_player_2[3]) {
			if (heart_cards_player_1[3] == 11) {
				System.out.println(player1 + " had J which is bigger than " + heart_cards_player_2[3]);
			}
			else if (heart_cards_player_1[3] == 12) {
				System.out.print(player1 + " had Q which is bigger than ");
				if (heart_cards_player_2[3] == 11) {
					System.out.println(" J");
				}
				else {
					System.out.println(heart_cards_player_2[3]);
				}
			}
			else if (heart_cards_player_1[3] == 13) {
				System.out.print(player1 + " had K which is bigger than ");
				if (heart_cards_player_2[3] == 12) {
					System.out.println(" Q");
				}
				else if (heart_cards_player_2[3] == 11) {
					System.out.println(" J");
				}
				else {
					System.out.println(heart_cards_player_2[3]);
				}
			}
			else {
				System.out.println(player1 + " had " + heart_cards_player_1[3] + " which is bigger than " + heart_cards_player_2[3]);
			}
			System.out.println(player1 + " won a point!");
			System.out.println();
			final_heart1++;
		}
		
		//Fourth player 2
		
		if (heart_cards_player_1[3] < heart_cards_player_2[3]) {
			if (heart_cards_player_2[3] == 11) {
				System.out.println(player2 + " had J which is bigger than " + heart_cards_player_1[3]);
			}
			else if (heart_cards_player_2[3] == 12) {
				System.out.print(player2 + " had Q which is bigger than ");
				if (heart_cards_player_1[3] == 11) {
					System.out.println(" J");
				}
				else {
					System.out.println(heart_cards_player_1[3]);
				}
			}
			else if (heart_cards_player_2[3] == 13) {
				System.out.print(player2 + " had K which is bigger than ");
				if (heart_cards_player_1[3] == 12) {
					System.out.println(" Q");
				}
				else if (heart_cards_player_1[3] == 11) {
					System.out.println(" J");
				}
				else {
					System.out.println(heart_cards_player_1[3]);
				}
			}
			else {
				System.out.println(player2 + " had " + heart_cards_player_2[3] + " which is bigger than " + heart_cards_player_1[3]);
			}
			System.out.println(player2 + " won a point!");
			System.out.println();
			final_heart2++;
		}
		
		//fifth player 1
		
		if (heart_cards_player_1[4] > heart_cards_player_2[4]) {
			if (heart_cards_player_1[4] == 11) {
				System.out.println(player1 + " had J which is bigger than " + heart_cards_player_2[4]);
			}
			else if (heart_cards_player_1[4] == 12) {
				System.out.print(player1 + " had Q which is bigger than ");
				if (heart_cards_player_2[4] == 11) {
					System.out.println(" J");
				}
				else {
					System.out.println(heart_cards_player_2[4]);
				}
			}
			else if (heart_cards_player_1[4] == 13) {
				System.out.print(player1 + " had K which is bigger than ");
				if (heart_cards_player_2[4] == 12) {
					System.out.println(" Q");
				}
				else if (heart_cards_player_2[4] == 11) {
					System.out.println(" J");
				}
				else {
					System.out.println(heart_cards_player_2[4]);
				}
			}
			else {
				System.out.println(player1 + " had " + heart_cards_player_1[4] + " which is bigger than " + heart_cards_player_2[4]);
			}
			System.out.println(player1 + " won a point!");
			System.out.println();
			final_heart1++;
		}
		
		//fifth player 2
		
		if (heart_cards_player_1[4] < heart_cards_player_2[4]) {
			if (heart_cards_player_2[4] == 11) {
				System.out.println(player2 + " had J which is bigger than " + heart_cards_player_1[4]);
			}
			else if (heart_cards_player_2[4] == 12) {
				System.out.print(player2 + " had Q which is bigger than ");
				if (heart_cards_player_1[4] == 11) {
					System.out.println(" J");
				}
				else {
					System.out.println(heart_cards_player_1[4]);
				}
			}
			else if (heart_cards_player_2[4] == 13) {
				System.out.print(player2 + " had K which is bigger than ");
				if (heart_cards_player_1[4] == 12) {
					System.out.println(" Q");
				}
				else if (heart_cards_player_1[4] == 11) {
					System.out.println(" J");
				}
				else {
					System.out.println(heart_cards_player_1[4]);
				}
			}
			else {
				System.out.println(player2 + " had " + heart_cards_player_2[4] + " which is bigger than " + heart_cards_player_1[4]);
			}
			System.out.println(player2 + " won a point!");
			System.out.println();
			final_heart2++;
		}
		
		//final result
		
		if (final_heart1 > final_heart2) {
			final_heart = 1;
		}
		else if (final_heart1 < final_heart2) {
			final_heart = 0;
		}
		return final_heart;
	}
	static int diamond(Integer[] diamond_cards, Scanner card_scan,String player1,String player2) {
		Integer[] diamond_cards_player_1 = new Integer [5];
		Integer[] diamond_cards_player_2 = new Integer [5];
		int help = 0;
		int final_diamond1 = 0,final_diamond2 = 0;
		int final_diamond = 0;
		for(int i11 = 0;i11<5;i11++) {
			diamond_cards_player_1[i11] = diamond_cards[i11];
		}
		for(int i12 = 5;i12<10;i12++) {
			diamond_cards_player_2[help] = diamond_cards[i12];
			help++;
		}
		
		//first player 1
		if (diamond_cards_player_1[0] > diamond_cards_player_2[0]) {
			if (diamond_cards_player_1[0] == 11) {
				System.out.println(player1 + " had J which is bigger than " + diamond_cards_player_2[0]);
			}
			else if (diamond_cards_player_1[0] == 12) {
				System.out.print(player1 + " had Q which is bigger than ");
				if (diamond_cards_player_2[0] == 11) {
					System.out.println(" J");
				}
				else {
					System.out.println(diamond_cards_player_2[0]);
				}
			}
			else if (diamond_cards_player_1[0] == 13) {
				System.out.print(player1 + " had K which is bigger than ");
				if (diamond_cards_player_2[0] == 12) {
					System.out.println(" Q");
				}
				else if (diamond_cards_player_2[0] == 11) {
					System.out.println(" J");
				}
				else {
					System.out.println(diamond_cards_player_2[0]);
				}
			}
			else {
				System.out.println(player1 + " had " + diamond_cards_player_1[0] + " which is bigger than " + diamond_cards_player_2[0]);
			}
			System.out.println(player1 + " won a point!");
			System.out.println();
			final_diamond1++;
		}
		
		//first player 2
		
		else if (diamond_cards_player_1[0] < diamond_cards_player_2[0]) {
			if (diamond_cards_player_2[0] == 11) {
				System.out.println(player2 + " had J which is bigger than " + diamond_cards_player_1[0]);
			}
			else if (diamond_cards_player_2[0] == 12) {
				System.out.print(player2 + " had Q which is bigger than ");
				if (diamond_cards_player_1[0] == 11) {
					System.out.println(" J");
				}
				else {
					System.out.println(diamond_cards_player_1[0]);
				}
			}
			else if (diamond_cards_player_2[0] == 13) {
				System.out.print(player2 + " had K which is bigger than ");
				if (diamond_cards_player_1[0] == 12) {
					System.out.println(" Q");
				}
				else if (diamond_cards_player_1[0] == 11) {
					System.out.println(" J");
				}
				else {
					System.out.println(diamond_cards_player_1[0]);
				}
			}
			else {
				System.out.println(player2 + " had " + diamond_cards_player_2[0] + " which is bigger than " + diamond_cards_player_1[0]);
			}
			System.out.println(player2 + " won a point!");
			System.out.println();
			final_diamond2++;
		}
		
		//second player 1
		
		if (diamond_cards_player_1[1] > diamond_cards_player_2[1]) {
			if (diamond_cards_player_1[1] == 11) {
				System.out.println(player1 + " had J which is bigger than " + diamond_cards_player_2[1]);
			}
			else if (diamond_cards_player_1[1] == 12) {
				System.out.print(player1 + " had Q which is bigger than ");
				if (diamond_cards_player_2[1] == 11) {
					System.out.println(" J");
				}
				else {
					System.out.println(diamond_cards_player_2[1]);
				}
			}
			else if (diamond_cards_player_1[1] == 13) {
				System.out.print(player1 + " had K which is bigger than ");
				if (diamond_cards_player_2[1] == 12) {
					System.out.println(" Q");
				}
				else if (diamond_cards_player_2[1] == 11) {
					System.out.println(" J");
				}
				else {
					System.out.println(diamond_cards_player_2[1]);
				}
			}
			else {
				System.out.println(player1 + " had " + diamond_cards_player_1[1] + " which is bigger than " + diamond_cards_player_2[1]);
			}
			System.out.println(player1 + " won a point!");
			System.out.println();
			final_diamond1++;
		}
		
		//second player 2
		
		else if (diamond_cards_player_1[1] < diamond_cards_player_2[1]) {
			if (diamond_cards_player_2[1] == 11) {
				System.out.println(player2 + " had J which is bigger than " + diamond_cards_player_1[1]);
			}
			else if (diamond_cards_player_2[1] == 12) {
				System.out.print(player2 + " had Q which is bigger than ");
				if (diamond_cards_player_1[1] == 11) {
					System.out.println(" J");
				}
				else {
					System.out.println(diamond_cards_player_1[1]);
				}
			}
			else if (diamond_cards_player_2[1] == 13) {
				System.out.print(player2 + " had K which is bigger than ");
				if (diamond_cards_player_1[1] == 12) {
					System.out.println(" Q");
				}
				else if (diamond_cards_player_1[1] == 11) {
					System.out.println(" J");
				}
				else {
					System.out.println(diamond_cards_player_1[1]);
				}
			}
			else {
				System.out.println(player2 + " had " + diamond_cards_player_2[1] + " which is bigger than " + diamond_cards_player_1[1]);
			}
			System.out.println(player2 + " won a point!");
			System.out.println();
			final_diamond2++;
		}
		
		//third player 1
		
		if (diamond_cards_player_1[2] > diamond_cards_player_2[2]) {
			if (diamond_cards_player_1[2] == 11) {
				System.out.println(player1 + " had J which is bigger than " + diamond_cards_player_2[2]);
			}
			else if (diamond_cards_player_1[2] == 12) {
				System.out.print(player1 + " had Q which is bigger than ");
				if (diamond_cards_player_2[2] == 11) {
					System.out.println(" J");
				}
				else {
					System.out.println(diamond_cards_player_2[2]);
				}
			}
			else if (diamond_cards_player_1[2] == 13) {
				System.out.print(player1 + " had K which is bigger than ");
				if (diamond_cards_player_2[2] == 12) {
					System.out.println(" Q");
				}
				else if (diamond_cards_player_2[2] == 11) {
					System.out.println(" J");
				}
				else {
					System.out.println(diamond_cards_player_2[2]);
				}
			}
			else {
				System.out.println(player1 + " had " + diamond_cards_player_1[2] + " which is bigger than " + diamond_cards_player_2[2]);
			}
			System.out.println(player1 + " won a point!");
			System.out.println();
			final_diamond1++;
		}
		
		//third player 2
		
		if (diamond_cards_player_1[2] < diamond_cards_player_2[2]) {
			if (diamond_cards_player_2[2] == 11) {
				System.out.println(player2 + " had J which is bigger than " + diamond_cards_player_1[2]);
			}
			else if (diamond_cards_player_2[2] == 12) {
				System.out.print(player2 + " had Q which is bigger than ");
				if (diamond_cards_player_1[2] == 11) {
					System.out.println(" J");
				}
				else {
					System.out.println(diamond_cards_player_1[2]);
				}
			}
			else if (diamond_cards_player_2[2] == 13) {
				System.out.print(player2 + " had K which is bigger than ");
				if (diamond_cards_player_1[2] == 12) {
					System.out.println(" Q");
				}
				else if (diamond_cards_player_1[2] == 11) {
					System.out.println(" J");
				}
				else {
					System.out.println(diamond_cards_player_1[2]);
				}
			}
			else {
				System.out.println(player2 + " had " + diamond_cards_player_2[2] + " which is bigger than " + diamond_cards_player_1[2]);
			}
			System.out.println(player2 + " won a point!");
			System.out.println();
			final_diamond2++;
		}
		
		//fourth player 1
		
		if (diamond_cards_player_1[3] > diamond_cards_player_2[3]) {
			if (diamond_cards_player_1[3] == 11) {
				System.out.println(player1 + " had J which is bigger than " + diamond_cards_player_2[3]);
			}
			else if (diamond_cards_player_1[3] == 12) {
				System.out.print(player1 + " had Q which is bigger than ");
				if (diamond_cards_player_2[3] == 11) {
					System.out.println(" J");
				}
				else {
					System.out.println(diamond_cards_player_2[3]);
				}
			}
			else if (diamond_cards_player_1[3] == 13) {
				System.out.print(player1 + " had K which is bigger than ");
				if (diamond_cards_player_2[3] == 12) {
					System.out.println(" Q");
				}
				else if (diamond_cards_player_2[3] == 11) {
					System.out.println(" J");
				}
				else {
					System.out.println(diamond_cards_player_2[3]);
				}
			}
			else {
				System.out.println(player1 + " had " + diamond_cards_player_1[3] + " which is bigger than " + diamond_cards_player_2[3]);
			}
			System.out.println(player1 + " won a point!");
			System.out.println();
			final_diamond1++;
		}
		
		//fourth player 2
		
		if (diamond_cards_player_1[3] < diamond_cards_player_2[3]) {
			if (diamond_cards_player_2[3] == 11) {
				System.out.println(player2 + " had J which is bigger than " + diamond_cards_player_1[3]);
			}
			else if (diamond_cards_player_2[3] == 12) {
				System.out.print(player2 + " had Q which is bigger than ");
				if (diamond_cards_player_1[3] == 11) {
					System.out.println(" J");
				}
				else {
					System.out.println(diamond_cards_player_1[3]);
				}
			}
			else if (diamond_cards_player_2[3] == 13) {
				System.out.print(player2 + " had K which is bigger than ");
				if (diamond_cards_player_1[3] == 12) {
					System.out.println(" Q");
				}
				else if (diamond_cards_player_1[3] == 11) {
					System.out.println(" J");
				}
				else {
					System.out.println(diamond_cards_player_1[3]);
				}
			}
			else {
				System.out.println(player2 + " had " + diamond_cards_player_2[3] + " which is bigger than " + diamond_cards_player_1[3]);
			}
			System.out.println(player2 + " won a point!");
			System.out.println();
			final_diamond2++;
		}
		
		//fifth player 1
		
		if (diamond_cards_player_1[4] > diamond_cards_player_2[4]) {
			if (diamond_cards_player_1[4] == 11) {
				System.out.println(player1 + " had J which is bigger than " + diamond_cards_player_2[4]);
			}
			else if (diamond_cards_player_1[4] == 12) {
				System.out.print(player1 + " had Q which is bigger than ");
				if (diamond_cards_player_2[4] == 11) {
					System.out.println(" J");
				}
				else {
					System.out.println(diamond_cards_player_2[4]);
				}
			}
			else if (diamond_cards_player_1[4] == 13) {
				System.out.print(player1 + " had K which is bigger than ");
				if (diamond_cards_player_2[4] == 12) {
					System.out.println(" Q");
				}
				else if (diamond_cards_player_2[4] == 11) {
					System.out.println(" J");
				}
				else {
					System.out.println(diamond_cards_player_2[4]);
				}
			}
			else {
				System.out.println(player1 + " had " + diamond_cards_player_1[4] + " which is bigger than " + diamond_cards_player_2[4]);
			}
			System.out.println(player1 + " won a point!");
			System.out.println();
			final_diamond1++;
		}
		
		//fifth player 2
		
		if (diamond_cards_player_1[4] < diamond_cards_player_2[4]) {
			if (diamond_cards_player_2[4] == 11) {
				System.out.println(player2 + " had J which is bigger than " + diamond_cards_player_1[4]);
			}
			else if (diamond_cards_player_2[4] == 12) {
				System.out.print(player2 + " had Q which is bigger than ");
				if (diamond_cards_player_1[4] == 11) {
					System.out.println(" J");
				}
				else {
					System.out.println(diamond_cards_player_1[4]);
				}
			}
			else if (diamond_cards_player_2[4] == 13) {
				System.out.print(player2 + " had K which is bigger than ");
				if (diamond_cards_player_1[4] == 12) {
					System.out.println(" Q");
				}
				else if (diamond_cards_player_1[4] == 11) {
					System.out.println(" J");
				}
				else {
					System.out.println(diamond_cards_player_1[4]);
				}
			}
			else {
				System.out.println(player2 + " had " + diamond_cards_player_2[4] + " which is bigger than " + diamond_cards_player_1[4]);
			}
			System.out.println(player2 + " won a point!");
			System.out.println();
			final_diamond2++;
		}
		
		//final result 
		
		if (final_diamond1 > final_diamond2) {
			final_diamond = 1;
		}
		else if (final_diamond1 < final_diamond2) {
			final_diamond = 0;
		}
		return final_diamond;
		
		
	}
	static int club(Integer[] club_cards, Scanner card_scan,String player1,String player2) {
		Integer[] club_cards_player_1 = new Integer [5];
		Integer[] club_cards_player_2 = new Integer [5];
		int help = 0;
		int final_club1 = 0,final_club2 = 0;
		int final_club = 0;
		for(int i11 = 0;i11<5;i11++) {
			club_cards_player_1[i11] = club_cards[i11];
		}
		for(int i12 = 5;i12<10;i12++) {
			club_cards_player_2[help] = club_cards[i12];
			help++;
		}
		
		//first player 1
		
		if (club_cards_player_1[0] > club_cards_player_2[0]) {
			if (club_cards_player_1[0] == 11) {
				System.out.println(player1 + " had J which is bigger than " + club_cards_player_2[0]);
			}
			else if (club_cards_player_1[0] == 12) {
				System.out.print(player1 + " had Q which is bigger than ");
				if (club_cards_player_2[0] == 11) {
					System.out.println(" J");
				}
				else {
					System.out.println(club_cards_player_2[0]);
				}
			}
			else if (club_cards_player_1[0] == 13) {
				System.out.print(player1 + " had K which is bigger than ");
				if (club_cards_player_2[0] == 12) {
					System.out.println(" Q");
				}
				else if (club_cards_player_2[0] == 11) {
					System.out.println(" J");
				}
				else {
					System.out.println(club_cards_player_2[0]);
				}
			}
			else {
				System.out.println(player1 + " had " + club_cards_player_1[0] + " which is bigger than " + club_cards_player_2[0]);
			}
			System.out.println(player1 + " won a point!");
			System.out.println();
			final_club1++;
		}
		
		//first player 2
		
		else if (club_cards_player_1[0] < club_cards_player_2[0]) {
			if (club_cards_player_2[0] == 11) {
				System.out.println(player2 + " had J which is bigger than " + club_cards_player_1[0]);
			}
			else if (club_cards_player_2[0] == 12) {
				System.out.print(player2 + " had Q which is bigger than ");
				if (club_cards_player_1[0] == 11) {
					System.out.println(" J");
				}
				else {
					System.out.println(club_cards_player_1[0]);
				}
			}
			else if (club_cards_player_2[0] == 13) {
				System.out.print(player2 + " had K which is bigger than ");
				if (club_cards_player_1[0] == 12) {
					System.out.println(" Q");
				}
				else if (club_cards_player_1[0] == 11) {
					System.out.println(" J");
				}
				else {
					System.out.println(club_cards_player_1[0]);
				}
			}
			else {
				System.out.println(player2 + " had " + club_cards_player_2[0] + " which is bigger than " + club_cards_player_1[0]);
			}
			System.out.println(player2 + " won a point!");
			System.out.println();
			final_club2++;
		}
		
		//second player 1
		
		if (club_cards_player_1[1] > club_cards_player_2[1]) {
			if (club_cards_player_1[1] == 11) {
				System.out.println(player1 + " had J which is bigger than " + club_cards_player_2[1]);
			}
			else if (club_cards_player_1[1] == 12) {
				System.out.print(player1 + " had Q which is bigger than ");
				if (club_cards_player_2[1] == 11) {
					System.out.println(" J");
				}
				else {
					System.out.println(club_cards_player_2[1]);
				}
			}
			else if (club_cards_player_1[1] == 13) {
				System.out.print(player1 + " had K which is bigger than ");
				if (club_cards_player_2[1] == 12) {
					System.out.println(" Q");
				}
				else if (club_cards_player_2[1] == 11) {
					System.out.println(" J");
				}
				else {
					System.out.println(club_cards_player_2[1]);
				}
			}
			else {
				System.out.println(player1 + " had " + club_cards_player_1[1] + " which is bigger than " + club_cards_player_2[1]);
			}
			System.out.println(player1 + " won a point!");
			System.out.println();
			final_club1++;
		}
		
		//second player 2
		
		else if (club_cards_player_1[1] < club_cards_player_2[1]) {
			if (club_cards_player_2[1] == 11) {
				System.out.println(player2 + " had J which is bigger than " + club_cards_player_1[1]);
			}
			else if (club_cards_player_2[1] == 12) {
				System.out.print(player2 + " had Q which is bigger than ");
				if (club_cards_player_1[1] == 11) {
					System.out.println(" J");
				}
				else {
					System.out.println(club_cards_player_1[1]);
				}
			}
			else if (club_cards_player_2[1] == 13) {
				System.out.print(player2 + " had K which is bigger than ");
				if (club_cards_player_1[1] == 12) {
					System.out.println(" Q");
				}
				else if (club_cards_player_1[1] == 11) {
					System.out.println(" J");
				}
				else {
					System.out.println(club_cards_player_1[1]);
				}
			}
			else {
				System.out.println(player2 + " had " + club_cards_player_2[1] + " which is bigger than " + club_cards_player_1[1]);
			}
			System.out.println(player2 + " won a point!");
			System.out.println();
			final_club2++;
		}
		
		//third player 1
		
		if (club_cards_player_1[2] > club_cards_player_2[2]) {
			if (club_cards_player_1[2] == 11) {
				System.out.println(player1 + " had J which is bigger than " + club_cards_player_2[2]);
			}
			else if (club_cards_player_1[2] == 12) {
				System.out.print(player1 + " had Q which is bigger than ");
				if (club_cards_player_2[2] == 11) {
					System.out.println(" J");
				}
				else {
					System.out.println(club_cards_player_2[2]);
				}
			}
			else if (club_cards_player_1[2] == 13) {
				System.out.print(player1 + " had K which is bigger than ");
				if (club_cards_player_2[2] == 12) {
					System.out.println(" Q");
				}
				else if (club_cards_player_2[2] == 11) {
					System.out.println(" J");
				}
				else {
					System.out.println(club_cards_player_2[2]);
				}
			}
			else {
				System.out.println(player1 + " had " + club_cards_player_1[2] + " which is bigger than " + club_cards_player_2[2]);
			}
			System.out.println(player1 + " won a point!");
			System.out.println();
			final_club1++;
		}
		
		//third player 2
		
		if (club_cards_player_1[2] < club_cards_player_2[2]) {
			if (club_cards_player_2[2] == 11) {
				System.out.println(player2 + " had J which is bigger than " + club_cards_player_1[2]);
			}
			else if (club_cards_player_2[2] == 12) {
				System.out.print(player2 + " had Q which is bigger than ");
				if (club_cards_player_1[2] == 11) {
					System.out.println(" J");
				}
				else {
					System.out.println(club_cards_player_1[2]);
				}
			}
			else if (club_cards_player_2[2] == 13) {
				System.out.print(player2 + " had K which is bigger than ");
				if (club_cards_player_1[2] == 12) {
					System.out.println(" Q");
				}
				else if (club_cards_player_1[2] == 11) {
					System.out.println(" J");
				}
				else {
					System.out.println(club_cards_player_1[2]);
				}
			}
			else {
				System.out.println(player2 + " had " + club_cards_player_2[2] + " which is bigger than " + club_cards_player_1[2]);
			}
			System.out.println(player2 + " won a point!");
			System.out.println();
			final_club2++;
		}
		
		//fourth player 1
		
		if (club_cards_player_1[3] > club_cards_player_2[3]) {
			if (club_cards_player_1[3] == 11) {
				System.out.println(player1 + " had J which is bigger than " + club_cards_player_2[3]);
			}
			else if (club_cards_player_1[3] == 12) {
				System.out.print(player1 + " had Q which is bigger than ");
				if (club_cards_player_2[3] == 11) {
					System.out.println(" J");
				}
				else {
					System.out.println(club_cards_player_2[3]);
				}
			}
			else if (club_cards_player_1[3] == 13) {
				System.out.print(player1 + " had K which is bigger than ");
				if (club_cards_player_2[3] == 12) {
					System.out.println(" Q");
				}
				else if (club_cards_player_2[3] == 11) {
					System.out.println(" J");
				}
				else {
					System.out.println(club_cards_player_2[3]);
				}
			}
			else {
				System.out.println(player1 + " had " + club_cards_player_1[3] + " which is bigger than " + club_cards_player_2[3]);
			}
			System.out.println(player1 + " won a point!");
			System.out.println();
			final_club++;
		}
		
		//fourth player 2
		
		if (club_cards_player_1[3] < club_cards_player_2[3]) {
			if (club_cards_player_2[3] == 11) {
				System.out.println(player2 + " had J which is bigger than " + club_cards_player_1[3]);
			}
			else if (club_cards_player_2[3] == 12) {
				System.out.print(player2 + " had Q which is bigger than ");
				if (club_cards_player_1[3] == 11) {
					System.out.println(" J");
				}
				else {
					System.out.println(club_cards_player_1[3]);
				}
			}
			else if (club_cards_player_2[3] == 13) {
				System.out.print(player2 + " had K which is bigger than ");
				if (club_cards_player_1[3] == 12) {
					System.out.println(" Q");
				}
				else if (club_cards_player_1[3] == 11) {
					System.out.println(" J");
				}
				else {
					System.out.println(club_cards_player_1[3]);
				}
			}
			else {
				System.out.println(player2 + " had " + club_cards_player_2[3] + " which is bigger than " + club_cards_player_1[3]);
			}
			System.out.println(player2 + " won a point!");
			System.out.println();
			final_club2++;
		}
		
		//fifth player 1
		
		if (club_cards_player_1[4] > club_cards_player_2[4]) {
			if (club_cards_player_1[4] == 11) {
				System.out.println(player1 + " had J which is bigger than " + club_cards_player_2[4]);
			}
			else if (club_cards_player_1[4] == 12) {
				System.out.print(player1 + " had Q which is bigger than ");
				if (club_cards_player_2[4] == 11) {
					System.out.println(" J");
				}
				else {
					System.out.println(club_cards_player_2[4]);
				}
			}
			else if (club_cards_player_1[4] == 13) {
				System.out.print(player1 + " had K which is bigger than ");
				if (club_cards_player_2[4] == 12) {
					System.out.println(" Q");
				}
				else if (club_cards_player_2[4] == 11) {
					System.out.println(" J");
				}
				else {
					System.out.println(club_cards_player_2[4]);
				}
			}
			else {
				System.out.println(player1 + " had " + club_cards_player_1[4] + " which is bigger than " + club_cards_player_2[4]);
			}
			System.out.println(player1 + " won a point!");
			System.out.println();
			final_club1++;
		}
		
		//fifth player 2
		
		if (club_cards_player_1[4] < club_cards_player_2[4]) {
			if (club_cards_player_2[4] == 11) {
				System.out.println(player2 + " had J which is bigger than " + club_cards_player_1[4]);
			}
			else if (club_cards_player_2[4] == 12) {
				System.out.print(player2 + " had Q which is bigger than ");
				if (club_cards_player_1[4] == 11) {
					System.out.println(" J");
				}
				else {
					System.out.println(club_cards_player_1[4]);
				}
			}
			else if (club_cards_player_2[4] == 13) {
				System.out.print(player2 + " had K which is bigger than ");
				if (club_cards_player_1[4] == 12) {
					System.out.println(" Q");
				}
				else if (club_cards_player_1[4] == 11) {
					System.out.println(" J");
				}
				else {
					System.out.println(club_cards_player_1[4]);
				}
			}
			else {
				System.out.println(player2 + " had " + club_cards_player_2[4] + " which is bigger than " + club_cards_player_1[4]);
			}
			System.out.println(player2 + " won a point!");
			System.out.println();
			final_club2++;
		}
		
		//final result
		
		if (final_club1 > final_club2) {
			final_club = 1;
		}
		else if (final_club1 < final_club2) {
			final_club = 0;
		}
		return final_club;
		
	}
	static int spade(Integer[] spade_cards, Scanner card_scan,String player1,String player2) {
		Integer[] spade_cards_player_1 = new Integer [5];
		Integer[] spade_cards_player_2 = new Integer [5];
		int help = 0;
		int final_spade1 = 0,final_spade2 = 0;
		int final_spade = 0;
		for(int i11 = 0;i11<5;i11++) {
			spade_cards_player_1[i11] = spade_cards[i11];
		}
		for(int i12 = 5;i12<10;i12++) {
			spade_cards_player_2[help] = spade_cards[i12];
			help++;
		}
		
		//first player 1
		
		if (spade_cards_player_1[0] > spade_cards_player_2[0]) {
			if (spade_cards_player_1[0] == 11) {
				System.out.println(player1 + " had J which is bigger than " + spade_cards_player_2[0]);
			}
			else if (spade_cards_player_1[0] == 12) {
				System.out.print(player1 + " had Q which is bigger than ");
				if (spade_cards_player_2[0] == 11) {
					System.out.println(" J");
				}
				else {
					System.out.println(spade_cards_player_2[0]);
				}
			}
			else if (spade_cards_player_1[0] == 13) {
				System.out.print(player1 + " had K which is bigger than ");
				if (spade_cards_player_2[0] == 12) {
					System.out.println(" Q");
				}
				else if (spade_cards_player_2[0] == 11) {
					System.out.println(" J");
				}
				else {
					System.out.println(spade_cards_player_2[0]);
				}
			}
			else {
				System.out.println(player1 + " had " + spade_cards_player_1[0] + " which is bigger than " + spade_cards_player_2[0]);
			}
			System.out.println(player1 + " won a point!");
			System.out.println();
			final_spade1++;
		}
		
		//first player 2
		
		else if (spade_cards_player_1[0] < spade_cards_player_2[0]) {
			if (spade_cards_player_2[0] == 11) {
				System.out.println(player2 + " had J which is bigger than " + spade_cards_player_1[0]);
			}
			else if (spade_cards_player_2[0] == 12) {
				System.out.print(player2 + " had Q which is bigger than ");
				if (spade_cards_player_1[0] == 11) {
					System.out.println(" J");
				}
				else {
					System.out.println(spade_cards_player_1[0]);
				}
			}
			else if (spade_cards_player_2[0] == 13) {
				System.out.print(player2 + " had K which is bigger than ");
				if (spade_cards_player_1[0] == 12) {
					System.out.println(" Q");
				}
				else if (spade_cards_player_1[0] == 11) {
					System.out.println(" J");
				}
				else {
					System.out.println(spade_cards_player_1[0]);
				}
			}
			else {
				System.out.println(player2 + " had " + spade_cards_player_2[0] + " which is bigger than " + spade_cards_player_1[0]);
			}
			System.out.println(player2 + " won a point!");
			System.out.println();
			final_spade2++;
		}
		
		//second player 1
		
		if (spade_cards_player_1[1] > spade_cards_player_2[1]) {
			if (spade_cards_player_1[1] == 11) {
				System.out.println(player1 + " had J which is bigger than " + spade_cards_player_2[1]);
			}
			else if (spade_cards_player_1[1] == 12) {
				System.out.print(player1 + " had Q which is bigger than ");
				if (spade_cards_player_2[1] == 11) {
					System.out.println(" J");
				}
				else {
					System.out.println(spade_cards_player_2[1]);
				}
			}
			else if (spade_cards_player_1[1] == 13) {
				System.out.print(player1 + " had K which is bigger than ");
				if (spade_cards_player_2[1] == 12) {
					System.out.println(" Q");
				}
				else if (spade_cards_player_2[1] == 11) {
					System.out.println(" J");
				}
				else {
					System.out.println(spade_cards_player_2[1]);
				}
			}
			else {
				System.out.println(player1 + " had " + spade_cards_player_1[1] + " which is bigger than " + spade_cards_player_2[1]);
			}
			System.out.println(player1 + " won a point!");
			System.out.println();
			final_spade1++;
		}
		
		//second player 2
		
		else if (spade_cards_player_1[1] < spade_cards_player_2[1]) {
			if (spade_cards_player_2[1] == 11) {
				System.out.println(player2 + " had J which is bigger than " + spade_cards_player_1[1]);
			}
			else if (spade_cards_player_2[1] == 12) {
				System.out.print(player2 + " had Q which is bigger than ");
				if (spade_cards_player_1[1] == 11) {
					System.out.println(" J");
				}
				else {
					System.out.println(spade_cards_player_1[1]);
				}
			}
			else if (spade_cards_player_2[1] == 13) {
				System.out.print(player2 + " had K which is bigger than ");
				if (spade_cards_player_1[1] == 12) {
					System.out.println(" Q");
				}
				else if (spade_cards_player_1[1] == 11) {
					System.out.println(" J");
				}
				else {
					System.out.println(spade_cards_player_1[1]);
				}
			}
			else {
				System.out.println(player2 + " had " + spade_cards_player_2[1] + " which is bigger than " + spade_cards_player_1[1]);
			}
			System.out.println(player2 + " won a point!");
			System.out.println();
			final_spade2++;
		}
		
		//third player 1
		
		if (spade_cards_player_1[2] > spade_cards_player_2[2]) {
			if (spade_cards_player_1[2] == 11) {
				System.out.println(player1 + " had J which is bigger than " + spade_cards_player_2[2]);
			}
			else if (spade_cards_player_1[2] == 12) {
				System.out.print(player1 + " had Q which is bigger than ");
				if (spade_cards_player_2[2] == 11) {
					System.out.println(" J");
				}
				else {
					System.out.println(spade_cards_player_2[2]);
				}
			}
			else if (spade_cards_player_1[2] == 13) {
				System.out.print(player1 + " had K which is bigger than ");
				if (spade_cards_player_2[2] == 12) {
					System.out.println(" Q");
				}
				else if (spade_cards_player_2[2] == 11) {
					System.out.println(" J");
				}
				else {
					System.out.println(spade_cards_player_2[2]);
				}
			}
			else {
				System.out.println(player1 + " had " + spade_cards_player_1[2] + " which is bigger than " + spade_cards_player_2[2]);
			}
			System.out.println(player1 + " won a point!");
			System.out.println();
			final_spade1++;
		}
		
		//third player 2
		
		if (spade_cards_player_1[2] < spade_cards_player_2[2]) {
			if (spade_cards_player_2[2] == 11) {
				System.out.println(player2 + " had J which is bigger than " + spade_cards_player_1[2]);
			}
			else if (spade_cards_player_2[2] == 12) {
				System.out.print(player2 + " had Q which is bigger than ");
				if (spade_cards_player_1[2] == 11) {
					System.out.println(" J");
				}
				else {
					System.out.println(spade_cards_player_1[2]);
				}
			}
			else if (spade_cards_player_2[2] == 13) {
				System.out.print(player2 + " had K which is bigger than ");
				if (spade_cards_player_1[2] == 12) {
					System.out.println(" Q");
				}
				else if (spade_cards_player_1[2] == 11) {
					System.out.println(" J");
				}
				else {
					System.out.println(spade_cards_player_1[2]);
				}
			}
			else {
				System.out.println(player2 + " had " + spade_cards_player_2[2] + " which is bigger than " + spade_cards_player_1[2]);
			}
			System.out.println(player2 + " won a point!");
			System.out.println();
			final_spade2++;
		}
		
		//fourth player 1
		
		if (spade_cards_player_1[3] > spade_cards_player_2[3]) {
			if (spade_cards_player_1[3] == 11) {
				System.out.println(player1 + " had J which is bigger than " + spade_cards_player_2[3]);
			}
			else if (spade_cards_player_1[3] == 12) {
				System.out.print(player1 + " had Q which is bigger than ");
				if (spade_cards_player_2[3] == 11) {
					System.out.println(" J");
				}
				else {
					System.out.println(spade_cards_player_2[3]);
				}
			}
			else if (spade_cards_player_1[3] == 13) {
				System.out.print(player1 + " had K which is bigger than ");
				if (spade_cards_player_2[3] == 12) {
					System.out.println(" Q");
				}
				else if (spade_cards_player_2[3] == 11) {
					System.out.println(" J");
				}
				else {
					System.out.println(spade_cards_player_2[3]);
				}
			}
			else {
				System.out.println(player1 + " had " + spade_cards_player_1[3] + " which is bigger than " + spade_cards_player_2[3]);
			}
			System.out.println(player1 + " won a point!");
			System.out.println();
			final_spade++;
		}
		
		//fourth player 2
		
		if (spade_cards_player_1[3] < spade_cards_player_2[3]) {
			if (spade_cards_player_2[3] == 11) {
				System.out.println(player2 + " had J which is bigger than " + spade_cards_player_1[3]);
			}
			else if (spade_cards_player_2[3] == 12) {
				System.out.print(player2 + " had Q which is bigger than ");
				if (spade_cards_player_1[3] == 11) {
					System.out.println(" J");
				}
				else {
					System.out.println(spade_cards_player_1[3]);
				}
			}
			else if (spade_cards_player_2[3] == 13) {
				System.out.print(player2 + " had K which is bigger than ");
				if (spade_cards_player_1[3] == 12) {
					System.out.println(" Q");
				}
				else if (spade_cards_player_1[3] == 11) {
					System.out.println(" J");
				}
				else {
					System.out.println(spade_cards_player_1[3]);
				}
			}
			else {
				System.out.println(player2 + " had " + spade_cards_player_2[3] + " which is bigger than " + spade_cards_player_1[3]);
			}
			System.out.println(player2 + " won a point!");
			System.out.println();
			final_spade2++;
		}
		
		//fifth player 1
		
		if (spade_cards_player_1[4] > spade_cards_player_2[4]) {
			if (spade_cards_player_1[4] == 11) {
				System.out.println(player1 + " had J which is bigger than " + spade_cards_player_2[4]);
			}
			else if (spade_cards_player_1[4] == 12) {
				System.out.print(player1 + " had Q which is bigger than ");
				if (spade_cards_player_2[4] == 11) {
					System.out.println(" J");
				}
				else {
					System.out.println(spade_cards_player_2[4]);
				}
			}
			else if (spade_cards_player_1[4] == 13) {
				System.out.print(player1 + " had K which is bigger than ");
				if (spade_cards_player_2[4] == 12) {
					System.out.println(" Q");
				}
				else if (spade_cards_player_2[4] == 11) {
					System.out.println(" J");
				}
				else {
					System.out.println(spade_cards_player_2[4]);
				}
			}
			else {
				System.out.println(player1 + " had " + spade_cards_player_1[4] + " which is bigger than " + spade_cards_player_2[4]);
			}
			System.out.println(player1 + " won a point!");
			System.out.println();
			final_spade1++;
		}
		
		//fifth player 2
		
		if (spade_cards_player_1[4] < spade_cards_player_2[4]) {
			if (spade_cards_player_2[4] == 11) {
				System.out.println(player2 + " had J which is bigger than " + spade_cards_player_1[4]);
			}
			else if (spade_cards_player_2[4] == 12) {
				System.out.print(player2 + " had Q which is bigger than ");
				if (spade_cards_player_1[4] == 11) {
					System.out.println(" J");
				}
				else {
					System.out.println(spade_cards_player_1[4]);
				}
			}
			else if (spade_cards_player_2[4] == 13) {
				System.out.print(player2 + " had K which is bigger than ");
				if (spade_cards_player_1[4] == 12) {
					System.out.println(" Q");
				}
				else if (spade_cards_player_1[4] == 11) {
					System.out.println(" J");
				}
				else {
					System.out.println(spade_cards_player_1[4]);
				}
			}
			else {
				System.out.println(player2 + " had " + spade_cards_player_2[4] + " which is bigger than " + spade_cards_player_1[4]);
			}
			System.out.println(player2 + " won a point!");
			System.out.println();
			final_spade2++;
		}
		
		//final result
		
		if (final_spade1 > final_spade2) {
			final_spade = 1;
		}
		else if (final_spade1 < final_spade2) {
			final_spade = 0;
		}
		return final_spade;
		
	}
}
