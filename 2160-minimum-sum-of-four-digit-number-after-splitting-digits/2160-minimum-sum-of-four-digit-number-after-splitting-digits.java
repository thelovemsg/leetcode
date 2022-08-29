class Solution {
    public int minimumSum(int num) {
        /*int[] numbers = new int[4];
        int i = 0;
        while(num > 0){
            numbers[i++] = num % 10;
            num /= 10;
        }
        Arrays.sort(numbers);
        for(int temp : numbers){
            System.out.println("number :: " + temp);
        }
        int result = (numbers[0] * 10 + numbers[2]) + (numbers[1] * 10 + numbers[3]);
        return result;*/
        
        
        int [] arr = new int [4];
        String s = String.valueOf(num);

        int i=0;
        for(char c : s.toCharArray()){
            arr[i++] = c-'0';

        }
        Arrays.sort(arr);
        int d1=arr[0];
        int d2 = arr[1];
        int d3 =arr[2];
        int d4 = arr[3];
        String n1 = ""+d1+d3, n2=""+d2+d4;


        return Integer.parseInt(n1)+Integer.parseInt(n2);
    }
}