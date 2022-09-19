public class PersonService {
    public void setAgeToEighteen(Person person) {
        person.setAge(18);
    }

    public void changePersonToDani(Person person) {
        person = new Person("Dani", 25);
    }
}
