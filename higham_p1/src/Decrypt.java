import java.util.Scanner;

public class Decrypt {

	public static void main(String [] args) {
			
		int[] dataArray = new int[4];
			
		Scanner inputObj = new Scanner(System.in);
			
		int code = inputObj.nextInt();
		int tempCode = code;
			
		for(int i = 3; i >= 0; i--) {
				
			dataArray[i] = tempCode % 10;
				tempCode = tempCode / 10;
		}
		
		int temp = 0;
		
		temp = dataArray[2];
		dataArray[2] = dataArray[0];
		dataArray[0] = temp;
			
		temp = dataArray[3];
		dataArray[3] = dataArray[1];
		dataArray[1] = temp;
		
		for(int i = 0; i < 4; i++) {
			
			if(7 < dataArray[i]) {
				
				dataArray[i] = (dataArray[i] - 7);
			}
			else {
				
				dataArray[i] = ((10 + dataArray[i]) - 7);
			}
		}
			
		
			
		for(int i = 0; i < 4; i++) {
				
			System.out.print(dataArray[i]);
		}
	}
}
