package cn.zybcn.design;

/**
 * @Author ZhangYiBo
 * @Date 2022-06-21 22:56
 */
public class BetUser {


    private String userName;

    private int userWeight;

    public BetUser(String userName, int userWeight) {
        this.userName = userName;
        this.userWeight = userWeight;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserWeight() {
        return userWeight;
    }

    public void setUserWeight(int userWeight) {
        this.userWeight = userWeight;
    }
}
