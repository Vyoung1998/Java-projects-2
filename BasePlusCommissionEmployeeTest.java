// BasePlusCommissionEmployeeTest.java
// Testing class BasePlusCommissionEmployee.

public class BasePlusCommissionEmployeeTest
{
   public static void main(String[] args) 
   {
      // instantiate CommissionEmployee object
      CommissionEmployee employee1 = new CommissionEmployee(
         "Sue", "Jones", "222-22-2222", 10000, .06);      
      
      // get commission employee data
      System.out.println(
         "Employee information obtained by get methods:");
      System.out.printf("%n%s %s%n", "First name is",
         employee1.getFirstName());
      System.out.printf("%s %s%n", "Last name is", 
         employee1.getLastName());
      System.out.printf("%s %s%n", "Social security number is", 
         employee1.getSocialSecurityNumber());
      System.out.printf("%s %.2f%n", "Gross sales is", 
         employee1.getGrossSales());
      System.out.printf("%s %.2f%n", "Commission rate is",
         employee1.getCommissionRate());

      employee1.setGrossSales(5000); 
      employee1.setCommissionRate(.1); 
      
      System.out.printf("%n%s:%n%n%s%n",                                
         "Updated employee information obtained by toString", employee1);
      
      // instantiate BasePlusCommissionEmployee object
      BasePlusCommissionEmployee employee2 = 
         new BasePlusCommissionEmployee(
            "Bob", "Lewis", "333-33-3333", 5000, .04, 300);
      
      // get base-salaried commission employee data
      System.out.println(
         "Employee information obtained by get methods:");
      System.out.printf("%n%s %s%n", "First name is",
         employee2.getFirstName());
      System.out.printf("%s %s%n", "Last name is", 
         employee2.getLastName());
      System.out.printf("%s %s%n", "Social security number is", 
         employee2.getSocialSecurityNumber());
      System.out.printf("%s %.2f%n", "Gross sales is", 
         employee2.getGrossSales());
      System.out.printf("%s %.2f%n", "Commission rate is",
         employee2.getCommissionRate());
      System.out.printf("%s %.2f%n", "Base salary is",
         employee2.getBaseSalary());

      employee2.setBaseSalary(1000); 
      
      System.out.printf("%n%s:%n%n%s%n", 
         "Updated employee information obtained by toString", 
         employee2.toString());
   } // end main
} // end class BasePlusCommissionEmployeeTest


/**************************************************************************
 * (C) Copyright 1992-2014 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
