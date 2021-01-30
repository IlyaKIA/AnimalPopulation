public class Main {

    public static void main(String[] args) {
        int lengthBarrier = 100;
        Dog dog = new Dog(lengthBarrier);
        Cat cat = new Cat(lengthBarrier);
        Animal cat2 = new Cat(lengthBarrier);
        Cat cat3 = new Cat(lengthBarrier);

        System.out.println("Популяция особей животных: " + cat.animalPopulation + ". Собак: " + dog.dogPopulation + ". Котов: " + cat.catPopulation + ".");
        System.out.println();

        dog.run(lengthBarrier);
        dog.swim(lengthBarrier);

        cat.run(lengthBarrier);
        cat.swim(lengthBarrier);

    }
}
