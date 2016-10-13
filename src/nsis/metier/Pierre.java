package nsis.metier;

public class Pierre implements Main{

	@Override
	public Boolean gagneContre(Main uneMain) {
		return uneMain.perdContre(this);
	}

	@Override
	public Boolean perdContre(Pierre unePierre) {
		return null;
	}

	@Override
	public Boolean perdContre(Papier unPapier) {
		return true;
	}

	@Override
	public Boolean perdContre(Ciseaux unCiseaux) {
		return false;
	}
	
}
