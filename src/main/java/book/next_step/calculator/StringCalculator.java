package book.next_step.calculator;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringCalculator {

    public int sum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            if (i < 0) {
                throw new RuntimeException("음수값은 더할 수 없습니다.");
            }
            sum += i;
        }
        return sum;
    }
    public int[] stringToIntArr(String str) {
        String intStr = str.replaceAll("[^0-9]", ",");
//        list로 가져오는것도 가능
//        List<String> collect = Arrays.stream(intStr.split(","))
//                .collect(Collectors.toList());

        return Arrays.stream(intStr.split(",")).mapToInt((s) -> Integer.parseInt(s)).toArray();
    }
}
