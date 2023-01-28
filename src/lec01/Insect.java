package lec01;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Insect {

    int n;

    Insect() {
        n = 0;
    }

    public void sayReflection() {
        System.out.println("Reflection!");
    }

    public void reflectionTest() {
        String strClassName = "lec01.Insect";
        String strMethodName = "sayReflection";

        Class cl = null;
        try {
            cl = Class.forName(strClassName);
            Method method = cl.getMethod(strMethodName);
            method.invoke(cl.getDeclaredConstructor().newInstance());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }

    int test() {

        if (n == 0) {
            throw new IllegalArgumentException("Ahhhhhhhhhhhhhhhhh");
        }

        n = 1;

        return n;
    }

    void move() {
        System.out.println("歩いたよ");
    }

}
