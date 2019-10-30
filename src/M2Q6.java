import java.util.Scanner;

public class M2Q6 {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n =scn.nextInt();
        String str="";
        while (n>1){
            str=Integer.toString(n%2)+str;
            n=n/2;
        }
        System.out.println(str);
    }
}
