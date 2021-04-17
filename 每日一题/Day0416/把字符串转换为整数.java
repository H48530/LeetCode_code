package Day0416;

/**
 *
 */
public class 把字符串转换为整数 {
    public static int StrToInt(String str) {
        if(str.equals("")){
            return 0;
        }

        char[] arr = str.trim().toCharArray();
        int falg = 1;
        int sum = 0;
        switch (arr[0]){
            case '+':
                falg =1;
                break;
            case '-':
                falg = -1;
                break;
            case ' ':
                break;
            default:
                sum = arr[0]-'0';
                break;
        }


        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >= '0' && arr[i] <= '9') {
                sum = sum * 10 + arr[i]-'0';
            } else {
                return 0;
            }
        }
        return sum * falg;
    }

    public static void main(String[] args) {
        String str = "       133";
        int i = StrToInt(str);
        System.out.println(i);
    }
}
