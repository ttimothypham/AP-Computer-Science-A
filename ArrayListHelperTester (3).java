import java.util.ArrayList;

/*After you finish testing a method with the scanner, you can comment the test lines off in order to test other methods */

public class ArrayListHelperTester 
{

	public static void main(String[] args) 
	{
	
	//initiating variables
	int[] numbers = {45,21,8,65,321,351,468,213,2,45,12,46,27,1,8};
	double[] numbers2 = {12.5,123.65,11.2,445.2,4481.1241,0.1234};
	String[] words = {"Go","bears","Win","The","Day"};
	int[] digits = {1,2,3,4,5,6,7,8};
	int[] one = {1,3,5,7,9,11};
	int[] two = {2,4,6,8,10};
	ArrayList<Integer> numbs = new ArrayList<Integer>();
	ArrayList<String> words2 = new ArrayList<String>();
	ArrayList<String> words3 = new ArrayList<String>();
	ArrayList<Integer> nums = new ArrayList<Integer>();
	ArrayList<String> random = new ArrayList<String>();
	ArrayList<Integer> list4 = new ArrayList<Integer>();
	ArrayList<Integer> list5 = new ArrayList<Integer>();
	ArrayList<Integer> sum10 = new ArrayList<Integer>();
	ArrayList<String> wordz = new ArrayList<String>();
	ArrayList<Integer> multList = new ArrayList<Integer>();
	ArrayList<String> inputs = new ArrayList<String>();
	ArrayList<String> palindromes = new ArrayList<String>();
	numbs.add(0);
	numbs.add(1);
	numbs.add(2);
	numbs.add(3);
	numbs.add(4);
	numbs.add(3);
	numbs.add(3);
	words2.add("Go");
	words2.add("Bears");
	words2.add("Go");
	words2.add("Bears");
	words2.add("Go");
	words2.add("Bears");
	words2.add("Go");
	words2.add("Bears");
	words3.add("Win");
	words3.add("The");
	words3.add("Day");
	words3.add("Win");
	words3.add("The");
	words3.add("Day");
	nums.add(4);
	nums.add(8);
	nums.add(10);
	nums.add(6);
	nums.add(2);
	random.add("Never");
	random.add("Gonna");
	random.add("Give");
	random.add("You");
	random.add("Up");
	list4.add(1);
	list4.add(2);
	list4.add(3);
	list4.add(4);
	list4.add(5);
	list4.add(6);
	list4.add(7);
	list4.add(8);
	list4.add(9);
	list4.add(10);
	list5.add(100);
	list5.add(45);
	list5.add(55);
	list5.add(8);
	list5.add(8);
	list5.add(10);
	list5.add(12);
	list5.add(6);
	sum10.add(100);
	sum10.add(145);
	sum10.add(55);
	sum10.add(82);
	sum10.add(80);
	sum10.add(10);
	sum10.add(12);
	sum10.add(6);
	wordz.add("Hello");
	wordz.add("World");
	wordz.add("Cars");
	wordz.add("at");
	multList.add(15);
	multList.add(7);
	multList.add(8);
	multList.add(1);
	multList.add(2);
	multList.add(6);
	multList.add(4);
	multList.add(5);
	multList.add(9);
	multList.add(3);
	inputs.add("abc");
	inputs.add("def");
	inputs.add("ghi");
	palindromes.add("tacocat");
	palindromes.add("racecar");
	palindromes.add("bears");
	palindromes.add("wow");
	palindromes.add("cool");
	palindromes.add("noon");
	int target;
	int sum = 0;
	String targetStr;
	
	//Test Cases
	
	//ArrayListHelper Part #1
	System.out.println("ArrayListHelper Part #1");
	System.out.println(ArrayListHelper.arrayToList(numbers));
	ArrayList<Integer> list = ArrayListHelper.arrayToList(numbers);
	System.out.println(ArrayListHelper.arrayToListDouble(numbers2));
	ArrayList<Double> list2 = ArrayListHelper.arrayToListDouble(numbers2);
	System.out.println(ArrayListHelper.arrayToListString(words));
	ArrayList<String> list3 = ArrayListHelper.arrayToListString(words);
	System.out.println(ArrayListHelper.count(numbs,3)); //prints 3
	System.out.println(ArrayListHelper.countWords(words2,"Bears"));//prints 4
	
	//ArrayListHelper Part #2
	System.out.println();
	System.out.println("ArrayListHelper Part #2");
	ArrayListHelper.removeEmAll(words3,"The");
	System.out.println(ArrayListHelper.findLargest(nums));
	System.out.println(ArrayListHelper.findSmallest(nums));
	System.out.println(ArrayListHelper.getRandomString(random));
	System.out.println(ArrayListHelper.first5Evens(list4));
	
	//ArrayListHelper Part #3
	System.out.println();
	System.out.println("ArrayListHelper Part #3");
	System.out.println(ArrayListHelper.downOrder(list5));
	System.out.println(ArrayListHelper.mathFib(digits));
	System.out.println(ArrayListHelper.sum(123));
	System.out.println(ArrayListHelper.total110(sum10));
	System.out.println(ArrayListHelper.isEven(31));
	ArrayListHelper.changeCase(wordz);
	System.out.println(wordz);
	
	//ArrayListHelper Part #4
	System.out.println();
	System.out.println("ArrayListHelper Part #4");
	System.out.println(ArrayListHelper.isFactor(3,36));
	System.out.println(ArrayListHelper.factors(3, multList));
	System.out.println(ArrayListHelper.mix(one, two));
	System.out.println(ArrayListHelper.combine(one, two));
	System.out.println(ArrayListHelper.dubLetterHelper("abc"));
	ArrayListHelper.dubLetter(inputs);
	System.out.println(ArrayListHelper.isPalindrome("tacocat"));
	ArrayListHelper.allPalindromes(palindromes);
	
	//add,remove,set,get test cases to prove they're ArrayLists
	System.out.println();
	System.out.println("////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
	System.out.println("Proving ArrayListHelper Part #1");
	//Proving ArrayListHelper Part #1
	list.add(100);
	System.out.println(list);
	list2.remove(0);
	System.out.println(list2); 
	System.out.println(list3.get(1)); //should print bears 
	numbs.remove(0);
	System.out.println(numbs); //[1,2,3,4,3,3]
	words2.add("Go");
	System.out.println(words2);
	
	System.out.println();
	System.out.println("Proving ArrayListHelper Part #2");
	//Proving ArrayListHelper Part #2
	words3.add("Go Bears!");
	System.out.println(words3);
	nums.remove(0);
	System.out.println(nums);
	nums.remove(nums.size() - 1);
	System.out.println(nums);
	list4.remove(0);
	System.out.println(list4);
	
	System.out.println();
	System.out.println("Proving ArrayListHelper Part #3");
	//Proving ArrayListHelper Part #3
	list5.add(1);
	System.out.println(list5);
	sum10.add(64);
	System.out.println(ArrayListHelper.total110(sum10));
	
	System.out.println();
	System.out.println("Proving ArrayListHelper Part #4");
	multList.add(21);
	System.out.println(ArrayListHelper.factors(3, multList));
	palindromes.add("bob");
	ArrayListHelper.allPalindromes(palindromes);
	}


}
