public class Zoo {
    public static void main(String[] args) {
        Animal[] zooAnimals = new Animal[6];


        zooAnimals[0] = new Dog("Buddy", 5, 25.0, "Golden", "Labrador");
        zooAnimals[1] = new Dog("Pugsy", "Pug");

        zooAnimals[2] = new Pigeon("Homer", 2, 0.5, "Rainbow", "Racing Homer");
        zooAnimals[3] = new Pigeon();

        zooAnimals[4] = new Blowfish("Puffy", 1, 0.8, "Saltwater", true);
        zooAnimals[5] = new Blowfish("Spike", false);

        System.out.println("### Zoo Animal Registry ###");
        for (Animal animal : zooAnimals) {
            System.out.println("---");
            System.out.println(animal.toString());
            animal.eat();
            System.out.println("Voice: " + animal.getVoice());

            if (animal instanceof Dog) {
                ((Dog) animal).fetch();
            } else if (animal instanceof Pigeon) {
                ((Pigeon) animal).navigate();
            } else if (animal instanceof Blowfish) {
                ((Blowfish) animal).puffUp();
            }
        }
    }
}