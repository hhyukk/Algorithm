//[level 0] 공백으로 구분하기 2 - 181868

// 단어가 공백 한 개 이상으로 구분되어 있는 문자열 my_string이 매개변수로 주어질 때,
// my_string에 나온 단어를 앞에서부터 순서대로 담은 문자열 배열을 return 하는 solution 함수를 작성해 주세요.

function solution(my_string) {
  var answer = my_string.split(' ').filter((a) => a !== '');
  return answer;
}

// Version 2
function solution(my_string) {
  return my_string.split(' ').filter((v) => v);
  return my_string.split(' ').filter(Boolean);
  //flter((v) => v)는 truthy한 값 (빈 문자열이 아닌 모든 값)
}
