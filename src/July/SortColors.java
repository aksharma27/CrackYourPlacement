package July;

import java.util.Arrays;

public class SortColors {
//    DAY - 2 : inplace sorting

    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        System.out.println(Arrays.toString(bubble(arr)));
    }

        static int[] bubble(int[] arr){
            // boolean swapped = false;

            for(int i = 0; i < arr.length - 1; i++){
                for(int j = 0; j < arr.length - i - 1; j++){
                    if(arr[j] > arr[j+1]){
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                        // swapped = true;
                    }
                    // else if(!swapped){
                    //     break;
                    // }
                }
            }
            return arr;
        }
}
