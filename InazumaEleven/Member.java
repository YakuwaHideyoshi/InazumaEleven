/**
 * サッカーチームのメンバーを表す抽象クラス
 * メンバーのポジション、ステータスを管理するメソッドを定義
 * 
 * @author H.yakuwa
 * レビュアー：堀内 基広
 */
public abstract class Member extends Object{
    
    /** サッカーポジションを表す配列。 */
    public final String[] position = {
        "FW", "MF", "DF", "GK"
    };

    /**
     * 各メンバーのステータスを表示する抽象メソッド。
     * サブクラスで具体的な実装が必要。
     */
    public abstract void status();

}