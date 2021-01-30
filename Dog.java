public class Dog extends Animal {
    public static int dogPopulation = 0;
    private int lengthBarrier;
    private int runLimit = 500;
    private int swimLimit = 10;

    {
        animalPopulation++;
        dogPopulation++;
    }

    public Dog (int lengthBarrier){
        this.lengthBarrier = lengthBarrier;
    }

    @Override
    public void run (int lengthBarrier){


        if (lengthBarrier <= runLimit) {
            System.out.println("Собака пробежала " + lengthBarrier + "м.");
        } else {
            System.out.println("Собака выдохлась пробежав " + runLimit + "м.");
        }
    }

    @Override
    public void swim (int lengthBarrier){
        if (lengthBarrier <= swimLimit) {
            System.out.println("Собака проплыла " + lengthBarrier + "м.");
        } else {
            System.out.println("Собака утонула проблыв " + swimLimit + "м.");
        }
    }

}
