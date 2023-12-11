package CodingAssignment;

public class Week04Homework {

	public static void main(String[] args) {


		//1: 
		//Created an array, subtracted the value in the first number in the array which is stored in [0] so the last one is stored in .length -1
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		int x = ages[ages.length -1] - ages[0];
		System.out.println("The first age subtracted from the last age is: " + x);


		
		int[] ages2 = {15, 20, 25, 30, 35, 40, 45, 50, 55};
		int y = ages2[ages2.length -1] - ages2[0];
		System.out.println("The first age subtracted from the last age is: " + y);
		int total = 0;

		
		//calculating the sum total in ages2
		for (int i = 0; i < ages2.length; i++ ) {
			total += ages2[i];

		}
		
		//then divide by ages2's by number of elements in the array.
		double average = total / ages2.length;
		System.out.println("The average age is: " + average);

		//2:
		String[] names = {"Sam", "Tommy", "Tim" , "Sally", "Buck", "Bob"};

		// for every name in names add the length to the previous value to get total char count
		int totalChars = 0;
		for (String name : names) {
			totalChars += name.length();
		}
		// then divide by number of elements in array to get the average
		double averageChars = totalChars / names.length;
		System.out.println("The average number of characters in each name is:" + averageChars);

		//3: array name . length -1 

		//4: array name [0]  	

		//5:
		int[] nameLengths = new int[names.length];
		// get the total length of all strings in the array 
		for (int a = 0; a < names.length; a++) {
			nameLengths[a] = names[a].length();
		}

		//6:
		 
		int totalNameLengths = 0;
		// loop adds together number of characters of each element in the array
		for (int nameLength: nameLengths) {
			totalNameLengths += nameLength;
		}
		System.out.println("The total numbers of characters in the list of names is: " + totalNameLengths);

		//7:
		System.out.println(replicateWord("Hello", 3));
		
		//8:
		String firstName = "Ricky";
		String lastName = "Bobby";
		
		System.out.println(makeFullName("The human's full name is: " + firstName, lastName));
		System.out.println(makeFullName("The pet's full name is: " + "Stinky", "Thecat"));
		
		//9:
		int[] array1 = {1, 5, 7, 9, 11, 42, 6, 15, 98};
		System.out.println("The sum of the array exceeds 100: " +checkIf100(array1));
		
		//10:
		double[] array2 = {10.3, 109.7, 11.0, 5.3, 9.9};
		
		System.out.println("The average of the array of numbers is: " + average(array2));
		
		
		//11.
		double[] arrayA = {11.9, 89.7, 55.0, 2.3, 16.72, 242.0, 99.7};
		double[] arrayB = {1.2, 13.8, 71.9, 1.3, 12.13, 100.0, 97.3};
		
		
		System.out.println("The first array has a greater average: " + compareArrays(arrayA, arrayB)); 
		
		//12: 
		System.out.println("Will buy a drink: " + willBuyDrink(true, 15.99));
		
		//13: Calculate gymnastics score by removing the lowest and highest score then calculate the average. 
		System.out.println("The average score with highest and lowest removed is: " + calculateScore(arrayA));
		
		
	}
	


	//Methods
	
	
	//7:
	// modifier, return type, name of method, parameters.
	public static String replicateWord (String word, int n) {
		String replicatedWord = "";
		// returns a word concatenated to itself n number of times. 
		for (int i = 0; i < n; i++) {
			replicatedWord += word;
		}
		return replicatedWord;
	}
	
	
	
	//8:
	// takes in two variables and prints them with a string of space in between
	public static String makeFullName (String firstName, String lastName) {
		String fullName = (firstName + " " + lastName);	
		return fullName;	
	}

	
	//9:
	// takes in an array and checks if the sum of the array is > 100
	public static boolean checkIf100 (int[] array) {
		int sumOfArray = 0;
		for (int num : array) {
			sumOfArray += num;
		}
		if (sumOfArray > 100) {
			return true;
		}else {
			return false;
		}
	}
	
	//10:
	//// sums up the numbers in the array and divides by the number of elements in the array to return an average
	public static double average (double[] array) {
		double sumOfDbl = 0;
		for (double dbl : array) {
			sumOfDbl += dbl;
		}
		return (sumOfDbl / array.length);
		
	}
	
	//11:
	// compares the value of two arrays by adding together elements of each array and dividing by the size of respective array
	public static boolean compareArrays (double[] array1, double[] array2) {
		double sumOfArray1 = 0;
		double sumOfArray2 = 0;
		for (double num : array1) {
			sumOfArray1 += num;
		}
		for (double num : array2) {
			sumOfArray2 += num;
		}
		// this checks if array1 is > array2
		if ((sumOfArray1 / array1.length) > (sumOfArray2 / array2.length)) {
			return true;
		}
		return false;
	}
	
	//12:
	// boolean used to check if both conditions are met if so true if not false
	public static boolean willBuyDrink (boolean isHotOutside, double moneyInPocket) {
		return (isHotOutside && moneyInPocket > 10.50) ? true : false;
	}
	
	//13:
	// created three variables one for sum of all elements in the array and one each for highest and lowest scores
	public static double calculateScore (double[] scores) {
		double sumOfScores = 0;
		double highestScore = 0;
		double lowestScore = Double.MAX_VALUE; 
		//set lowestScore to max value of a double
		
		
		for (double score : scores) {
			sumOfScores += score;
			if (score > highestScore) {
				highestScore = score;
			}
			if (score < lowestScore) {
				lowestScore = score;
			}
		}
		//takes the sum of all scores then subtracts the highest and lowest scores
		sumOfScores= sumOfScores - highestScore - lowestScore;
		//sub 2 from length to get average because two elements of the array are being removed from the average 
		return sumOfScores / (scores.length-2);
		
	}
}


