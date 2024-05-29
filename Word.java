package Week4;
import java.util.Random;
//This program assigns arrays to different word types, and randomly generates them with their get methods
//CSIS312: Advanced OO Programming DO1
//Victoria Young Date created: 4.13.24
//Deitel, P., & Deitel, H. (2019). Java How To Program, Late Objects (11th ed.). Pearson Education (US). https://libertyonline.vitalsource.com/books/9780134763507
//KB Tutorials. (2021, May 14). Java program to capitalize 1st letter each word in string [Video]. YouTube. https://www.youtube.com/watch?v=z03sU6oNyvs
//theurbanpenguin. (2013, November 12). JAVA Using StringBuilder to manipulate data [Video]. YouTube. https://www.youtube.com/watch?v=1cTrS340jgw
//Bro Code. (2020f, October 19). Java for loop ➰ [Video]. YouTube. https://www.youtube.com/watch?v=Rn16ugyorX0


public class Word {
	//create arrays, build in constructor
	private String[] articles;
	private String[] verbs;
	private String[] preps;
	private String[] nouns;
	
	//create variables that random assignments will belong to
	private String randomNoun;
	private String randomArticle;
	private String randomPrep;
	private String randomVerb;
	
	//constructor nothing needs to be passed in from us, so nothing in ()
	public Word() {
		String[] articles ={"the", "a", "one", "some", "any"};
		String[] verbs  = {"drove", "jumped", "ran", "walked", "skipped"};
		String[] preps = {"to", "from", "over", "under", "on"};
		String[] nouns = {"boy", "girl", "dog", "town", "car"};
		
		//building arrays here
		this.articles = articles;
		this.verbs = verbs;
		this.preps = preps;
		this.nouns = nouns;
		
		//randomly select within array for each type
		for( int i = 0; i < nouns.length; i++) {
		randomNoun = nouns[new Random().nextInt(nouns.length)];
		}
		
		for( int i = 0; i < nouns.length; i++) {
		randomArticle = articles[new Random().nextInt(articles.length)];
		}
		
		for( int i = 0; i < nouns.length; i++) {
		randomPrep = preps[new Random().nextInt(preps.length)];
		}
		
		for( int i = 0; i < nouns.length; i++) {
		randomVerb = verbs[new Random().nextInt(verbs.length)];
		}
	
}
	
	//set word type noun
	public void setNoun(String[] nouns, String randomNoun) {
		randomNoun = nouns[new Random().nextInt(nouns.length)];
		this.randomNoun = randomNoun;
		}

	//get word type noun
	public String getNoun() {
		return randomNoun;
	}
	
	//set word type verbs
	public void setVerb(String[] verbs, String randomVerb) {
		randomVerb = verbs[new Random().nextInt(verbs.length)];
		this.randomVerb = randomVerb;
	}
	
	//get word type verb
	public String getVerb() {
		return randomVerb;
		}

	//set word type articles
	public void setArticle(String[] article, String randomArticle) {
		randomArticle = articles[new Random().nextInt(article.length)];
		this.randomArticle = randomArticle;
		}
		
	//get word type article
	public String getArticle() {
		return randomArticle;
		}	
	
	//set word type preposition
	public void setPrep(String[] preps, String randomPrep) {
		randomPrep = preps[new Random().nextInt(preps.length)];
		this.randomPrep = randomPrep;
			}
			
	//get word type preposition
	public String getPrep() {
		return randomPrep;
		}		
	
}
  