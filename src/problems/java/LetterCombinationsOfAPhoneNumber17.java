package problems.java;

import java.util.*;
import java.util.stream.Collectors;

public class LetterCombinationsOfAPhoneNumber17 {



    public static HashMap<String, String[]> getHashMap() {

        HashMap<String, String[]> hashMap = new HashMap<>();

        hashMap.put("2",new String[]{"a","b","c"});
        hashMap.put("3",new String[]{"d","e","f"});
        hashMap.put("4",new String[]{"g","h","i"});
        hashMap.put("5",new String[]{"j","k","l"});
        hashMap.put("6",new String[]{"m","n","o"});
        hashMap.put("7",new String[]{"p","q","r","s"});
        hashMap.put("8",new String[]{"t","u","v"});
        hashMap.put("9",new String[]{"w","x","y","z"});

        return hashMap;
    }

    public List<String> letterCombinations(String digits) {

        List<String> res = new ArrayList<>();

        String[] digitsArray = digits.split("");

        HashMap<String,String[]> map = getHashMap();



        return res;

    }

//    public List<String> letterCombinations(String digits) {
//
//        List<String> res = new ArrayList<>();
//
//        HashMap<String,String[]> letters = getHashMap();
//
//        String[] digitsArray = digits.split("");
//
//        return Arrays.stream(digitsArray)
//                .map(letters::get)
//                .filter(Objects::nonNull)
//                .reduce((arr1, arr2) -> {
//                    // Perform combination of two arrays
//                    return Arrays.stream(arr1)
//                            .flatMap(letter1 -> Arrays.stream(arr2).map(letter2 -> letter1 + letter2))
//                            .toArray(String[]::new);
//                })
//                .map(Arrays::asList)
//                .orElse(Collections.emptyList());
//    }

    public static void test(){


        LetterCombinationsOfAPhoneNumber17 letterCombinationsOfAPhoneNumber17 = new LetterCombinationsOfAPhoneNumber17();

        System.out.println(letterCombinationsOfAPhoneNumber17.letterCombinations("2345"));

    }
}
