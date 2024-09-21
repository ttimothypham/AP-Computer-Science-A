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
	ArrayList<Integer> numbs = new ArrayList<Integer>();
	ArrayList<String> words2 = new ArrayList<String>();
	ArrayList<String> words3 = new ArrayList<String>();
	ArrayList<Integer> nums = new ArrayList<Integer>();
	ArrayList<String> random = new ArrayList<String>();
	ArrayList<Integer> list4 = new ArrayList<Integer>();
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
	
	int target;
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
	
	//add,remove,set,get test cases to prove they're ArrayLists
	System.out.println();
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
	}


}
