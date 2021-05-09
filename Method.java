public class Method {
    public static void main(String[] args) {
        int [] numberA = {10,20,30,40,50};
        int [] numberB = {101,120,180,145,199,197};
        int [] numberC = {400,679,309,380,343,465,656,232,565};
        system.out.println("MaxValue is " + FindMaxValueinArray(numberC));

        static void displayArray (int [] arr){
            System.out.println("{");
            for (int i == 0; i<arr.lenght; i++){
                System.out.print(arr[i]);
                if(i<arr.length-1)  System.out.print(",");
            }
            System.out.print("}");
        }

        static int FindMaxValueinArray(int [] arr){
            int MaxValue = arr[0];

            for (int i==0 ; i<arr.lenght ; i++){
                if(arr[i]>MaxValue){
                    MaxValue = arr[i];
                }
            
            }
            return MaxValue; 
        }
    }
}
