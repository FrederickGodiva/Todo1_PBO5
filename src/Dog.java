class Dog {
    private String name;
    private double weight;
    private String breed;
    private String featherColor;

    Dog(String name, double weight, String breed, String featherColor) {
        this.name = name;
        this.weight = weight;
        this.breed = breed;
        this.featherColor = featherColor;
    }

    public void bark() {
        System.out.println("Woof...");
    }

    public void walk() {
        weight--;
    }

    public void eat() {
        weight++;
    }

    public void setName(String name) {
         this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return this.breed;
    }

    public void setFeatherColor(String featherColor) {
        this.featherColor = featherColor;
    }

    public String getFeatherColor() {
        return this.featherColor;
    }
}
