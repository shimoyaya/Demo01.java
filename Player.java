package QuickHit;

import java.util.Scanner;

/**
 * 玩家类
 *
 * @author 凌鹏焰
 * @date 2021年06月03日 15:08
 */
/*
 *
方法：玩游戏 根据游戏的输出来输入相同字符串
 */
public class Player {
    private int levelNo;//玩家当前级别号
    private int curScore;//玩家当前级别积分
    private long startTime = 0;//当前级别开始时间
    private int clapscdTime;//当前级别已用时间

    public Player(int levelNo, int curScore, long startTime, int clapscdTime) {
        this.levelNo = levelNo;
        this.curScore = curScore;
        this.startTime = startTime;
        this.clapscdTime = clapscdTime;
    }

    public Player() {

    }

    //get  set 方法
    public int getLevelNo() {
        return levelNo;
    }

    public void setLevelNo(int levelNo) {
        this.levelNo = levelNo;
    }

    public int getCurScore() {
        return curScore;
    }

    public void setCurScore(int curScore) {
        this.curScore = curScore;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public int getClapscdTime() {
        return clapscdTime;
    }

    public void setClapscdTime(int clapscdTime) {
        this.clapscdTime = clapscdTime;
    }


    //玩游戏
    public void play() {
        //创建对象实例
        Game game = new Game(this);
        //外层循环控制游戏晋级
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < LevelParam.levels.length; i++) {
            //晋级,因为i是从0开始的，实际从1开始
            this.levelNo += 1;
            //晋级后计时清零，获取当前系统时间
            this.startTime = System.currentTimeMillis();
            //晋级积分清零
            curScore = 0;
            //内循环 循环一次完成一次系统输出，玩家输入，比较
            for (int j = 0; j < LevelParam.levels[i].getStrTime(); j++) {
                //先让游戏输出字符串
                String out = game.printStr();
                //接收用户输入的字符串
                String in = sc.next();
                //游戏，判断玩家输入是否正确，并输出相应信息
                game.printResult(out, in);
            }
        }
    }

}
