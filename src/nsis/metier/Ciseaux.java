package nsis.metier;


public class Ciseaux implements Main{

	@Override
	public Boolean gagneContre(Main uneMain) {
		return uneMain.perdContre(this);
	}

	@Override
	public Boolean perdContre(Pierre unePierre) {
		return true;
	}

	@Override
	public Boolean perdContre(Papier unPapier) {
		return false;
	}

	@Override
	public Boolean perdContre(Ciseaux unCiseaux) {
		return null;
	}

}
