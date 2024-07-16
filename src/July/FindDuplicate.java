package July;

public class FindDuplicate {
//    DAY - 2
public static void main(String[] args) {
    int[] arr = {1,3,4,2,2};
    System.out.println(findDuplicate(arr));
}
static int findDuplicate (int[] arr) {
    boolean[] check = new boolean[arr.length + 1];
    for (int i = 0; i < arr.length; i++) {
        if (check[arr[i]]) return arr[i];
        check[arr[i]] = true;
    }
    return -1;
}
}
