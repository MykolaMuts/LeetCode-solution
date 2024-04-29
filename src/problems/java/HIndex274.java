package problems.java;

import java.util.Arrays;

public class HIndex274 {


    /**
     * Solution with O(n) complexity
     * Array sorted by counting because we only need n+1 different numbers
     * Than find H-index like in previous solution
     * @param citations
     * @return
     */
    public int hIndex(int[] citations) {

        int length = citations.length;

        int[] count = new int[length + 1]; // plus one for number over length (length+)

        for (int citation : citations) { // create frequency array
            if (citation >= length) {
                count[length] += 1;
            } else {
                count[citation] += 1;
            }
        }

        int pos = 0;
        for (int i = 0; i <= length; i++) { // change original array
            for (int j = 0; j < count[i]; j++) {
                citations[pos] = i;
                pos++;
            }
        }

        int hIndex = 1;

        for (int i = length - 1; i >= 0; i--) { // looking for hIndex in sorted array
            if (citations[i] < hIndex){
                return hIndex - 1; // if there is no larger index, return the previous
            }
            hIndex++;
        }

        return length;
    }



    /**
     * Solution with O(n log n) complexity
     * Checking if last element bigger than 1,
     * last-1 bigger than 2, and so on, list must be sorted
     * @param citations input
     * @return output
     */
    public int hIndexFromLast(int[] citations) {

//        int[] sortedRev = Arrays.stream(citations)
//                .boxed()
//                .sorted()
//                .mapToInt(Integer::intValue)
//                .toArray();

        Arrays.sort(citations);

        int n = citations.length;
        int hIndex = 0;
        int counter = 1;

        for (int i = n - 1; i >= 0; i--) {
            if (citations[i] >= counter) {
                hIndex = counter;
                counter++;
            }
        }

        return hIndex;
    }

//    public int hIndex(int[] citations) {
//
//        int[] sortedRev = Arrays.stream(citations)
//                .boxed()
//                .sorted()
//                .mapToInt(Integer::intValue)
//                .toArray();
//
//        int hIndex = 0;
//
//        if(sortedRev.length == 1 && sortedRev[0] >= 1){
//            hIndex = 1;
//        }
//
//        for (int left = 1; left < sortedRev.length; left++) {
//            if( sortedRev[sortedRev.length - left] >= left){
//                hIndex = left;
//            }
//        }
//
//        return hIndex;
//    }

    public static void test() {

        int[] nums2 = new int[]{3, 0, 6, 1, 5};
        int[] nums = new int[]{1, 3, 1};

        HIndex274 solution = new HIndex274();

        System.out.println(solution.hIndex(nums2));

    }
}
