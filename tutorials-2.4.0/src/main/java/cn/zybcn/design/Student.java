package cn.zybcn.design;

/**
 * @Author ZhangYiBo
 * @Date 2022-06-19 22:06
 */
public class Student {

    /**
     * 学生姓名
     */
    private String name;
    /**
     * 考试排名(总排名)
     */
    private int rank;
    /**
     * 考试分数(总分)
     */
    private double grade;

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public Student(String name, int rank, double grade) {
        this.name = name;
        this.rank = rank;
        this.grade = grade;
    }
}
