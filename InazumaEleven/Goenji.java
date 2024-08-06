/**
 * 豪炎寺 修也のステータスを表示するための実装を提供
 * 
 * @author H.yakuwa
 * レビュアー：堀内 基広
 */
public class Goenji extends Member{
    
    /**
     * 身長(cm)
     */
    public final int high = 162;

    /**
     * 体重(kg)
     */
    public final int weight = 41;

     /**
     * 豪炎寺 修也の詳細なステータスを表示
     */
    public void status(){

        System.out.println("豪炎寺 修也");
        System.out.println(position[0]);
        System.out.println("身長：" + this.high + "cm, 体重：" + this.weight + "kg");
        System.out.println("技名：爆熱ストーム");
        
    }
}
