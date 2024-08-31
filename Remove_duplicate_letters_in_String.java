// remove duplicate letter
import java.util.*;//import for set interface
public class Main{
    public static void main(String[] args){
        // approach 1
        String str="programming";
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            int ind=str.indexOf(ch,i+1);// checks the character from i+1 index till last
            if(ind==-1){
                sb.append(ch);
            }
        }
        System.out.println(sb);
        // approach 2 
        StringBuilder sb=new StringBuilder();
        String str="helloo ";
        str.chars().distinct().forEach(c->sb.append((char)c));// chars() is a input stream method distict removes duplicates and for each append charcater to builder
        System.out.println(sb);
    // approach 3
        Set<Character> set=new LinkedHashSet<>();
        for(int i=0;i<str.length();i++){
            set.add(str.charAt(i));
        }
        System.out.println(set);
        for(char c:set){
            sb.append(c);
        }
        System.out.print(sb);
    }
}
