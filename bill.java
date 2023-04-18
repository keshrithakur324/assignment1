import java.util.Scanner;

public class bill{

public static void main(String[] args) {
Scanner input = new Scanner(System.in);
        System.out.print("Enter the unit: ");
        int unit= input.nextInt();
        double bill=0;
         if(unit<=100){
            bill=unit*1.20;
         }
         else if (unit>100||unit<=300) {
            bill=(100*1.20)+(unit-100)*2;
         } else {
            bill=100 * 1.20 + 200 * 2 + (unit - 300) * 3;
         }
          

         System.out.println("The electricity bill is:" +bill);
}
}