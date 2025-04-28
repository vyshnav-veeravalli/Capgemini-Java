package week3.searching;

public class wordSearch {
    public static void main(String[] args){
        String sent = "today trump was playing a safe game for india and pakistan";
        String target = "for";
        String[] words = sent.split(" ");
        for(String word: words){
            if(word.equals(target)){
                System.out.println(sent);
                return;
            }
        }
        System.out.println("not found");
    }
}
