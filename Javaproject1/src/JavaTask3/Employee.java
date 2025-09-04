package JavaTask3;

public class Employee {

	    // Fields
	    private int id;
	    private String firstName;
	    private String lastName;
	    private int salary;

	    // Constructor
	    public Employee(int id, String firstName, String lastName, int salary) {
	        this.id = id;
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.salary = salary;
	    }

	    // Getters
	    public int getID() {
	        return id;
	    }

	    public String getFirstName() {
	        return firstName;
	    }

	    public String getLastName() {
	        return lastName;
	    }

	    public String getName() {
	        return firstName + " " + lastName;
	    }

	    public int getSalary() {
	        return salary;
	    }

	    // Setter
	    public void setSalary(int salary) {
	        this.salary = salary;
	    }

	    // Get annual salary
	    public int getAnnualSalary() {
	        return salary * 12;
	    }

	    // Raise salary by percent
	    public int raiseSalary(int percent) {
	        salary += salary * percent / 100;
	        return salary;
	    }

	    // toString method
	    @Override
	    public String toString() {
	        return "Employee[id=" + id + ",name=" + getName() + ",salary=" + salary + "]";
	    }
	


    public static void main(String[] args) {
        Employee emp = new Employee(101, "John", "Doe", 5000);
        
        System.out.println(emp);  // Before raise

        System.out.println("Annual Salary: " + emp.getAnnualSalary());

        emp.raiseSalary(10); // Raise salary by 10%

        System.out.println("After 10% Raise: " + emp);
    }
}



















