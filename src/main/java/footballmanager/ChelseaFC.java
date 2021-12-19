package footballmanager;

import java.util.HashMap;
import java.util.Map;

public class ChelseaFC {
    String role;
    String playerName;
    boolean covid;

    public ChelseaFC(String role, String playerName){
        this.role = role;
        this.playerName = playerName;
    }

    public ChelseaFC(String role, String playerName, boolean covid){
        this.role = role;
        this.playerName = playerName;
        this.covid = covid;
    }

    public static void main(String[] args) {
        Map<String, String> players= new HashMap<>();
        players.put("ST", "Lomelo Lukaku");
        players.put("ATM", "Kai Havertz");
        players.put("DF", "Thiago Silva");

        System.out.println(players);
    }
}
