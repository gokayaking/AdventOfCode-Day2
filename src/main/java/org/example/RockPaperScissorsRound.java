package org.example;

public class RockPaperScissorsRound {

    private RockPaperScissorsAction opponentSelection = null;
    private RockPaperScissorsAction mySelection = null;


    public RockPaperScissorsRound(RockPaperScissorsAction opponentSelection, RockPaperScissorsAction mySelection) {
        this.opponentSelection = opponentSelection;
        this.mySelection = mySelection;
    }

    public RockPaperScissorsAction getOpponentSelection() {
        return opponentSelection;
    }

    public void setOpponentSelection(RockPaperScissorsAction opponentSelection) {
        this.opponentSelection = opponentSelection;
    }

    public RockPaperScissorsAction getMySelection() {
        return mySelection;
    }

    public void setMySelection(RockPaperScissorsAction mySelection) {
        this.mySelection = mySelection;
    }

/*    Rock Paper and Scissor is a hand game usually played among two people where both the people form one of three objects (Rock, Paper, or Scissors) with an outstretched hand. The winner is decided based on the following:

    Rock beats Scissor (Rock smashes Scissor)
    Scissors beats Paper (Scissor cuts Paper)
    Paper beats Rock (Paper wraps Rock)*/

    public RockPaperScissorsResult deriveMyRoundResult() {

        if (opponentSelection.equals(RockPaperScissorsAction.ROCK) ) {

            if( mySelection.equals( RockPaperScissorsAction.ROCK ) ) {
                return RockPaperScissorsResult.TIE;
            }
            else if( mySelection.equals( RockPaperScissorsAction.SCISSORS ) ) {
                return RockPaperScissorsResult.LOSE;
            }
            else { // if( mySelection.equals( RockPaperScissorsAction.PAPER ) ) {
                return RockPaperScissorsResult.WIN;
            }
        }
        else if (opponentSelection.equals(RockPaperScissorsAction.SCISSORS) ) {

            if( mySelection.equals( RockPaperScissorsAction.ROCK ) ) {
                return RockPaperScissorsResult.WIN;
            }
            else if( mySelection.equals( RockPaperScissorsAction.SCISSORS ) ) {
                return RockPaperScissorsResult.TIE;
            }
            else { // if( mySelection.equals( RockPaperScissorsAction.PAPER ) ) {
                return RockPaperScissorsResult.LOSE;
            }

        }
        else { // if (opponentSelection.equals(RockPaperScissorsAction.PAPER) ) {

            if( mySelection.equals( RockPaperScissorsAction.ROCK ) ) {
                return RockPaperScissorsResult.LOSE;
            }
            else if( mySelection.equals( RockPaperScissorsAction.SCISSORS ) ) {
                return RockPaperScissorsResult.WIN;
            }
            else { // if( mySelection.equals( RockPaperScissorsAction.PAPER ) ) {
                return RockPaperScissorsResult.TIE;
            }
        }

    }

    public int deriveScoreForRound() {

        int scoreForRound = 0;

        // update for my selection
        // the score for the shape you selected (1 for Rock, 2 for Paper, and 3 for Scissors)
        if( getMySelection() == RockPaperScissorsAction.ROCK ) {
            scoreForRound += 1;
        }
        else if( getMySelection() == RockPaperScissorsAction.PAPER ) {
            scoreForRound += 2;
        }
        else { // if (getMySelection() == RockPaperScissorsAction.SCISSORS) {
                scoreForRound += 3;
        }

        // update for winner
        // the score for the outcome of the round (0 if you lost, 3 if the round was a draw, and 6 if you won)
        RockPaperScissorsResult roundResult = deriveMyRoundResult();

        if ( roundResult == RockPaperScissorsResult.LOSE) {
            scoreForRound += 0;
        } else if (roundResult == RockPaperScissorsResult.TIE) {
            scoreForRound += 3;
        } else { // if ( roundResult == RockPaperScissorsResult.WIN ) {
            scoreForRound += 6;
        }

        return scoreForRound;
    }

                @Override
    public String toString() {
        return "RockPaperScissorsRound{" +
                "opponentSelection=" + opponentSelection +
                ", mySelection=" + mySelection +
                '}';
    }
}
