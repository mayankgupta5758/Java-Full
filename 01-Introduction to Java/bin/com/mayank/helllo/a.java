/*
Property Division
Ashwin has two sons Warner and Smith. He wants to distribute his property between them equally.

Ashwin's property includes an array of positive integers . Find if the array can be splitted into two parts such that the sum of elements in both parts are equal.

The array can be splitted in two parts such that :

Sum of both parts is equal.
All elements in the array, which are divisible by 5 should be in same group.
All elements in the array, which are divisible by 3 (but not divisible by 5) should be in other group.
Elements which are neither divisible by 5 nor by 3, can be put in any group.
Groups can be made with any set of elements, i.e. elements need not to be continuous. And you need to consider each and every element of input array in some group.

Note:- Input has been handled in the driver code. You need to complete ArrayDivision() function.

Input Format
The first line contains an integer n denoting the size of nums.

Second line contains an integer array nums.

Output Format
Print True or False.

Example 1
Input

8
1 2 3 4 5 3 3 1
Output

True
Explanation

Array splits in these two parts : 
Warner : {3,3,3,2}
Smith :  {5,4,1,1}

Example 2
Input

3 
2 4 3
Output

False
Explanation

We can't split the array according to the given conditions.

Constraints
1 <= n <= 50

1 <= num
*/

public class a {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,3,3,5,1};

        int sum5 = 0, sum3 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 5 == 0) {
                sum5 += arr[i];
                arr[i] = 0;
            } else if (arr[i] % 3 == 0) {
                sum3 += arr[i];
                arr[i] = 0;
            }
        }

        System.out.println(s(arr, 0, sum3, sum5));
    }

    public static boolean s(int[] arr, int i, int sum3, int sum5) {
        if (i == arr.length) {
            return sum3 == sum5;
        }
        if(i > arr.length) {
            return false;
        }
        
        return s(arr, i+1, sum3+arr[i], sum5) || s(arr, i+1, sum3, sum5+arr[i]);
    }
}