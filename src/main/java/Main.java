import fr.esgi.Game;
import fr.esgi.Player;

public class Main {

    public static void main(String[] args) {
        // instantiate each part of the game
        Player sacha = new Player("Sacha");
        Player souleman = new Player("Souleman");
        Game game = new Game(sacha, souleman);

        // start the game
        game.start(sacha, souleman);

        // check the point of each player
        System.out.println("Sacha score : " + sacha.getScore());
        System.out.println("Souleman score : " + souleman.getScore());
        System.out.println("------------------------------");

        // play the game
        game.winPoints(sacha);
        game.winPoints(souleman);
        game.winPoints(sacha);
        game.winPoints(souleman);
        game.winPoints(sacha);

        // deuce rule
        game.winThePointWhenGameIsDeuce(souleman);

        // check the state of the game
        System.out.println("------------------------------");
        System.out.println(game);
        System.out.println("------------------------------");

        // advantage rule
        game.winThePointOfTheAdvantage(sacha);

        // check the state of the rule deuce with advantage
        System.out.println(sacha);
        System.out.println(souleman);

        System.out.println("------------------------------");

        // player win the game
        game.winThePointWhenGameIsDeuce(sacha);

        System.out.println("------------------------------");

        // check the score of the game win of sacha
        System.out.println(sacha);

    }
}
