public class Test {
    public static void Test1(String str1, String str2){
        System.out.println("Test1");
        System.out.println("For '" + str1 + "' and ' " + str2 +
                "' .concat" + " = " + String1.concat(str1, str2) + "\n");
    }
    public static void Test2(String str1,String str2,String b){
        System.out.println("Test2");
        System.out.println("For '" + str1 + "' and ' " + str2
                + "' .join(\"" + b + "\")" + " = " + String1.join(str1, str2,b) + "\n");
    }
    public static void Test3(String str1, char a, char b){
        System.out.println("Test3");
        System.out.println("For '" + str1 + "' .replace('"+ a + "', '" + b + "')"
                + " = " + String1.replace(str1, a,b) + "\n");
    }
    public static void Test4(String str1,char a){
        System.out.println("Test4");
        System.out.println("For '" + str1 + "' ' .indexOf('" + a + "') = " + String1.indexOf(str1, a) + "\n");
    }
    public static void Test5(String str1, char a, int i){
        System.out.println("Test5");
        System.out.println("For '" + str1 + "' .indexOf('" + a + "','"
                + i + "') = " + String1.indexOf(str1, a, i) + "\n");
    }
    public static void Test6(String str1,String str2){
        System.out.println("Test6");
        System.out.println("For '" + str1 + "' and ' " + str2 +
                "' .equalsIgnoreCase" + " = " + String1.equalsIgnoreCase(str1, str2) + "\n");
    }
    public static void Test7(String str1, char a){
        System.out.println("Test7");
        System.out.println("For '" + str1 + "' .lastIndexOf('" + a + "')"
                + " = " + String1.lastIndexOf(str1, a) + "\n");
    }
    public static void Test8(String str1){
        System.out.println("Test10");
        System.out.println("For '" + str1 + "' .toLowerCase" + " = " + String1.toLowerCase(str1) + "\n");
    }
    public static void Test9(String str1){
        System.out.println("Test9");
        System.out.println("For '" + str1 + "' .trim" + " = " + String1.trim(str1) + "\n");
    }
    public static void Test10(String str1){
        System.out.println("Test10");
        System.out.println("For '" + str1 + "' .toUpperCase" + " = " + String1.toUpperCase(str1) + "\n");
    }
    public static void Test11(String str1, int i){
        System.out.println("Test11");
        System.out.println("For '" + str1 + "' .charAt('"+ i +"')" + " = " + String1.charAt(str1, i) + "\n");
    }
    public static void Test12(String str1, String b){
        System.out.println("Test12");
        String[] words = String1.split(str1, b);
        System.out.println("For '" + str1 + "' .split('"+ b +"')" + " = ");
        for (String word : words) {
            System.out.println(word);
        }
        System.out.println("\n");
    }
}
