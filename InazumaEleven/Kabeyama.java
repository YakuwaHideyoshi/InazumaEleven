/**
 * 壁山 塀吾郎のステータスを表示するための実装を提供
 * 
 * @author H.yakuwa
 * レビュアー：堀内 基広
 */
public class Kabeyama extends Member{
   
    /**
     * 身長(cm)
     */
    public final int high = 180;

    /**
     * 体重(kg)
     */
    public final int weight = 120;

    /**
     * 壁山 塀吾郎の詳細なステータスを表示
     */
    public void status(){

        System.out.println("壁山 塀吾郎");
        System.out.println(position[2]);
        System.out.println("身長：" + this.high + "cm, 体重：" + this.weight + "kg");
        System.out.println("技名：ザ・ウォール");
    }
}
