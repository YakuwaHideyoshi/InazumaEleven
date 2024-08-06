/**
 * 風丸 一太郎のステータスを表示するための実装を提供
 * 
 * @author H.yakuwa
 * レビュアー：堀内 基広
 */
public class Kazemaru extends Member {
   
    /**
     * 身長(cm)
     */
    public final int high = 161;

    /**
     * 体重(kg)
     */
    public final int weight = 39;

    /**
     * 風丸 一太郎の詳細なステータスを表示
     */
    public void status(){

        System.out.println("風丸 一太郎");
        System.out.println(position[2]);
        System.out.println("身長：" + this.high + "cm, 体重：" + this.weight + "kg");
        System.out.println("技名：疾風ダッシュ");
    }
}