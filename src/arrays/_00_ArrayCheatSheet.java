package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	Random ran = new Random(0 - 50);

	public static void main(String[] args) {
		_00_ArrayCheatSheet yee = new _00_ArrayCheatSheet();
		yee.ran;
		// 1. make an array of 5 Strings
		String[] memes = { "anotherOne", "bern", "nani", "oceanMan", "doge" };
		// 2. print the third element in the array
		System.out.println(memes[3]);
		// 3. set the third element to a different value
		memes[3] = "deez nuts";
		// 4. print the third element again
		System.out.println(memes[3]);
		// 5. use a for loop to print all the values in the array
		// BE SURE TO USE THE ARRAY'S length VARIABLE
		for (String meme : memes) {
			System.out.println(meme);
		}
		int [] oddNums = new int[50];
		// 6. make an array of 50 integers
		for (int i = 0; i < oddNums.length; i+=2) {
		oddNums[i] = ran 
		}
       // int[]  nums = {11,2,31,4,51,6,71,8,91,101,111,112,113,141,15,116,117,181,19,120,211,221,23,124,215,261,27,128,219,301,31,132,313,341,35,136,317,381,39,140,411,421,43,144,415,461,47,148,419,510};
		/* 7. use a for loop to make every value of the integer array a random number*/
        
		// 8. without printing the entire array, print only the smallest number in the
		// array

		// 9 print the entire array to see if step 8 was correct

		// 10. print the largest number in the array.
	}
}
