package Week3;
//Fig. 10.9: PayrollSystemTest.java
//Employee hierarchy test program.
//CSIS312: Advanced OO Programming DO1
//Victoria Young date created: 4.4.24
//Deitel, P., & Deitel, H. (2019). Java How To Program, Late Objects (11th ed.). Pearson Education (US). https://libertyonline.vitalsource.com/books/9780134763507
//Bro Code. (2020b, October 6). Java interface 🦅 [Video]. YouTube. https://www.youtube.com/watch?v=GhslBwrRsnw
//Bro Code. (2020c, October 6). Java polymorphism 🏁 [Video]. YouTube. https://www.youtube.com/watch?v=2hkngtWLGvE
//Bro Code. (2020a, June 30). Java dynamic polymorphism ✨ [Video]. YouTube. https://www.youtube.com/watch?v=tAIaK5LNatE
//Bro Code. (2020c, October 6). Java exception handling ⚠️ [Video]. YouTube. https://www.youtube.com/watch?v=adTDlH0lhaA

public class PayrollSystemTest 
{
public static void main(String[] args) 
{
	System.out.println("Victoria Young - Assignment#3\n");
	
	
   // create subclass objects
   SalariedEmployee salariedEmployee = 
      new SalariedEmployee("John", "Smith", "111-11-1111", 800.00);
   HourlyEmployee hourlyEmployee = 
      new HourlyEmployee("Karen", "Price", "222-22-2222", 16.75, 40);
   CommissionEmployee commissionEmployee = 
      new CommissionEmployee(
      "Sue", "Jones", "333-33-3333", 10000, .06);
   BasePlusCommissionEmployee basePlusCommissionEmployee = 
      new BasePlusCommissionEmployee(
      "Bob", "Lewis", "444-44-4444", 5000, .04, 300);
   
   //creating PieceWorker Here
   PieceWorker pieceWorker = new PieceWorker ("Mary", "Jane", "555-55-5555", 300, .50);
  
   System.out.println("Employees processed individually:");
   
   System.out.printf("%n%s%n%s: $%,.2f%n%n", 
      salariedEmployee, "earned", salariedEmployee.earnings());
   System.out.printf("%s%n%s: $%,.2f%n%n",
      hourlyEmployee, "earned", hourlyEmployee.earnings());
   System.out.printf("%s%n%s: $%,.2f%n%n",
      commissionEmployee, "earned", commissionEmployee.earnings());
   System.out.printf("%s%n%s: $%,.2f%n%n", 
      basePlusCommissionEmployee, 
      "earned", basePlusCommissionEmployee.earnings());
   
   //individual piece worker printed
   System.out.printf("%s%n%s: $%,.2f%n%n", pieceWorker, "Earned", pieceWorker.earnings());
  
   // create five-element Employee array
   Employee[] employees = new Employee[5]; // add one

   // initialize array with Employees
   employees[0] = salariedEmployee;
   employees[1] = hourlyEmployee;
   employees[2] = commissionEmployee; 
   employees[3] = basePlusCommissionEmployee;
   employees[4] = pieceWorker; //added
   
   System.out.printf("Employees processed polymorphically:%n%n");
   
   // generically process each element in array employees
   for (Employee currentEmployee : employees) 
   {
      System.out.println(currentEmployee); // invokes toString

      // determine whether element is a BasePlusCommissionEmployee
      if (currentEmployee instanceof BasePlusCommissionEmployee) 
      {
         // downcast Employee reference to 
         // BasePlusCommissionEmployee reference
         BasePlusCommissionEmployee employee = 
            (BasePlusCommissionEmployee) currentEmployee;

         employee.setBaseSalary(1.10 * employee.getBaseSalary());

         System.out.printf(
            "new base salary with 10%% increase is: $%,.2f%n",
            employee.getBaseSalary());
      } 

      System.out.printf(
         "earned $%,.2f%n%n", currentEmployee.earnings());
  
      
   } 

   // get type name of each object in employees array
   for (int j = 0; j < employees.length; j++)
      System.out.printf("Employee %d is a %s%n", j, 
         employees[j].getClass().getName()); 
} // end main
} // end class PayrollSystemTest
