package QuickHit;

import java.util.Random;

/**
 * 游戏类
 *
 * @author 凌鹏焰
 * @date 2021年06月03日 15:08
 */
/*思路：
*   （1）生成字符串。
    （2）输出字符串。
    （3）返回字符串
 */

public class Game {
    private Player player;//玩家

    /**
     * 构造方法，传入玩家信息
     *
     * @param player
     * @return null
     */
    public Game(Player player) {
        super();
        this.player = player;
    }

    /**
     * 输出指定级别规定的字符串
     * @return String 输出字符串，用于和用户比较
     */
    public String printStr() {
        int strLength = LevelParam.levels[player.getLevelNo() - 1].getStrLengh();//根据级别号-1得到LevelParam中levels的内容
        StringBuffer buffer = new StringBuffer();
        Random random = new Random();
        //通过循环来生成字符串
        for (int i = 0; i < strLength; i++) {
            int rand = random.nextInt(strLength);
            //根据随机数拼接字符串
            switch (rand) {
                case 0:
                    buffer.append("-");
                    break;
                case 1:
                    buffer.append("<");
                    break;
                case 2:
                    buffer.append(">");
                    break;
                case 3:
                    buffer.append("%");
                    break;
                case 4:
                    buffer.append("@");
                    break;
                case 5:
                    buffer.append("$");
                    break;
                case 6:
                    buffer.append("#");
                    break;
            }
        }
        System.out.println(buffer.toString());
        return buffer.toString();
    }

    //  确定玩家输入是否正确
    // 输出相应结果信息
    /*比较游戏输出out和玩家输入in，根据比较结果输出相应信息*/
/**
 *
 * @author 凌鹏焰
 * @date 2021/6/5 13:39
 * @param out 游戏输出字符串
 * @param in 用户输入字符串
 */
    public void printResult(String out, String in) {
        //判断输入是否正确
        if (out.equals(in)) {
            long currentTime = System.currentTimeMillis();//返回当前时间以毫秒为单位
            if ((currentTime - player.getStartTime()) / 1000 > LevelParam.levels[player.getLevelNo() - 1].getTimeLimit()) {
                System.out.println("你输入太慢了，已经超时");
                System.exit(1);
            } else {//没超时
                //计算玩家当前积分:玩家已有分数+当前玩的这个级别通过应该加的分数
                player.setCurScore(player.getCurScore() + LevelParam.levels[player.getLevelNo() - 1].getPerScore());
                //计算已用时间
                player.setClapscdTime((int)(currentTime - player.getStartTime())/1000);
                //输出当前积分，当前级别，已用时间
                System.out.println("输入正确，你的级别"+player.getLevelNo()+", 你的积分"+player.getCurScore()
                        +", 已用时间：" +player.getClapscdTime()+"秒");
                //最后一关
                if(player.getLevelNo() == 6){
                    //计算分数，回答一次加分*回答的次数----》闯关所需要的分数
                    int score = LevelParam.levels[player.getLevelNo()-1].getPerScore()
                            *LevelParam.levels[player.getLevelNo()-1].getStrTime();
                    if(player.getCurScore()==score){
                        System.out.println("闯关成功");
                        System.out.println("游戏结束");
                        System.exit(0);
                    }

                }
            }
        } else {
            System.out.println("错误信息并退出程序");
            System.exit(1);
        }
    }
}









































