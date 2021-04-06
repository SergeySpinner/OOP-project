package standIN;
public class Croap {
    private String price;
    private String name;
    private String category;
    private String producer;
    private String weight;
    private String resource;
    private String imageUrl;

    public String getPrice() {
        return this.price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String toString() {
        return "Croap [price=" + this.price + ", name=" + this.name + ", category=" + this.category + ", producer=" + this.producer + ", weight=" + this.weight + ", resource=" + this.resource + ", imageUrl=" + this.imageUrl + "]";
    }

    public Croap(String price, String name, String category, String producer, String weight, String resource, String imageUrl) {
        this.price = price;
        this.name = name;
        this.category = category;
        this.producer = producer;
        this.weight = weight;
        this.resource = resource;
        this.imageUrl = imageUrl;
    }

    public Croap(Parsing parserTemp, String imageUrl){
        this.price = parserTemp.getPrice();
        this.name = parserTemp.getName();
        this.category = parserTemp.getCategory();
        this.producer = parserTemp.getProducer();
        this.weight = parserTemp.getWeight();
        this.resource = parserTemp.getUrl();
        this.imageUrl = imageUrl;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getProducer() {
        return this.producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getWeight() {
        return this.weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getResource() {
        return this.resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }
}
