import java.util.Random;

public class bucket {
    // 初始化
    int count = 0, input = 0;
    boolean success = true;
    boolean[] hole = new boolean[10];//10個洞的記錄陣列
    boolean[] knifes = new boolean[hole.length]; // true 已插刀, false 未插刀

    public bucket() {
        hole[new Random().nextInt(hole.length)] = true; // 隨機產生某個特殊的洞
    }

    // 插入一把刀的方法, 輸入在那個位置插刀, 回傳是否
    // 1: 成功插到虎克船長, 0:沒插到虎克船長次數在五次以內,
    // -1:沒插到且超過5次, -2:錯誤輸入
    public int put_knifes(int input) {
        if (input < 0 || input > hole.length || knifes[input]){// 刀插到外面或已有刀
            return -2;}// 錯誤輸入, 重插
        else if (hole[input]){
            return 1;//成功插到虎克船長
        }else {
            knifes[input] = true; // 插入刀子
            count++;//插入刀子的計數
            if (count<5){
                return 0;}//失敗
            else {
                return -1;//失敗且超過5次
            }
        }
    }
}

