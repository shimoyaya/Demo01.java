package QuickHit;

/**
 * 各个级别的具体参数信息
 *
 * @author 凌鹏焰
 * @date 2021年06月03日 17:40
 */
public class LevelParam {
    public final static Level levels[] = new Level[6];//对应6个级别

    static {
        levels[0] = new Level(1, 2, 10, 30, 1);
        levels[1] = new Level(2, 3, 9, 26, 2);
        levels[2] = new Level(3, 4, 8, 22, 5);
        levels[3] = new Level(4, 5, 7, 18, 8);
        levels[4] = new Level(5, 6, 6, 15, 10);
        levels[5] = new Level(6, 7, 5, 12, 15);
    }

}
