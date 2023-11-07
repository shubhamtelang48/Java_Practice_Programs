package JavaPrograms;

public class Sentence {
    public static String sortSentence(String s) {
        String[] word = s.split(" ");
        String[] temp = new String[word.length];
        int index;
        for(String j : word){
            index = j.charAt(j.length()-1) - '0';
            temp[index-1] = j.substring(0, j.length()-1);
        }
        return String.join(" ", temp);

    }

    public static void main(String[] args) {
        String str="Myself2 Me1 I4 and3";
        System.out.println(sortSentence(str));
    }
}
