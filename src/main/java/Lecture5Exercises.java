public class Lecture5Exercises {

    /*
     *   implement a function to create a random password with
     *   given length using lower case letters
     *   lecture 5 page 14
     */
    public String weakPassword(int length) {
        String result = "";
        Random randomNumber = new Random();
        for (int i = 0; i < length; i++) {
            result = result + (char)(randomNumber.nextInt(26) + 97);
        }
        return result;
    }

    /*
     *   implement a function to create a random password with
     *   given length and at least 1 digit and 1 special character
     *   lecture 5 page 14
     */
    public String strongPassword(int length) throws Exception {

        if (length < 3) {
            throw new IllegalArgumentException("Password must be at least 3 characters!");
        }

        String password = "";
        String lowerCaseAlphabet = "abcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";
        String specialCharacters = "!@#$%^&*()_-+={}[]|\\:;\"'<>,.?/`~";
        Random random = new Random();

        password += digits.charAt(random.nextInt(digits.length()));
        password += specialCharacters.charAt(random.nextInt(specialCharacters.length()));

        for (int i = 0 ; i < length - 2 ; i++) {
            int index = random.nextInt(lowerCaseAlphabet.length());
            password += lowerCaseAlphabet.charAt(index);
        }

        char[] passwordArray = password.toCharArray();
        for (int i = passwordArray.length - 1 ; i > 0 ; i--) {
            int index = random.nextInt(i + 1);
            char placeHolder = passwordArray[index];
            passwordArray[index] = passwordArray[i];
            passwordArray[i] = placeHolder;
        }
        password = new String(passwordArray);

        return password;
    }

    /*
     *   implement a function that checks if a integer is a fibobin number
     *   integer n is fibobin is there exist an i where:
     *       n = fib(i) + bin(fib(i))
     *   where fib(i) is the ith fibonacci number and bin(i) is the number
     *   of ones in binary format
     *   lecture 5 page 17
     */
    public boolean isFiboBin(int n) {
        int first = 0;
        int second = 1;
        while(second <= n) {
            int third = first + second;
            if((n - second) == Integer.bitCount(third)){
                return true;
            }
            first = second;
            second = third;
        }
        return false;
    }
}
