import java.nio.charset.StandardCharsets;
import java.util.*;
//import java.util.Collection;
public final class String1 {


    public static String concat(String str1, String str2) {
        final var bytes1 = str1.getBytes(StandardCharsets.UTF_8);
        final var bytes2 = str2.getBytes(StandardCharsets.UTF_8);
        byte[] byte3 = new byte[bytes1.length + bytes2.length] ;
        for(int i = 0; i < bytes1.length;i++){
            byte3[i]+=bytes1[i];
        }
        for(int i = 0; i < bytes2.length;i++){
            byte3[i + bytes1.length]+=bytes2[i];
        }
        return new String(byte3, StandardCharsets.UTF_8);
    }

    public static String join(String str1, String str2, String b) {
        final var bytes1 = str1.getBytes(StandardCharsets.UTF_8);
        final var bytes2 = str2.getBytes(StandardCharsets.UTF_8);
        final var bytes3 = b.getBytes(StandardCharsets.UTF_8);
        byte[] byte4 = new byte[bytes1.length + bytes2.length + bytes3.length] ;
        for(int i = 0; i < bytes1.length;i++){
            byte4[i]+=bytes1[i];
        }
        for(int i = 0; i < bytes3.length;i++){
            byte4[i + bytes1.length] += bytes3[i];
        }
        for(int i = 0; i < bytes2.length;i++){
            byte4[i + bytes3.length + bytes1.length] += bytes2[i];
        }
        return new String(byte4, StandardCharsets.UTF_8);
    }

    public static String replace(String str1, char b, char c) {
        char[] aa = str1.toCharArray();
        String result = new String();
        for (int i = 0; i < str1.length(); i++) {
            if (aa[i] == b) {
                aa[i] = c;
            }
        }
        return new String(aa);
    }


    public static int indexOf(String str1, char b, int c) {
        char[] aa = str1.toCharArray();
        int result = -1;
        for (int i = c; i < aa.length; i++) {
            if (aa[i] == b) {
                result = i;
                break;
            }
        }
        return result;
    }
    public static int indexOf(String str1, char b) {
        return indexOf(str1,b,0);
    }

    public static int lastIndexOf(String str1, char b) {
        char[] aa = str1.toCharArray();
        int result = -1;
        for (int i = aa.length - 1; i >= 0; i--) {
            if (aa[i] == b) {
                result = i;
                break;
            }
        }
        return result;
    }


    public static String trim(String str1) {
        char[] a = str1.toCharArray();
        int count = 0;
        int t = a.length;
        Deque<Character> aa = new LinkedList<Character>();
        String result = new String();
        for (int i = 0; i < t; i++) {
            aa.addLast(a[i]);
            if (a[i] == ' '){
                count += 1;
            }
        }
        if (count == a.length){
            return "";
        }
        for (int i = 0; i < t; i++) {
            if (aa.getFirst().equals(' ')) {
                aa.pollFirst();
                t -= 1;
            } else {
                break;
            }
        }
        for (int i = 0; i < t; i++) {
            if (aa.getLast().equals(' ')) {
                aa.pollLast();
                t -= 1;
            } else {
                break;
            }
        }
        for (int i = 0; i < t; i++) {
            result += aa.pollFirst();
        }
        //if (result == null) {
         //   return "";
        //}
        return result;
    }

    public static boolean equalsIgnoreCase(String str1, String str2) {

        if (str1.toLowerCase().equals(str2.toLowerCase())) {
            return true;
        }
        return false;
    }

    public static String toLowerCase(String str1) {
        char[] a = str1.toCharArray();
        String result = new String();
        for (char c : a) {
            result += Character.toLowerCase(c);
        }
        return result;
    }

    public static String toUpperCase(String str1) {
        char[] a = str1.toCharArray();
        String result = new String();
        for (char c : a) {
            result += Character.toUpperCase(c);
        }
        return result;
    }

    public static char charAt(String str1, int index) {
        if (index > str1.length()) {
            return '-';
        }
        char[] a = str1.toCharArray();
        return a[index];
    }

    public static String[] split(String a, String b) {
        char[] aa = a.toCharArray();
        char[] bb = b.toCharArray();
        List<String> dd = new ArrayList<>();
        String d = new String("");
        String c = new String("");
        int t = 0;
        for (int i = 0; i < aa.length; i++) {
            t = i;
            for (int j = 0; j < bb.length; j++) {
                if (aa[t] != bb[j]) {
                    d += c;
                    d += aa[t];
                    c = "";
                    if (t == aa.length - 1){
                        d += c;
                        dd.add(d);
                    }
                    break;
                }
                else {
                    c += aa[t];
                    t += 1;
                }

                if (j == bb.length - 1){
                    if(t != bb.length) {
                        dd.add(d);
                    }
                    d = "";
                    c = "";
                    i = t - 1;
                    break;
                }
                if (t == aa.length - 1){
                    d += c;
                    dd.add(d);
                    break;
                }
            }
        }
        String [] dd1 =new String[dd.size()];
        for(int i = 0; i < dd.size() ;i++){
            dd1[i] = dd.get(i);
        }
        return dd1;
    }


}