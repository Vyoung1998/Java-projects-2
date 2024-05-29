package Week5;
import java.util.LinkedList;//for linked list
import java.util.Random; //to randomly generate list
//CSIS312: Advanced OO Programming DO1
//This program does the following:
//*Creates a randomly generated linked list of 25 numbers, and returns it as myNumbersList.
//*Converts the linked list to an array to integerArray.
//*The sum function returns the sum of this array's elements as a double.
//*The average function inherits both the sum of the array, and the length.
// of the array to return the average of its elements as a double.
//Victoria Young Date created: 4.20.24
//Citations:
//Deitel, P., & Deitel, H. (2019). Java How To Program, Late Objects (11th ed.). Pearson Education (US). https://libertyonline.vitalsource.com/books/9780134763507
//thenewboston. (2009, May 16). Java Programming Tutorial - 29 - Summing elements of arrays [Video]. YouTube. https://www.youtube.com/watch?v=etyrkipdKvc
//Ram N Java. (2014, October 30). How to convert LinkedList to Array Object? | Java Collection Framework [Video]. YouTube. https://www.youtube.com/watch?v=8hEdSxrHX6M
//Coding with John. (2021, June 6). LinkedList vs ArrayList in Java Tutorial - Which Should You Use? [Video]. YouTube. https://www.youtube.com/watch?v=5dscMs2hnDI
//Bro Code. (2021, April 19). Learn Linked Lists in 13 minutes 🔗 [Video]. YouTube. https://www.youtube.com/watch?v=N6dOwBde7-M


public class MyList {
	
	
	LinkedList<Integer> myNumbersList = new LinkedList<>();//activate Linked List
	int[] integerArray;//build regular array after conversion...

	//private, will hold values
	private double sum;
	private double avg;
	
	//Constructor
	public MyList() {
		
		//build randomly generated list of numbers into linked list...
		for( int i = 0; i <= 24; i++) { // loop the following 25 times
			Random gen = new Random(); //create random generator
			int number = gen.nextInt(101);//limited to 0-100 assigned to this variable
			myNumbersList.add(number);//put in linked list
			}
		this.myNumbersList = myNumbersList; //set to variable
				
		//convert linked list to array to make sum and average functions...
		Integer[] integerArray = myNumbersList.toArray(new Integer[myNumbersList.size()]);
		double sum = 0;//activate double sum to hold value
		for(int i = 0; i < integerArray.length; i++) {
			sum += integerArray[i];//add all elements together, assign to sum
			}
		this.sum = sum;// set to variable
		
		//get average
		int length = integerArray.length;//get length of array 
		double avg = (sum/length);//average equals sum of array divided by length
		this.avg = avg;//set to variable
		}
	
	
	//set list
	public void setMyList(LinkedList<Integer> myNumbersList) {
		for( int i = 0; i <= 24; i++) { 
			Random gen = new Random(); 
			int number = gen.nextInt(101);
			myNumbersList.add(number);
			}
		this.myNumbersList = myNumbersList;//set to variable
	}
	
	//return the list
	public LinkedList<Integer> getList() {
		return myNumbersList;
	}
	
	//set sum
	public void setSum(LinkedList<Integer> myNumbersList, Integer[] integerArray, double sum){
		//inherit the needed variables, do not need to reiterate
		//loop through this array, add, and then print sum
		for(int i = 0; i < integerArray.length; i++) {
			sum += integerArray[i];
		}
		this.sum = sum;//set to variable
	}

	//return sum
	public double getSum() {
		return sum;
	}
	
	//set average
	public void setAvg(int length) {
		double avg = sum/length;
		this.avg = avg; //set to variable
	}
	
	//get average
	public double getAvg() {
		return avg;
	}
	
}
