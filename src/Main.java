

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        char[] result = line.toCharArray();

        ArrayList<Integer> st = new ArrayList<>();
        ArrayList<Character> operator = new ArrayList<>();

        for (int i = 0; i < result.length; i++) {
            char lineS = result[i];
            String num = Character.toString(lineS);
            addElementForStec(st, num, operator);
        }
        st = result(st, operator);
        System.out.println(Arrays.toString(st.toArray()));
    }

    private static void addElementForStec(ArrayList<Integer> st, String num, ArrayList<Character> operator) {
        int number;
        if (isDigit(num) == true) {
            number = Integer.parseInt(num);
            st.add(number);
        } else {
            char i = num.charAt(0);
            operator.add(i);
        }
    }

    private static ArrayList<Integer> result(ArrayList<Integer> st, ArrayList<Character> operator) {
        ArrayList<Integer> re = new ArrayList<>();
        boolean flag = false;
        int operand = 0;
        for (char i : operator) {
            flag = false;
            while (flag == false) {
                for (int x = 0; x < 1; x++) {
                    if (i == '+') {
                        operand = st.get(x) + st.get(x + 1);
                        st.remove(x);
                        st.add(0, operand);
                        st.remove(x + 1);
                        flag = true;
                    } else if (i == '-') {
                        operand = st.get(x) - st.get(x + 1);
                        st.remove(x);
                        st.add(0, operand);
                        st.remove(x + 1);
                        flag = true;
                    } else if (i == '/') {
                        operand = st.get(x) / st.get(x + 1);
                        st.remove(x);
                        st.add(0, operand);
                        st.remove(x + 1);
                        flag = true;
                    } else if (i == '*') {
                        operand = st.get(x) * st.get(x + 1);
                        st.remove(x);
                        st.add(0, operand);
                        st.remove(x + 1);
                        flag = true;
                    }

                }
            }
            re.add(operand);
        }
        return re;
    }

    private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {

            return false;
        }
    }
}

