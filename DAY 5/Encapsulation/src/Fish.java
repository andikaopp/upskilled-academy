public class Fish {
    private String type;
    private String feed;

    public Fish() {
    }

    public Fish(String type, String feed) {
        this.type = type;
        this.feed = feed;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFeed() {
        return feed;
    }

    public void setFeed(String feed) {
        this.feed = feed;
    }

    public void showDetail(){
        System.out.print("Saya ikan dengan detail, ");
        System.out.print("Jenis: "+this.type);
        System.out.println(", Makanan: "+this.feed);
    }

    public static void main(String[] args) {
        Fish fish = new Fish();
        fish.setType("paus");
        fish.setFeed("plankton");
        fish.showDetail();

        fish.setType("cupang");
        fish.setFeed("cacing");
        fish.showDetail();

        fish.setType("arwana");
        fish.setFeed("jangkrik");
        fish.showDetail();

        fish.setType("sapu-sapu");
        fish.setFeed("pelet");
        fish.showDetail();
    }
}
