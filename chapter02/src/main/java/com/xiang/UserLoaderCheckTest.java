package com.xiang;

/**
 * 点击main运营时，javac会将所有的类都进行编译，生成class文件
 * 执行java命令运营程序时，会先执行类加载。
 * 类加载时又分为：加载、验证、准备、解析、初始化
 * 验证时若class文件不符合要求则会校验失败
 *
 * 测试：执行下述代码，在运行的时候（线程休眠的30s内），将编译好的User文件篡改，会报异常java.lang.ClassFormatError
 */
public class UserLoaderCheckTest {
    static {
        System.out.println("TestMain 类被加载了");
    }

    public UserLoaderCheckTest(){
        System.out.println("TestMain 当前实例被创建了");
    }
    public static void main(String[] args) {
        System.out.println("main 运行中");
        int i = 0;
        while(i <= 3){
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
        }
        User user = new User();
        System.out.println("user info " + user);
        System.out.println("main 运行结束");
    }

    @Override
    protected void finalize() {
        System.out.println("TestMain 当前示例被销毁了...");
    }
}
