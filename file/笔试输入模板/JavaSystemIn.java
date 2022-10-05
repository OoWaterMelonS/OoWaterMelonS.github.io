import java.util.*;
import java.io.*;

public class JavaSystemIn{
    public static void main(String[] args) throws IOException {
        /**
         * 实例一：基于Scanner
         */
        Scanner sc1 = new Scanner(System.in);
        System.out.println(sc1.nextInt());
        System.out.println(sc1.nextDouble());
        System.out.println(sc1.nextFloat());
        // 读取下一行
        System.out.println(sc1.nextLine());
        sc1.close();

        /**
         * 实例二：
         * 利用new BufferedInputStream加快速度
         */
        Scanner sc2 = new Scanner(new BufferedInputStream(System.in));
        System.out.println(sc2.nextInt());
        System.out.println(sc2.nextDouble());
        System.out.println(sc2.nextFloat());
        // 读取下一行
        System.out.println(sc2.nextLine());
        
        sc2.close();
        /**
         * 示例三：
         * 利用字符输入流
         * PS 需要抛出异常
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(br.readLine());

        int a = Integer.parseInt(br.readLine());
        System.out.println(a);
        
        float b = Float.parseFloat(br.readLine());
        System.out.println(b);
    }
}
