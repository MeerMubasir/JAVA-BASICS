import java.util.Scanner;
public class loops {
    public static void main(String[] args) {
        // for loop
       /* for (int count=0;count<7;count++){
            System.out.println("hello"); 
        }*/



        /*Scanner sc = new Scanner(System.in);
        int[] arr= new int[5];
        System.out.println("ENTER ARRAY ELEMENTS:");
        for(int i=0;i<5;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Array elements are:");
        for (int i = 0;i<5;i++){
            System.out.println(arr[i]);
        }
        sc.close();*/



        // while loop
       /* Scanner sc= new Scanner(System.in);
        int age = sc.nextInt();
        while(age<18 ){
            System.out.print(+age );
            System.out.println(" years old");
            age++;
        }*/





        // do-while loop
      Scanner sc = new Scanner(System.in);
      int day = sc.nextInt();
      do {
        System.out.print(day);
        System.out.println(" day's of this month");
        day++;
      }while(day<32);
      sc.close();




       
    }
}