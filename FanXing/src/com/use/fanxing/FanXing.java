/**
 * Created with IntelliJ IDEA.
 * User: fmm
 * Date: 13-5-2
 * Time: 下午4:38
 * To change this template use File | Settings | File Templates.
 */
package com.use.fanxing;

public class FanXing<T> {
    private T str;

    public FanXing(T str) {
        this.str = str;
    }

    public T getStr() {
        return str;
    }

    public void setStr(T str) {
        this.str = str;
    }

    public <V> void showValue(V value) {
        System.out.println(value);
    }

    public static void main(String args[]) {
        String str = "my name is fmm";
        String changedStr = "hello fmm";
        Integer num = 5;
        FanXing<String> fanXing = new FanXing<String>(str);
        System.out.println(fanXing.getStr());

        fanXing.setStr(changedStr);
        System.out.println(fanXing.getStr());

        fanXing.showValue(str);

        FanXing<Integer> integerFanXing = new FanXing<Integer>(num);
        System.out.println(integerFanXing.getStr());

        ExtensiveFanXing<Double, Integer> extensiveFanXing = new ExtensiveFanXing<Double, Integer>(6.13, 6);
        extensiveFanXing.CompareTwoNum();

        ExtensiveFanXing<Float, Float> extensiveFanXingFloat = new ExtensiveFanXing<Float, Float>(5.24f, 5.24f);
        extensiveFanXingFloat.CompareTwoNum();

        System.out.println(extensiveFanXingFloat.getNum1());
        System.out.println(extensiveFanXingFloat.getNum2());


        System.out.println(5.24f == 5.24f);
    }

}
