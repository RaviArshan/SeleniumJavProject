package interview;

import java.util.*;

public class Number129_add1_130_array {
    public static void main(String[] args) {
        int arr[]={1,2,9}; //{1,3,0}
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<arr.length;i++)
        {
            sb.append(arr[i]);
        }
        Integer integer=Integer.parseInt(sb.toString());
        int addOne=integer+1;
       String str=String.valueOf(addOne);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            list.add(Character.getNumericValue(str.charAt(i)));
        }

        // Step 5: Print result
        System.out.println(list);

        /*
         // Step 4: Convert string digits to integers manually (no getNumericValue)
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int digit = ch - '0'; // ✅ converts '0'–'9' → 0–9
            list.add(digit);
        }
         */

    }
}
