public class TwoSum {
    // Given a sorted array and a target, we need to find a pair of numbers that equal to target

    private static boolean twoSum(int[] arr, int target) {
        int left = 0;
        int right = arr.length-1;

        while(left<right) {
            if(arr[left] + arr[right] == target) {
                return true;
            }else {
                if(arr[left] + arr[right]<target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {2,4,5,6,7,9};
        int target = 18;
        boolean sum = twoSum(arr, target);
        System.out.println(sum);
    }



}
