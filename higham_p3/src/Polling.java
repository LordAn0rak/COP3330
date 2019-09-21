import java.util.Scanner;

public class Polling {

	public static void main(String [] args) {
		
		Scanner inObj = new Scanner(System.in);
		String[] topics = {"Video Games", "Tacos", "Jazz", "Big O Notation", "Taxes"};
		int[][] responses = new int [5][10];
		int[] total = new int [5];
		
		char repeat = 'y';
		int answer = 0;
		double average = 0;
		int largest = 0;
		int smallest = 0;
		
		System.out.println("Rate these topics from 1 to 10");
		System.out.println();
		

		
		while(repeat == 'y') {
			
			for(int i = 0; i < 5; i++){
					
				System.out.print(topics[i] + "? ");
				answer = inObj.nextInt();
				
				responses[i][(answer-1)]++;
			}
			
			System.out.print("Take Survey Again? (y or n) ");
			repeat = inObj.next().charAt(0);
		}
		
		System.out.println();
		
		System.out.print("                ");
		
		for(int i = 0; i < 10; i++) {
			
			System.out.print((i+1) + " ");
		}
		
		System.out.print("Avg");
		
		System.out.println();
		
		for(int i = 0; i < 5; i++){
					
			System.out.printf("%-15s ", topics[i]);
			for(int j = 0; j < 10; j++) {
				
				total[i] += ((j + 1) * responses[i][j]);
				
				if(total[i] > total[largest]) {
					
					largest = i;
				}
				
				if(total[i] < total[smallest]) {
									
					smallest = i;
				}
				
				average += ((j + 1) * responses[i][j]);
				System.out.print(responses[i][j] + " ");
			}
		
			System.out.println(" " + (average/10));
			average = 0;
		}
		
		System.out.println("Most points topic: " + topics[largest] + " with " + total[largest] + " points");
		System.out.println("Least points topic: " + topics[smallest] + " with " + total[smallest] + " points");
	}
}
