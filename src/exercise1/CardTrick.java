package exercise1;
import java.util.Scanner;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author RealNabeal
 * @author Nabil Abdi Feb 01, 2023 
 */
public class CardTrick {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Card[] hand = new Card[7];

        for (int i = 0; i < hand.length; i++) {
            hand[i] = new Card();
            hand[i].setValue((int)(Math.random() * 13) + 1);
            hand[i].setSuit(Card.SUITS[(int)(Math.random() * 4)]);
        }

        for(int i = 0; i < hand.length; i++){
            System.out.println(hand[i]);
        }

        int userValue;
        String userSuit;

        System.out.println("Enter the number of your card (1-13 inclusive) ");
        userValue = sc.nextInt();

        System.out.println("Enter your suit: (Spades, Hearts etc...)");
        userSuit = sc.next();

        Card userCard = new Card();
        userCard.setSuit(userSuit);
        userCard.setValue(userValue);

        //System.out.println("----------\n" + userCard); To see if the toString works, as well as debugging

        for (int i = 0; i < hand.length; i++){
            if (hand[i].getValue() == userCard.getValue() && hand[i].getSuit().equals(userCard.getSuit())){
                System.out.println("You have a card match!!!");
                printInfo();
            }else {
                break;
            }
        }
        
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
     */
    private static void printInfo() {
        //I'm done!
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Nabil, and I am excited to learn and grow as a developer.");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Always learn and grow. Try different things.");
        System.out.println("-- Have a semester with no violations of academic integrity!");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Reading");
        System.out.println("-- Coding");
        System.out.println("-- Writing/Watching TV");
        System.out.println("-- Swimming");

        System.out.println("Nabil Out......Bye");
        
    
    }

}
