package week3.searching;

public class concantate {
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer();
        String[] arr = {"lakshmi", " ", "sailaja", " ", "audit", " ", "officer"};
        for(String s: arr){
            sb.append(s);
        }
        System.out.println(sb);
    }
}
