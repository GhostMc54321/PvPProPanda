package ScoreBoard;

import org.bukkit.entity.Player;

public class BlinkEffect {
	
	private int i = 1;
	private String texto = "§e§lKITPVP";
	public BlinkEffect(){
		
	}
	
	public void blink(){
	    final Player p = Player();
		if (i == 1){
			texto = "§k§lK§e§lITPVP";
			ScoreboardUpdater.Score(p);
		}
		if (i == 2){
			texto = "§e§lK§k§lI§e§lITPVP";
			ScoreboardUpdater.Score(p);
		}
		if (i == 3){
			texto = "§e§lKI§k§lT§e§lPVP";
			ScoreboardUpdater.Score(p);
		}
		if (i == 4){
			texto = "§e§lKIT§K§LP§E§LVP";
			ScoreboardUpdater.Score(p);
		}
		if (i == 5){
			texto = "§e§lKITP§k§lV§e§lP";
			ScoreboardUpdater.Score(p);
		}
		if (i == 6){
			texto = "§e§lKITPPV§k§lP";
			ScoreboardUpdater.Score(p);
		}
		if (i == 7){
			texto = "§e§lKITPV§k§lP";
			ScoreboardUpdater.Score(p);
		}
		if (i == 8){
			texto = "§e§lKITP§k§lV§e§lP";
			ScoreboardUpdater.Score(p);
		}
		if (i == 9){
			texto = "§e§lKIT§K§LP§e§lVP";
			ScoreboardUpdater.Score(p);
		}
		if (i == 10){
			texto = "§E§lKI§K§LT§E§LPVP";
			ScoreboardUpdater.Score(p);
		}
		if (i == 11){
			texto = "§e§lK§K§LI§E§LTPVP";
			ScoreboardUpdater.Score(p);
		}
		if (i == 12){
			texto = "§K§LK§E§LITPVP";
			ScoreboardUpdater.Score(p);
		}
		if (i == 13){
			texto = "";
		}
		if (i == 14){
			texto = "§6§lMASTERKITS";
			ScoreboardUpdater.Score(p);
		}
		if (i == 15){
			texto = "";
		}
		if (i == 16){
			texto = "§E§LMASTERKITS";
			ScoreboardUpdater.Score(p);
		}
		if (i == 17){
			texto = "§F§LMASTERKITS";
			ScoreboardUpdater.Score(p);
			i = 0;
		}
		i++;
		
		
	}
	private Player Player() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getText(){
		return texto;
	}

}
