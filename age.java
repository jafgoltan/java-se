import java.util.Scanner;

public class age{

    public static void main(String[] args) {
        int age;
        Scanner se = new Scanner(System.in);
        System.out.println("Enter your age : ");
        age = se.nextInt();
        System.out.println("your age is: " + age);
        // age must be fourth 
        int out =  ageFunction(age);
        //age willbe double again
        System.out.println(ageFunction(out)); 

    }

    static int ageFunction (int age) {

        return age*2;
    }


}
