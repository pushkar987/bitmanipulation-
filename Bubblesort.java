import java.util.*;
public class bubblesort {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int i = 0;
        int temp = 0;
        int a[] = { 10,4,6,5,7,11};
        for( i =0 ; i< a.length-1;i++){
            for(int j=0 ;j<a.length-1-i ;j++){
                if(a[i]>a[j]){
                    temp =a[i];
                    a[i] = a[j];
                    a[j] = temp ;

                }
            }

        }
        for(int k = 0; k<a.length;k++){
            System.out.println(a[i]);
        }
        
    }
}
