class Blowfish extends Fish {
    private boolean isPoisonous;

    // Constructors
    public Blowfish() {
        super();
        this.isPoisonous = true;
    }

    public Blowfish(String name, int age, double weight, String waterType, boolean isPoisonous) {
        super(name, age, weight, waterType);
        this.isPoisonous = isPoisonous;
    }

    public Blowfish(String name, boolean isPoisonous) {
        super(name, "Saltwater");
        this.isPoisonous = isPoisonous;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " (a Blowfish) is nibbling on small invertebrates.");
    }

    @Override
    public String getVoice() {
        return "A tiny bubble sound";
    }

    public void puffUp() {
        System.out.println(getName() + " is puffing up its body to deter predators!");
    }

    public boolean isPoisonous() { return isPoisonous; }
    public void setPoisonous(boolean isPoisonous) { this.isPoisonous = isPoisonous; }

    @Override
    public String toString() {
        return "Blowfish [isPoisonous=" + isPoisonous + ", " + super.toString() + "]";
    }
}