// This program will perform tasks with a menu system. (Jade Park - 8/10/2021)

import java.util.Scanner;

public class WorkforceMenuSystem {

   public static boolean flag = true; // variable that will help trigger the loop if needed

   public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
      
      do {
      
      // 9999 is the default ID
      Manager man1 = new Manager("Jeff", "Bezos", 9999);
      Manager man2 = new Manager("Elon", "Musk", 9999);
      Manager man3 = new Manager("Mark", "Zuckerberg", 9999);
      
      Employee[] team1 = new Employee[3];
      Employee[] team2 = new Employee[3];
      Employee[] team3 = new Employee[3];
      
      Employee[] totalEmployees = new Employee[9];
      
      totalEmployees[0] = new Employee("Ava", "Anderson", 8935);
      totalEmployees[1] = new Employee("Benjamin", "Brown", 1249);
      totalEmployees[2] = new Employee("Charlotte", "Carter", 9012);
      totalEmployees[3] = new Employee("David", "Dunn", 3954);
      totalEmployees[4] = new Employee("Ella", "Edwards", 5832);
      totalEmployees[5] = new Employee("Fred", "Fletcher", 8143);
      totalEmployees[6] = new Employee("Grace", "Gordon", 5892);
      totalEmployees[7] = new Employee("Henry", "Harris", 1041);
      totalEmployees[8] = new Employee("Izzy", "Issacs", 4398);
      
      Branch br1 = new Branch("New York", 1000, "545 8th Avenue", man1, team1);
      Branch br2 = new Branch("Los Angeles", 2000, "545 8th Avenue", man2, team2);
      Branch br3 = new Branch("Chicago", 3000, "545 8th Avenue", man3, team3);
      
      System.out.print("\nWelcome to Starr! Enter 1 to navigate to Administration, or 2 to go to Reporting: ");
      int selection = input.nextInt();
      
      if (selection == 1) { // administration


         System.out.println("\n1 - Assign a manager to supervise the branch");
         System.out.println("2 - Assign an employee to the branch team");
         System.out.println("3 - Remove an employee from the branch team");
         System.out.print("Which of the above options would you like to do?  ");
         int choice = input.nextInt();
         
         if (choice == 1) { // assign a manager
            
            System.out.println("\n1 - " + man1.getManagerFullName() + "'s current Branch ID is " + man1.getBranchID());
            System.out.println("2 - " + man2.getManagerFullName() + "'s current Branch ID is " + man2.getBranchID());
            System.out.println("3 - " + man3.getManagerFullName() + "'s current Branch ID is " + man3.getBranchID());
            System.out.print("Enter the number that corresponds to the manager you'd like to assign:  ");
            int choice2 = input.nextInt();
            
            System.out.println("\n1 - " + br1.getLocationName() + "'s Branch ID is " + br1.getBranchID());
            System.out.println("2 - " + br2.getLocationName() + "'s Branch ID is " + br2.getBranchID());
            System.out.println("3 - " + br3.getLocationName() + "'s Branch ID is " + br3.getBranchID());
            System.out.print("Which branch would you like to assign them to?:  ");
            int branchSelection = input.nextInt();
            
            if (choice2 == 1) { // branch 1
            
               if (branchSelection == 1) {
                  man1.setBranchID(br1.getBranchID());
                  br1.setManager(man1);
                  System.out.println("The new manager of Branch " + br1.getLocationName() + " is " + man1.getManagerFullName());
                  
               } else if (branchSelection == 2) {
                  man1.setBranchID(br2.getBranchID());
                  br2.setManager(man1);
                  System.out.println("The new manager of Branch " + br2.getLocationName() + " is " + man1.getManagerFullName());
                  
               } else if (branchSelection == 3) {
                  man1.setBranchID(br3.getBranchID());
                  br3.setManager(man1);
                  System.out.println("The new manager of Branch " + br3.getLocationName() + " is " + man1.getManagerFullName());
               } else {
                  invalid();
                  flag = false;
               }
               
               
               
            } else if (choice2 == 2) { // branch 2
               
               if (branchSelection == 1) {
                  man2.setBranchID(br1.getBranchID());
                  br1.setManager(man2);
                  System.out.println("The new manager of Branch " + br1.getLocationName() + " is " + man2.getManagerFullName());
                  
               } else if (branchSelection == 2) {
                  man1.setBranchID(br2.getBranchID());
                  br2.setManager(man2);
                  System.out.println("The new manager of Branch " + br2.getLocationName() + " is " + man2.getManagerFullName());
                  
               } else if (branchSelection == 3) {
                  man1.setBranchID(br3.getBranchID());
                  br3.setManager(man2);
                  System.out.println("The new manager of Branch " + br3.getLocationName() + " is " + man2.getManagerFullName());
               } else {
                  invalid();
                  flag = false;
               }
               
            } else if (choice2 == 3) { // branch 3
            
               if (branchSelection == 1) {
                  man3.setBranchID(br1.getBranchID());
                  br1.setManager(man3);
                  System.out.println("The new manager of Branch " + br1.getLocationName() + " is " + man3.getManagerFullName());
                  
               } else if (branchSelection == 2) {
                  man3.setBranchID(br2.getBranchID());
                  br2.setManager(man3);
                  System.out.println("The new manager of Branch " + br2.getLocationName() + " is " + man3.getManagerFullName());
                  
               } else if (branchSelection == 3) {
                  man3.setBranchID(br3.getBranchID());
                  br3.setManager(man3);
                  System.out.println("The new manager of Branch " + br3.getLocationName() + " is " + man3.getManagerFullName());
               } else {
                  invalid();
                  flag = false;
               }
               
            } else {
               invalid();
               flag = false;
            }
            
            // offers users to quit or restart
            System.out.print("\nPress 1 to go to the main method again or 2 to exit. ");
            int userInput = input.nextInt();
               
            if (userInput == 1) {
               flag = false;
            } else if (userInput == 2) {
               exit();
            } else {
               invalid();
               flag = false;
            }
            
         } else if (choice == 2) { // assign an employee
         
            System.out.println("\n1 - " + totalEmployees[0].getFullName() + "'s Employee ID is " + totalEmployees[0].getEmployeeID());
            System.out.println("2 - " + totalEmployees[1].getFullName() + "'s Employee ID is " + totalEmployees[1].getEmployeeID());
            System.out.println("3 - " + totalEmployees[2].getFullName() + "'s Employee ID is " + totalEmployees[2].getEmployeeID());
            System.out.println("4 - " + totalEmployees[3].getFullName() + "'s Employee ID is " + totalEmployees[3].getEmployeeID());
            System.out.println("5 - " + totalEmployees[4].getFullName() + "'s Employee ID is " + totalEmployees[4].getEmployeeID());
            System.out.println("6 - " + totalEmployees[5].getFullName() + "'s Employee ID is " + totalEmployees[5].getEmployeeID());
            System.out.println("7 - " + totalEmployees[6].getFullName() + "'s Employee ID is " + totalEmployees[6].getEmployeeID());
            System.out.println("8 - " + totalEmployees[7].getFullName() + "'s Employee ID is " + totalEmployees[7].getEmployeeID());
            System.out.println("9 - " + totalEmployees[8].getFullName() + "'s Employee ID is " + totalEmployees[8].getEmployeeID());
            System.out.print("Enter the number that corresponds to the employee you'd like to assign:  ");
            int choice3 = input.nextInt();
            
            System.out.println("\n1 - " + br1.getLocationName() + "'s Branch ID is " + br1.getBranchID());
            System.out.println("2 - " + br2.getLocationName() + "'s Branch ID is " + br2.getBranchID());
            System.out.println("3 - " + br3.getLocationName() + "'s Branch ID is " + br3.getBranchID());
            System.out.print("Which branch?  ");
            int choice4 = input.nextInt();
            
            for (int i = 0; i < 3; i++) {
                  if (team1[i] == null) {
                     team1[i] = totalEmployees[choice3 - 1];
                  }
                  break;
            }
            
            if (choice4 == 1) { // branch 1

               System.out.println("Employee " + totalEmployees[choice3 - 1].getFullName() + " is now part of the " + br1.getLocationName() + " branch.");
               
            } else if (choice4 == 2) { // branch 2
                
               System.out.println("Employee " + totalEmployees[choice3 - 1].getFullName() + " is now part of the " + br2.getLocationName() + " branch.");
               
            } else if (choice4 == 3) { // branch 3
            
               System.out.println("Employee " + totalEmployees[choice3 - 1].getFullName() + " is now part of the " + br3.getLocationName() + " branch.");
               
            } else {
               invalid();
               flag = false;
            }
            
            // offers users to quit or restart
            System.out.print("\nPress 1 to go to the main method again or 2 to exit. ");
            int userInput = input.nextInt();
               
            if (userInput == 1) {
               flag = false;
            } else if (userInput == 2) {
               exit();
            } else {
               invalid();
               flag = false;
            }
            
         } else if (choice == 3) { // Remove an employee
         
            System.out.println("\n1 - " + totalEmployees[0].getFullName() + "'s Employee ID is " + totalEmployees[0].getEmployeeID());
            System.out.println("2 - " + totalEmployees[1].getFullName() + "'s Employee ID is " + totalEmployees[1].getEmployeeID());
            System.out.println("3 - " + totalEmployees[2].getFullName() + "'s Employee ID is " + totalEmployees[2].getEmployeeID());
            System.out.println("4 - " + totalEmployees[3].getFullName() + "'s Employee ID is " + totalEmployees[3].getEmployeeID());
            System.out.println("5 - " + totalEmployees[4].getFullName() + "'s Employee ID is " + totalEmployees[4].getEmployeeID());
            System.out.println("6 - " + totalEmployees[5].getFullName() + "'s Employee ID is " + totalEmployees[5].getEmployeeID());
            System.out.println("7 - " + totalEmployees[6].getFullName() + "'s Employee ID is " + totalEmployees[6].getEmployeeID());
            System.out.println("8 - " + totalEmployees[7].getFullName() + "'s Employee ID is " + totalEmployees[7].getEmployeeID());
            System.out.println("9 - " + totalEmployees[8].getFullName() + "'s Employee ID is " + totalEmployees[8].getEmployeeID());
            System.out.print("Enter the number that corresponds to the employee you'd like to remove:  ");
            int choice5 = input.nextInt();
            
            System.out.println("\n1 - " + br1.getLocationName() + "'s Branch ID is " + br1.getBranchID());
            System.out.println("2 - " + br2.getLocationName() + "'s Branch ID is " + br2.getBranchID());
            System.out.println("3 - " + br3.getLocationName() + "'s Branch ID is " + br3.getBranchID());
            System.out.print("Which branch?  ");
            int choice6 = input.nextInt();
         
            if (choice6 == 1) { // branch 1
               
               for (int i = 0; i < 3; i++) {
                  if (team1[i] == totalEmployees[choice5 - 1]) {
                     team1[i] = null;
                  }
                  break;
               }
               
               System.out.println("Employee " + totalEmployees[choice5 - 1].getFullName() + " is now removed from the " + br1.getLocationName() + " branch.");
               
            } else if (choice6 == 2) { // branch 2
                
               for (int i = 0; i < 3; i++) {
                  if (team2[i] == totalEmployees[choice5 - 1]) {
                     team2[i] = null;
                  }
                  break;
               }
               
               System.out.println("Employee " + totalEmployees[choice5 - 2].getFullName() + " is now removed from the " + br2.getLocationName() + " branch.");
               
            } else if (choice6 == 3) { // branch 3
            
               for (int i = 0; i < 3; i++) {
                  if (team3[i] == totalEmployees[choice5 - 1]) {
                     team3[i] = null;
                  }
                  break;
               }
               
               System.out.println("Employee " + totalEmployees[choice5 - 1].getFullName() + " is now removed from the " + br3.getLocationName() + " branch.");
               
            }
            
            // offers users to quit or restart
            System.out.print("\nPress 1 to go to the main method again or 2 to exit. ");
            int userInput = input.nextInt();
               
            if (userInput == 1) {
               flag = false;
            } else if (userInput == 2) {
               exit();
            } else {
               invalid();
               flag = false;
            }
            
         } else {
            invalid();
            flag = false;
         }
            
      
      } else if (selection == 2) { // reporting
      
         System.out.print("Enter 1 view a report of manager and employees for a location or 2 to view a cumulative report: ");
         selection = input.nextInt();
         
         if (selection == 1) { // report of a manager and employee for a location

            System.out.println("\n1 - " + br1.getLocationName() + "'s Branch ID is " + br1.getBranchID());
            System.out.println("2 - " + br2.getLocationName() + "'s Branch ID is " + br2.getBranchID());
            System.out.println("3 - " + br3.getLocationName() + "'s Branch ID is " + br3.getBranchID());
            System.out.print("Enter the number that corresponds to the branch you'd like to get a report on:  ");
            int choice7 = input.nextInt();
               
            if (choice7 == 1) {
               br1.displayBranchInfo(team1, man1);
            } else if (choice7 == 2) {
               br2.displayBranchInfo(team2, man2);
            } else if (choice7 == 3) {
               br3.displayBranchInfo(team3, man3);
            }
            
            // offers users to quit or restart
            System.out.print("\nPress 1 to go to the main method again or 2 to exit. ");
            int userInput = input.nextInt();
               
            if (userInput == 1) {
               flag = false;
            } else if (userInput == 2) {
               exit();
            } else {
               invalid();
               flag = false;
            }
            
         } else if (selection == 2) { // cumulative report
         
            br1.displayBranchInfo(team1, man1);
            br2.displayBranchInfo(team2, man2);
            br3.displayBranchInfo(team3, man3); 
            
            // offers users to quit or restart
            System.out.print("\nPress 1 to go to the main method again or 2 to exit. ");
            int userInput = input.nextInt();
               
            if (userInput == 1) {
               flag = false;
            } else if (userInput == 2) {
               exit();
            } else {
               invalid();
               flag = false;
            }
         }
         
      } else {
         invalid();
         flag = false;
      }
      
      } while (flag == false);
   }
   
   
   // method that notifies the user they exited the program
   public static void exit() {
      System.out.println("You have exited the program. Thank you for visiting Starr!");
   }
   
   // method that notifies the user if the input is invalid
   public static void invalid() {
      System.out.println("INVALID INPUT! Please try again.");
   }
   
}  





