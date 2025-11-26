class Dog extends Mammal {
    private String breed;

    public Dog() {
        super();
        this.breed = "Mixed";
    }

    public Dog(String name, int age, double weight, String furColor, String breed) {
        super(name, age, weight, furColor);
        this.breed = breed;
    }

    public Dog(String name, String breed) {
        super(name, 15.0);
        this.breed = breed;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " (a Dog) is happily eating kibble.");
    }

    @Override
    public String getVoice() {
        return "Woof! Woof!";
    }

    public void fetch() {
        System.out.println(getName() + " is fetching a ball!");
    }

    public String getBreed() { return breed; }
    public void setBreed(String breed) { this.breed = breed; }

    @Override
    public String toString() {
        return "Dog [breed=" + breed + ", " + super.toString() + "]";
    }
}