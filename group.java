import java.util.Scanner;

public class group {

public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the roll number: ");
        int x = input.nextInt();
        
        int groupNumber = (x - 1) % 4; // determine the group number
        
        String group;
        switch (groupNumber) { // assign the group based on the group number
            case 0:
                group = "Sapphire";
                break;
            case 1:
                group = "Perl";
                break;
            case 2:
                group = "Ruby";
                break;
            case 3:
                group = "Emerald";
                break;
            default:
                group = "Unknown"; // handle the case where the input is invalid
        }
        
        System.out.println("The student belongs to the " + group + " group.");
    }
}