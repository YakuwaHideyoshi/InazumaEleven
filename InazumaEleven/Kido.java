/**
 * 鬼道 有人のステータスを表示するための実装を提供
 * 
 * @author H.yakuwa
 * レビュアー：堀内 基広
 */
public class Kido extends Member{

    /**
     * 身長(cm)
     */
    public final int high = 151;

    /**
     * 体重(kg)
     */
    public final int weight = 40;

    /**
     * 鬼道 有人の詳細なステータスを表示
     */
    public void status(){

        System.out.println("鬼道 有人");
        System.out.println(position[1]);
        System.out.println("身長：" + this.high + "cm, 体重：" + this.weight + "kg");
        System.out.println("技名：皇帝ペンギン2号");
    }
}
