package Week3;
//Fig. 10.8: BasePlusCommissionEmployee.java
//BasePlusCommissionEmployee class extends CommissionEmployee.
//CSIS312: Advanced OO Programming DO1
//Victoria Young date created: 4.4.24
//Deitel, P., & Deitel, H. (2019). Java How To Program, Late Objects (11th ed.). Pearson Education (US). https://libertyonline.vitalsource.com/books/9780134763507
//Bro Code. (2020b, October 6). Java interface 🦅 [Video]. YouTube. https://www.youtube.com/watch?v=GhslBwrRsnw
//Bro Code. (2020c, October 6). Java polymorphism 🏁 [Video]. YouTube. https://www.youtube.com/watch?v=2hkngtWLGvE
//Bro Code. (2020a, June 30). Java dynamic polymorphism ✨ [Video]. YouTube. https://www.youtube.com/watch?v=tAIaK5LNatE
//Bro Code. (2020c, October 6). Java exception handling ⚠️ [Video]. YouTube. https://www.youtube.com/watch?v=adTDlH0lhaA

public class BasePlusCommissionEmployee extends CommissionEmployee 
{
private double baseSalary; // base salary per week

// constructor
public BasePlusCommissionEmployee(String firstName, String lastName, 
   String socialSecurityNumber, double grossSales,
   double commissionRate, double baseSalary)
{
   super(firstName, lastName, socialSecurityNumber, 
      grossSales, commissionRate);

   if (baseSalary < 0.0) // validate baseSalary                  
      throw new IllegalArgumentException("Base salary must be >= 0.0");
         
   this.baseSalary = baseSalary;                
}

// set base salary
public void setBaseSalary(double baseSalary)
{
   if (baseSalary < 0.0) // validate baseSalary                  
      throw new IllegalArgumentException("Base salary must be >= 0.0");
         
   this.baseSalary = baseSalary;                
} 

// return base salary
public double getBaseSalary()
{
   return baseSalary;
}

// calculate earnings; override method earnings in CommissionEmployee
@Override                                                            
public double earnings()                                             
{                                                                    
   return getBaseSalary() + super.earnings();                        
} 

// return String representation of BasePlusCommissionEmployee object
@Override                                                           
public String toString()                                            
{                                                                   
   return String.format("%s %s; %s: $%,.2f",                       
      "base-salaried", super.toString(),                            
      "base salary", getBaseSalary());                             
} 
} // end class BasePlusCommissionEmployee

