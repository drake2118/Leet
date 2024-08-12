class Solution {
    public int lengthOfLongestSubstring(String s) {
    int left = 0, right = 0, maxlength = 0;
    Map<Character, Integer> frequencyMap = new HashMap<>();
    while (right < s.length() && left < s.length()) {
      char temp = s.charAt(right);
      if (frequencyMap.getOrDefault(temp,0) > 0) {
        char leftchar=s.charAt(left);
        frequencyMap.put(leftchar, frequencyMap.getOrDefault(leftchar, 0) - 1);
        left++;
        
      } else
    {
        right++;
        frequencyMap.put(temp, frequencyMap.getOrDefault(temp, 0) + 1);
        maxlength = Math.max(maxlength, right - left);}
    }
    return maxlength;
    }
}