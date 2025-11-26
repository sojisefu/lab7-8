class Mammal extends Animal {
    private String furColor;

    public Mammal() {
        super();
        this.furColor = "Brown";
    }

    public Mammal(String name, int age, double weight, String furColor) {
        super(name, age, weight);
        this.furColor = furColor;
    }

    public Mammal(String name, double weight) {
        super(name, weight);
        this.furColor = "Black";
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is a mammal and is nursing or chewing.");
    }

    @Override
    public String getVoice() {
        return "Mammalian sound";
    }

    public void regulateTemperature() {
        System.out.println(getName() + " is regulating its body temperature.");
    }

    public String getFurColor() { return furColor; }
    public void setFurColor(String furColor) { this.furColor = furColor; }

    @Override
    public String toString() {
        return "Mammal [furColor=" + furColor + ", " + super.toString() + "]";
    }
}