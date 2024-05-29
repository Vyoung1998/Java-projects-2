package Week3;
//Fig. 10.6: HourlyEmployee.java
//HourlyEmployee class extends Employee.
//CSIS312: Advanced OO Programming DO1
//Victoria Young date created: 4.4.24
//Deitel, P., & Deitel, H. (2019). Java How To Program, Late Objects (11th ed.). Pearson Education (US). https://libertyonline.vitalsource.com/books/9780134763507
//Bro Code. (2020b, October 6). Java interface 🦅 [Video]. YouTube. https://www.youtube.com/watch?v=GhslBwrRsnw
//Bro Code. (2020c, October 6). Java polymorphism 🏁 [Video]. YouTube. https://www.youtube.com/watch?v=2hkngtWLGvE
//Bro Code. (2020a, June 30). Java dynamic polymorphism ✨ [Video]. YouTube. https://www.youtube.com/watch?v=tAIaK5LNatE
//Bro Code. (2020c, October 6). Java exception handling ⚠️ [Video]. YouTube. https://www.youtube.com/watch?v=adTDlH0lhaA

public class HourlyEmployee extends Employee 
{
private double wage; // wage per hour
private double hours; // hours worked for week

// constructor
public HourlyEmployee(String firstName, String lastName,
   String socialSecurityNumber, double wage, double hours)
{
   super(firstName, lastName, socialSecurityNumber);

   if (wage < 0.0) // validate wage
      throw new IllegalArgumentException(
         "Hourly wage must be >= 0.0");

   if ((hours < 0.0) || (hours > 168.0)) // validate hours
      throw new IllegalArgumentException(
         "Hours worked must be >= 0.0 and <= 168.0");

   this.wage = wage;
   this.hours = hours;
} 
 
// set wage
public void setWage(double wage)
{
   if (wage < 0.0) // validate wage
      throw new IllegalArgumentException(
         "Hourly wage must be >= 0.0");

   this.wage = wage;
} 

// return wage
public double getWage()
{
   return wage;
} 

// set hours worked
public void setHours(double hours)
{
   if ((hours < 0.0) || (hours > 168.0)) // validate hours
      throw new IllegalArgumentException(
         "Hours worked must be >= 0.0 and <= 168.0");

   this.hours = hours;
} 

// return hours worked
public double getHours()
{
   return hours;
} 

// calculate earnings; override abstract method earnings in Employee
@Override                                                           
public double earnings()                                            
{                                                                   
   if (getHours() <= 40) // no overtime                           
      return getWage() * getHours();                                
   else                                                             
      return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
}                                          

// return String representation of HourlyEmployee object              
@Override                                                             
public String toString()                                              
{                                                                     
   return String.format("hourly employee: %s%n%s: $%,.2f; %s: %,.2f",
      super.toString(), "hourly wage", getWage(),                     
      "hours worked", getHours());                                   
}                                    
} // end class HourlyEmployee


