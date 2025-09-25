class Solution {
    public int[] solution(int[] num_list) {
        int n = num_list.length;
        int[] answer = new int[n];
        
        // num_list의 뒤에서부터 하나씩 answer의 앞에 채우기
        for (int i = 0; i < n; i++) {
            answer[i] = num_list[n - 1 - i];
        }
        
        return answer;
    }
}