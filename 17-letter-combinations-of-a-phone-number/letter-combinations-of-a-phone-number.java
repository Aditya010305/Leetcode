class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        String[] map = {
            "", "", "abc", "def", "ghi",
            "jkl", "mno", "pqrs", "tuv", "wxyz"
        };
        backtrack(0, digits, "", result, map);
        return result;
    }
    private void backtrack(int index, String digits, String current, List<String> result, String[] map) {
        if (index == digits.length()) {
            result.add(current);
            return;
        }
        String letters = map[digits.charAt(index) - '0'];
        for (char ch : letters.toCharArray()) {
            backtrack(index + 1, digits, current + ch, result, map);
        }
    }
}