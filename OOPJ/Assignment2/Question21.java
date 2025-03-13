import java.util.Scanner;
public class Question21 {
    public static void main(String args[]){
		System.out.println("Enter the number:");
		Scanner input= new Scanner(System.in);
		int a= input.nextInt();
		System.out.println("Number before increment:"+a);
		a=-(~a);
		System.out.println("Number after increment:"+a);
	}
}