package com.xiang;

/**
 * 点击main运营时，javac会将所有的类都进行编译，生成class文件
 * 执行java命令运营程序时，会先执行类加载。
 * 需要注意的是类加载时，不会将每一个class都直接加载到内存中。而是用到哪个类，才加载对应的class文件。
 *
 * 测试：执行下述代码，在运行的时候（线程休眠的20s内），将编译好的User文件删掉，会报异常java.lang.ClassNotFoundException
 */
public class UserLoaderTest {
    static {
        System.out.println("TestMain 类被加载了");
    }

    public UserLoaderTest(){
        System.out.println("TestMain 当前实例被创建了");
    }
    public static void main(String[] args) {
        System.out.println("main 运行中");
        int i = 0;
        while(i <= 1){
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
