public class p5 {

    interface Animal {
        void sound();
    }

    interface Dog extends Animal {
    }

    interface Wolf extends Animal {
        void amIWolf();
    }

    interface Cat extends Animal {
        void canIMeow();
    }

    class StreetDog implements Dog {
        String Name = "StreetDog", Sound = "Barks";

        @Override
        public void sound() {
            print("Sound of " + Name + ": " + Sound + ".");
        }

        public void who() {
            print("I am " + Name + ".");
        }
    }

    class DogWolfCat extends StreetDog implements Wolf, Cat {
        DogWolfCat() {
            Name = "DogWolfCat";
            Sound = "Scientists are still figuring out";
        }

        @Override
        public void amIWolf() {
            print("Am I wolf: Probably Yes.");
        }

        @Override
        public void canIMeow() {
            print("Can I Meow: Not really sure about that.");
        }
    }

    p5() {
        StreetDog SD = new StreetDog();
        DogWolfCat DWC = new DogWolfCat();

        SD.who();
        SD.sound();

        DWC.who();
        DWC.sound();
        DWC.amIWolf();
        DWC.canIMeow();
    }

    void print(String text) {
        System.out.println(text);
    }

    public static void main(String[] args) {
        new p5();
    }
}