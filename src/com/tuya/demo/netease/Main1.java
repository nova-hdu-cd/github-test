import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int N = scanner.nextInt();
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            String bb = String.valueOf(b);
            ArrayList<String> list = Permutation(bb);
            Collections.sort(list);
            boolean flag = false;
            int m = 0;
            for (String s : list) {
                if (Integer.parseInt(s) > a) {
                    flag = true;
                    m = Integer.parseInt(s);
                    break;
                }
            }
            if (flag) {
                System.out.println(m);
            } else {
                System.out.println(-1);
            }
        }

    }

    public static ArrayList<String> PermutationHelp(StringBuilder str) {
        ArrayList<String> result = new ArrayList<>();
        if (str.length() == 1) {
            result.add(str.toString());
        } else {
            for (int i = 0; i < str.length(); i++) {
                if (i == 0 || str.charAt(i) != str.charAt(0)) {
                    char temp = str.charAt(i);
                    str.setCharAt(i, str.charAt(0));
                    str.setCharAt(0, temp);
                    ArrayList<String> newResult = PermutationHelp(new StringBuilder(str.substring(1)));
                    for (int j = 0; j < newResult.size(); j++) {
                        result.add(str.substring(0, 1) + newResult.get(j));
                    }
                    //用完还是要放回去的
                    temp = str.charAt(0);
                    str.setCharAt(0, str.charAt(i));
                    str.setCharAt(i, temp);//删了可以通过
                }
            }

        }
        return result;
    }

    public static ArrayList<String> Permutation(String str) {
        StringBuilder strBuilder = new StringBuilder(str);
        ArrayList<String> result = PermutationHelp(strBuilder);
        return result;
    }

}
