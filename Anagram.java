import java.util.Random;
/**
 * Created by Ravi on 19-12-2017.
 */

public class Anagram {
public static  Random ran=new Random();
public static  String[] words={"ACCOUNT","ADDITION","AGREEMENT","ANGRY","ANIMAL","BEHAVIOUR","BLACK","CHEMICAL",
        "FOOLISH","FREQUENT","GOVERMENT","GRAIN","GAIN","GRASS","HOSPITAL","PAYMENT","POLITICAL","PROCESS",
        "SHAME","SMOOTH","STATEMENT","SUBSTANCE","TEACHING","TENDENCY","TOMORROW","TOUCH","UMBRELLA","WEATHER",
"YESTERDAY"};
public static String randomword(){
    return words[ran.nextInt(words.length)];


    }
    public static String shuffleword(String word){
    if(word!=null && !"".equals(word)){
        char a[]=word.toCharArray();
        for (int i=0;i<a.length;i++){
            int j=ran.nextInt(a.length);
            char temp=a[i];
            a[i]=a[j];
            a[j]=temp;
        }
        return new String(a);
    }
       return word;
}
}
