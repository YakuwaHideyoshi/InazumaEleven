/**
 * 不動 明王のステータスを表示するための実装を提供
 * 
 * @author H.yakuwa
 * レビュアー：堀内 基広
 */
public class Hudou extends Member {
   
    /**
     * 身長(cm)
     */
    public final int high = 151;

    /**
     * 体重(kg)
     */
    public final int weight = 40;

    /**
     * 不動 明王の詳細なステータスを表示
     */
    public void status(){

        System.out.println("不動 明王");
        System.out.println(position[1]);
        System.out.println("身長：" + this.high + "cm, 体重：" + this.weight + "kg");
        System.out.println("技名：キラースライド");
    }
}