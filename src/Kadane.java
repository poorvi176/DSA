public class Kadane{

  public static int kadaneAlgo(int[] arr) {
    int res = arr[0];
    int max = arr[0];
    for(int i=0; i<arr.length; i++) {
      max = Math.max(max + arr[i], arr[i]);
      res = Math.max(max, res);
    }
    return res;
  } 
  
  public static void main(String[] args) {
    int[] arr = {1,2,3,4,5};
    int k = kadaneAlgo(arr);
    System.out.print(k);
  }
}
