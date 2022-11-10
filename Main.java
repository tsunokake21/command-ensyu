import java.util.Scanner;

public class Main{
   public static void main(String[] args){
	Scanner str = new Scanner(System.in);
	System.out.println("身長");
	double height = str.nextDouble();
	System.out.println("体重");
	double weight = str.nextDouble();

	double bmi = weight/Math.pow(height,2);
	System.out.println("BMI:");
	System.out.println(String.format("%.2f",bmi));
   }
}

