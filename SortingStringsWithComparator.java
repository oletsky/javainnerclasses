package javatraining.oletsky.innerclasses;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author O.Oletsky
 * Demonstration of sorting an array of strings with Comparator
 * try to rewrite this with lambdas
 */

public class SortingStringsWithComparator {
    public static void main(String[] args) {
        String arr[] = {"extremely long",
                "short",
                "rather long",
                "this is just almost a BLOB"};
        Arrays.sort
                (arr, new Comparator<String>() {
                            public int compare (String o1, String o2) {
                                return o1.length()-o2.length();
                            }
                        }
                );

        for (var s:arr) {
            System.out.println(s);
        }
    }
}
