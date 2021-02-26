import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class NumberClass {

    public static final String[] units = {"", "One", "Two", "Three", "Four",
            "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve",
            "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen",
            "Eighteen", "Nineteen"};

    public static final String[] tens = {
            "",        // 0
            "",        // 1
            "Twenty",    // 2
            "Thirty",    // 3
            "Forty",    // 4
            "Fifty",    // 5
            "Sixty",    // 6
            "Seventy",    // 7
            "Eighty",    // 8
            "Ninety"    // 9
    };

    public static String convert(final int n) {
        if (n < 0) {
            return "Minus " + convert(-n);
        }

        if (n < 20) {
            return units[n];
        }

        if (n < 100) {
            return tens[n / 10] + ((n % 10 != 0) ? " " : "") + units[n % 10];
        }

        if (n < 1000) {
            return units[n / 100] + " Hundred" + ((n % 100 != 0) ? " " : "") + convert(n % 100);
        }

        if (n < 100000) {
            return convert(n / 1000) + " Thousand" + ((n % 10000 != 0) ? " " : "") + convert(n % 1000);
        }

        if (n < 10000000) {
            return convert(n / 100000) + " Lakh" + ((n % 100000 != 0) ? " " : "") + convert(n % 100000);
        }

        return convert(n / 10000000) + " Crore" + ((n % 10000000 != 0) ? " " : "") + convert(n % 10000000);
    }

    public static void main(final String[] args) {
        int n=12;
        //System.out.println(NumberFormat.getInstance().format(n) + "='" + convert(n) + "'");
       //System.out.println(isPrime(22));
       //System.out.println(getFibannocci(10));
       System.out.println(isPalindromeInteger(-142543));
    }


    public static boolean isPrime(int number) {
        return !IntStream.rangeClosed(2, number / 2).anyMatch(i -> number % i == 0);
    }

    public static List<Integer> getFibannocci(int series) {
        return Stream.iterate(new int[]{10, 11}, s -> new int[]{s[1], s[0] + s[1]})
                .limit(series)
                .map(n -> n[0])
                .collect(Collectors.toList());
    }


    public static boolean isPalindromeInteger(Integer inputNumber)
    {
        int reverse=0;
        int helpVar=inputNumber;
        while(helpVar!=0)
        {
            reverse=reverse*10+helpVar%10;
            helpVar=helpVar/10;
        }
        System.out.println(inputNumber);
        System.out.println(reverse);
        return inputNumber==reverse;
    }

}

