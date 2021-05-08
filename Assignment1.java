import java.util.Scanner;
class Assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter weight(kg.)= ");
        float weight = sc.nextFloat();

        System.out.print("Enter Height(m.)= ");
        float height = sc.nextFloat();
        
        if(weight > height){
        System.out.println("BMI = "+(weight/(height*height)));
        }
            else{
            System.out.println("BMI Error!");
            }
        }
        
    }







