package com.algoExpert.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Tournament_winner
{
    public static void main(String[] args) {

        /*
        "competitions": [
    ["HTML", "C#"],
    ["C#", "Python"],
    ["Python", "HTML"]
  ],
  "results": [0, 0, 1]
         */

        ArrayList<Integer>results = new ArrayList<>();
        results.add(0);
        results.add(1);
        results.add(1);
       /* results.add(1);
        results.add(1);
        results.add(1);*/
        ArrayList<ArrayList<String>> competitions = new ArrayList<>();
        ArrayList<String> round1 = new ArrayList<>();
        round1.add("html");
        round1.add("java");

        ArrayList<String> round2 = new ArrayList<>();
        round2.add("java");
        round2.add("python");


        ArrayList<String> round3 = new ArrayList<>();
        round3.add("python");
        round3.add("html");

      /*  ArrayList<String> round4 = new ArrayList<>();
        round4.add("eagles");
        round4.add("bears");
        ArrayList<String> round5 = new ArrayList<>();
        round5.add("eagles");
        round5.add("monkey");
        ArrayList<String> round6 = new ArrayList<>();
        round6.add("bears");
        round6.add("monkey");*/



        competitions.add(round1);
        competitions.add(round2);
        competitions.add(round3);
  /*      competitions.add(round4);
        competitions.add(round5);
        competitions.add(round6);*/
        System.out.println(tournamentWinner(competitions,results));
    }

    private static String tournamentWinner(ArrayList<ArrayList<String>> competitions,
             ArrayList<Integer> results)
    {
        String currentWinner = "";
        String overAllwinningTeam  = "";
        Integer totalPointsForHomeTeam = 0;
        Integer totalPointsForAwayTeam = 0;
        Map<String,Integer> myTouramentScores = new HashMap<>();
        myTouramentScores.put(overAllwinningTeam,0);
        for (int i = 0; i < competitions.size() ; i++)
        {
            String mHomeTeamName = competitions.get(i).get(0);
            String mAwayTeamName = competitions.get(i).get(1);
            if(0 == results.get(i))
            {
                currentWinner = mAwayTeamName;
                if(myTouramentScores.containsKey(mAwayTeamName))
                    totalPointsForAwayTeam = myTouramentScores.get(mAwayTeamName)+3;
                else
                    totalPointsForAwayTeam = 3;
                myTouramentScores.put(mAwayTeamName,totalPointsForAwayTeam);

                //myTouramentScores.put(mAwayTeamName, myTouramentScores.getOrDefault(mAwayTeamName,0));


                if(myTouramentScores.containsKey(mHomeTeamName))
                    totalPointsForHomeTeam = myTouramentScores.get(mHomeTeamName);
                else
                    totalPointsForHomeTeam = 0;
                myTouramentScores.put(mHomeTeamName,totalPointsForHomeTeam);

            }else if (1 == results.get(i)){
                if(myTouramentScores.containsKey(mHomeTeamName))
                    totalPointsForHomeTeam = myTouramentScores.get(mHomeTeamName) + 3;
                else
                    totalPointsForHomeTeam = 3;
                myTouramentScores.put(mHomeTeamName,totalPointsForHomeTeam);
                if(myTouramentScores.containsKey(mAwayTeamName))
                    totalPointsForAwayTeam = myTouramentScores.get(mAwayTeamName);
                else
                    totalPointsForAwayTeam = 0;
                myTouramentScores.put(mAwayTeamName,totalPointsForAwayTeam);
                currentWinner = mHomeTeamName;
            }


            if(myTouramentScores.get(currentWinner) >= myTouramentScores.get(overAllwinningTeam))
            {
                overAllwinningTeam = currentWinner;
            }
        }



        return overAllwinningTeam;
    }
}
