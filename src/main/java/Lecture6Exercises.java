import jdk.nashorn.internal.runtime.regexp.joni.Regex;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lecture6Exercises {

    /*
     *   implement a function that takes an array of int and return sum of
     *   elements at even positions
     *   lecture 6 page  16
     */
    public long calculateEvenSum(int[] arr) {
        long sum = 0;
        for (int i=0 ; i < arr.length ; i+=2){
            sum+=arr[i];
        }
        return sum;
    }

    /*
     *   implement a function that takes an array of int and return that
     *   array in reverse order
     *   lecture 6 page 16
     */
    public int[] reverseArray(int[] arr) {
        int tmp = 0;
        int length = arr.length;
        for(int i = 0 ; i < (length)/2 ; i++){
            tmp = arr[i];
            arr[i] = arr[length-i-1];
            arr[length-i-1] = tmp;
        }
        return arr;
    }

    /*
     *   implement a function that calculate product of two 2-dim matrices
     *   lecture 6 page 21
     */
    public double[][] matrixProduct(double[][] m1, double[][] m2) throws RuntimeException {

        if (m1[0].length != m2.length) {
            throw new RuntimeException();
        }
        double answer[][]= new double[m1.length][m2[0].length];
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m2[0].length; j++) {
                answer[i][j] = 0;
                for (int k = 0; k < m2.length; k++) {
                    answer[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }
        return answer;
    }

    /*
     *   implement a function that return array list of array list of string
     *   from a 2-dim string array
     *   lecture 6 page 30
     */
    public List<List<String>> arrayToList(String[][] names) {
        List<List<String>> result = new ArrayList<List<String>>();
        for (int i = 0; i <names.length; i++)
        {
            result.add(i,new ArrayList<>());
            for (int j = 0; j < names[i].length; j++) {
                result.get(i).add(j, names[i][j]);
            }
        }
        return result;
    }

    /*
     *   implement a function that return a list of prime factor of integer n
     *   in ascending order
     *   lecture 6 page 30
     */
    public List<Integer> primeFactors(int n) {
        List<Integer> result = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (n % i == 0 && isPrime(i)) {
                result.add(i);
            }
        }
        return result;
    }

    public boolean isPrime(int n) {
        int counter = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                counter++;
            }
        }

        if (counter == 2) {
            return true;
        } else {
            return false;
        }
    }

    /*
     *   implement a function that return a list of words in a given string
     *   lecture 6 page 30
     */
    public List<String> extractWord(String line) {
        List<String> words= new ArrayList<String>();

        Pattern pattern = Pattern.compile("\\w+");
        Matcher match = pattern.matcher(line);
        for (int i = 0; match.find(); i++) {
            words.add(i, match.group());
        }
        return words;
    }

}
