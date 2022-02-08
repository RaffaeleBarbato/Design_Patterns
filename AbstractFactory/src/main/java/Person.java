
class Person
{
  public int id;
  public String name;

  public Person(int id, String name)
  {
    this.id = id;
    this.name = name;
  }
}
//implementare un metodo createPerson nella classe non statica PersonFactory che istanzia una nuova Persona
//la nuova persona ha come nome il name passato come parametro e id che parte da 0 per la prima persona, 1 per la successiva etc.
class PersonFactory
{
  private int id = 0;

  public Person createPerson(String name)
  {
    return new Person(id++, name);
  }
}