package QuickHit;

/**
 * 级别类 存放信息
 *
 * @author 凌鹏焰
 * @date 2021年06月03日 15:08
 */
public class Level {
    private int leveNo;//各级别编号
    private int strLengh;//各级别一次输出字符串的长度
    private int strTime;//各级别输出字符串的次数
    private int timeLimit;//各级别闯关的时间限制
    private int perScore;//各级别正确输入一次的得分

    public Level() {

    }

    public Level(int leveNo, int strLengh, int strTime, int timeLimit, int perScore) {
        this.leveNo = leveNo;
        this.strLengh = strLengh;
        this.strTime = strTime;
        this.timeLimit = timeLimit;
        this.perScore = perScore;
    }

    public int getLeveNo() {
        return leveNo;
    }

    public int getStrLengh() {
        return strLengh;
    }

    public int getStrTime() {
        return strTime;
    }

    public int getTimeLimit() {
        return timeLimit;
    }

    public int getPerScore() {
        return perScore;
    }

    public void setLeveNo(int leveNo) {
        this.leveNo = leveNo;
    }

    public void setStrLengh(int strLengh) {
        this.strLengh = strLengh;
    }

    public void setStrTime(int strTime) {
        this.strTime = strTime;
    }

    public void setTimeLimit(int timeLimit) {
        this.timeLimit = timeLimit;
    }

    public void setPerScore(int perScore) {
        this.perScore = perScore;
    }
}
