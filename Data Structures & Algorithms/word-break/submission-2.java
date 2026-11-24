// class Solution {
//     public boolean wordBreak(String s, List<String> wordDict) {
//         int memo
//         return solve(wordDict.size() - 1, s, wordDict);
//     }

//     boolean solve(int n, String s, List<String> wordDict) {
//         if (s.length() == 0)
//             return true;
//         if (n<0)
//             return false;
//         String word = wordDict.get(n);
//         if(s.startsWith(word))
//         if (solve(wordDict.size()-1,s.substring(word.length()), wordDict))
//                 return true;
//         return solve(n - 1, s, wordDict);
//     }
// }
class Solution {
    Boolean[] memo;

    public boolean wordBreak(String s, List<String> wordDict) {
        memo = new Boolean[s.length()];
        return solve(0, s, wordDict);
    }

    boolean solve(int i, String s, List<String> wordDict) {
        if (i == s.length())
            return true;
        if (memo[i] != null)
            return memo[i];

        for (String w : wordDict) {
            if (s.startsWith(w, i) && solve(i + w.length(), s, wordDict))
                return memo[i] = true;
        }
        return memo[i] = false;
    }
}