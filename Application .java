#HDFC application file
  public class SimpleMethodExample {

    // Method that takes two integers and returns their sum
    public static int addNumbers(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        // Calling the method and storing the result
        int result = addNumbers(5, 7);

        // Printing the result
        System.out.println("The sum is: " + result);
    }
}
# feature-202 change by vivek  for the module reports on oc 2024

  // File: Animal.java

// A class with protected access specifier
public class Animal {

    // Protected field
    protected String species = "Unknown"; // Initialize with a default value

    // Protected method
    protected void makeSound() {
        System.out.println("Some generic animal sound");
    }
}