import java.util.Scanner;

public class Shuru {
    public static void main(String [] args){
        System.out.println("请输入字符");
        int x=0;String b="";
        while(x==0) {
            Scanner w = new Scanner(System.in);
            String a = w.next();
            if (a.equals("#o")) {
                x = 1;
                break;
            }
            else if (a.equals("#c")) {
                b = "";
            }
            else if (a.equals("#b")) {
                continue;
            }
            else {
                b = b + " " + a;

            }
            System.out.println(b);}
        System.out.println("你输入的结果是"+b);}
}
