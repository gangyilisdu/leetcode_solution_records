class example {
    public static void main(String args[]){
        String s = "abcabcbb";
        example b = new example();
        int a = b.lengthOfLongestSubstring(s);
        System.out.println(a);
    }

    public int lengthOfLongestSubstring(String s) {
        int n = s.length();

        int res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (checkRepetition(s, i, j)) {
                    res = Math.max(res, j - i + 1);
                }
            }
        }

        return res;
    }

    private boolean checkRepetition(String s, int start, int end) {
        int[] count = new int[128];

        for (int i = start; i <= end; i++) {
            char result = s.charAt(i);
            count[result]++;
            if (count[result] > 1) {
                return false;
            }
        }

        return true;
    }
}

