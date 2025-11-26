class Pigeon extends Bird {
    private String species;

    public Pigeon() {
        super();
        this.species = "Rock Dove";
    }

    public Pigeon(String name, int age, double weight, String featherColor, String species) {
        super(name, age, weight, featherColor);
        this.species = species;
    }

    public Pigeon(String name, String species) {
        super(name, 0.4);
        this.species = species;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " (a Pigeon) is eating bread crumbs.");
    }

    @Override
    public String getVoice() {
        return "Coo! Coo!";
    }

    public void navigate() {
        System.out.println(getName() + " is using its homing instinct to navigate.");
    }

    public String getSpecies() { return species; }
    public void setSpecies(String species) { this.species = species; }

    @Override
    public String toString() {
        return "Pigeon [species=" + species + ", " + super.toString() + "]";
    }
}