import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {

        int[] arr1 = new int[]{3, 5, 6, 2, 4};
        int[] arr2 = new int[]{3, 2, 5, 2, 2};
        List<Integer> result = new ArrayList<>();
        List<Integer> res = DifArr(arr1, arr2, result);
        System.out.println(res);

    }

    public static List<Integer> DifArr(int[] arr1, int[] arr2, List<Integer> result) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1.length != arr2.length) throw new RuntimeException("Длины двух массивов не совпадают!");
                else if (i == j) result.add(arr1[i] - arr2[j]);
            }
        }
        return result;
    }
}
















