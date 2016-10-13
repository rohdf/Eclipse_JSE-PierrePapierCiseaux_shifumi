package nsis.metier;

public interface Main {
	public Boolean gagneContre(Main uneMain);
	public Boolean perdContre(Pierre unePierre);
	public Boolean perdContre(Papier unPapier);
	public Boolean perdContre(Ciseaux unCiseaux);
}
