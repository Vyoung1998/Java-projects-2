package Week4;
//Builds sentence using randomly generated words with String builder class
//CSIS312: Advanced OO Programming DO1
//Victoria Young Date created: 4.13.24
//Deitel, P., & Deitel, H. (2019). Java How To Program, Late Objects (11th ed.). Pearson Education (US). https://libertyonline.vitalsource.com/books/9780134763507
//KB Tutorials. (2021, May 14). Java program to capitalize 1st letter each word in string [Video]. YouTube. https://www.youtube.com/watch?v=z03sU6oNyvs
//theurbanpenguin. (2013, November 12). JAVA Using StringBuilder to manipulate data [Video]. YouTube. https://www.youtube.com/watch?v=1cTrS340jgw
//Bro Code. (2020f, October 19). Java for loop ➰ [Video]. YouTube. https://www.youtube.com/watch?v=Rn16ugyorX0


public class Sentence extends Word{
	
	private String randomSentence;
	//constructor
	public Sentence() {	
	//build sentence
		Word word = new Word();
		StringBuilder sb = new StringBuilder();
		//create correct syntax pieces for sentences
		String dot = ".";
		String space = " ";
		//get article but capitalize the first letter
		String capital = getArticle().substring(0,1).toUpperCase()+getArticle().substring(1,getArticle().length());
		
		//build string
		sb.append(capital);
		sb.append(space);
		sb.append(word.getNoun());
		sb.append(space);
		sb.append(word.getVerb());
		sb.append(space);
		sb.append(word.getPrep());
		sb.append(space);
		sb.append(word.getArticle());
		sb.append(space);
		sb.append(word.getNoun());
		sb.append(dot);
		
		//set string that was built to this variable
		String randomSentence = sb.toString();
		
		this.randomSentence = randomSentence;
		
}
	public void setSentence(String dot, String space, StringBuilder sb) {
			String randomSentence = sb.toString(); 
			this.randomSentence = randomSentence;
	}
	
	public String getSentence() {
		return randomSentence;
	}
}