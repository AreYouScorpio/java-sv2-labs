package introexceptiontrace.aquarium;

public class AquariumMain {
    public static void main(String[] args) {


    Aquarium aquarium = new Aquarium();


    Fish fish1 = new Fish("piranja", "zold");
    Fish fish2 = new Fish("ebihal", "fekete");
    Fish fish3 = new Fish("meleghal", "rózsaszín");

    aquarium.addFish(fish1);
    aquarium.addFish(fish2);
    aquarium.addFish(fish3);

        System.out.println(aquarium.getNumberOfFish());

}}


// az Aquarium osztályban kellett a listának példányosítás = new Arraylist<> , hogy jó legyen