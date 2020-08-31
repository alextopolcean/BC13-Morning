public class RecursionExercise {
    public static void main(String[] args) {
        System.out.println(endX("xxre"));// → "rexx"
        System.out.println(endX("xxhixx"));// → "hixxxx"
        System.out.println(endX("xhixhix"));// → "hihixxx"
        System.out.println("-----");
        System.out.println(count11("11abc11"));// → 2
        System.out.println(count11("abc11x11x11"));// → 3
        System.out.println(count11("111"));// → 1
    }

    private static String endX(String str) {
        if (str.length() == 0) {
            return str;
        }
        if (str.charAt(0) == 'x') {
            return endX(str.substring(1)) + 'x';
        }
        return str.charAt(0) + endX(str.substring(1));
    }

    // Given a string, compute recursively (no loops) the number of “11” substrings in the string.
    // The “11” substrings should not overlap.

    public static int count11(String input) {
        if (input.length() < 2) {
            return 0;
        }
        if (input.substring(0, 2).equals("11")) {
            return 1 + count11(input.substring(2));
        }
        return count11(input.substring(1));
    }
}
