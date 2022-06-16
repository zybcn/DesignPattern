package cn.zybcn.design.impl;

/**
 * @Author ZhangYiBo
 * @Date 2022-06-16 21:57
 */
public class CalculationAreaExt extends CalculationArea {

    private final static double Π = 3.141592653D;

    @Override
    public double circular(double r) {
        return Π * r * r;
    }
}
