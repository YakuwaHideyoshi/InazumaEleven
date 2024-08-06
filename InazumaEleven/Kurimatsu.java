/**
 * 栗松 鉄平のステータスを表示するための実装を提供
 * 
 * @author H.yakuwa
 * レビュアー：堀内 基広
 */
public class Kurimatsu extends Member{
       
    /**
     * 身長(cm)
     */
    public final int high = 138;

    /**
     * 体重(kg)
     */
    public final int weight = 35;

    /**
     * 栗松 鉄平の詳細なステータスを表示
     */
    public void status(){

        System.out.println("栗松 鉄平");
        System.out.println(position[2]);
        System.out.println("身長：" + this.high + "cm, 体重：" + this.weight + "kg");
        System.out.println("技名：トリプルディフェンス");
    }    
}
