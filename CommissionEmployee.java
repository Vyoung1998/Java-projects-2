package Week3;
//Fig. 10.7: CommissionEmployee.java
//CommissionEmployee class extends Employee.
//CSIS312: Advanced OO Programming DO1
//Victoria Young date created: 4.4.24
//Deitel, P., & Deitel, H. (2019). Java How To Program, Late Objects (11th ed.). Pearson Education (US). https://libertyonline.vitalsource.com/books/9780134763507
//Bro Code. (2020b, October 6). Java interface 🦅 [Video]. YouTube. https://www.youtube.com/watch?v=GhslBwrRsnw
//Bro Code. (2020c, October 6). Java polymorphism 🏁 [Video]. YouTube. https://www.youtube.com/watch?v=2hkngtWLGvE
//Bro Code. (2020a, June 30). Java dynamic polymorphism ✨ [Video]. YouTube. https://www.youtube.com/watch?v=tAIaK5LNatE
//Bro Code. (2020c, October 6). Java exception handling ⚠️ [Video]. YouTube. https://www.youtube.com/watch?v=adTDlH0lhaA

public class CommissionEmployee extends Employee 
{
private double grossSales; // gross weekly sales
private double commissionRate; // commission percentage

// constructor
public CommissionEmployee(String firstName, String lastName, 
   String socialSecurityNumber, double grossSales, 
   double commissionRate)
{
   super(firstName, lastName, socialSecurityNumber);

   if (commissionRate <= 0.0 || commissionRate >= 1.0) // validate 
      throw new IllegalArgumentException(
         "Commission rate must be > 0.0 and < 1.0");

   if (grossSales < 0.0) // validate
      throw new IllegalArgumentException("Gross sales must be >= 0.0");

   this.grossSales = grossSales;
   this.commissionRate = commissionRate;
} 

// set gross sales amount
public void setGrossSales(double grossSales)
{
   if (grossSales < 0.0) // validate
      throw new IllegalArgumentException("Gross sales must be >= 0.0");

   this.grossSales = grossSales;
} 

// return gross sales amount
public double getGrossSales()
{
   return grossSales;
} 

// set commission rate
public void setCommissionRate(double commissionRate)
{
   if (commissionRate <= 0.0 || commissionRate >= 1.0) // validate
      throw new IllegalArgumentException(
         "Commission rate must be > 0.0 and < 1.0");

   this.commissionRate = commissionRate;
} 

// return commission rate
public double getCommissionRate()
{
   return commissionRate;
} 

// calculate earnings; override abstract method earnings in Employee
@Override                                                           
public double earnings()                                            
{                                                                   
   return getCommissionRate() * getGrossSales();                    
}                                             

// return String representation of CommissionEmployee object
@Override                                                   
public String toString()                                    
{                                                           
   return String.format("%s: %s%n%s: $%,.2f; %s: %.2f",    
      "commission employee", super.toString(),              
      "gross sales", getGrossSales(),                       
      "commission rate", getCommissionRate());             
} 
} // end class CommissionEmployee
