package magacin;

import java.util.Date;

public class KucnaHemija extends Artikal{

	public Date rokTrajanja;

	public Date getRokTrajanja() {
		return rokTrajanja;
	}

	public void setRokTrajanja(Date rokTrajanja) {
		//validacija
		this.rokTrajanja = rokTrajanja;
	}
	
}
