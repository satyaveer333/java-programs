public class main {
    public static void main(String[] args) {
        // first code :- print 1 to 10
        int i;
        for (i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // second code :-print odd or even for numbers 1 to 10
        int j;
        for (j = 1; j <= 10; j++) {
            if (j % 2 == 0) {
                System.out.println(j + " is even");
            } else {
                System.out.println(j + " is odd");
            }
        }

        // third code :-print factorial of a number
        int k;
        for (k = 1; k <= 10; k++) {
            int fact = 1;
            for (int m = 1; m <= k; m++) {
                fact *= m;
            }
            System.out.println(k + "!" + fact);
        }

        // fourth code :-print prime or not
        // also check by changing values of n
        int n = 23;
        for (i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.println(n + " is not prime");
                break;
            }
        }
        if (i == n) {
            System.out.println(n + " is prime");
        }

        // fifth code :-print fibonacci series
        int a = 0, b = 1, c;
        for (i = 1; i <= 10; i++) {
            System.out.println(a);
            c = a + b;
            a = b;
            b = c;
        }

        // sixth code :-reverse a number
        int num = 12345;
        int rev = 0;
        while (num != 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }
        System.out.println(rev);

        // seventh code :-check if a string is palindrome
        // also check by using your name in place of madam
        String str = "madam";
        String revstr = "";
        for (i = str.length() - 1; i >= 0; i--) {
            revstr += str.charAt(i);
        }
        if (str.equals(revstr)) {
            System.out.println(str + " is a palindrome");
        } else {
            System.out.println(str + " is not a palindrome");
        }

        // eighth code :- print sum of first 10 natural numbers
        int sum = 0;
        for (i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println(sum);

        // nineth code :- print multiplication table of 5
        for (i = 1; i <= 10; i++) {
            System.out.println("5*" + i + "=" + 5 * i);
        }

        // tenth code :- check positive or negative or zero
        // also check for different values of num1
        int num1 = 10;
        if (num1 > 0) {
            System.out.println(num1 + " is positive");
        } else if (num1 < 0) {
            System.out.println(num1 + " is negative");
        } else {
            System.out.println(num1 + " is zero");
        }

    }

}