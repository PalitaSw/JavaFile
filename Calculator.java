import java.util.Scanner;
class Calculator {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Input num1: ");
        float num1 = ip.nextFloat();

        System.out.print("Input num2: ");
        float num2 = ip.nextFloat();

        System.out.println("Enter: \n 1 = plus \n 2 = minus \n 3 = multipication \n 4 = division");
        int i = ip.nextInt();
        
        if (i == 1){
            System.out.println("Total = " +(num1 + num2));
        } 
        else if(i == 2) {
            System.out.println("Total = " +(num1 - num2));
        }
        else if(i == 3){
            System.out.println("Total = " +(num1*num2));
        }
        else if(i==4){
            System.out.println("Total= " +(num1/num2));
        }
            else 
            System.out.println ("Error! Please choose enter the number");
            
       
    }
}