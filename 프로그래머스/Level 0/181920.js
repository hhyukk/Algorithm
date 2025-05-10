// [level 0] 카운트 업 - 181920

// 정수 start_num와 end_num가 주어질 때, start_num부터 end_num까지의 숫자를 차례로 담은 리스트를 return하도록 solution 함수를 완성해주세요.

function solution(start_num, end_num) {
  var answer = [];
  for (let i = start_num; i <= end_num; i++) {
    answer.push(i);
  }
  return answer;
}

//Version 2
function solution(start, end) {
  idx = start;
  return Array.from({ length: end - start + 1 }, () => {
    return start++;
  });
}

//Version 3
function solution(start, end) {
  return Array(end - start + 1) // 1. 길이가 (end - start + 1)인 배열 생성
    .fill(start) // 2. 모든 요소를 start로 채움
    .map((x, idx) => x + idx); // 3. 각 요소에 인덱스를 더해 연속된 수 생성
}

//Version 4
function solution(start, end) {
  return Array.from(
    Array(end - start + 1), // 1. 길이만 있는 배열 생성
    (_, i) => start + i // 2. 각 인덱스를 이용해 숫자 채우기
  );
}
