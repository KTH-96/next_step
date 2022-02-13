package book.next_step.calculator;

public class StringCalculator {
    public int sum(String str) {
        if (isBlank(str)) {
            return 0;
        }
        return split(str);
    }

    private boolean isBlank(String str) {
        return str == null || str.isEmpty();
    }

    private int split(String str) {
        String[] split = str.split(",|;");
        int sum = 0;
        for (String s : split) {
            valid(s);
            sum += Integer.parseInt(s);
        }

        return sum;
    }

    private void valid(String s) {
        if (Integer.parseInt(s) < 0) {
            throw new RuntimeException("음수는 처리가 불가능합니다");
        }
    }
}
