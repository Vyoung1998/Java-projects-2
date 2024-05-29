package Week4;
//Calls for sentences to be generated and listed 20 times
//CSIS312: Advanced OO Programming DO1
//Victoria Young Date created: 4.13.24
//Deitel, P., & Deitel, H. (2019). Java How To Program, Late Objects (11th ed.). Pearson Education (US). https://libertyonline.vitalsource.com/books/9780134763507
//KB Tutorials. (2021, May 14). Java program to capitalize 1st letter each word in string [Video]. YouTube. https://www.youtube.com/watch?v=z03sU6oNyvs
//theurbanpenguin. (2013, November 12). JAVA Using StringBuilder to manipulate data [Video]. YouTube. https://www.youtube.com/watch?v=1cTrS340jgw
//Bro Code. (2020f, October 19). Java for loop ➰ [Video]. YouTube. https://www.youtube.com/watch?v=Rn16ugyorX0

public class WordTest {
	public static void main(String[] args) 
	{
		System.out.println("Victoria Young - Assignment#4\n");
		
		//repeat the sentence to be built 20 times
		for(int i = 1; i <= 20; i ++) {
			Sentence sentence = new Sentence();
			System.out.println(sentence.getSentence());
		}
		
		
	}
	
	
}
