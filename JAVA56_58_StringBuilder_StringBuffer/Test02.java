package JAVA300.JAVA56_58_StringBuilder_StringBuffer;

public class Test02 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abcdefghijklmnopqrstuvwxyz");
        sb.delete(3,5);//包头不包尾的删除
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        StringBuffer sb2 = new StringBuffer();


    }
}
