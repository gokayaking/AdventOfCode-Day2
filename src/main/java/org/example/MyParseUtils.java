package org.example;

import org.example.RockPaperScissorsAction;

public class MyParseUtils {

    public static RockPaperScissorsAction mapOpponentInputToSelection(String input ) {
        if( input.equals( "A") ) {
            return RockPaperScissorsAction.ROCK;
        }
        else if ( input.equals( "B" ) ) {
            return RockPaperScissorsAction.PAPER;
        }
        else { //if ( input.equals( "C" ) ) {
            return RockPaperScissorsAction.SCISSORS;
        }
    }

    public static RockPaperScissorsAction mapMyInputToSelection(String input ) {
        if( input.equals( "X") ) {
            return RockPaperScissorsAction.ROCK;
        }
        else if ( input.equals( "Y" ) ) {
            return RockPaperScissorsAction.PAPER;
        }
        else { //if ( input.equals( "Z" ) ) {
            return RockPaperScissorsAction.SCISSORS;
        }
    }

    public static RockPaperScissorsResult mapMyInputToResult(String input ) {

        if( input.equals( "X") ) {
            return RockPaperScissorsResult.LOSE;
        }
        else if ( input.equals( "Y" ) ) {
            return RockPaperScissorsResult.TIE;
        }
        else { //if ( input.equals( "Z" ) ) {
            return RockPaperScissorsResult.WIN;
        }
    }


    public static RockPaperScissorsRound parseInputForExercise1( String strCurrentLine ) {

        RockPaperScissorsRound aRound = null;

        try {

            String[] splitted = strCurrentLine.split(" ");

            if( splitted.length == 2 ) {

                RockPaperScissorsAction opponentSelection = mapOpponentInputToSelection( splitted[0] );
                RockPaperScissorsAction mySelection = mapMyInputToSelection( splitted[1] );

                aRound = new RockPaperScissorsRound( opponentSelection, mySelection );
            }
            else {
                System.out.println( "FAILURE! Failure parsing input:'" + strCurrentLine + "'  Need 2 items!" );
            }
        }
        catch( Exception anException ) {
            System.out.println( "FAILURE! Failure parsing input:'" + strCurrentLine + "'" );
        }

        return aRound;
    }


    public static RockPaperScissorsRoundExercise2 parseInputForExercise2(String strCurrentLine ) {

        RockPaperScissorsRoundExercise2 aRound = null;

        try {

            String[] splitted = strCurrentLine.split(" ");

            if( splitted.length == 2 ) {

                RockPaperScissorsAction opponentSelection = mapOpponentInputToSelection( splitted[0] );
                RockPaperScissorsResult myResult = mapMyInputToResult( splitted[1] );

                aRound = new RockPaperScissorsRoundExercise2( opponentSelection, myResult );
            }
            else {
                System.out.println( "FAILURE! Failure parsing input:'" + strCurrentLine + "'  Need 2 items!" );
            }
        }
        catch( Exception anException ) {
            System.out.println( "FAILURE! Failure parsing input:'" + strCurrentLine + "'" );
        }

        return aRound;
    }

    public static Integer parseCalories( String strCurrentLine ) {

        Integer aFoodItem = null;

        try {
            aFoodItem = Integer.parseInt(strCurrentLine);
        }
        catch( Exception anException ) {
            System.out.println( "FAILURE! Failure parsing input:'" + strCurrentLine + "'" );
        }

        return aFoodItem;
    }
}
