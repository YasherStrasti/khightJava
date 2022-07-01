import java.util.*;

public class Knight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        String[] splitWord = input.split("");
        String[][] arr = new String[8][8];
        String[] words = {"a", "b", "c", "d", "e", "f", "g", "h"};
        int place = 0;
        int row = arr.length - Integer.parseInt(splitWord[1]);
        for (int i = 0; i < words.length; i++) {
            if (splitWord[0].equals(words[i])) {
                place = i;
            }
        }
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                arr[i][j] = ".";
//            }
//        }
        for (String[] value : arr) {
            Arrays.fill(value, ".");
        }
        arr[row][place] = "K";
        if (row == 0) {
            if (place == 0) {
                arr[row + 2][place + 1] = "*";
                arr[row + 1][place + 2] = "*";
            } else if (place == 1) {
                arr[row + 1][place + 2] = "*";
                arr[row + 2][place - 1] = "*";
                arr[row + 2][place + 1] = "*";
            } else if (place <= 5) {
                arr[row + 2][place + 1] = "*";
                arr[row + 1][place + 2] = "*";
                arr[row + 2][place - 1] = "*";
                arr[row + 1][place - 2] = "*";
            } else if (place == 6) {
                arr[row + 1][place - 2] = "*";
                arr[row + 2][place - 1] = "*";
                arr[row + 2][place + 1] = "*";
            } else {
                arr[row + 1][place - 2] = "*";
                arr[row + 2][place - 1] = "*";
            }
        } else if (row == 1) {
            if (place == 0) {
                arr[row + 2][place + 1] = "*";
                arr[row + 1][place + 2] = "*";
                arr[row - 1][place + 2] = "*";
            } else if (place == 1) {
                arr[row - 1][place + 2] = "*";
                arr[row + 1][place + 2] = "*";
                arr[row + 2][place - 1] = "*";
                arr[row + 2][place + 1] = "*";
            } else if (place <= 5) {
                arr[row + 2][place + 1] = "*";
                arr[row + 1][place + 2] = "*";
                arr[row - 1][place + 2] = "*";
                arr[row + 2][place - 1] = "*";
                arr[row + 1][place - 2] = "*";
                arr[row - 1][place - 2] = "*";
            } else if (place == 6) {
                arr[row - 1][place - 2] = "*";
                arr[row + 1][place - 2] = "*";
                arr[row + 2][place - 1] = "*";
                arr[row + 2][place + 1] = "*";
            } else {
                arr[row - 1][place - 2] = "*";
                arr[row + 1][place - 2] = "*";
                arr[row + 2][place - 1] = "*";
            }
        } else if (row <= 5) {
            if (place == 0) {
                arr[row - 2][place + 1] = "*";
                arr[row - 1][place + 2] = "*";
                arr[row + 2][place + 1] = "*";
                arr[row + 1][place + 2] = "*";
            } else if (place == 1) {
                arr[row - 2][place + 1] = "*";
                arr[row - 1][place + 2] = "*";
                arr[row + 2][place + 1] = "*";
                arr[row + 1][place + 2] = "*";
                arr[row - 2][place - 1] = "*";
                arr[row + 2][place - 1] = "*";
            } else if (place <= 5) {
                arr[row - 2][place + 1] = "*";
                arr[row - 1][place + 2] = "*";
                arr[row + 2][place + 1] = "*";
                arr[row + 1][place + 2] = "*";
                arr[row - 2][place - 1] = "*";
                arr[row - 1][place - 2] = "*";
                arr[row + 2][place - 1] = "*";
                arr[row + 1][place - 2] = "*";
            } else if (place == 6) {
                arr[row - 2][place - 1] = "*";
                arr[row - 1][place - 2] = "*";
                arr[row + 2][place - 1] = "*";
                arr[row + 1][place - 2] = "*";
                arr[row - 2][place + 1] = "*";
                arr[row + 2][place + 1] = "*";
            } else {
                arr[row - 2][place - 1] = "*";
                arr[row - 1][place - 2] = "*";
                arr[row + 2][place - 1] = "*";
                arr[row + 1][place - 2] = "*";
            }
        } else if (row == 6) {
            if (place == 0) {
                arr[row + 1][place + 2] = "*";
                arr[row - 1][place + 2] = "*";
                arr[row - 2][place + 1] = "*";
            } else if (place == 1) {
                arr[row + 1][place + 2] = "*";
                arr[row - 1][place + 2] = "*";
                arr[row - 2][place + 1] = "*";
                arr[row - 2][place - 1] = "*";
            } else if (place <= 5) {
                arr[row - 1][place - 2] = "*";
                arr[row - 1][place + 2] = "*";
                arr[row + 1][place - 2] = "*";
                arr[row + 1][place + 2] = "*";
                arr[row - 2][place + 1] = "*";
                arr[row - 2][place - 1] = "*";
            } else if (place == 6) {
                arr[row - 1][place - 2] = "*";
                arr[row + 1][place - 2] = "*";
                arr[row - 2][place + 1] = "*";
                arr[row - 2][place - 1] = "*";
            } else {
                arr[row - 1][place - 2] = "*";
                arr[row + 1][place - 2] = "*";
                arr[row - 2][place - 1] = "*";
            }
        } else {
            if (place == 0) {
                arr[row - 1][place + 2] = "*";
                arr[row - 2][place + 1] = "*";
            } else if (place == 1) {
                arr[row - 1][place + 2] = "*";
                arr[row - 2][place + 1] = "*";
                arr[row - 2][place - 1] = "*";
            } else if (place <= 5) {
                arr[row - 1][place - 2] = "*";
                arr[row - 1][place + 2] = "*";
                arr[row - 2][place + 1] = "*";
                arr[row - 2][place - 1] = "*";
            } else if (place == 6) {
                arr[row - 1][place - 2] = "*";
                arr[row - 2][place + 1] = "*";
                arr[row - 2][place - 1] = "*";
            } else {
                arr[row - 1][place - 2] = "*";
                arr[row - 2][place - 1] = "*";
            }
        }

//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
        for (String[] strings : arr) {
            for (String string : strings) {
                System.out.print(string + " ");
            }
            System.out.println();
        }
    }
}
