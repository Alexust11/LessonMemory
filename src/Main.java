public class Main {
    public static void main(String[] args) {
        PersonService personService = new PersonService();
        Person sarah = new Person("sara", 30);
        personService.setAgeToEighteen(sarah);

        System.out.println("sarah.getAge() = " + sarah.getAge());
        personService.changePersonToDani(sarah);
        System.out.println("sarah.getAge() = " + sarah.getAge());

    }
}