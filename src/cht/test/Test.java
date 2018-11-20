package cht.test;

import java.io.File;
import java.lang.reflect.Field;
import java.util.regex.Pattern;

/**
 * @author chenhantao
 * @since 2018/10/26
 */
public class Test {
    private int i1;
    private int i2;

    public static void main(String[] args){
        String str = "[\\w.]*\\.txt";
        boolean temp = Pattern.matches(str, "123.txt");
        System.out.println(temp);
        Class p = Test.class;
        Field[] fields = p.getDeclaredFields();
        System.out.println(fields[0].getName());
        try {
            Class c = Class.forName("cht.test.Test");
            System.out.println(c.getName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        File file = new File("E:\\test.txt");
        System.out.println(file.getName() + "\n" + file.getParentFile().getName() + "end");
    }
}
