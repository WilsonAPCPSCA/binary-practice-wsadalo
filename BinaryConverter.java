import java.util.Scanner;
public class BinaryConverter {
	
	public static void convertBinary(int num) {
		int x = 0;
		System.out.print("The number "+num+" is equivalent to ");
		while(num >= Math.pow(2,x)) {
			x++;
		}
		System.out.print("1");
		num = num-(int)Math.pow(2, x-1);
		for(int i = x-2;i>=0;i--) {
			if (num - (int)Math.pow(2, i) >= 0) {
				System.out.print("1");
				num = num - (int)Math.pow(2, i);
			}else {
				System.out.print("0");
			}
		}
	    System.out.print(" in binary.");
	}
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.print("Enter the number you would like to convert into binary: ");
		int num = in.nextInt();
		convertBinary(num);
	}

}
