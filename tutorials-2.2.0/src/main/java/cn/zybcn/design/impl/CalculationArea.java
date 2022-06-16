package cn.zybcn.design.impl;

import cn.zybcn.design.ICalculationArea;

/**
 * @Author ZhangYiBo
 * @Date 2022-06-16 21:58
 */
public class CalculationArea implements ICalculationArea {

    private final static double Π = 3.14D;

    public double rectangle(double x, double y) {
        return x * y;
    }

    public double triangle(double x, double y, double z) {
        double p = (x + y + z) / 2;
        return Math.sqrt(p * (p - x) * (p - y) * (p - z));
    }

    public double circular(double r) {
        return Π * r * r;
    }
}
