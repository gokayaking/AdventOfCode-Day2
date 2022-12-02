package org.example;

public class RockPaperScissorsRoundExercise2 {

    private RockPaperScissorsAction opponentSelection = null;
    private RockPaperScissorsResult myResult = null;


    public RockPaperScissorsRoundExercise2(RockPaperScissorsAction opponentSelection, RockPaperScissorsResult myResult) {
        this.opponentSelection = opponentSelection;
        this.myResult = myResult;
    }

    public RockPaperScissorsAction getOpponentSelection() {
        return opponentSelection;
    }

    public void setOpponentSelection(RockPaperScissorsAction opponentSelection) {
        this.opponentSelection = opponentSelection;
    }

    public RockPaperScissorsResult getMyResult() {
        return myResult;
    }

    public void setMyResult(RockPaperScissorsResult myResult) {
        this.myResult = myResult;
    }

/*    Rock Paper and Scissor is a hand game usually played among two people where both the people form one of three objects (Rock, Paper, or Scissors) with an outstretched hand. The winner is decided based on the following:

    Rock beats Scissor (Rock smashes Scissor)
    Scissors beats Paper (Scissor cuts Paper)
    Paper beats Rock (Paper wraps Rock)*/

    public RockPaperScissorsAction deriveMyRoundAction() {

        if (opponentSelection.equals(RockPaperScissorsAction.ROCK) ) {

            if( myResult.equals( RockPaperScissorsResult.LOSE ) ) {
                return RockPaperScissorsAction.SCISSORS;
            }
            else if( myResult.equals( RockPaperScissorsResult.TIE ) ) {
                return RockPaperScissorsAction.ROCK;
            }
            else { // if( myResult.equals( RockPaperScissorsResult.WIN ) ) {
                return RockPaperScissorsAction.PAPER;
            }
        }
        else if (opponentSelection.equals(RockPaperScissorsAction.SCISSORS) ) {

            if( myResult.equals( RockPaperScissorsResult.LOSE ) ) {
                return RockPaperScissorsAction.PAPER;
            }
            else if( myResult.equals( RockPaperScissorsResult.TIE ) ) {
                return RockPaperScissorsAction.SCISSORS;
            }
            else { // if( myResult.equals( RockPaperScissorsResult.WIN ) ) {
                return RockPaperScissorsAction.ROCK;
            }

        }
        else { // if (opponentSelection.equals(RockPaperScissorsAction.PAPER) ) {

            if( myResult.equals( RockPaperScissorsResult.LOSE ) ) {
                return RockPaperScissorsAction.ROCK;
            }
            else if( myResult.equals( RockPaperScissorsResult.TIE ) ) {
                return RockPaperScissorsAction.PAPER;
            }
            else { // if( myResult.equals( RockPaperScissorsResult.WIN ) ) {
                return RockPaperScissorsAction.SCISSORS;
            }
        }

    }

    public int deriveScoreForRound() {

        int scoreForRound = 0;


        // derive action to take
        RockPaperScissorsAction mySelection = deriveMyRoundAction();

        // update for my selection
        // the score for the shape you selected (1 for Rock, 2 for Paper, and 3 for Scissors)
        if( mySelection == RockPaperScissorsAction.ROCK ) {
            scoreForRound += 1;
        }
        else if( mySelection == RockPaperScissorsAction.PAPER ) {
            scoreForRound += 2;
        }
        else { // if (mySelection == RockPaperScissorsAction.SCISSORS) {
            scoreForRound += 3;
        }


        if ( getMyResult() == RockPaperScissorsResult.LOSE) {
            scoreForRound += 0;
        } else if (getMyResult() == RockPaperScissorsResult.TIE) {
            scoreForRound += 3;
        } else { // if ( getMyResult() == RockPaperScissorsResult.WIN ) {
            scoreForRound += 6;
        }

        return scoreForRound;
    }


}
