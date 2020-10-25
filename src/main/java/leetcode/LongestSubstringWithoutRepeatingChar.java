package main.java.leetcode;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class LongestSubstringWithoutRepeatingChar {

    public Integer lengthOfLongestSubstring(String s) {
        int n = s.length();
        HashSet<Character> set = new HashSet<>();
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n) {
            // try to extend the range [i, j]
            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            }
            else {
                set.remove(s.charAt(i++));
            }
        }
        return ans;
//        if (null == s) {
//            return 0;
//        }
//        char[] chars = s.toCharArray();
//        HashMap map = new HashMap();
//        HashSet set = new HashSet();
//        StringBuilder builder = new StringBuilder();
//        for (int i=0; i<s.length(); i++) {
//            if (notAlreadyExisting(chars[i], set)) {
//                char c = chars[i];
//                set.add(c);
//                builder.append(c);
//            } else {
//                set.clear();
//                map.put(builder.toString(), builder.toString().length());
//                i = i - builder.toString().length();
//                builder = new StringBuilder();
//                // remove least count of substring from map.
//            }
//        }
//        set.clear();
//        map.put(builder.toString(), builder.toString().length());
//        return mapWithLargestVal(map);
//    }
//
//    private Integer mapWithLargestVal(HashMap map) {
//        Map.Entry maxEntry = (Map.Entry) map.entrySet().stream()
//                .max(Map.Entry.comparingByValue()).get();
//        return (Integer) maxEntry.getValue();
//    }
//
//    private boolean notAlreadyExisting(char aChar, HashSet set) {
//        if (set.contains(aChar)){
//            return false;
//        }
//        else {
//            return true;
//        }
    }
}
