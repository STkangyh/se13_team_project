package org.se13.view.tetris;

public record TetrisGameEndData(int winnerUserId, int score, boolean isItemMode, boolean isGameOvered, String difficulty) {

}
