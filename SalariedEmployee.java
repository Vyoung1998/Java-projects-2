package Week3;
//Fig. 10.5: SalariedEmployee.java
//SalariedEmployee concrete class extends abstract class Employee.
//CSIS312: Advanced OO Programming DO1
//Victoria Young date created: 4.4.24
//Deitel, P., & Deitel, H. (2019). Java How To Program, Late Objects (11th ed.). Pearson Education (US). https://libertyonline.vitalsource.com/books/9780134763507
//Bro Code. (2020b, October 6). Java interface 🦅 [Video]. YouTube. https://www.youtube.com/watch?v=GhslBwrRsnw
//Bro Code. (2020c, October 6). Java polymorphism 🏁 [Video]. YouTube. https://www.youtube.com/watch?v=2hkngtWLGvE
//Bro Code. (2020a, June 30). Java dynamic polymorphism ✨ [Video]. YouTube. https://www.youtube.com/watch?v=tAIaK5LNatE
//Bro Code. (2020c, October 6). Java exception handling ⚠️ [Video]. YouTube. https://www.youtube.com/watch?v=adTDlH0lhaA

public class SalariedEmployee extends Employee 
{
private double weeklySalary;

// constructor
public SalariedEmployee(String firstName, String lastName, 
   String socialSecurityNumber, double weeklySalary)
{
   super(firstName, lastName, socialSecurityNumber); 

   if (weeklySalary < 0.0)
      throw new IllegalArgumentException(
         "Weekly salary must be >= 0.0");

   this.weeklySalary = weeklySalary;
} 

// set salary
public void setWeeklySalary(double weeklySalary)
{
   if (weeklySalary < 0.0)
      throw new IllegalArgumentException(
         "Weekly salary must be >= 0.0");

   this.weeklySalary = weeklySalary;
} 

// return salary
public double getWeeklySalary()
{
   return weeklySalary;
} 

// calculate earnings; override abstract method earnings in Employee
@Override                                                           
public double earnings()                                            
{                                                                   
   return getWeeklySalary();                                        
}                                             

// return String representation of SalariedEmployee object   
@Override                                                    
public String toString()                                     
{                                                            
   return String.format("salaried employee: %s%n%s: $%,.2f",
      super.toString(), "weekly salary", getWeeklySalary());
} 
} // end class SalariedEmployee
