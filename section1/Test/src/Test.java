import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        int[] arr = {1,2,3,5,7,9};
        test.getOddNum(arr);
    }

    private void getOddNum(int[] arr) {
        Arrays.stream(arr).filter(i->i%2==1).forEach(System.out::println);
    }


}