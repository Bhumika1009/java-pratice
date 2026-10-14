import java.util.Scanner;
public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number :");
        double num1 = scanner.nextDouble();
        
        scanner.nextLine();

        System.out.print("Enter operator(+,-,*,/):");
        String operator = scanner.nextLine();

        System.out.print("Enter secomd number :");
        double num2 = scanner.nextDouble();

if(operator.equals("+")){
    System.out.println("Result: " + (num1 + num2));
}
else if(operator.equals("-")){
    System.out.println("Result: " + (num1 + num2));
}
else if(operator.equals("*")){
    System.out.println("Result: " + (num1 + num2));
}
else if(operator.equals("/")){
    System.out.println("Result: " + (num1 / num2));
}
else{
    System.out.println("invalid answer");
}
scanner.close();

        
    }
}