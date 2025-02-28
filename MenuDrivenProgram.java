import java.util.Scanner;
public class MenuDrivenProgram {
	
	public static void displayMenu() {
	    System.out.println("Menu: ");
	    System.out.println("1. Greet User");
	    System.out.println("2. Check Even/Odd");
	    System.out.println("3. Exit");
	    System.out.print("Enter your choice (1-3): ");
	}
	
	public static void handleMenuChoice() {
	 	Scanner input = new Scanner(System.in);
	     int choice = input.nextInt();
	    
	    if (choice == 1) {
	        System.out.println ("Hello! Welcome!\n");
	        
	    } else if (choice == 2) {
	      
	      System.out.print("Enter an integer: ");
	     int number = input.nextInt();
	        if (number % 2 != 0) {
            System.out.println(number + " is an Odd number.\n"); 
        } else {
            System.out.println(number + " is an Even number.\n"); 
    }
        } else if (choice == 3 ) {
            System.out.println("Exiting the prpgram. Goodbye!");
            System.exit(0);
	} else {
	    System.out.println("Invalid choice");
	}
	}
	
public static void main(String[] args) {	    
	    while (true) {
	        displayMenu();
	        handleMenuChoice();
	    }
	}
}

