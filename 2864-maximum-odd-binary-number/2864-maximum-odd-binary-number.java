class Solution {
    public String maximumOddBinaryNumber(String s) {
        int oneCount = 0; // '1'의 총 개수를 세기 위한 변수입니다.
        // 문자열 s에서 '1'의 총 개수를 세는 반복문입니다.
        for (char c : s.toCharArray()) {
            if (c == '1') {
                oneCount++;
            }
        }

        StringBuilder sb = new StringBuilder();
        // '1'을 oneCount-1 만큼 앞으로 추가합니다. 마지막 '1'은 홀수를 만들기 위해 맨 뒤에 위치시킬 것입니다.
        for (int i = 0; i < oneCount - 1; i++) {
            sb.append("1");
        }
        // 나머지 자리에 '0'을 채웁니다. 마지막에 '1'을 추가하기 전까지입니다.
        while (sb.length() < s.length() - 1) {
            sb.append("0");
        }
        // 마지막에 '1'을 추가하여 홀수 이진 숫자를 완성합니다.
        sb.append("1");

        return sb.toString();
    }
}