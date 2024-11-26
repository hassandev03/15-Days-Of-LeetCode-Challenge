class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder revString = new StringBuilder();
        int strLen = s.length();

        for (int index = 0; index < strLen; index += 2 * k) {
            String remainString = s.substring(index);
            int remainStrLen = remainString.length();

            if (remainStrLen < k) {
                revString.append(reverse(remainString));
            } else {
                int twoKStrStopIndex = (index + 2 * k) <= strLen ? (index + 2 * k) : index + k;
                revString.append(reverse(s.substring(index, index + k))).append(s.substring(index + k, twoKStrStopIndex));
            }
        }

        return revString.append(s.substring(revString.length())).toString();
    }

    private static StringBuilder reverse(String str) {
        StringBuilder reversedStr = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr.append(str.charAt(i));
        }

        return reversedStr;
    }
}