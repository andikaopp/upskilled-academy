public class Flower {
    private String name;
    private String color;
    private int num_of_petal;

    public Flower() {
    }

    public Flower(String name, String color, int num_of_petal) {
        this.name = name;
        this.color = color;
        this.num_of_petal = num_of_petal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNum_of_petal() {
        return num_of_petal;
    }

    public void setNum_of_petal(int num_of_petal) {
        this.num_of_petal = num_of_petal;
    }

    public void showDetail(){
        System.out.print("Saya bunga dengan detail, ");
        System.out.print("jenis: " + this.name + ", ");
        System.out.print("color: " + this.color + ", ");
        System.out.println("num of petal: " + this.num_of_petal);
    }

    public static void main(String[] args) {
        Flower flower = new Flower();
        flower.setName("Bangkai");
        flower.setColor("Hitam");
        flower.setNum_of_petal(12);
        flower.showDetail();

        flower.setName("Anggrek");
        flower.setColor("ungu");
        flower.setNum_of_petal(4);
        flower.showDetail();

        flower.setName("Mawar");
        flower.setColor("merah");
        flower.setNum_of_petal(6);
        flower.showDetail();

        flower.setName("Melati");
        flower.setColor("kuning");
        flower.setNum_of_petal(3);
        flower.showDetail();
    }
}
