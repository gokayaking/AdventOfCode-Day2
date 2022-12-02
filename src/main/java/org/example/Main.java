package org.example;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {

        // exercise1();
        exercise2();
    }


    public static void exercise1() {

        String fileName = "/Users/todd/IdeaProjects/AdventOfCode-Day2/input/Day2_input.txt";
        FileInputStream inputStream = null;

        Path path = FileSystems.getDefault().getPath(".").toAbsolutePath();
        System.out.println( "Current path is:'" + path + "'" );

        try {

            int totalScore = 0;

            int lineCount = 0;
            String strCurrentLine = null;
            BufferedReader reader = new BufferedReader( new FileReader( fileName ) );

            while ((strCurrentLine = reader.readLine()) != null) {

                // System.out.println(strCurrentLine);

                if( !MyStringUtils.isBlank( strCurrentLine ) ) {

                    lineCount++;

                    // parse input
                    RockPaperScissorsRound aRound = MyParseUtils.parseInputForExercise1( strCurrentLine );

                    if( aRound != null ) {

                        int scoreForRound = aRound.deriveScoreForRound();

                        totalScore += scoreForRound;

                        System.out.println( "Total Score:'" + totalScore + "' after adding score for round:'" + scoreForRound + "'" );
                    }
                    else {
                        System.out.println( "FAILURE! Parsing string:'" + strCurrentLine + "'" );
                    }
                }
            }

            System.out.println( "Total Score:'" + totalScore + "' for lines:'" + lineCount + "'"  );
        }
        catch( FileNotFoundException anException ) {
            System.out.println( "FAILURE! File:'" + fileName + "' not found! ");
        }
        catch( Exception anException ) {
            System.out.println( "FAILURE! Due to exeption:'" + anException.toString() + "'" );
        }
    }

    public static void exercise2() {

        String fileName = "/Users/todd/IdeaProjects/AdventOfCode-Day2/input/Day2_input.txt";
        FileInputStream inputStream = null;

        Path path = FileSystems.getDefault().getPath(".").toAbsolutePath();
        System.out.println( "Current path is:'" + path + "'" );

        try {

            int totalScore = 0;

            int lineCount = 0;
            String strCurrentLine = null;
            BufferedReader reader = new BufferedReader( new FileReader( fileName ) );

            while ((strCurrentLine = reader.readLine()) != null) {

                // System.out.println(strCurrentLine);

                if( !MyStringUtils.isBlank( strCurrentLine ) ) {

                    lineCount++;

                    // parse input
                    RockPaperScissorsRoundExercise2 aRound = MyParseUtils.parseInputForExercise2( strCurrentLine );

                    if( aRound != null ) {

                        int scoreForRound = aRound.deriveScoreForRound();

                        totalScore += scoreForRound;

                        System.out.println( "Total Score:'" + totalScore + "' after adding score for round:'" + scoreForRound + "'" );
                    }
                    else {
                        System.out.println( "FAILURE! Parsing string:'" + strCurrentLine + "'" );
                    }
                }
            }

            System.out.println( "Total Score:'" + totalScore + "' for lines:'" + lineCount + "'"  );
        }
        catch( FileNotFoundException anException ) {
            System.out.println( "FAILURE! File:'" + fileName + "' not found! ");
        }
        catch( Exception anException ) {
            System.out.println( "FAILURE! Due to exeption:'" + anException.toString() + "'" );
        }
    }
}