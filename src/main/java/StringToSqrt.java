public class StringToSqrt {
    public static void main(String[] args) {
        String str = "14213123";
        System.out.println(parseAndSqrt(str));
    }

    public static long parseAndSqrt(String number) {

        return Math.round(Math.sqrt(Long.parseLong(number)));
    }

}
