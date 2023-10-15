

public class Main {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "Hello";
        String str3 = "How can I do it? ";
        String str4 = "   fkkffkfk       ";
        String str5 = "rrr";
        String str6 = "Rrr";
        String str7 = "rrr";
        Test.Test1(str1, str2);
        Test.Test1(str3, str4);
        Test.Test2(str5,str7, " ");
        Test.Test2(str5,str7, str2);
        Test.Test3(str2,'l','d');
        Test.Test3(str2,'d','l');
        Test.Test4(str1,'a');
        Test.Test4(str2,'o');
        Test.Test5(str1,'a',3);
        Test.Test5(str2,'o', 3);
        Test.Test6(str5,str6);
        Test.Test6(str5,str7);
        Test.Test6(str1,str2);
        Test.Test7(str3, 'o');
        Test.Test8(str3);
        Test.Test8(str5);
        Test.Test9(str4);
        Test.Test9(str3);
        Test.Test9("    ");
        Test.Test10(str3);
        Test.Test10(str5);
        Test.Test11(str5,0);
        Test.Test11(str3,5);
        Test.Test12(str3,"do");
        Test.Test12(str3," ");
        Test.Test12(str3,"How");

    }



}