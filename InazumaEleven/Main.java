/**
 * アプリケーションのエントリーポイント
 * mainメソッドを含み、{@link Director}オブジェクトを作成し、
 * {@link Director#perform()}メソッドを呼び出す
 * 
 * @author H.yakuwa
 * レビュアー：堀内 基広
 */
public class Main extends Object{
    
    /**
     * アプリケーションのエントリーポイントであるmainメソッド
     * {@link Director}のインスタンスを作成し、その{@link Director#perform()}メソッドを呼び出す
     *
     * @param args コマンドライン引数。アプリケーションには影響しない
     */
    public static void main(String[] args) {

        Director aDirector = new Director();
        aDirector.perform();
    }
}
