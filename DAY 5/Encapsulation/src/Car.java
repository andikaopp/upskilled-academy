public class Car {
    private String type;
    private String color;
    private int num_of_tire;

    public Car() {
    }

    public Car(String type, String color, int num_of_tire) {
        this.type = type;
        this.color = color;
        this.num_of_tire = num_of_tire;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNum_of_tire() {
        return num_of_tire;
    }

    public void setNum_of_tire(int num_of_tire) {
        this.num_of_tire = num_of_tire;
    }

    public void showDetail(){
        System.out.print("Saya mobil dengan detail, ");
        System.out.print("Type: " + this.type + ", ");
        System.out.print("color: " + this.color + ", ");
        System.out.println("num of tire: " + this.num_of_tire);
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.setType("sedan");
        car.setColor("Merah");
        car.setNum_of_tire(4);
        car.showDetail();

        car.setType("Truk");
        car.setColor("Hijau");
        car.setNum_of_tire(12);
        car.showDetail();

        car.setType("Tronton");
        car.setColor("Kuning");
        car.setNum_of_tire(8);
        car.showDetail();

        car.setType("Angkot");
        car.setColor("Coklat");
        car.setNum_of_tire(6);
        car.showDetail();
    }
}
