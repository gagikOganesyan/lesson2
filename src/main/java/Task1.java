import java.util.Arrays;

public class Task1 {

    public static void main(String[] args) {
        printTaskNumber(1);
        int[] arr = new int[]{0, 1, 0, 1, 0, 1, 1, 1, 0, 1};
        printArray(arr);
        printArray(change(arr));

        printTaskNumber(2);
        int[] array = new int[8];
        printArray(array);
        int a = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = a;
            a = a + 3;
        }
        printArray(array);

        printTaskNumber(3);
        int[] task3 = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        printArray(task3);
        for (int i = 0; i < task3.length; i++) {
            int b = task3[i];
            if (b < 6) {
                task3[i] = b * 2;
            }
        }
        printArray(task3);

        printTaskNumber(5);
        int[] task5 = new int[]{1, -11, -33, 17, 98, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        printArray(task5);
        int min = task5[0];
        int max = 0;
        for (int currentItem : task5) {
            if (currentItem < min) {
                min = currentItem;
            }
            if (currentItem > max) {
                max = currentItem;
            }
        }
        System.out.println("Минимальное число: " + min);
        System.out.println("Максимальное число: " + max);

        printTaskNumber(6);
        int[] task6 = new int[]{1, 2, 3, 4, 5, 15};
        int leftSum;
        int rightSum;
        for (int i = 1; i < task6.length; i++) {
            leftSum = getSum(getNewArray(task6, 0, i));
            rightSum = getSum(getNewArray(task6, i, task6.length));
            if (leftSum == rightSum) {
                System.out.println(leftSum + "=" + rightSum);
                System.out.println(true);
                break;
            }
        }
        printTaskNumber(7);
        int[] task7 = new int[]{1, 2, 3, 4};
        int timesExecute = 5;
        for (int i = 0; i < Math.abs(timesExecute); i++) {
            changeIndex(task7, timesExecute);
        }
        printArray(task7);
    }

    public static void printArray(int[] args) {
        System.out.println(Arrays.toString(args));
    }

    public static void printTaskNumber(int number) {
        System.out.println("Задание " + number);
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

    public static int getSum(int[] args) {
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            sum = sum + args[i];
        }
        return sum;
    }

    public static int[] getNewArray(int[] source, int startPosition, int endPosition) {
        int[] newTask6 = new int[endPosition - startPosition];
        for (int i = 0; i < newTask6.length; i++) {
            newTask6[i] = source[i + startPosition];
        }
        return newTask6;
    }
//            [1,2,3,4]

    /**
     * @param arr
     * @param n   если положительное, то сдвигаем вправо. Если n отрицательное, то сдвигаем влево.
     * @return
     */
    public static int[] changeIndex(int[] arr, int n) {
        int tempFirst = arr[0];
        int tempLast = arr[arr.length - 1];
        if (n > 0) {
            for (int i = arr.length - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = tempLast;
        } else {
            for (int i = 0; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[arr.length - 1] = tempFirst;
        }
        return arr;
    }


}

