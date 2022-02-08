package shopping;

/* Il pattern del Factory Method ha lo svantaggio che per ogni classe ConcreteObjectN (scarpaTennis) occorre definire
una sottoclasse CreatorN (CommessoTennis) corrispondente.*/

public class Cliente {

	public static void main(String[] args) {
		Commesso commesso = new Commesso();
		Scarpe scarpe = commesso.getScarpe("ginnastica");
		System.out.println(scarpe.getClass());
	}

}
