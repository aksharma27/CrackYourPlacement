package July;

public class CheckIfReversingTheArrayMakesItSorted {
//    TWO POINTERS :
//    x = -1, yh = -1 :
public static void main(String[] args) {
//    int[] ar = {1, 2, 5, 4, 3, 9, 10, 11, 25, 24, 20};
    int[] ar = {1, 2, 5, 4, 3};
    System.out.println(checkRevSort(ar));
}

static void reverse(int[] arr, int x, int y) {
    while (x < y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
        x++;
        y--;
    }
}

static boolean checkRevSort (int[] arr) {
    int x = -1, y = -1;
    for (int i = 0; i < arr.length - 1; i++) {
        //x = i, for first element where a[i] >a[i+1], y = i+1, for last element where a[i] > a[i+1]
        if (arr[i] > arr[i+1]) {
            if (x == -1) x = i;
            y = i + 1;
        }
    }
    if (x == -1) return true;       //array is already sorted :

    //else reverse the subarray from x to y :
    //and check if it is sorted or not :
    if (x != -1) {
        reverse(arr, x, y);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) return false;
        }
    }
    return true;
}
}
