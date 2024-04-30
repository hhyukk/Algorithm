package 자료구조;

import java.io.*;

public class Baekjun_1546 {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(bf.readLine());
        String grade = bf.readLine();
        double sum=0;
        double max=0;

        for(String s : grade.split(" "))
        {
            if(max < Integer.parseInt(s))
            {
                max = Integer.parseInt(s);
            }
        }
        for(String s: grade.split(" "))
        {
            sum += (Integer.parseInt(s) / max) * 100;
        }
        System.out.println(sum/count);
    }
}
