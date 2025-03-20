package org.howard.edu.lsp.midterm.question3;

import java.util.HashMap;
import java.util.Map;

public class VotingMachine {
    private Map<String, Integer> votes = new HashMap<>();

    public void addCandidate(String name) {
        votes.putIfAbsent(name, 0);
    }

    public boolean castVote(String name) {
        if (votes.containsKey(name)) {
            votes.put(name, votes.get(name) + 1);
            return true;
        }
        return false;
    }

    public String getWinner() {
        return votes.entrySet()
                    .stream()
                    .max((entry1, entry2) -> entry1.getValue() - entry2.getValue())
                    .map(entry -> entry.getKey() + " WINS with " + entry.getValue() + " votes!!")
                    .orElse("No votes cast.");
    }
}

