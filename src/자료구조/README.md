<h1>11720번 숫자의 합</h1>
<h3>입력</h3>
첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.
<h3>출력</h3>
입력으로 주어진 숫자 N개의 합을 출력한다.



```java
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(bf.readLine());
        long num = Long.parseLong(bf.readLine());
        long sum=0;
        for(int i=0; i<count; i++)
        {
            sum+=num%10;
            num/=10;
        }
        System.out.println(sum);
    }
}

```
long int로 입력값을 받고 10으로 나눈 값을 더해서 sum을 출력하려고 했지만 25 700000000000000000을 입력하자 NumFormatException 오류가 발생함

입력 및 연산 결과 값이 int 범위보다 크면 long타입을 사용하면 되지만 만약 long 범위를 벗어나게 된다면 NumFormatException(숫자 형식 오류)이 발생할 수 있음
```java
import java.io.*;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(bf.readLine());
        BigInteger num = new BigInteger(bf.readLine());
        BigInteger sum = new BigInteger("0");
        for(int i=0; i<count; i++)
        {
            sum+=num%10;
            num/=10;
        }
        System.out.println(sum);
    }
```
범위를 더 크게 하려고 BigInteger를 사용했지만 % 연산자를 BigInteger에 사용할 수 없다는 오류 발생

N개의 숫자를 문자열로 입력받아 한 글자씩 분리하여 int로 변환 후 더하는 방법을 사용함

<h3>split("")</h3>
`String.split(x)`은 지정된 문자열 x를 기준으로 문자열을 나누는 메서드.

```java
import java.io.*;

public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int t = Integer.parseInt(br.readLine());
    String number = br.readLine();
    int sum = 0;

    for (String s : number.split("")) {
        sum += Integer.parseInt(s);
    }

    System.out.println(sum);
}
```

<h3>toCharArray()</h3>

문자열을 한 글자씩 나눠 char 타입의 배열에 담아 반환하는 메서드

```java
import java.io.*;

public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int t = Integer.parseInt(br.readLine());
    String number = br.readLine();
    int sum = 0;
    char[] arr = new char[t];

//        문자열을 한 글자씩 나눠 char 타입의 배열에 담아 반환하는 toCharArray()
    arr = number.toCharArray();

    for (int i = 0; i < arr.length; i++) {
        sum += arr[i] - '0'; // 문자 1의 아스키 코드에서 문자 0의 아스키 코드를 뺴주면 숫자 1을 얻음
    }
    System.out.println(sum);
}
```

<h3>charAt(i)</h3>
문자열의 인덱스 i에 해당하는 문자를 char타입으로 반환하는 메서드

```java
import java.io.*;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        String number = br.readLine();
        int sum = 0;

        for(int i=0; i<t; i++)
        {
            sum += number.charAt(i) - '0'; // 문자 1의 아스키 코드에서 문자 0의 아스키 코드를 뺴주면 숫자 1을 얻음
        }
        System.out.println(sum);
    }
```