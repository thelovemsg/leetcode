class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> result = new ArrayList<>();
        String digits = "123456789"; // 기본으로 사용할 숫자 문자열

        // 순차적 숫자의 가능한 모든 길이에 대해 반복
        for (int length = 2; length <= digits.length(); length++) {
            // 시작 인덱스를 이동시키며 순차적 숫자 생성
            for (int start = 0; start <= digits.length() - length; start++) {
                String seqDigitStr = digits.substring(start, start + length);
                int seqDigit = Integer.parseInt(seqDigitStr);
                // 생성된 숫자가 범위 안에 있으면 결과에 추가
                if (seqDigit >= low && seqDigit <= high) {
                    result.add(seqDigit);
                }
            }
        }

        return result;
    }
}