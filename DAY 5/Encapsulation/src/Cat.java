public class Cat {
    private String fur_color;
    private String num_of_leg;

    public Cat(){}
    public Cat(String fur_color, String num_of_leg){
        this.fur_color = fur_color;
        this.num_of_leg = num_of_leg;
    }

    public String getFur_color() {
        return fur_color;
    }

    public void setFur_color(String fur_color) {
        this.fur_color = fur_color;
    }

    public String getNum_of_leg() {
        return num_of_leg;
    }

    public void setNum_of_leg(String num_of_leg) {
        this.num_of_leg = num_of_leg;
    }

    public void showDetail(){
        System.out.print("Saya kucing dengan detail, ");
        System.out.print("Warna Bulu: "+ this.fur_color);
        System.out.println(" dengan jumlah kaki: "+this.num_of_leg);
    }

    public static void main(String[] args) {
        Cat cat = new Cat("Coklat","4");
        cat.showDetail();

        cat.setFur_color("Hitam");
        cat.setNum_of_leg("4");
        cat.showDetail();

        cat.setFur_color("Coklat");
        cat.setNum_of_leg("3");
        cat.showDetail();

        cat.setFur_color("Putih");
        cat.setNum_of_leg("4");
        cat.showDetail();

        cat.setFur_color("Putih Abu");
        cat.setNum_of_leg("3");
        cat.showDetail();

        cat.setFur_color("Oren");
        cat.setNum_of_leg("4");
        cat.showDetail();
    }
}
