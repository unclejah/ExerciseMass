import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        //Exercise 1
        int summ = 0;
        for (int m: arr ) {
            summ = summ + m;
        }
        System.out.println("Сумма трат за месяц составила "+summ+" рублей.");

        //Exercise 2
        int minVal = arr[0];
        int maxVal = arr[0];
        for (int m: arr ) {
            if(m>maxVal){
                maxVal = m;
            }
            if(m<minVal){
                minVal = m;
            }
        }
        System.out.println("Минимальная сумма трат за день составила "+minVal+" рублей.");
        System.out.println("Максимальная сумма трат за день составила "+maxVal+" рублей.");

        //Exercise 3
        System.out.println("Средняя сумма трат за месяц составила "+summ /30f+" рублей.");

        //Exercise 4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i>=0; i--){
            System.out.print(reverseFullName[i]);
        }
        System.out.println();
        //Dop Exercise 1
        int[][] matrix = new int[3][3];
        for (int i = 0; i<3; i++){
            matrix[i][i] = 1;
            matrix[matrix.length-i-1][i] = 1;
        }
        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }

        //Dop Exercis 2
        int[] arr2 = new int[]{ 5, 4, 3, 2, 1 };
        int[] arr3 = new int[arr2.length];
        for (int i = 0; i<arr2.length; i++) {
            arr3[i] = arr2[arr2.length-i-1];

        }
        System.out.println(Arrays.toString(arr2));
        arr2 = arr3;
        System.out.println(Arrays.toString(arr2));

        //Dop Exercise 3
        int[] arr4 = new int[]{ 5, 8, 2, 3, 9 };
        int r = 0;
        System.out.println(Arrays.toString(arr4));
        for (int i = 0; i<arr4.length / 2; i++) {
            r = arr4[i];
            arr4[i] = arr4[arr4.length-i-1];
            arr4[arr4.length-i-1] = r;
        }
        System.out.println(Arrays.toString(arr4));

        //Dop  Exercise 4

        int[] arr6 = new int[]{-6,2,5,-8,8,10,4,-7,12,1};
        int count = 0;
        for (int fr =0; fr < arr6.length; fr++) {
            for (int i =fr;i<arr6.length;i++) {
                if (arr6[fr] + arr6[i] == -2) {
                    if(count !=2){
                        count++;
                        System.out.println(arr6[fr] +" и " + arr6[i]);
                    }
                }
            }

        }
        for (int fr =0; fr < arr6.length; fr++) {
            for (int i =fr;i<arr6.length;i++) {
                if (arr6[fr] + arr6[i] == -2) {
                        System.out.println("v = "+arr6[fr] +" и " + arr6[i]);
                }
            }

        }

    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}
