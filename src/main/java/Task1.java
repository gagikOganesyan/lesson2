import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

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

        // Lesson 3
        printTaskNumber(1);
        int size = 5;
        int[][] array2d = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if ((i == j) || (i == size - 1 - j)) {
                    array2d[i][j] = 1;
                }
            }
        }
        print2dArray(array2d);

//        printTaskNumber(2);
//        Random random = new Random();
//        int x = random.nextInt(10);
//        System.out.println(x);
//        boolean needGame = true;
//        Scanner scanner = new Scanner(System.in);
//        Scanner scanner2 = new Scanner(System.in);
//        while (needGame) {
//            for (int i = 0; i < 4; i++) {
//                print("Введите число от 0 до 9");
//                int enter = scanner.nextInt();
//                if (enter > x) {
//                    print("Введённое число больше загаданного");
//                } else if (enter < x) {
//                    print("Введённое число меньше загаданного");
//                } else {
//                    print("Вы угадали! Поздравляем!");
//                    break;
//                }
//            }
//            print("Повторить игру еще раз? 1 – да / 0 – нет");
//            int answer = scanner2.nextInt();
//            needGame = answer == 1;
//        }
//        scanner.close();
//        scanner2.close();


        printTaskNumber(3);
        String[] words = {"apple", "orange", "lemon", "banana", "apricot",
                "avocado", "broccoli", "carrot", "cherry", "garlic", "grape",
                "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive",
                "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin",
                "potato"};
        boolean right = false;
        Random rand = new Random();
        int fruitIndex = rand.nextInt(words.length);
        String fruitName = words[fruitIndex];
        print("Отгадайте слово");
        Scanner scanner3 = new Scanner(System.in);
        while (!right) {
            print(fruitName);
            String userWord = scanner3.next();
            right = fruitName.equals(userWord);
            if (!right) {
                String maskedAnswer = "###############";
                char[] maskedAnswerArray = maskedAnswer.toCharArray();
                for (int i = 0; i < 15; i++) {
                    if (i >= fruitName.length() || i>=userWord.length()) {
                        break;
                    }
                    char originChare = fruitName.charAt(i);
                    char userChoice = userWord.charAt(i);
                    if (originChare == userChoice) {
                        maskedAnswerArray[i] = originChare;
                    }
                }
                printArray(maskedAnswerArray);
            }
            System.out.println(right);

        }
        scanner3.close();
    }


    public static void print2dArray(int[][] arr) {
        for (int y = 0; y < arr.length; y++) {
            for (int x = 0; x < arr.length; x++) {
                System.out.print(arr[y][x] + " ");
            }
            System.out.println();
        }

    }


    public static void printArray(int[] args) {
        System.out.println(Arrays.toString(args));
    }
    public static void printArray(char[] args) {
        System.out.println(Arrays.toString(args).replace(", ",""));
    }

    public static void printTaskNumber(int number) {
        System.out.println("Задание " + number);
    }

    public static void print(String text) {
        System.out.println(text);
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

