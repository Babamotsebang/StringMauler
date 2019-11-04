import java.util.Scanner;

public class Mauler {

    //variable declaration
    private static String input;
    private static StringBuilder stringBuilder;
    private static Scanner scanner = new Scanner(System.in);

    //main method
    public static void main(String [] args){
        //prompting the user to enter action
        System.out.println("N Creates a new string to maul");
        System.out.println("A Appends a string to the current string");
        System.out.println("P Prepends a string to the current string");
        System.out.println("R Reverses the string");
        System.out.println("Q Quits the app");
        System.out.println("Please Enter input prefixed with 'input': Action String");
        input =scanner.nextLine();

        //Condition on when to exit the program
        while (!(input.charAt(0) =='Q')){
            manipulation(input);
            System.out.println("Please enter input prefixed with 'input': Action String");
            input =scanner.nextLine();
        }


    }

    //method for performing string manipulation
    public static String manipulation(String input){
         String withoutInput= input.replaceAll(".*:","").trim();
         String withoutAction = withoutInput.substring(1).trim();
         Character character = withoutInput.trim().charAt(0);

         switch (character){
            case 'N':
                stringBuilder = new StringBuilder("");
                System.out.println(stringBuilder);
                break;
            case 'A':
                stringBuilder.append(withoutAction);
                System.out.println(stringBuilder);
                break;
            case 'P':;
                stringBuilder.insert(0,withoutAction);
                System.out.println(stringBuilder);
                break;
            case 'R':;
                stringBuilder.reverse();
                System.out.println(stringBuilder);
                break;
            case 'Q':
                 break;
        }

        return new String(stringBuilder.toString());
    }
}
