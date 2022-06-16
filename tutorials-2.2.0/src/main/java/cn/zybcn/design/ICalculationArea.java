package cn.zybcn.design;

/**
 * @Author ZhangYiBo
 * @Date 2022-06-16 21:52
 */
public interface ICalculationArea {


    /**
     * 长方形米面积
     */
    double rectangle(double x, double y);

    /**
     * 三角形面积
     * <p>
     * 海伦公式 S=√[p(p-a)(p-b)(p-c)] 其中：p=(a+b+c)/2
     */
    double triangle(double x, double y, double z);


    /**
     * 圆形的面积
     */
    double circular(double r);
}
