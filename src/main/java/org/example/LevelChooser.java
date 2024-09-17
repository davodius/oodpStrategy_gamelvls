package org.example;

public class LevelChooser implements DifficultyLevelStrategy  {
    // Use lambda in main
    @Override
    public void modifyGameRules() {
        // Modify game rules for game


         class EasyLevel implements DifficultyLevelStrategy {

            public void modifyGameRules() {
                // Modify game rules for easy level
                System.out.println("Game rules for easy level: Time limit increased, scoring simplified. ");
                //Update logic
            }
        }

        class MediumLevel implements DifficultyLevelStrategy {

            public void modifyGameRules() {
                // Modify game rules for medium level
                System.out.println("Game rules for medium level: Standard time limit and scoring. ");
            }
        }

        class HardLevel implements DifficultyLevelStrategy {

            public void modifyGameRules() {
                // Modify game rules for hard level
                System.out.println("Game rules for hard level: Time limit reduced, complex scoring.");
            }
        }



    }
}
