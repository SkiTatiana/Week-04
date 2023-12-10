
package week04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Map;

public class Week04StringBuilderListSetMapLab {

	public static void main(String[] args) {

		// 1. Why would we use a StringBuilder instead of a String?
		// 		a. Instantiate a new StringBuilder
		//		b. Append the characters 0 through 9 to it separated by dashes
		// 				Note:  make sure no dash appears at the end of the StringBuilder
		StringBuilder sb = new StringBuilder();
		
		for (int i= 0; i<10; i++) {
			sb.append(i);
		if (i != 9) {
			sb.append("-");
			}
		}
		
			System.out.println(sb.toString());		


			
			
			// 2. List of String:
		//		a. Create a list of Strings 
		//		b. Add 5 Strings to it, each with a different length
			List<String> strings = new ArrayList<String>();
			strings.add("Tali");
			strings.add("Sammy");
			strings.add("Paul");
			strings.add("I");
			strings.add("Me");
			
			
			
			

		// 3. Write and test a method that takes a list of strings 
		//			and returns the shortest string
			
			
		System.out.println(findShortestString(strings));	 


		// 4. Write and test a method that takes a list of strings 
		//			and returns the list with the first and last element switched
		System.out.println("\n**Swapped strings**");
		List<String> swapped = swapFirstAndLast(strings);
		for (String string : swapped) {
			System.out.println(string);
		}

		// 5. Write and test a method that takes a list of strings 
		//			and returns a string with all the list elements concatenated to each other,
		// 			separated by a comma
		System.out.println(combineStrings(swapped));
		
		

		// 6. Write and test a method that takes a list of strings and a string 
		//			and returns a new list with all strings from the original list
		// 			containing the second string parameter (i.e. like a search method)
		System.out.println(searchList(strings,"a"));

		// 7. Write and test a method that takes a list of integers 
		//			and returns a List<List<Integer>> with the following conditions specified
		//			for the return value:
		//		a. The first List in the returned value contains any number from the input list 
		//			that is divisible by 2
		//		b. The second List contains values from the input list that are divisible by 3
		//		c. The third containing values divisible by 5, and 
		//		d. The fourth all numbers from the input List not divisible by 2, 3, or 5
		
		List<Integer> myNumbers = new ArrayList<Integer>();
		myNumbers.add(77);
		myNumbers.add(242);
		myNumbers.add(11);
		myNumbers.add(100);
		myNumbers.add(125);
		myNumbers.add(666);
		myNumbers.add(404);
		myNumbers.add(7);
		myNumbers.add(99);
		
		
		System.out.println(categorizeInts(myNumbers));
		

		// 8. Write and test a method that takes a list of strings 
		//			and returns a list of integers that contains the length of each string
		
		List<Integer> lengths = lengthOfString(strings);
		for (Integer length : lengths) {
		System.out.println("The length of the string is:" + length);
		}
		
		System.out.println();


		// 9. Create a set of strings and add 5 values
		Set<String> cats = new HashSet<String>();
		cats.add("ragdoll");
		cats.add("sphynx");
		cats.add("persian");
		cats.add("siamese");
		cats.add("ocicat");
		


		// 10. Write and test a method that takes a set of strings and a character 
		//			and returns a set of strings consisting of all the strings in the
		// 			input set that start with the character parameter.
		
		Set<String> results = searchStrings(cats, 's'); 
		System.out.println("matching results:");
		
		for (String result : results) {
			System.out.println(result);
		}


		// 11. Write and test a method that takes a set of strings 
		//			and returns a list of the same strings
		 System.out.println(convertToList(cats));


		// 12. Write and test a method that takes a set of integers 
		//			and returns a new set of integers containing only even numbers 
		//			from the original set
		 System.out.println("** Even Numbers **");
		 Set<Integer> myNumberSet = new HashSet<Integer>();
		 myNumberSet.addAll(myNumbers);
		 System.out.println(getEvenInts(myNumberSet));

		 System.out.println("********");

		// 13. Create a map of string and string and add 3 items to it where the key of each
		// 			is a word and the value is the definition of the word
		Map<String,String> dictionary = new HashMap<String,String>();
		dictionary.put("builder", "someone who constructs structures");
		dictionary.put("painter", "uses pigments to put color on things " );
		dictionary.put("chef", "turns raw ingredients into dishes");
		
		


		// 14. Write and test a method that takes a Map<String, String> and a string 
		// 			and returns the value for a key in the map that matches the
		// 			string parameter (i.e. like a language dictionary lookup)

		System.out.println("The definition of 'chef' is: " + getMap(dictionary, "chef"));
		
		// 15. Write and test a method that takes a List<String> 
		//			and returns a Map<Character, Integer> containing a count of 
		//			all the strings that start with a given character
		List<String> states = new ArrayList<String>();
		states.add("Alabama");
		states.add("Alaska");
		states.add("California");
		states.add("Florida");
		states.add("Nevada");
		states.add("Oregon");
		states.add("Ohio");
		states.add("Oklahoma");
		states.add("Wyoming");

		System.out.println(getCounts(strings));
		System.out.println(getCounts(states));
		

		/*
		List<String> ingredients = new ArrayList<String>();
		ingredients.add("flour");
		ingredients.add("sugar");
		ingredients.add("eggs");
		ingredients.add("butter");
		//flour, sugar, eggs, butter
		
		String ingredientStr = stringBakeryIngredients(ingredients);
		System.out.println(ingredientStr);
		
		List<String> states = new ArrayList<String>();
		states.add("Alabama");
		states.add("Alaska");
		states.add("California");
		states.add("Florida");
		states.add("Nevada");
		states.add("Oregon");
		states.add("Wyoming");
		
		String statesStr = stringBakeryIngredients(states);
		System.out.println(statesStr);
		*/
	}
 
	// 15. Write and test a method that takes a List<String> 
	//			and returns a Map<Character, Integer> containing a count of 
	//			all the strings that start with a given character

	
	
	public static Map<Character , Integer> getCounts (List<String> list){
		Map<Character, Integer> result8 = new HashMap<Character, Integer>();
		
		for (String string : list) {
			Character c = string.charAt(0);
			Integer count = result8.get(c);
			if (count == null) {
				count = 1;
			}
			else {
				count++;
			}
			result8.put(c, count);
		}
		
		return result8;
	}

	public static String getMap(Map<String,String> map, String string) {
		String result7 = map.get(string);
		
		
		return result7;
	}
	
	
	
	
	
	public static Set<Integer> getEvenInts(Set<Integer> intSet){
		Set<Integer> result6 = new HashSet<Integer>();
		for (Integer num : intSet) {
			if (num % 2 == 0) {
				result6.add(num);
			}
		
		}
		
		return result6;
	}


	public static List<String> convertToList(Set<String> stringSet){
		List<String> result5 = new ArrayList<String>();
		for (String str : stringSet) {
			result5.add(str);
		}
		
		
		return result5;
	}
	
	
	public static Set<String> searchStrings(Set<String> strSet, Character startsWith){
		Set<String> result4 = new HashSet<String>();
		for (String string : strSet) {
			if (string.startsWith(startsWith.toString())) {
				result4.add(string);
			}
		}
	
		
		return result4;
	}
	
	

	public static List<Integer> lengthOfString(List<String> strings){
		List<Integer> result3 = new ArrayList<Integer>();
		for (String string : strings) {
			result3.add(string.length());
		}
		
		
		return result3;
	}
	
	
	public static List<List<Integer>> categorizeInts(List<Integer> intList){ 
		List<Integer> firstList = new ArrayList<Integer>();
		List<Integer> secondList = new ArrayList<Integer>();
		List<Integer> thirdList = new ArrayList<Integer>();
		List<Integer> fourthList = new ArrayList<Integer>();
		List<List<Integer>> resultList = new ArrayList<List<Integer>>();
		resultList.add(firstList);
		resultList.add(secondList);
		resultList.add(thirdList);
		resultList.add(fourthList);
		
		for (Integer i : intList) {
			if (i % 2 == 0) {
				firstList.add(i);
				
			}
			if (i % 3 == 0){
				secondList.add(i);
			}
			if (i % 5 == 0) {
				thirdList.add(i);
			}
			if (i % 2 != 0 && i % 3 !=0 && i % 5 !=0) {
				fourthList.add(i);
			}
		}
		return resultList;
	}
			
	public static List<String> searchList(List<String> strings, String searchTerm){
		List<String> result = new ArrayList<String>();
		for (String string : strings) {
			if (string.contains(searchTerm)) {
				result.add(string);
			}
			
		}
		return result;
	}
	
	public static String combineStrings(List<String> strings) {
		StringBuilder result = new StringBuilder();
		for (String string : strings) {
			result.append(string + ", ");
		}
		result = result.delete(result.length()-2, result.length());
		return result.toString();
		
	}
	
	public static String stringBakeryIngredients(List<String> toBeConcatenated) {
		String concatBakeryIngredients = "";
		for (String ingredient : toBeConcatenated){
			 concatBakeryIngredients = concatBakeryIngredients + ingredient + ", ";
		}
		return concatBakeryIngredients;
	}
	
	
	public static List<String> swapFirstAndLast(List<String> list){
		String temp = list.get(0);
		String last = list.get(list.size() - 1);
		list.set(0, last);
		list.set(list.size() - 1, temp);
		return list;
	}

	public static String findShortestString(List<String> list) {
		String shortest = list.get(0);
		for (String string : list) {
			if (string.length() < shortest.length()){
				shortest = string;
			}
		}
		return shortest;
	}
	

	// Method 15:



	// Method 14:



	// Method 12:



	// Method 11:



	// Method 10:



	// Method 8:



	// Method 7:



	// Method 6:



	// Method 5:



	// Method 4:



	// Method 3:


}
