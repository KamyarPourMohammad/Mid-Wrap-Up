public class Lecture4Exercises {
    /*
     *   implement a function that returns factorial of given n
     *   lecture 4 page 15
     */

    public long factorial(int n) {
        int cross=1;
        if (n == 0){
            return 1;
        }
        for(int i=1;i<=n;i++){
            cross*=i
        }
        return i;
    }
    /*
     *   implement a function that return nth number of fibonacci series
     *   the series -> 1, 1, 2, 3, 5, 8, ...
     *   lecture 4 page 19
     */

    public long fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
    /*
     *   implement a function that return reverse of a given word
     *   lecture 4 page 19
     */

    public String reverse(String word) {
        String result = "";
        for (int i = word.length()-1 ; i >= 0 ; i--) {
            result += word.charAt(i);
        }
        return result;
    }


    public boolean isPalindrome(String line) {
        line = line.replaceAll("\\s", "");
        line = line.toLowerCase();
        return line.equals(reverse(line));
    }

    /*
     *   implement a function which computes the dot plot of 2 given
     *   string. dot plot of hello and ali is:
     *       h e l l o
     *   h   *
     *   e     *
     *   l       * *
     *   l       * *
     *   o           *
     *   lecture 4 page 26
     */
    public char[][] dotPlot(String str1, String str2) {
        int length1 = str1.length();
        int length2 = str2.length();
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        char[][] result = new char[length1][length2];
        for (int i = 0; i < length1; i++) {
            for (int j = 0; j < length2; j++) {
                result[i][j] = (arr1[i] == arr2[j] ? '*' : ' ');
            }
        }
        return result;
    }

}