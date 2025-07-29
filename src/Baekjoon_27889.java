import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_27889 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        //백준은 Java 11로 소스 코드를 컴파일 하기 때문에
        //Java 14 이상에서 도입된 enhanced switch expression 문법은 오류 발생
        switch (bf.readLine()){
            case "NLCS"-> System.out.println("North London Collegiate School");
            case "BHA"-> System.out.println("Branksome Hall Asia");
            case "KIS"-> System.out.println("Korea International School");
            case "SJA"-> System.out.println("St. Johnsbury Academy");
        }
    }
}
