package Week3;
//CSIS312: Advanced OO Programming DO1
//Calculates earnings based on wages per piece produced. 
//Concrete class extends superclass employee.
//Victoria Young date created: 4.4.24
//Deitel, P., & Deitel, H. (2019). Java How To Program, Late Objects (11th ed.). Pearson Education (US). https://libertyonline.vitalsource.com/books/9780134763507
//Bro Code. (2020b, October 6). Java interface 🦅 [Video]. YouTube. https://www.youtube.com/watch?v=GhslBwrRsnw
//Bro Code. (2020c, October 6). Java polymorphism 🏁 [Video]. YouTube. https://www.youtube.com/watch?v=2hkngtWLGvE
//Bro Code. (2020a, June 30). Java dynamic polymorphism ✨ [Video]. YouTube. https://www.youtube.com/watch?v=tAIaK5LNatE
//Bro Code. (2020c, October 6). Java exception handling ⚠️ [Video]. YouTube. https://www.youtube.com/watch?v=adTDlH0lhaA

public class PieceWorker extends Employee{
		private double wages; //amount of money paid per part produced
		private double pieces; //number of parts made
	//constructor
	public PieceWorker (String firstName, String lastName, 
				String socialSecurityNumber, double pieces, double wages) 
	{	super(firstName, lastName, socialSecurityNumber); //added from superclass employee
		//validate pieces
		if (pieces < 0) 
			throw new IllegalArgumentException(
		         "Pieces produced made cannot be a negative number.");
		
		// validate wage
		 if (wages <= 0.0) 
		      throw new IllegalArgumentException(
		    	 "Wages earned per piece cannot be a negative number or zero.");
		 
		 this.pieces = pieces;
		 this.wages = wages;
		}
	//end constructor
	
	//set pieces...
	public void setPieces(double pieces) {
		if (pieces < 0) 
			throw new IllegalArgumentException(
		         "Pieces produced made cannot be a negative number.");
		this.pieces = pieces;
	}
	
	// return pieces
	public double getPieces() {
		return pieces;
	}   
	
	//set wages...
	public void setWages(double wages){
		if (wages <= 0.0) 
		      throw new IllegalArgumentException(
		         "Wages earned per piece cannot be a negative number or zero.");
	   this.wages = wages;
	} 
	
	// return wages
	public double getWages()
	{
	   return wages;
	} 

	//calculate earnings by wages * pieces made...
	@Override
	public double earnings() {
			return getPieces() * getWages(); 
	}
	
	//to String to print these out
	@Override                                                           
	public String toString()                                            
	{                                                                   
		   return String.format("Piece Worker Employee: %s%n%s: $%,.2f; %s: %,.2f",
				      super.toString(), "Wages per Piece", getWages(),                     
				      "Pieces produced", getPieces());                        
	}
	}
