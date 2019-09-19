import java.util.Scanner;

public class Encrypt {

	public static void main(String [] args) {
		
		int[] dataArray = new int[4];
		
		Scanner inputObj = new Scanner(System.in);
		System.out.println("Enter Word");
		
		int code = inputObj.nextInt();
		int tempCode = code;
		//System.out.println(code);
		
		for(int i = 3; i >= 0; i--) {
			
			dataArray[i] = tempCode % 10;
			tempCode = tempCode / 10;
		}
		
		for(int i = 0; i < 4; i++) {
			
			//System.out.println(i);
			System.out.println(dataArray[i]);
		}
	}
}
