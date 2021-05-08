 import java.time.Year;
import java.util.Scanner;
 class Episode {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        System.out.print("Input Name: ");
        String Name = sc.nextLine();

        System.out.print("Input Year: ");
        Integer Year = sc.nextInt();

        int Age = 2564 - Year;
        

        System.out.println("ProductName: "+Name);
        System.out.println("Year: "+Year);
        System.out.println("Age: "+Age);


    } 
        
    
    
}
