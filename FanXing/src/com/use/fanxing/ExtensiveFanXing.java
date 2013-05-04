package com.use.fanxing;

/**
 * Created with IntelliJ IDEA.
 * User: fmm
 * Date: 13-5-2
 * Time: 下午7:12
 * To change this template use File | Settings | File Templates.
 */
public class ExtensiveFanXing<V, T> {
    private V num1;
    private T num2;

    public ExtensiveFanXing(V num1, T num2) {
        this.num1 = num1;
        this.num2 = num2;

    }

    public V getNum1() {
        return num1;

    }

    public T getNum2() {
        return num2;
    }

    public void CompareTwoNum() {
        if (num2.equals(num1)) //对象不能用==来比较大小，必须用equals方法
        {
            System.out.println("two numbers are equal");
        } else {
            System.out.println("Sorry");
        }

        System.out.println(num1);
        System.out.println(num2);
    }
}


