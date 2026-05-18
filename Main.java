
import java.util.*;    //importing the whole util package
public class Main {

    public static void main(String[] args) {    
        //variables
        /*String name = "abc";
        *double price = 33.44;
        int a = 5;
        a = 6;
        name = "def";*/
        // data types  ----
        //1.primitive data types  ---
        //byte,  short,  char,  boolean,  int,  long,  float,  double.....
        //non-primitive data types  ---
        //String,  Array,  Class,  Object,  Interface.....
      /*  Scanner sc = new Scanner(System.in);
       * String name = sc.next();   ///----only one word in a sentence
        System.out.println(name);
        String name2 = sc.nextLine();    //---more than 1 word in a sentence
        System.out.println(name2);*/
        //sc.nextInt(),sc.nextFloat()

        //----conditional statements
        /*System.out.println("ENTER AGE TO CHECK ELIGIBILITY:");
        *Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age>150 || age<0){
            System.out.println("not a valid age");
        }
        else if(age>=18 && age<150){
            System.out.println("you can vote");
        }
        else{
            System.out.println("not an adult");
        }*/
        /*System.out.println("ENTER NUMBER:");
       * Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x%2==0){
            System.out.println("even number");
        }
        else{
            System.out.println("odd number");
        }*/
      /*  System.out.println("ENTER THE NUMBERS:");
      *  Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        Scanner ac = new Scanner(System.in);
        int y = ac.nextInt();
        if(x==y){
            System.out.println("these are equal numbers");
        }
        else if(x>y){
            System.out.println("x is greater than y");
        }
        else {
            System.out.println("x is less than y");
        }*/
        Scanner sc = new Scanner (System.in);
        int button = sc.nextInt();
        switch(button){
            case 1:
                System.out.println("hey");
                break;
            case 2:
                System.out.println("hii");
                break;
            case 3:
                System.out.println("hello");
                break;
            default:
                System.out.println("invalid case");

        }



    }


    }
