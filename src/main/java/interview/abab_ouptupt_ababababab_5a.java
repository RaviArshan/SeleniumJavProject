package interview;

public class abab_ouptupt_ababababab_5a {

    public static void main (String[] args){

        String str = "abb";
        int n=10;
        countMaxA(n,str);

    }

    public static void countMaxA(int n, String str){
        int countA=0;
        for (int i =0; i<str.length();i++){
            if (str.charAt(i) == 'a'){
                countA++;
            }
        }

        //
        countA = countA + n/str.length();
       for(int i=0;i<(n%str.length()-1);i++)
       {
           if (str.charAt(i) == 'a'){
               countA++;
           }
       }
       System.out.println(countA);
        }


}
