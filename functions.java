import java.util.Scanner;
 public class functions {
//     public static void printMyName(String name) {
//         System.out.println("my name is - "+name);
//         return;
//     }
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         String name = sc.next();
//         printMyName(name);}
       

    // public static int multiply(int a, int b){
    //     int product = a * b;
    //     return product;
    // }
    // public static void main(String args[]) {
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();
    //     int result = multiply(a, b);
    //     System.out.println("The product is: " + result);
    // }
    public static void factorial(int n){
        int m = 1;
        for(int i = 1; i <= n; i++){
             m = m*i;
            System.out.println(m);
        }}
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            factorial(n);
        }


    }

