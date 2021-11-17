import java.util.*;

class solution {

    static HashMap<String,Integer> values = new HashMap<>();

    static{
        values.put("M", 1000);
        values.put("D", 500);
        values.put("C", 100);
        values.put("L", 50);
        values.put("X", 10);
        values.put("V", 5);
        values.put("I", 1);
    }

    public int romanToInt(String s) {
        int sum = 0;
        int i = 0;
        while (i < s.length()) {
            String CurrentSymbol;
            CurrentSymbol = s.substring(i, i + 1);
            int CurrentValue = 0;
            CurrentValue = values.get(CurrentSymbol);
            int nextValue = 0;
            if (i + 1 < s.length()) {
                String nextSymbol;
                nextSymbol = s.substring(i + 1, i + 2);
                nextValue = values.get(nextSymbol);
            }
            if (CurrentValue < nextValue) {
                sum = sum + nextValue - CurrentValue;
                i += 2;
            } else {
                sum = sum + CurrentValue;
                i++;
            }
        }
        return sum;
    }

    public static void main(String args[]){
        String s = "MCMXCIV";
        solution b = new solution();
        int a = b.romanToInt(s);
        System.out.println(a);
    }
}