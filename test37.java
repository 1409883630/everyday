//实现函数 ToLowerCase() ，该函数接收一个字符串参数 str ，并将该字符串中的大写字母转换成小写字母，之后返回新的字符串
public class Main {
public static String toLowerCase(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        char[] ch = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            ch[i] |= 32;
        }
        return String.valueOf(ch);
    }

    public static void main(String[] args) {
        String a="Hello";
        System.out.println(toLowerCase(a));
    }
}