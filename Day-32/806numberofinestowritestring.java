class Solution {
    public int[] numberOfLines(int[] width, String s) {

        int lines = 1;
        int current = 0;

        for (int i = 0; i < s.length(); i++) {

            int w = width[s.charAt(i) - 'a'];

            if (current + w > 100) {
                lines++;
                current = w;
            } else {
                current += w;
            }
        }

        return new int[]{lines, current};
    }
}
