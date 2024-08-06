/**
 * 円堂 守のステータスを表示するための実装を提供
 * 
 * @author H.yakuwa
 * レビュアー：堀内 基広
 */
public class Endo extends Member {

    /**
     * 身長(cm)
     */
    public final int high = 151;

    /**
     * 体重(kg)
     */
    public final int weight = 40;

    /**
     * 円堂 守の詳細なステータスを表示
     */
    public void status(){

        System.out.println("円堂 守");
        System.out.println(position[3]);
        System.out.println("身長：" + this.high + "cm, 体重：" + this.weight + "kg");
        System.out.println("技名：ゴットハンド");
    }
}