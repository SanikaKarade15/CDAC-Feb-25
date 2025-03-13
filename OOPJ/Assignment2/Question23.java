import java.util.Scanner;
public class Question23 {
    public static void main(String args[]){
		Scanner input= new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num= input.nextInt();
		String result=((num&1)==0)?num+" is Even":" is Odd";
		System.out.println(result);
	}
}