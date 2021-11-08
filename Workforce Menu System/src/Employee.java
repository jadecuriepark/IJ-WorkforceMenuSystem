class Employee { 
   
   // add current attributes
   private String employeeFirstName;
   private String employeeLastName;
   private String employeeFullName = employeeFirstName + " " + employeeLastName;
   
   // new attributes
   private int employeeID;
   public static int totalActiveEmployees; 
   
   
   // default constructor
   public Employee() {
      employeeFirstName = "";
      employeeLastName = "";
      employeeFullName = "";
      employeeID = 0;
      totalActiveEmployees = 0;
   }
   

   public Employee(String firstName, String lastName, int id) {
      employeeFirstName = firstName;
      employeeLastName = lastName;
      employeeFullName = firstName + " " + lastName;
      employeeID = id;
      totalActiveEmployees += 1;
   }

   // getter and setter methods
    public String getFirstName() {
		return employeeFirstName;
	}
   
	public void setFirstName(String firstName) {
		employeeFirstName = firstName;
	}
   
   
   public String getLastName() {
		return employeeLastName;
	}
   
	public void setLastName(String lastName) {
		employeeLastName = lastName;
	}
   
   
   public String getFullName() {
		return employeeFullName;
	}
   
	public void setFullName(String firstName, String lastName) {
		employeeFullName = firstName + " " + lastName;
	}

   public int getEmployeeID() {
		return employeeID;
	}
   
	public void setEmployeeID(int id) {
		employeeID = id;
	}

   
   // The terminate method for an employee should decrement the class variable 
   
   public static void terminateEmployee() {
      // decrements the static variable by 1
      totalActiveEmployees -= 1;
     
   }
   
   // getter coded for the static class variable returning total # of active employees

   public static int getTotalActiveEmployees() {
		return totalActiveEmployees;
	}
   
   //toString
   public String toString() {
      String str = "";
      str += "\nFirst Name: " + employeeFirstName;
      str += "\nLast Name: " + employeeLastName;
      str += "\nFull Name: " + employeeFullName;
      str += "\nEmployee ID: " + employeeID;
      return str;
   }
   
}
