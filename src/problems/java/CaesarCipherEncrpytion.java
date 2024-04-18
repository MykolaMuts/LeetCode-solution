package problems.java;

import java.util.*;

public class CaesarCipherEncrpytion {

    public List<String[]> caesarCipherEncrpytion(String[] input){

        List<String[]> output = new ArrayList<>();

        HashSet<String> words = new HashSet<>();
        Collections.addAll(words, input);


        for (String s : input) {

            for (int i = 1; i < 26; i++) {
                char[] arr = s.toCharArray();
                for (int j = 0; j < arr.length; j++) {
                    arr[j]+= (char) i;
                }

                String test = convertString(Arrays.toString(arr));

                if(words.contains(test)){
                    String[] word = {s,test};
                    output.add(word);
                }
            }

        }

        return output;
    }

    public String convertString(String word){
        return word.replace(", ", "")  //remove the commas
                .replace("[", "")  //remove the right bracket
                .replace("]", "")  //remove the left bracket
                .trim();
    }



    public static void test() {


        CaesarCipherEncrpytion solution = new CaesarCipherEncrpytion();

        String[] test = new String[]{"abc", "bcd", "acd", "dfg"};
        int[] test2 = {1, 2, 3, 4, 5, 6, 7};

        System.out.println(solution.caesarCipherEncrpytion(test));


    }
}
