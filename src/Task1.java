import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class Task1 {
    public static void main(String[] args) {
        int length = 10;
        int[] nums = new int[length];
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            nums[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(nums));
        long n = IntStream.of(nums).filter(w -> w % 2 == 0).count();
        System.out.println(n);
    }
}