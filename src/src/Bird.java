class Bird extends Animal {
    private String featherColor;

    // Constructors
    public Bird() {
        super();
        this.featherColor = "Gray";
    }

    public Bird(String name, int age, double weight, String featherColor) {
        super(name, age, weight);
        this.featherColor = featherColor;
    }

    public Bird(String name, double weight) {
        super(name, weight);
        this.featherColor = "Blue";
    }

    @Override
    public void eat() {
        System.out.println(getName() + " (a Bird) is pecking seeds.");
    }

    @Override
    public String getVoice() {
        return "Chirp! Chirp!";
    }

    public void layEgg() {
        System.out.println(getName() + " is laying an egg.");
    }

    public String getFeatherColor() { return featherColor; }
    public void setFeatherColor(String featherColor) { this.featherColor = featherColor; }

    @Override
    public String toString() {
        return "Bird [featherColor=" + featherColor + ", " + super.toString() + "]";
    }
}