package cn.zybcn.design;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author ZhangYiBo
 * @Date 2022-06-19 22:08
 */
public class Teacher {
    /**
     * 老师名称
     */
    private String name;
    /**
     * 班级
     */
    private String clazz;
    /**
     * 学生
     */
    private static List<Student> studentList;

    public Teacher() {
    }

    public Teacher(String name, String clazz) {
        this.name = name;
        this.clazz = clazz;
    }

    static {
        studentList = new ArrayList<>();
        studentList.add(new Student("花花", 10, 589));
        studentList.add(new Student("豆豆", 54, 356));
        studentList.add(new Student("秋雅", 23, 439));
        studentList.add(new Student("皮皮", 2, 665));
        studentList.add(new Student("蛋蛋", 19, 502));
    }

    public static List<Student> getStudentList() {
        return studentList;
    }

    public String getName() {
        return name;
    }

    public String getClazz() {
        return clazz;
    }
}
