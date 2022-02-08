
public class AnimalFactory {

	public AnimalFactory() {}
	
	public Animal getAnimal(AnimalEnum type)
	{
		Animal retval = null;
		switch(type) {
		case Cat:
			retval = new Cat();
			break;
		case Dog:
			retval = new Dog();
			break;
		}
		return retval;
	}

}
