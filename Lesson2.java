public class Lesson2 {

    public static void main(String[] args) {
        /* Задание 1 */
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] == 1 ? 0 : 1;
            System.out.print(arr[i] + " ");
        }

        /* Задание 2 */
        System.out.println("\n");
        int[] arr1 = new int[8];
        for (int i = 1, j = 0; i < arr1.length; i++) arr1[i] = j += 3;
        for (int x : arr1)
            System.out.print(x + " ");


         /* Задание 3 */
        System.out.println("\n");
         int[] arr2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
         for (int i = 0; i < arr2.length; i++) {
             if (arr2[i] < 6) arr2[i] *= 2;
             System.out.print(arr2[i] + " ");
        }

        /* Задание 4 */
        System.out.println("\n");
        int[][] arr3 = new int[5][5];
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0, j2 = arr3[i].length; j < arr3[i].length; j++, j2--) {
                if (i == j || i == (j2 - 1)) arr3[i][j] = 1;
                System.out.print(arr3[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
