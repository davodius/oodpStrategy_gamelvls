package org.example;

public class Game {

    // Field to hold the current reference to the current difficulty level.
    private DifficultyLevelStrategy difficultyLevelStrategy;

    // Game constructor for initializing the level of difficulty of the game
    public Game(DifficultyLevelStrategy difficultyLevelStrategy) {
        // initial difficulty level for the game
        // standard difficulty for start of game
        this.difficultyLevelStrategy = difficultyLevelStrategy;
    }

    // method to change the games difficulty level when running
    public void setDifficultyLevel(DifficultyLevelStrategy difficultyLevelStrategy) {
        //updates the difficulty level to the chosen one
        this.difficultyLevelStrategy = difficultyLevelStrategy;
    }

    // method to start or continue the game
    // by choosing the modifyGameRules from the chosen level
    // and setting it
    public void startGame() {
        difficultyLevelStrategy.modifyGameRules();
        // Other game logic ex. a timer
    }
}