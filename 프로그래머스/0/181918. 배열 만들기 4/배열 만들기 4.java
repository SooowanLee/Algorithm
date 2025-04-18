import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> stkList = new ArrayList<>();

            for (int i = 0; i < arr.length;) {
                if (stkList.isEmpty()) {
                    stkList.add(arr[i]);
                    i++;
                } else if (stkList.get(stkList.size() - 1) < arr[i]) {
                    stkList.add(arr[i]);
                    i++;
                } else {
                    stkList.remove(stkList.size() - 1);
                }
            }

            return stkList.stream()
                    .mapToInt(Integer::intValue)
                      .toArray();
    }
}