import java.util.ArrayList;

class WordElement{
	String word;
	int length;

    public WordElement(String word) {
        this.word = word;
        this.length = word.length();
      }
}

class ChainingMapOfWords{
	int size = 0;
	 ArrayList<WordElement> wordList = new ArrayList<>();
}

public class chainingHash{
	ChainingMapOfWords[] table = new ChainingMapOfWords[100];
	Graph graph;
		
	public void initializeTable() {
		for(int i=0; i<100; i++) {
			table[i] = new ChainingMapOfWords();
		}
	}
	
	 public void createKeyboardGraph() {
			int vertices = 26;
			Graph graph1 = new Graph(vertices);
	      
	         graph1.addNode(new Node(1));
	         graph1.addNode(new Node(2));
	         graph1.addNode(new Node(3));
	         graph1.addNode(new Node(4));
	         graph1.addNode(new Node(5));
	         graph1.addNode(new Node(6));
	         graph1.addNode(new Node(7));
	         graph1.addNode(new Node(8));
	         graph1.addNode(new Node(9));
	         graph1.addNode(new Node(10));
	         graph1.addNode(new Node(11));
	         graph1.addNode(new Node(12));
	         graph1.addNode(new Node(13));
	         graph1.addNode(new Node(14));
	         graph1.addNode(new Node(15));
	         graph1.addNode(new Node(16));
	         graph1.addNode(new Node(17));
	         graph1.addNode(new Node(18));
	         graph1.addNode(new Node(19));
	         graph1.addNode(new Node(20));
	         graph1.addNode(new Node(21));
	         graph1.addNode(new Node(22));
	         graph1.addNode(new Node(23));
	         graph1.addNode(new Node(24));
	         graph1.addNode(new Node(25));
	         graph1.addNode(new Node(26));
	         
	         graph1.addEdge(0, 1);
	         graph1.addEdge(0, 10);
	         graph1.addEdge(0, 11);
	         
	         graph1.addEdge(1, 0);
	         graph1.addEdge(1, 2);
	         graph1.addEdge(1, 10);
	         graph1.addEdge(1, 11);
	         graph1.addEdge(1, 12);
	         
	         graph1.addEdge(2, 1);
	         graph1.addEdge(2, 3);
	         graph1.addEdge(2, 11);
	         graph1.addEdge(2, 12);
	         graph1.addEdge(2, 13);
	         
	         graph1.addEdge(3, 2);
	         graph1.addEdge(3, 4);
	         graph1.addEdge(3, 12);
	         graph1.addEdge(3, 13);
	         graph1.addEdge(3, 14);
	         
	         graph1.addEdge(4, 3);
	         graph1.addEdge(4, 5);
	         graph1.addEdge(4, 13);
	         graph1.addEdge(4, 14);
	         graph1.addEdge(4, 15);
	         
	         graph1.addEdge(5, 4);
	         graph1.addEdge(5, 6);
	         graph1.addEdge(5, 14);
	         graph1.addEdge(5, 15);
	         graph1.addEdge(5, 16);
	         
	         graph1.addEdge(6, 5);
	         graph1.addEdge(6, 7);
	         graph1.addEdge(6, 15);
	         graph1.addEdge(6, 16);
	         graph1.addEdge(6, 17);
	         
	         graph1.addEdge(7, 6);
	         graph1.addEdge(7, 8);
	         graph1.addEdge(7, 16);
	         graph1.addEdge(7, 17);
	         graph1.addEdge(7, 18);
	         
	         graph1.addEdge(8, 9);
	         graph1.addEdge(8, 7);
	         graph1.addEdge(8, 17);
	         graph1.addEdge(8, 18);
	         
	         graph1.addEdge(9, 8);
	         graph1.addEdge(9, 17);
	         graph1.addEdge(9, 18);
	         
	         graph1.addEdge(10, 0);
	         graph1.addEdge(10, 1);
	         graph1.addEdge(10, 11);
	         graph1.addEdge(10, 19);
	         graph1.addEdge(10, 20);
	         
	         graph1.addEdge(11, 10);
	         graph1.addEdge(11, 12);
	         graph1.addEdge(11, 1);
	         graph1.addEdge(11, 0);
	         graph1.addEdge(11, 2);
	         graph1.addEdge(11, 19);
	         graph1.addEdge(11, 20);
	         
	         graph1.addEdge(12, 1);
	         graph1.addEdge(12, 2);
	         graph1.addEdge(12, 3);
	         graph1.addEdge(12, 11);
	         graph1.addEdge(12, 13);
	         graph1.addEdge(12, 20);
	         
	         graph1.addEdge(13, 2);
	         graph1.addEdge(13, 4);
	         graph1.addEdge(13, 12);
	         graph1.addEdge(13, 14);
	         graph1.addEdge(13, 21);
	         graph1.addEdge(13, 22);
	         
	         graph1.addEdge(14, 3);
	         graph1.addEdge(14, 4);
	         graph1.addEdge(14, 5);
	         graph1.addEdge(14, 13);
	         graph1.addEdge(14, 15);
	         graph1.addEdge(14, 22);
	         
	         graph1.addEdge(15, 4);
	         graph1.addEdge(15, 6);
	         graph1.addEdge(15, 6);
	         graph1.addEdge(15, 14);
	         graph1.addEdge(15, 16);
	        // graph1.addEdge(15, 22);
	         graph1.addEdge(15, 23);
	         graph1.addEdge(15, 24);
	         
	         graph1.addEdge(16, 5);
	         graph1.addEdge(16, 6);
	         graph1.addEdge(16, 7);
	         graph1.addEdge(16, 15);
	         graph1.addEdge(16, 17);
	         graph1.addEdge(16, 24);
	         graph1.addEdge(16, 25);
	         
	         graph1.addEdge(17, 16);
	         graph1.addEdge(17, 18);
	         graph1.addEdge(17, 7);
	         graph1.addEdge(17, 6);
	         graph1.addEdge(17, 8);
	         graph1.addEdge(17,25);
	         
	         graph1.addEdge(18, 7);
	         graph1.addEdge(18, 8);
	         graph1.addEdge(18, 9);
	         graph1.addEdge(18, 17);
	         
	         graph1.addEdge(19, 10);
	         graph1.addEdge(19, 11);
	         graph1.addEdge(19, 20);
	         
	         graph1.addEdge(20, 19);
	         graph1.addEdge(20, 21);
	         graph1.addEdge(20, 11);
	         graph1.addEdge(20, 12);
	         
	         graph1.addEdge(21, 20);
	         graph1.addEdge(21, 22);
	         graph1.addEdge(21, 12);
	         graph1.addEdge(21, 13);
	         
	         graph1.addEdge(22, 21);
	         graph1.addEdge(22, 23);
	         graph1.addEdge(22, 13);
	         graph1.addEdge(22, 14);
	         
	         graph1.addEdge(23, 22);
	         graph1.addEdge(23, 24);
	         graph1.addEdge(23, 14);
	         graph1.addEdge(23, 15);
	         
	         graph1.addEdge(24, 23);
	         graph1.addEdge(24, 25);
	         graph1.addEdge(24, 15);
	         graph1.addEdge(24, 16);
	         
	         graph1.addEdge(25, 24);
	         graph1.addEdge(25, 16);
	         graph1.addEdge(25, 17);
	         
	         this.graph = graph1;
		}
	
	
	
	public char lowerChar(char letter) {
    	return Character.toLowerCase(letter);
    }
	
	public void insertWord(String word) {
		WordElement wordElement = new WordElement(word);
		table[wordElement.length].wordList.add(wordElement);
    }
	 	
	public boolean searchWord(String writenWord) {
		
		if(writenWord.length() == 1) {
			return true;
		}
		
		for(int n = 0; n < table[writenWord.length()].wordList.size(); n++) {
			
			if(table[writenWord.length()].wordList.get(n).word.equals(writenWord)){
					return true;
				}
			// to make first letter non case sensitive
			if(table[writenWord.length()].wordList.get(n).word.charAt(0) == lowerChar(writenWord.charAt(0))){
				if(table[writenWord.length()].wordList.get(n).word.substring(1).equals(writenWord.substring(1))){
					return true;
					}
				}
		}
		return false;
    }
	
	public String findAvaliableWord(String writenWord) {
		
		int lCount = 0;
		int maxL = Integer.MIN_VALUE;
		ArrayList<String> closestWords = new ArrayList<String>();
		
		for(int i=0; i<this.table[writenWord.length()].wordList.size(); i++) {
			for(int j=0; j<writenWord.length(); j++) {
				
				if(j == 0){
					if(this.table[writenWord.length()].wordList.get(i).word.charAt(j) == lowerChar(writenWord.charAt(j))) {
						lCount++;
					}
				}
				else if(this.table[writenWord.length()].wordList.get(i).word.charAt(j) == writenWord.charAt(j)) {
					lCount++;
				}
				
			}
			if(maxL < lCount) maxL=lCount;
			lCount = 0;
		}
		
		for(int i=0; i<this.table[writenWord.length()].wordList.size(); i++) {
			for(int j=0; j<writenWord.length(); j++) {
				if(j == 0){
					if(this.table[writenWord.length()].wordList.get(i).word.charAt(j) == lowerChar(writenWord.charAt(j))) {
						lCount++;
					}
				}
				else if(this.table[writenWord.length()].wordList.get(i).word.charAt(j) == writenWord.charAt(j)) {
					lCount++;
				}
			}
			if(maxL == lCount) {
				closestWords.add(this.table[writenWord.length()].wordList.get(i).word);
			}
			lCount = 0;
		}
		
		this.createKeyboardGraph();
		int minD = Integer.MAX_VALUE, countL = 0 , index = 0;
		
		for(int i=0; i<closestWords.size(); i++) {
			for(int j=0; j<writenWord.length(); j++) {
				int start = this.letterToInt(closestWords.get(i).charAt(j));
		        int end = this.letterToInt(lowerChar(writenWord.charAt(j)));
				countL += this.graph.dijkstra(start, end);// Counting distance between 2 letters
			}
	
			if(minD > countL) {
				minD = countL;
				index = i;
			}
			countL = 0;
		}
		
		if(Character.isUpperCase(writenWord.charAt(0))) {
			String lowerOne = closestWords.get(index);
			return Character.toUpperCase(lowerOne.charAt(0)) + lowerOne.substring(1);
		}
		else
			return closestWords.get(index);
	}
	
	
	public void printCorrectedOne(String sentence){
		String[] myWords = sentence.split(" ");
		
		for(int current = 0; current < myWords.length; current++) {
		boolean lastOneflag = false;
		char lastOne = ' ';
		
		// for ends with . ?  
		if(!Character.isLetter(myWords[current].charAt(myWords[current].length()-1))) {
			lastOne = myWords[current].charAt(myWords[current].length()-1);
			lastOneflag = true;
			myWords[current] = myWords[current].substring(0,myWords[current].length()-1);
		}
			
		// if starts with digit
		if(searchWord(myWords[current]) || Character.isDigit(myWords[current].charAt(0))) {
				myWords[current] = myWords[current];
	    }
	    else {
	    	String newWord = findAvaliableWord(myWords[current]);
	    	if(newWord != null)
	    		myWords[current] = newWord;
	    	else
	    		myWords[current] = myWords[current];
	    	}
		
		if(lastOneflag)	
			myWords[current] = myWords[current] + lastOne;
		
		}

		for(int i=0; i < myWords.length;i++) {
			System.out.print(myWords[i] + " ");
		}
		
	}
	
	public int letterToInt(char src) {
		switch(src) {
		case 'q': return 0;
		case 'w': return 1;
		case 'e': return 2;
		case 'r': return 3;
		case 't': return 4;
		case 'y': return 5;
		case 'u': return 6;
		case 'i': return 7;
		case 'o': return 8;
		case 'p': return 9;
		case 'a': return 10;
		case 's': return 11;
		case 'd': return 12;
		case 'f': return 13;
		case 'g': return 14;
		case 'h': return 15;
		case 'j': return 16;
		case 'k': return 17;
		case 'l': return 18;
		case 'z': return 19;
		case 'x': return 20;
		case 'c': return 21;
		case 'v': return 22;
		case 'b': return 23;
		case 'n': return 24;
		case 'm': return 25;
		default: return -1;
		}
	}
}
