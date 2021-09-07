import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 0;
        arr[3] = 0;
        arr[4] = 1;
        arr[5] = 0;
        arr[6] = 1;
        arr[7] = 1;
        arr[8] = 0;
        arr[9] = 0;
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] change(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }

        return arr;

    }


}
