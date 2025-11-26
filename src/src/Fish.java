class Fish extends Animal {
    private String waterType;

    // Constructors
    public Fish() {
        super();
        this.waterType = "Freshwater";
    }

    public Fish(String name, int age, double weight, String waterType) {
        super(name, age, weight);
        this.waterType = waterType;
    }

    public Fish(String name, String waterType) {
        super(name, 0.2); // Using a partial constructor from Animal
        this.waterType = waterType;
    }

    // Abstract methods implementation
    @Override
    public void eat() {
        System.out.println(getName() + " (a Fish) is gulping food pellets.");
    }

    @Override
    public String getVoice() {
        return "Blub blub (no real voice)";
    }

    public void swim() {
        System.out.println(getName() + " is swimming gracefully.");
    }

    public String getWaterType() { return waterType; }
    public void setWaterType(String waterType) { this.waterType = waterType; }

    @Override
    public String toString() {
        return "Fish [waterType=" + waterType + ", " + super.toString() + "]";
    }
}