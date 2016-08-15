class MaximumDiff{
  public static int max_diff(int arr[]){
    int max_diff = arr[1] - arr[0];
    int min_element = arr[0];
    for( int i = 1; i < arr.length; i++){
      if(arr[i] - min_element > max_diff){
        max_diff = arr[i] - min_element;
      }
      if( arr[i] < min_element){
        min_element = arr[i];
      }
    }
    return max_diff;
  }

  public static void main(String[] args){
    int arr[] = { 2, 3, 10, 6, 8, 1};
    int diff = max_diff(arr);
    System.out.println(diff);
  }
}
