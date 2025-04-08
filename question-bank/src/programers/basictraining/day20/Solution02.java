/**
 * 1. 길이가 다를 때
 * - arr1.size > arr2.size -> return 1
 * - arr1.size < arr2.size -> return -1
 * 2. 길이가 같을 때
 * -
 */

package programers.basictraining.day20;

public class Solution02 {

    public int solution(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return arr1.length > arr2.length ? 1 : -1;
        } else {
            int arr1Sum = arrSum(arr1);
            int arr2Sum = arrSum(arr2);

            if (arr1Sum == arr2Sum) {
                return 0;
            } else {
                return arr1Sum > arr2Sum ? 1 : -1;
            }
        }
    }

    public int arrSum(int[] arr) {
        int sum = 0;

        for (int i : arr) {
            sum += i;
        }

        return sum;
    }
}
