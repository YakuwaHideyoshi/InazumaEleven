import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * サッカーチームのメンバーを管理し、
 * メンバーの選択やアクションの実行を行う
 * 
 * @author H.yakuwa
 * レビュアー：堀内 基広
 */
public class Director extends Object{
    
    /** 
     * サッカーポジションを表す配列
     */
    public final String[] position = {
        "FW", "MF", "DF", "GK"
    };

    /** 
     * チームメンバーの配列
     */
    Member[] players = {
        new Endo(), new Goenji(), new Kabeyama(), new Kido(),
        new Kurimatsu(), new Kazemaru(), new Hubuki(), new Hudou(),
        new Someoka(), new Tachimukai(), new Tsunami()
    };

    /**
     * ランダムに5人のメンバーを選び、選択したメンバーのステータスを表示
     */
    public void choiceMembers(){
        Random rand = new Random();
        List<Member> selectedPlayers = new ArrayList<>();

        // ランダムに5つのインスタンスを選択
        while (selectedPlayers.size() < 5) {
            int randomIndex = rand.nextInt(players.length);
            Member selectedPlayer = players[randomIndex];

            // 重複を避けるためにリストに含まれていない場合のみ追加
            if (!selectedPlayers.contains(selectedPlayer)) {
                selectedPlayers.add(selectedPlayer);
            }
        }
        for(Member member : selectedPlayers) {
            member.status();
        }
    }

     /**
     * チームの共通情報を表示、現在は「出身校：雷門中」と表示
     */
    public void commonStatus(){
        System.out.println("出身校：雷門中");
    }

    /**
     * 各ポジションの役割について説明
     */
    public void commonAction(){
        System.out.println(position[0] + "はゴールを決める役割である。");
        System.out.println(position[1] + "は上手くゲームメイクする役割である。");
        System.out.println(position[2] + "は相手のプレーを止める役割である。");
        System.out.println(position[3] + "はゴールを守る役割である。");
    }

    /**
     * メンバー選択、共通情報の表示、ポジション役割の説明を実行
     */
    public void perform(){
        choiceMembers();
        commonStatus();
        commonAction();
    }
}
