package book.next_step.calculator;

public class StringCalculator {
    public int sum(String str) {
        if (isBlank(str)) {
            return 0;
        }

        return sum(toInts(split(str)));
    }

    private String[] split(String str) {
        String[] split = str.split(",|:");
        return split;
    }

    private int[] toInts(String[] split) {
        int[] numbers = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            numbers[i] = valid(Integer.parseInt(split[i]));
        }
        return numbers;
    }

    private int sum(int[] numbers) {
        int sum = 0;
        for (int i : numbers) {
            sum += i;
        }

        return sum;
    }

    private boolean isBlank(String str) {
        return str == null || str.isEmpty();
    }

    private int valid(int i) {
        if (i < 0) {
            throw new RuntimeException("음수는 처리가 불가능합니다");
        }
        return i;
    }
}
