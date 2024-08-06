/**
 * 吹雪 士郎のステータスを表示するための実装を提供
 * 
 * @author H.yakuwa
 * レビュアー：堀内 基広
 */
public class Hubuki extends Member {
   
    /**
     * 身長(cm)
     */
    public final int high = 147;

    /**
     * 体重(kg)
     */
    public final int weight = 36;

    /**
     * 吹雪 士郎の詳細なステータスを表示
     */
    public void status(){

        System.out.println("吹雪 士郎");
        System.out.println(position[0]);
        System.out.println("身長：" + this.high + "cm, 体重：" + this.weight + "kg");
        System.out.println("技名：ウルフレジェンド");
    }
}