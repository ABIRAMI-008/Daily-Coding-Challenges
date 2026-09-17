class Solution {
    public String licenseKeyFormatting(String s, int k) {

        s = s.replace("-", "").toUpperCase();

        StringBuilder ans = new StringBuilder();

        int first = s.length() % k;
        int index = 0;

        if (first != 0) {
            ans.append(s.substring(0, first));
            index = first;
        }

        while (index < s.length()) {

            if (ans.length() > 0) {
                ans.append("-");
            }

            ans.append(s.substring(index, index + k));
            index += k;
        }

        return ans.toString();
    }
}