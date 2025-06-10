package com.example.algorithms.baekjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P1920_수_찾기 {
    public static int binarySearch(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;

        while(left <= right){
            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // N 입력
        int N = Integer.parseInt(br.readLine());

        // A 배열 입력받기
        int[] A = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        Arrays.sort(A);

        int M = Integer.parseInt(br.readLine());
        int[] queries = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int q : queries) {
            sb.append(binarySearch(A, q) >= 0 ? '1' : '0').append('\n');
        }

        System.out.println(sb);
    }
}
