package Game;

import Game.constants.Position;

public class TestGame {
    public static void TryGame() {
        Team bulls = new Team("Chicago Bulls");
        bulls.setPlayer(Position.SHOOTING_GUARD, "Michael Jordan");
        bulls.setPlayer(Position.SMALL_FORWARD, "Scottie Pippen");
        bulls.setPlayer(Position.POWER_FORWARD, "Dennis Rodman");
        bulls.setPlayer(Position.CENTER, "Bill Wennington");
        bulls.setPlayer(Position.POINT_GUARD, "Randy Brown");

        Team pistons = new Team("Detroit Pistons");
        pistons.setPlayer(Position.SHOOTING_GUARD, "Joe Dumars");
        pistons.setPlayer(Position.SMALL_FORWARD, "Grant Hill");
        pistons.setPlayer(Position.POWER_FORWARD, "Otis Thorpe");
        pistons.setPlayer(Position.CENTER, "William Bedford");
        pistons.setPlayer(Position.POINT_GUARD, "Isiah Thomas");

        Game game = new Game("Etihad Stadium");
        game.begin(bulls, pistons);
        System.out.println(game.details());

        try{
            Position pos1 = Position.valueOf("SHOOTING_GUARD");
            Position pos2 = Position.valueOf("SHOOTING_GUARd");
            Position pos3 = Position.valueOf("SHG_GUARd");
            System.out.println("1: " + pos1 + "\n2: " + pos2 + "\n3: " + pos3);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
