package stack;

/**
 * -Xss128M 设置栈大小
 * 通过count观察栈内存溢出
 */
public class StackOverFlowTest {
    private static int count = 0;
    public static void main(String[] args) {
        count++;
        System.out.println(count);
        main(args);
    }
}
