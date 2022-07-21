class Solution {
    public boolean backspaceCompare(String s, String t) {
        int i = s.length() - 1, j = t.length() - 1, back;
        while (true) {
            back = 0;
            while (i >= 0 && (back > 0 || s.charAt(i) == '#')) {
                back += s.charAt(i) == '#' ? 1 : -1;
                i--;
            }
            back = 0;
            while (j >= 0 && (back > 0 || t.charAt(j) == '#')) {
                back += t.charAt(j) == '#' ? 1 : -1;
                j--;
            }

            if (i >= 0 && j >= 0 && s.charAt(i) == t.charAt(j)) {
                i--;
                j--;
            } else {
                break;
            }
        }
        return i == -1 && j == -1;
    }
}