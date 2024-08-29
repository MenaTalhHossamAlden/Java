import java.util.Scanner;

class UserInputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // let it know from where it'll take input

        System.out.print("what is your name? ");
        String name = scanner.nextLine(); // to take strings as input from the user
    
        System.out.printf("Hello %s. How old are you? ", name);
        int age = Integer.parseInt(scanner.nextLine());
  
        System.out.printf("%d is an excellent age to start programming. What language do you prefer? ", age);
        String language = scanner.nextLine();

        // <enter>

        System.out.printf("%s is a very popular programming language.", language);
        
        scanner.close();
    }
}

// Scanner object to get user inputs
// Scanner is a java class
// use new keyword to create a new Scanner object