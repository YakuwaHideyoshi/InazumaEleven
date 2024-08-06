/**
 * 染岡 竜吾のステータスを表示するための実装を提供
 * 
 * @author H.yakuwa
 * レビュアー：堀内 基広
 */
public class Someoka extends Member {
   
    /**
     * 身長(cm)
     */
    public final int high = 176;

    /**
     * 体重(kg)
     */
    public final int weight = 55;

    /**
     * 染岡 竜吾の詳細なステータスを表示
     */
    public void status(){

        System.out.println("染岡 竜吾");
        System.out.println(position[0]);
        System.out.println("身長：" + this.high + "cm, 体重：" + this.weight + "kg");
        System.out.println("技名：ドラゴンクラッシュ");
    }
}