package Week7;
//CSIS312: Advanced OO Programming DO1
//Victoria Young Date created: 5.4.24
//Citations:
//Deitel, P., & Deitel, H. (2019). Java How To Program, Late Objects (11th ed.). Pearson Education (US). https://libertyonline.vitalsource.com/books/9780134763507

public class Pair<F,S> {
	
	F first;
	S second;
	
	//constructor
	Pair(F first, S second){
		this.first = first;
		this.second = second;
	}
	
	//set
	public void setFirst(F first) {
		this.first = first;
	}
	//get
	public F getFirst() {
		return first;
	}
	
	//set
	public void setSecond(S second) {
		this.second = second;
		}
	//get
	public S getSecond() {
		return second;
		}
}
