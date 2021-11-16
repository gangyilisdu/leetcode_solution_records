import java.util.*;

class solution {

    private static final int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    private static final String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    public String integerToRoman(int num){
        StringBuilder sb = new StringBuilder();

        for( int i = 0; i < values.length && num > 0; i++){
            while(values[i] <= num){
                num = num - values[i];
                sb.append(symbols[i]);
            }
        }
        return sb.toString();
    }
    public static void main(String args[]){
        int num = 671;
        solution s = new solution();
        String a = s.integerToRoman(num);
        System.out.println(a);
    }
}
