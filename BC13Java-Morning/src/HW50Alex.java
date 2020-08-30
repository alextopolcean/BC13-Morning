public class HW50Alex {
    public static void main(String[] args) {
        System.out.println(triangle(0));// → 0
        System.out.println(triangle(1));// → 1
        System.out.println(triangle(2));// → 3
        System.out.println("---------");
        System.out.println(count8(8));// → 1
        System.out.println(count8(818));// → 2
        System.out.println(count8(8818));// → 4
        System.out.println("---------");
        System.out.println(countHi("xxhixx"));// → 1
        System.out.println(countHi("xhixhix"));// → 2
        System.out.println(countHi("hi"));// → 1

    }

    /*
    We have triangle made of blocks. The topmost row has 1 block, the next row down has 2 blocks,
    the next row has 3 blocks, and so on. Compute recursively (no loops or multiplication)
    the total number of blocks in such a triangle with the given number of rows.
     */

    public static int triangle(int rows) {
        if (rows == 0) {
            return 0;
        } else {
            return rows + triangle(rows - 1);
        }
    }

    /*
    Given a non-negative int n, compute recursively (no loops) the count of the occurrences of 8 as a digit,
    except that an 8 with another 8 immediately to its left counts double, so 8818 yields 4.
    Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6),
    while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
     */

    public static int count8(int n) {
        if (n == 0) return 0;
        if (n % 10 == 8 && n % 100 == 88) return 2 + count8(n / 10);
        if (n % 10 == 8) return 1 + count8(n / 10);
        return count8(n / 10);
    }
    
    // Given a string, compute recursively (no loops) the number of times lowercase “hi” appears in the string.

    public static int countHi(String s) {
        if (s.length() < 2) {
            return 0;
        }
        if (s.substring(0, 2).equals("hi")) return 1 + countHi(s.substring(1));
        else {
            return countHi(s.substring(1));
        }
    }
}
