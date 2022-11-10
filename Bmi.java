import java.util.Scanner;

public class Main{
   public static void main(String[] args){
	Scanner str = new Scanner(System.in);
	System.out.println("身長:");
	double aheight = str.nextDouble();
	System.out.println("体重:");
	double aweight = str.nextDouble();
            
	double abmi = aweight/(aheight*aheight);
	System.out.println("BMI:");
	System.out.println(String.format("%.2f",abmi));

	System.out.orintln("身長:");
	double bheight = str.nextDouble();
	System.out.println("体重:");
	double bweight = str.nextDouble();

	double bbmi = bweight/(bheight*bheight);
	System.out.println("BMI:");
	System.out.println(String.format("%.2f",bbmi));
   }
}

