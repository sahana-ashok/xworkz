package interfacesimpl.run;

public class VoteImpli implements Vote {
    @Override
    public void castVote() {
        System.out.println("Vote is casted");
    }

    @Override
    public void verifyVoter() {
        System.out.println("Voter is verified");
    }

    @Override
    public void countVote() {
        System.out.println("Votes are being counted");
    }

    @Override
    public void right() {
        System.out.println("voting is a fundamental right");
    }
}
