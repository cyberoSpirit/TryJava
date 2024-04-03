package Game;

import java.util.HashMap;
import java.util.Map;

import Game.constants.Position;

public class Team {

    private String name;
    private Map<Position, String> players;

    public Team(String name) {
        this.name = name;
        this.players = new HashMap<>();
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank())
            throw new IllegalArgumentException("Name cannot be null/blank");
        this.name = name;
    }

    public String getPlayer(Position position) {
        return this.players.get(position);
    }

    public void setPlayer(Position position, String player) {
        if (position == null)
            throw new IllegalArgumentException("Position cannot be null");

        if (!position.equals(Position.SHOOTING_GUARD)
                && !position.equals(Position.SMALL_FORWARD)
                && !position.equals(Position.POWER_FORWARD)
                && !position.equals(Position.CENTER)
                && !position.equals(Position.POINT_GUARD)) {
            throw new IllegalArgumentException("INVALID POSITION");
        }
        this.players.put(position, player);
    }
    
}

