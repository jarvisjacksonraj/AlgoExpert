package dev.jacksonraj.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TournamentWinner {

    public String tournamentWinner(ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
        HashMap<String, Integer> TeamMap = new HashMap<>();
        for (int i = 0; i < competitions.size(); i++) {
            String team = competitions.get(i).get(0);
            if (!TeamMap.containsKey(team)) {
                TeamMap.put(team, 0);
            }
        }
        updateTeamScore(competitions, results, TeamMap);
        String tournamentWinner = findTopScorer(TeamMap);
        return tournamentWinner;
    }

    private String findTopScorer(HashMap<String, Integer> map) {
        int topPoints = Integer.MIN_VALUE;
        String tournamentWinner = "";
        Iterator<Map.Entry<String, Integer>> mapIterator = map.entrySet().iterator();

        while (mapIterator.hasNext()) {
            Map.Entry<String, Integer> entry = mapIterator.next();
            if (topPoints < entry.getValue()) {
                topPoints = entry.getValue();
                tournamentWinner = entry.getKey();
            }
        }
        return tournamentWinner;
    }

    private void updateTeamScore(ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results, HashMap<String, Integer> TeamMap) {
        for (int i = 0; i < results.size(); i++) {
            String awayTeam = competitions.get(i).get(1);
            String homeTeam = competitions.get(i).get(0);
            if (results.get(i) == 0) {
                TeamMap.put(awayTeam, TeamMap.getOrDefault(awayTeam, 0) + 3);
            } else if (results.get(i) == 1) {
                TeamMap.put(homeTeam, TeamMap.getOrDefault(homeTeam, 0) + 3);
            }
        }
    }
}
