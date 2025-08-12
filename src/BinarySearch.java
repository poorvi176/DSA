public class BinarySearch {
  public static int serach(int[] arr, int k) {
    int n = arr.length;
    int low = 0;
    int high = n-1;
    int mid;

    while(low<=high) {
      mid = (low+high)/2;
      if(arr[mid] == k) {
        return mid;
  } else if(arr[mid] < k) {
        low = mid + 1;
      } else {
        high = mid - 1
      }
}
    return -1;
  }
}
