package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class RockPaperSissorsEvaluator {
    protected static final String ROCK = "rock";
    protected static final String PAPER = "paper";
    protected static final String SCISSOR = "scissor";

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective winning move
     */
    public String getWinningMove(String handSign) {
        String answer = "";
        if (handSign == ROCK){
            answer = PAPER;
        }
        else if (handSign == PAPER){
            answer = SCISSOR;
        }
        else if (handSign == SCISSOR){
            answer = ROCK;
        }
        return answer;
    }

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective losing move
     */
    public String getLosingMove(String handSign) {
        String answer = "";
        if (handSign == ROCK){
            answer = SCISSOR;
        }
        else if (handSign == PAPER){
            answer = ROCK;
        }
        else if (handSign == SCISSOR){
            answer = PAPER;
        }
        return answer;
    }

    /**
     * @param handSignOfPlayer1 a string representative of a hand sign of a player
     * @param handSignOfPlayer2 a string representative of a hand sign of a challenger
     * @return a string representative of the winning hand sign between the two players
     */
    public String getWinner(String handSignOfPlayer1, String handSignOfPlayer2) {
        String answer = "";
        if (handSignOfPlayer1 == ROCK && handSignOfPlayer2 == SCISSOR){
            answer = ROCK;
        }
        else if (handSignOfPlayer1 == ROCK && handSignOfPlayer2 == PAPER){
            answer = PAPER;
        }
        else if (handSignOfPlayer1 == PAPER && handSignOfPlayer2 == SCISSOR){
            answer = SCISSOR;
        }
        else if (handSignOfPlayer1 == PAPER && handSignOfPlayer2 == ROCK){
            answer = PAPER;
        }
        else if (handSignOfPlayer1 == SCISSOR && handSignOfPlayer2 == ROCK){
            answer = ROCK;
        }
        else if (handSignOfPlayer1 == SCISSOR && handSignOfPlayer2 == PAPER){
            answer = SCISSOR;
        }
        return answer;
    }
}
