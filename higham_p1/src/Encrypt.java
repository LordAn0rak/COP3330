import java.util.Scanner;

public class Encrypt {

	public static void main(String [] args) {
		
		int[] dataArray = new int[4];
		
		Scanner inputObj = new Scanner(System.in);
		
		int code = inputObj.nextInt();
		int tempCode = code;
		
		for(int i = 3; i >= 0; i--) {
			
			dataArray[i] = tempCode % 10;
			tempCode = tempCode / 10;
		}
		
		for(int i = 0; i < 4; i++) {
			
			dataArray[i] = ((dataArray[i] + 7) % 10);
		}
		
		int temp = 0;
		
		temp = dataArray[0];
		dataArray[0] = dataArray[2];
		dataArray[2] = temp;
		
		temp = dataArray[1];
		dataArray[1] = dataArray[3];
		dataArray[3] = temp;
		
		for(int i = 0; i < 4; i++) {
			
			System.out.print(dataArray[i]);
		}
		
		inputObj.close();
	}
}
