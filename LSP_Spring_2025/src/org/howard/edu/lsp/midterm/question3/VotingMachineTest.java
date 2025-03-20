package org.howard.edu.lsp.midterm.question3;

public class VotingMachineTest {
    public static void main(String[] args) {
        VotingMachine vm = new VotingMachine();

        vm.addCandidate("Alice");
        vm.addCandidate("Bob");
        vm.addCandidate("Charlie");

        vm.castVote("Alice");
        vm.castVote("Alice");
        vm.castVote("Bob");
        vm.castVote("Charlie");
        vm.castVote("Charlie");
        vm.castVote("Charlie");

        System.out.println("Vote for Eve successful? " + vm.castVote("Eve"));
        System.out.println("Winner: " + vm.getWinner());
    }
}
