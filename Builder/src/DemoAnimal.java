
public class DemoAnimal {

	public static void main(String[] args) {
		/*
		Animal pluto2 = AnimalBuilder.newBuilder("0000001")
				 .name("0000001")
				 .pedigreeName("PlutoSecondo")
				 .owner("Marco Rossi")
				 .race("labrador")
				 .residence("Via x")
				 .isVaccinated(true)
				 .isChampion(false)
				 .sons(null)
				 .sex(Animal.Sex.MALE)
				 .weight(40.5)
				 .height(30.0)
				 .build();
				 
				 //System.out.println(pluto2.toString());
		*/
		AnimalBuilder animalBuilder = AnimalBuilder.newBuilder("0000001")
				 .name("pluto")
				 .pedigreeName("PlutoSecondo")
				 .owner("Marco Rossi")
				 .race("labrador")
				 .residence("Via x")
				 .isVaccinated(true)
				 .isChampion(false)
				 .sons(null)
				 .sex(Animal.Sex.MALE)
				 .weight(40.5)
				 .height(30.0);
		
		//creo un animal, un clone di animal e un terzo clone di sesso opposto.
		Animal animal3A = animalBuilder.build();
		Animal animal3AClone = animalBuilder.build();
		Animal animal3B = animalBuilder.sex(Animal.Sex.FEMALE).build();

	}

}
