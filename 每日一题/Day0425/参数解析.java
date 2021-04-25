package Day0425;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 */
public class 参数解析 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            String[] s1 = s.split(" ");

            List<String> list = new ArrayList<>();
            for (int i = 0; i < s1.length; i++) {
                if (s1[i].contains("\"")  ) {
                    char[] array = s1[i].toCharArray();
                    char[] array1 = s1[i + 1].toCharArray();
                    StringBuilder sb = new StringBuilder();
                    for (char c : array) {
                        if (c!='"'){
                            sb.append(c);
                        }
                    }
                    sb.append(" ");
                    for (char c : array1) {
                        if (c!='"'){
                            sb.append(c);
                        }
                    }
                    list.add(sb.toString());
                    i++;
                    continue;
                }
                list.add(s1[i]);
            }
            System.out.println(list.size());
            for (String s2 : list) {
                System.out.println(s2);
            }
        }
    }
}
