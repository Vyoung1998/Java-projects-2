package Week5;
import java.util.Collections;//for sort function
//CSIS312: Advanced OO Programming DO1
//This program calls on the My List program and displays the following:
//*Asks for the randomly generated list and prints.
//*Calls for the list to be sorted via collections function.
//*Prints the sorted list.
//*Asks for Sum and Average of said list.
//Victoria Young Date created: 4.20.24
//Citations:
//Deitel, P., & Deitel, H. (2019). Java How To Program, Late Objects (11th ed.). Pearson Education (US). https://libertyonline.vitalsource.com/books/9780134763507
//thenewboston. (2009, May 16). Java Programming Tutorial - 29 - Summing elements of arrays [Video]. YouTube. https://www.youtube.com/watch?v=etyrkipdKvc
//Ram N Java. (2014, October 30). How to convert LinkedList to Array Object? | Java Collection Framework [Video]. YouTube. https://www.youtube.com/watch?v=8hEdSxrHX6M
//Coding with John. (2021, June 6). LinkedList vs ArrayList in Java Tutorial - Which Should You Use? [Video]. YouTube. https://www.youtube.com/watch?v=5dscMs2hnDI
//Bro Code. (2021, April 19). Learn Linked Lists in 13 minutes 🔗 [Video]. YouTube. https://www.youtube.com/watch?v=N6dOwBde7-M


public class ListTest {

	public static void main(String[] args) {
		
		System.out.println("Victoria Young - Assignment#5\n");
	
		MyList list = new MyList();	//create new object, assign to variable
		
		System.out.println("Unsorted List: " + list.getList());//print random list as is
		
		Collections.sort(list.getList());//sort the list
		
		System.out.println("Sorted List: " + list.getList());//print sorted list
		
		System.out.println("Sum of list: " + list.getSum());//print the sum
	
		System.out.printf("Average of list: %.2f" , list.getAvg());//print the average and floating point
		}
	}


