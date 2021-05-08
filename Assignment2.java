import java.util.Scanner;
class Assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number1 = ");
        int num1 = sc.nextInt();

        System.out.print("Enter Number2 =");
        int num2 = sc.nextInt();

        if(num1 > num2){
            System.out.println(num1+ " more than " +num2);
        }
        else if (num1 < num2){
            System.out.println(num1+ " less than " +num2);
        }
        else if (num1 == num2){
            System.out.println(num1+ " equal " +num2);
        }
            else {
            System.out.println("Error!");}
        System.out.println("MATH");
    }
}
