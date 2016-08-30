import java.util.Scanner;

public class Lab6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String userInput;

		System.out.println("Welcome To Pig Latin Translator!");
		System.out.println("\n");

		do {
			System.out.println("Enter a line to be translated");
			String englishWord = scanner.next();
			//String word = scanner.next();
			System.out.println("\n");
			String LatinWord = translateWord(englishWord);
			String consonantWord = moveConsonent( englishWord);
			 //System.out.println(moveConsonent(englishWord));
			System.out.println("Translate another line?(y/n)");
			System.out.println("\n");
			userInput = scanner.next();
			
		} while (userInput.equals("y"));
		System.out.println("Have a great day");
		scanner.close();
		// TODO Write this code. You will have a loop and call translateWord
		// from here.
	}

	/**
	 * This method move consonant that appear before vowels to end of the word and add "ay" to the end of the word
	 */
	public static String translateWord(String englishWord) {
		Scanner sc = new Scanner(System.in);
		String latinWord = "";

		latinWord = englishWord.toLowerCase();

		char check = latinWord.charAt(0);

		if (check == 'a' || check == 'e' || check == 'i' || check == 'o' || check == 'u')
			System.out.println(latinWord + "way");
		else System.out.println(latinWord + " doesn't starts with vowel");
		System.out.println("\n");

		// TODO Write this code
		return latinWord;

	}

	
	
	
	
public static String moveConsonent(String word) {
    String vowels = "aeiouAEIOU";
    if (!vowels.contains(""+word.charAt(0))){
    for (int i = 0; i < word.length(); i++) {
    	
        if (vowels.contains(""+word.charAt(i))) {
            String prefix = word.substring(0, i);
            String suffix = word.substring(i);
            word = suffix + prefix + "ay";
            System.out.println(word );
            break;
        }
    }
    
    
}
    else System.out.println(word +" doesn't start with consonent");
    return word;
	}
	
	
}
