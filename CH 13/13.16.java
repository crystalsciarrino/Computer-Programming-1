package CH_13

import Tools.Rational
/**
* used similar method to exercise 7.9
* imported as Tools.Rational
*
**/

public class Exercise_16 {
    public static void main(String[] args) {
    String[] token = getTokens(args);
    if (token.length != 3 || !isValidOperator(token)) {
      System.out.println("Invalid arguments.");
      System.out.println("Usage: java CH_13.13_16 1/2 * 8/17");
      System.exit(1);
        }
     Rational operand1 = new Rational(token[0]);
     Rational operand2 = new Rational(token[2]);
     Rational answer = null;
     switch (args[1]) {
       case "+": answer = operand1.add(operand2); break;
       case "-": answer = operand1.subtract(operand2); break;
       case "*": answer = operand1.multiply(operand2); break;
       case "/": answer = operand1.divide(operand2); break;
        }
    System.out.println(operand1 + " " + args[1] + " " + operand2 + " = " + answer);
    }
    private static boolean isValidOperator(String[] token) {
        return token[0].matches("[\\d]*[0-9]/[\\d]*[0-9]") &&
        token[1].matches("[\\-\\+\\*\\/]") &&
        token[2].matches("[\\d]*[0-9]/[\\d]*[0-9]");
    }
    private static String[] getTokens(String[] strings) {
        String merged = " ";
        for (String s : strings) {
        merged += " " + s;
        }
        String[] tokens = merged.split("[\\s ]");
        ArrayList<String> temp = new ArrayList<>();
        for (String s : tokens) {
        if (s.length() != 0) {
         temp.add(s);
            }
        }
        return temp.toArray(new String[temp.size()]);
    }

}
