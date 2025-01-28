import java.util.*;
public class BMI {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter your weight in kilograms:");
    float weight=sc.nextFloat();
    System.out.print("Enter your height in metres:");
    float height=sc.nextFloat();
    float BMI=weight/height*height;
    System.out.println("Your bod mass Index is :"+BMI);
    if(BMI < 18.5) {
        System.err.println("Underweight");
    } else if (18.5<=BMI && BMI<=24.9) {
        System.err.println("Normal Weight");
    } else if(18.5<=BMI && BMI<=29.9) {
        System.err.println("Overweight");
    } else {
        System.out.println("Obesity");
 
    }
    }
    
    

    }

    



