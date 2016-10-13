package nsis.metier;

public class Papier implements Main{

	@Override
	public Boolean gagneContre(Main uneMain) {
		return uneMain.perdContre(this);

	}

	@Override
	public Boolean perdContre(Pierre unePierre) {
		return false;
	}

	@Override
	public Boolean perdContre(Papier unPapier) {
		return null;
	}

	@Override
	public Boolean perdContre(Ciseaux unCiseaux) {
		return true;
	}

}
