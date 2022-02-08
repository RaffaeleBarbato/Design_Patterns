package shopping;

//Sottoclasse di Creator
public class CommessoGinnastica extends Commesso{
	public static Scarpe getScarpe() {
		return new ScarpeGinnastica();
	}
}
