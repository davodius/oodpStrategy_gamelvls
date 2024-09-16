package org.example;

public class Main {
    public static void main(String[] args) {

        DifficultyLevelStrategy easyLevel = () -> System.out.println("Game rules for easy level: Time limit increased, scoring simplified.");
        DifficultyLevelStrategy mediumLevel = () -> System.out.println("Game rules for medium level: Standard time limit and scoring.");
        DifficultyLevelStrategy hardLevel = () -> System.out.println("Game rules for hard level: Time limit reduced, complex scoring.");


        Game game = new Game(new EasyLevel());

        game.startGame();  // Start game with easy difficulty

        game.setDifficultyLevel(new MediumLevel());
        game.startGame();  // Switch to medium difficulty

        game.setDifficultyLevel(new HardLevel());
        game.startGame();  // Play on hard difficulty

    }
}
