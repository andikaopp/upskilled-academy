public class Animal {
    private String type;
    private String name;
    private String food;
    private String teeth;

    public Animal() {}

    public Animal(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public Animal(String type, String name, String food, String teeth) {
        this.type = type;
        this.name = name;
        this.food = food;
        this.teeth = teeth;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void setTeeth(String teeth) {
        this.teeth = teeth;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String getFood() {
        return food;
    }

    public String getTeeth() {
        return teeth;
    }

    public void identifyMyself(){
        System.out.print("Hi I'm " + this.type + ", ");
        System.out.print("My Name is " + this.name);
    }

    public static void main(String[] args) {
        Animal animal = new Animal("Parent of All Animal", "Binatang");
        animal.identifyMyself();
        System.out.println("");

        Herbivor herbivor = new Herbivor();
        herbivor.setType("Herbivor");
        herbivor.setName("Kambing");
        herbivor.setFood("'tumbuhan");
        herbivor.setTeeth("tumpul");
        herbivor.identifyMyself();

        Carnivor carnivor = new Carnivor();
        carnivor.setType("Carnivor");
        carnivor.setName("Singa");
        carnivor.setFood("'daging");
        carnivor.setTeeth("tajam");
        carnivor.identifyMyself();

        Omnivor omnivor = new Omnivor();
        omnivor.setType("Omnivor");
        omnivor.setName("Ayam");
        omnivor.setFood("'semua");
        omnivor.setTeeth("tajam dan tumpul");
        omnivor.identifyMyself();

    }

}

class Herbivor extends Animal {
    @Override
    public void identifyMyself() {
        super.identifyMyself();
        System.out.print(", My Food is " + super.getFood() + ", ");
        System.out.println("I have " + super.getTeeth() + " teeth");
    }
}

class Carnivor extends Animal {
    @Override
    public void identifyMyself() {
        super.identifyMyself();
        System.out.print(", My Food is " + super.getFood() + ", ");
        System.out.println("I have " + super.getTeeth() + " teeth");
    }
}

class Omnivor extends Animal {
    @Override
    public void identifyMyself() {
        super.identifyMyself();
        System.out.print(", My Food is " + super.getFood() + ", ");
        System.out.println("I have " + super.getTeeth() + " teeth");
    }
}
