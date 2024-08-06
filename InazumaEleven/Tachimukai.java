/**
 * 立向居 勇気のステータスを表示するための実装を提供
 * 
 * @author H.yakuwa
 * レビュアー：堀内 基広
 */
public class Tachimukai extends Member {
   
    /**
     * 身長(cm)
     */
    public final int high = 155;

    /**
     * 体重(kg)
     */
    public final int weight = 37;

    /**
     * 立向居 勇気の詳細なステータスを表示
     */
    public void status(){

        System.out.println("立向居 勇気");
        System.out.println(position[3]);
        System.out.println("身長：" + this.high + "cm, 体重：" + this.weight + "kg");
        System.out.println("技名：ムゲン・ザ・ハンド");
    }
}