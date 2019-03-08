import java.util.ArrayList;

public class VoteProcessor {
	int EdwardSnowdenVotes;
	int PopeFrancisVotes;

	public Object calculateElectionWinner(ArrayList<String> votes) {
		for (int i = 0; i < votes.size(); i++) {
			if (votes.get(i).equalsIgnoreCase("Pope Francis")) {
				PopeFrancisVotes++;
			}
			if (votes.get(i).equalsIgnoreCase("Edwqrd Snowden")) {
				EdwardSnowdenVotes++;
			}
			if (PopeFrancisVotes == EdwardSnowdenVotes) {
				return("TIE");
			}
			if (PopeFrancisVotes > EdwardSnowdenVotes) {
				return ("pope francis");
			}
			else {
				return("edward snowden");
			}
		}
		return null;
	}
}
