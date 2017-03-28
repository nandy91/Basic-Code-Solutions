import java.util.Scanner;

class ReverseAString {
    public static void main(String[] args) {
        // Create a Scanner object to read input from stdin.
        Scanner scan = new Scanner(System.in);

        // Read a full line of input from stdin and save it to our variable,
        // inputString.
        String inputString = scan.nextLine();

        // Close the scanner object, because we've finished reading
        // all of the input from stdin needed for this challenge.
        scan.close();
        // Call the reverse method and pass the input string
        String reverse_result = reverse(inputString);
        //display result on console
        
        System.out.println("The reversed string is: "+reverse_result);
    }

    public static String reverse(String s) {
        int length = s.length();
        int last = length - 1;
        char[] letters = s.toCharArray();
        for (int i = 0; i < length / 2; i++) {
            char c = letters[i];
            letters[i] = letters[last - i];
            letters[last - i] = c;
        }
        return new String(letters);
    }

}
