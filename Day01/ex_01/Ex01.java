public class Ex01 {
    public static void myConcat (String str1, String str2) {
        String result = str1 + " " + str2;
        System.out.print(result);
    }

    public static void main(String[] args) {
        String param1 = "Hello";
        String param2 = "World";
        myConcat(param1, param2);
    }
}

