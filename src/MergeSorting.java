Class MergeSorting{
  public static void merge(int[] arr, int low, int mid, int high) {
    ArrayList<Integer> temp = new ArrayList<>();
    int left = low;
    int right = mid + 1;

    while(left<=mid && right<=high){
      if(arr[left] <= arr[right]) {
        temp.add(arr[left]);
        left++;
      } else {
        temp.add(arr[right]);
        right++;
      }
    }

    while(left<=mid) {
      temp.add(arr[left]);
      left++;
    }

    while(right<=high) {
      temp.add(arr[right]);
      right++;
    }

    for(int i=low; i<=high; i++) {
      arr[i]  = temp.get(i-low);
    }
  } 
}

public static void mergeSort(int[] arr, int l, int h) {
  int m = (l+h)/2;
  mergeSort(arr, l, m);
  mergeSort(arr, m+1, h);
  merge(arr,l,m,h);
}
