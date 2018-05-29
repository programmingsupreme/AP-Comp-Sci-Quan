import java.util.Scanner;

public class loops {
	private static final String num3 = null;

	public static void main(String[] args) {

		// Program 1
		for (int i = 0; i < 11; i++) {
			if (i == 10) {

				System.out.print(i);

			} else {

				System.out.print(i + ",");

			}
		}
		System.out.println("\n");
		// Program 1a
		int i2 = 0;
		while (i2 < 11) {

			if (i2 == 10) {

				System.out.print(i2);

			} 
			else {

				System.out.print(i2 + ",");

			}
			i2++;
		}
		System.out.println("\n");

		// Program 2a
		for (int a = 0; a < 31; a++) {

			if (a % 2 == 0)
				System.out.println(a + " ");

		}

		System.out.println(0);

		// Program 2b
		int a2 = 0;
		while (a2 < 31) {

			a2++;
			if (a2 % 2 == 0)
				System.out.println(a2);
		}

		// Program 3
		Scanner sc = new Scanner(System.in);

		int sum = 0;

		System.out.println("Please enter a positive integer");
		int num = sc.nextInt();
		if (num < 0) {
			System.out.println("A positive number was not detected.");
			System.exit(0);
		}
		while (num != 0) {

			sum = sum + num;
			System.out.println("Please enter a positive integer");
			num = sc.nextInt();
			if (num < 0) {
				System.out.println("A positive number was not detected.");
				System.exit(0);

			}
			int test = sum + num;
			System.out.println("The sum of the numbers you entered was " + test);

		}
		{

			// Program4
			int sum1 = -1;
			int tries = 1;
			System.out.println("Please enter a positive integer");
			int number = sc.nextInt();
			if (number < 0) {
				System.out.println("A positive number was not detected.");
				System.exit(0);
			}
			while (number != 0) {

				sum1 = sum1 + num;
				System.out.println("Please enter a positive integer");
				number = sc.nextInt();
				tries++;
				if (number < 0) {
					System.out.println("A positive number was not detected.");
					System.exit(0);

				}

			}
			int test2 = sum + num;
			System.out.println("The average of the numbers you entered was " + test2 / tries);
			System.out.println("\n");
			// Program5
			for (int c1 = 1; c1 <= 10; c1++) {
				for (int c2 = 1; c2 <= 10; c2++) {
					int pr = c1 * c2;

					if (pr < 10) {
						System.out.print(" " + pr + " ");
					} 
					else {
						System.out.print(pr + " ");
					}

				}
				System.out.println("  ");
			}

			// Program6
	//		System.out.println("Please enter 2 numbers, seperate the numbers by pressing enter");
			
		
		int number1 = 0;
		int num2 = 0;
		int max = 0;
		int min = 0;
		Scanner statement = new Scanner(System.in);
		System.out.print("Please input a number");

		number1 = statement.nextInt();
		Scanner statement2 = new Scanner(System.in);

		System.out.print("Please input another number that is different from the previous number");
		num2 = statement2.nextInt();
		if(number1 > num2){
		min = num2;
		max = number1;
		}

		if (num2 > number1) {
			min = number1;
			max = num2;
		}

		if (number1 == num2) {

			max = number1;
			min = num2;
		}

		while (number1 != num2) {

			num2 = number1;
			System.out.print("Please input another number that is different from the previous number");
			number1 = statement.nextInt();
			System.out.println("");
			if (number1 >= max) {

				max = number1;
			}
			if (number1 <= min) {

				min = number1;
			}
			
		}
		System.out.println("The maximum number is " + max + " and the minimum number is " + min);
		
			}
			

		}

	
}
