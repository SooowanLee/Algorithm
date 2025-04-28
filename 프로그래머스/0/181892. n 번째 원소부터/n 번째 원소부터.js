function solution(num_list, n) {
    var answer = [];

    answer.push(...num_list.slice(n-1));
    return answer;
}