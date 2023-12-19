import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Character> consonants = new ArrayList<>();
        consonants.addAll(Arrays.asList(new Character[]{'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z'}));
        ArrayList<Character> vowels = new ArrayList<>();
        vowels.addAll(Arrays.asList(new Character[]{'a','e','i','o','u'}));
        String output="yes";

        Scanner in = new Scanner(System.in);
        String input=in.nextLine();
        boolean V=false;
        //Find out if first letter is consonant or vowel
        if (vowels.contains(input.charAt(0))) {
        	V=true;
        }
        for (int x=0;x<input.length();x++) {
        	if (V) {
        		if (!vowels.contains(input.charAt(x))) {
        			output="no";
        			break;
        		}
        	}else {
        		if (!consonants.contains(input.charAt(x))){
        			output="no";
        			break;
        		}
        	}
        	V=!V;
        }
        System.out.println(output);
    }
}