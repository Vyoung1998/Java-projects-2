package Week3;
//Fig. 10.4: Employee.java
//Employee abstract superclass.
//CSIS312: Advanced OO Programming DO1
//Victoria Young date created: 4.4.24
//Deitel, P., & Deitel, H. (2019). Java How To Program, Late Objects (11th ed.). Pearson Education (US). https://libertyonline.vitalsource.com/books/9780134763507
//Bro Code. (2020b, October 6). Java interface 🦅 [Video]. YouTube. https://www.youtube.com/watch?v=GhslBwrRsnw
//Bro Code. (2020c, October 6). Java polymorphism 🏁 [Video]. YouTube. https://www.youtube.com/watch?v=2hkngtWLGvE
//Bro Code. (2020a, June 30). Java dynamic polymorphism ✨ [Video]. YouTube. https://www.youtube.com/watch?v=tAIaK5LNatE
//Bro Code. (2020c, October 6). Java exception handling ⚠️ [Video]. YouTube. https://www.youtube.com/watch?v=adTDlH0lhaA

public abstract class Employee 
{
private final String firstName;
private final String lastName;
private final String socialSecurityNumber;

// constructor
public Employee(String firstName, String lastName, 
   String socialSecurityNumber)
{
   this.firstName = firstName;                                    
   this.lastName = lastName;                                    
   this.socialSecurityNumber = socialSecurityNumber;         
} 

// return first name
public String getFirstName()
{
   return firstName;
} 

// return last name
public String getLastName()
{
   return lastName;
} 

// return social security number
public String getSocialSecurityNumber()
{
   return socialSecurityNumber;
} 

// return String representation of Employee object
@Override
public String toString()
{
   return String.format("%s %s%nsocial security number: %s", 
      getFirstName(), getLastName(), getSocialSecurityNumber());
} 

// abstract method must be overridden by concrete subclasses
public abstract double earnings(); // no implementation here
} // end abstract class Employee

