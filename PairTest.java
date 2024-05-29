package Week7;
//CSIS312: Advanced OO Programming DO1
//Victoria Young Date created: 5.4.24
//Citations:
//Deitel, P., & Deitel, H. (2019). Java How To Program, Late Objects (11th ed.). Pearson Education (US). https://libertyonline.vitalsource.com/books/9780134763507

public class PairTest {

	public static void main(String[] args) {
		
		System.out.println("Victoria Young - Assignment#7\n");
		
		System.out.println("Demonstrating generic class with integer and string.\n");
		//Demonstrating generic class abilities... p1
		Pair<Integer, String> p1 = new Pair<Integer, String>(1, "One Line p1: Hello");//set/get in one line
		System.out.println(p1.getFirst() + " " + p1.getSecond());//print
		//set manually then print
		p1.setFirst(2);//set first as integer
		p1.setSecond("Set Manually p1: Hello Again"); //set second as string
		System.out.println(p1.getFirst() + " " + p1.getSecond() + "\n"); //demonstrate getting pair p1
		
		
		System.out.println("Demonstrating generic class with string and integer.\n");
		//Demonstrating generic class abilities... p2
		Pair<String, Integer> p2 = new Pair<String, Integer>("One Line p2: Goodbye", 3);//set/get in one line
		System.out.println(p2.getFirst() + " " + p2.getSecond());//print
		//set manually then print
		p2.setFirst("Set Manually p2: Goodbye Again");//set first as string
		p2.setSecond(4); //set second as integer
		System.out.println(p2.getFirst() + " " + p2.getSecond()+"\n"); //demonstrate getting pair p2
		
		System.out.println("Demonstrating generic class with double and character.\n");
		//Demonstrating generic class abilities... p3 (with double and character to demonstrate ability)
		Pair<Double, Character> p3 = new Pair<Double, Character>(12.3, '$');//set/get in one line
		System.out.println(p3.getFirst() + " " + p3.getSecond());//print
		//set manually then print
		p3.setFirst(34.5);//set first as double
		p3.setSecond('!'); //set second as new character
		System.out.println(p3.getFirst() + " " + p3.getSecond()+"\n"); //demonstrate getting pair p3
				
	}

}
