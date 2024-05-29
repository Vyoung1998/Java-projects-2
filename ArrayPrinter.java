package Week6;
import java.util.Random;
//CSIS312: Advanced OO Programming DO1
//This program does the following:
//build random array and calls for print function with spaces between each number
//Victoria Young Date created: 4.25.24
//Deitel, P., & Deitel, H. (2019). Java How To Program, Late Objects (11th ed.). Pearson Education (US). https://libertyonline.vitalsource.com/books/9780134763507
//Coding with John. (2021, November 1). Recursion in Java Full tutorial - How to create recursive Methods [Video]. YouTube. https://www.youtube.com/watch?v=k-7jJP7QFEM
//Coding with John. (2021a, February 24). Array vs. ArrayList in Java Tutorial - What’s The Difference? [Video]. YouTube. https://www.youtube.com/watch?v=NbYgm0r7u6o
//Bro Code. (2022, December 9). Learn RECURSION in 5 minutes! 😵 [Video]. YouTube. https://www.youtube.com/watch?v=ivl5-snqul8
//Coding with John. (2021b, April 11). Merge Sort Algorithm in Java - Full Tutorial with Source [Video]. YouTube. https://www.youtube.com/watch?v=bOk35XmHPKs


public class ArrayPrinter {
	public static void main(String[] args) {
		Random rand = new Random();//start random generator
		int[] numbers = new int[99];//create empty array with 100 spaces
		
		for (int i = 0; i < numbers.length; i++) {//randomly fill array
			numbers[i] = rand.nextInt(101);}//limit gen 0-100
		
		printArray(numbers);//recursive call
		}//end main
		

	private static void printArray(int[] numbers) {	
		System.out.println("Victoria Young - Assignment#6\n");//print my name
		
		System.out.println("The Array: ");//print label
			for(int i=0; i < numbers.length; i++) {//go through array and print with spaces
				System.out.print(" "+ numbers[i] + " ");
			}//end loop
		}//end printArray
	}//end ArrayPrinter class

