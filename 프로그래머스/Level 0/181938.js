// [level 0] 두 수의 연산값 비교하기 - 181938

/*
연산 ⊕는 두 정수에 대한 연산으로 두 정수를 붙여서 쓴 값을 반환합니다. 예를 들면 다음과 같습니다.

12 ⊕ 3 = 123
3 ⊕ 12 = 312
양의 정수 a와 b가 주어졌을 때, a ⊕ b와 2 * a * b 중 더 큰 값을 return하는 solution 함수를 완성해 주세요.

단, a ⊕ b와 2 * a * b가 같으면 a ⊕ b를 return 합니다.
*/

function solution(a, b) {
  return String(a) + String(b) > 2 * a * b ? Number(String(a) + String(b)) : 2 * a * b;
}

// Version 2
function solution(a, b) {
  let num1 = parseInt(a + '' + b + ''); //a+"" 스트링변환
  let num2 = 2 * a * b;
  return num1 > num2 ? num1 : num2;
}

// Version 3
function solution(a, b) {
  return Math.max(+(a.toString() + b.toString()), 2 * a * b);
  //+(...) : 문자열을 숫자로 변환
  //Math.max()로 큰 값 반환
}

// Version 4
function solution(a, b) {
  return Math.max(Number(`${a}${b}`), a * b * 2);
}
