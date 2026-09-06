public class selectionsort {
    public static void main(String[] args) {
        int arr[] = { 10,34,56,42,57,89,01};
        for(int i = 0 ; i<arr.length -1; i++){  
            int smallest = i;
            for( int j=i+1 ; j <arr.length ; j++){
                if(arr[smallest]> arr[j]){
                    smallest= j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i]= temp;
        }
    }
}

