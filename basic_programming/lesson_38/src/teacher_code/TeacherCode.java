package teacher_code;


import java.util.Arrays;
import java.util.List;

public class TeacherCode {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3};

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {

            }
        }

        System.out.println(Arrays.toString(nums));

        List<Integer> collection = List.of(1, 2, 3, 4, 5);

        Integer odd = collection.stream()
                .filter(p -> p % 2 != 0)
                .reduce((c1, c2) -> c1 + c2)
                .orElse(0);



        Integer oldOdd = 0;
        for (Integer i : collection) {
            if (i % 2 != 0) {
                oldOdd += i;
            }
        }
    }
}
