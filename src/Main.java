import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		chainingHash dictionary = new chainingHash();
        
		dictionary.initializeTable();
			String line;
			BufferedReader myReader = new BufferedReader(new FileReader("words.txt"));

			while ((line = myReader.readLine()) != null) {
				dictionary.insertWord(line);
			}
			System.out.println("Enter a word or a sentence ");
		Scanner input = new Scanner(System.in);
	    String writenSentence = input.nextLine();
	    while(!writenSentence.matches("^\\w+$")){
			System.out.println("Your input contains non english characters. Please enter a new one: ");
			writenSentence = input.nextLine();
		}
	    dictionary.printCorrectedOne(writenSentence);
	    
	   
	}

}
