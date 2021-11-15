import java.util.*;

class solution {
    public String[] reorderLogFiles(String[] logs) {

        Comparator<String> MyComp = new Comparator<String>() {
            @Override
            public int compare(String log1, String log2) {
                String[] split1 = log1.split(" ", 2);
                String[] split2 = log2.split(" ", 2);

                boolean isDigit1 = Character.isDigit(split1[1].charAt(0));
                boolean isDigit2 = Character.isDigit(split2[1].charAt(0));

                if (!isDigit1 && !isDigit2) {
                    if (!split1[1].equals(split2[1])) {
                        return split1[1].compareTo(split2[1]);
                    } else {
                        return split1[0].compareTo(split2[0]);
                    }
                } else if (isDigit1 && !isDigit2) {
                    return 1;
                } else if (!isDigit1 && isDigit2) {
                    return -1;
                } else {
                    return 0;
                }
            }
        };
        Arrays.sort(logs, MyComp);
        return logs;
    }
    public static void main(String args[]){
        String[] logs = {"dig1 8 1 5 1","let1 art can","dig2 3 6","let2 own kit dig","let3 art zero"};
        solution s = new solution();
        String[] a = s.reorderLogFiles(logs);
        System.out.println(Arrays.toString(a));
    }
}