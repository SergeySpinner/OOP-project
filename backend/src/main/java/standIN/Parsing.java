package standIN;

import org.jsoup.Jsoup;

public class Parsing {
    private String url,price, name, category, producer, weight;

    public Parsing(String url,String price, String name, String category, String weight, String producer) {
        this.url = url;
        this.price = price;
        this.name = name;
        this.category = category;
        this.weight = weight;
        this.producer = producer;
    }

    public String getUrl() {
        return url;
    }

    public String getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public String getProducer() {
        return producer;
    }

    public String getWeight() {
        return weight;
    }

    public Croap parse(){

        String tempPrice = (Jsoup.parse(price, url)).body().text();
        String tempName = (Jsoup.parse(name, url)).body().text();
        String tempCategory = (Jsoup.parse(category, url)).body().text();
        String tempProducer = (Jsoup.parse(producer, url)).body().text();
        String tempWeight = (Jsoup.parse(weight, url)).body().text();

        return new Croap(tempPrice,tempName,tempCategory,tempProducer,tempWeight,url,"");
    }
}
