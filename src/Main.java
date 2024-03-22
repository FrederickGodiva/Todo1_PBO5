public class Main {
    public static void main(String[] args) {
        Dog bruno = new Dog("Bruno", 60.0, "Beagle", "Superblack");
        Dog spark = new Dog("Spark", 32.0, "Chihuahua", "Gold");
        Dog momo = new Dog("Momo", 20.0, "German Shepherd", "Brown");

        bruno.walk();
        bruno.walk();
        bruno.walk();
        bruno.eat();
        System.out.println(bruno.getName());
        System.out.println("=============");
        System.out.println("Weight: " + bruno.getWeight());
        System.out.println("Breed: " + bruno.getBreed());
        System.out.println("Feather color: " + bruno.getFeatherColor());

        System.out.println("\n\n");

        spark.walk();
        spark.walk();
        spark.walk();
        spark.eat();
        System.out.println(spark.getName());
        System.out.println("=============");
        System.out.println("Weight: " + spark.getWeight());
        System.out.println("Breed: " + spark.getBreed());
        System.out.println("Feather color: " + spark.getFeatherColor());

        System.out.println("\n\n");

        momo.walk();
        momo.walk();
        momo.walk();
        momo.eat();
        System.out.println(momo.getName());
        System.out.println("=============");
        System.out.println("Weight: " + momo.getWeight());
        System.out.println("Breed: " + momo.getBreed());
        System.out.println("Feather color: " + momo.getFeatherColor());
    }
}