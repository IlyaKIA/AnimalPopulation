public class Cat extends Animal {
    public static int catPopulation = 0;
    private int lengthBarrier;
    private int runLimit = 200;

    {
        animalPopulation++;
        catPopulation++;
    }

    public Cat (int lengthBarrier){
        this.lengthBarrier = lengthBarrier;
    }

    @Override
    public void run (int lengthBarrier){
        if (lengthBarrier <= runLimit) {
            System.out.println("Кошка пробежала " + lengthBarrier + "м.");
        } else {
            System.out.println("Кошка выдохлась пробежав " + runLimit + "м.");
        }
    }

    @Override
    public void swim (int lengthBarrier){
        System.out.println("Кошка утонула. Она не умеет плавать!");
    }
}
