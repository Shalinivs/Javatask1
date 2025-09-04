package JavaTask3;
	
	public class Person {
	    // Attributes
	    private String name;
	    private int age;

	    // Constructor
	    public Person(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    // Getter for name
	    public String getName() {
	        return name;
	    }

	    // Getter for age
	    public int getAge() {
	        return age;
	    }


	    public String toString() {
	        return "Person{name='" + name + "', age=" + age + "}";
	    }
	
	  
	        public static void main(String[] args)
	        {
	            Person p1 = new Person("Alice", 25);
	            System.out.println("Name: " + p1.getName());
	            System.out.println("Age: " + p1.getAge());
	            System.out.println(p1); // Calls toString()
	        }
	}
	



