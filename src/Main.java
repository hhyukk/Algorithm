public class Main {
    public static void main(String[] args) {
        // 1~100 사이 값 랜덤 선택
        int findNumber = (int)(Math.random() * 100);
        for(int i=0; i<100; i++)
        {
            if(i == findNumber)
            {
            System.out.println("i = " + i);
            break;
            }
        }
    }
}
// 빅-오메가 표기법의 시간 복잡도는 1번
// 빅-세타 표기법의 시간 복잡도는 N/2번
// 빅-오 표기법의 시간 복잡도는 N번