package standIN;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class CroapScrap {
    public CroapScrap() {
    }

    public static void main(String[] args) throws IOException, JSONException {
        buckwheat();
        System.out.println();
        wheat();
        System.out.println();
        corn();
        System.out.println();
        rice();
        System.out.println();
        barley();
    }

    public static void buckwheat() throws IOException, JSONException {

        //Data for parsing

        String bkwtRozUrl = "https://rozetka.com.ua/ua/art_foods_4820191590977/p47538592/characteristics/";
        String buckwheatPriceHTML = "<div class=\"product-carriage__price product-carriage__price_color_red\"> 55<span class=\"product-carriage__price-symbol\">";
        String buckwheatNameHTML = "<a href=\"/ua/krupy/c4628397/strana-proizvoditelj-tovara-90098=544338/\">Україна</a>";
        String buckwheatCategoryHTML = "<a href=\"/ua/krupy/c4628397/vid-225787=grechka/\">Гречка</a>";
        String buckwheatProducerHTML = "<a href=\"/ua/krupy/c4628397/strana-proizvoditelj-tovara-90098=544338/\">Україна</a>";
        String buckwheatWeightHTML = "<a href=\"/ua/krupy/c4628397/ves147016=751-g-1000-g/\">1 кг</a>";
        String imgRozUr = "https://i2.rozetka.ua/goods/14397645/art_foods_4820191590977_images_14397645953.jpg";


        Parsing temp1 = new Parsing(bkwtRozUrl,buckwheatPriceHTML,buckwheatNameHTML,buckwheatCategoryHTML,
                buckwheatWeightHTML,buckwheatProducerHTML);

        String bkwtEpicUrl = "https://epicentrk.ua/shop/krupa-grechnevaya-khutorok-yadritsya-800-g-4820211661410.html?ssh=new&gclid=CjwKCAiAo5qABhBdEiwAOtGmbvlIB8sEwG8FDjHmtRqGPJeAElRmbaMvZVnWFvEFpASheUoa-zZFgRoCPiwQAvD_BwE";
        String bkwtEpicPriceHTML = "<div class=\"p-price__main\" title=\"Цена: 39.90 грн/упак.\" data-text=\"грн/упак.\">39.90 </div>";
        String bkwtEpicNameHTML = "<span class=\"p-char__value\"><span>Хуторок</span></span>";
        String bkwtEpicCategoryHTML = "<a href=\"/ua/shop/krupy-i-makaronnye-izdeliya/fs/vid-krupa-grechnevaya/\" class=\"link link--blue link--inverted\">крупа гречана</a>";
        String bkwtEpicProducerHTML = "<span class=\"p-char__value\"><span>Україна</span></span>";
        String bkwtEpicWeightHTML = "<span class=\"p-char__value\"><span>800&nbsp;г</span></span>";
        String imgEpicUrl = "https://cdn.27.ua/499/61/c2/2712002_1.jpeg";

        Parsing temp2 = new Parsing(bkwtEpicUrl,bkwtEpicPriceHTML,bkwtEpicNameHTML,bkwtEpicCategoryHTML,
                bkwtEpicWeightHTML,bkwtEpicProducerHTML);


        String bkwtAquaUrl = "https://aquamarket.ua/uk/grechka/10047-khutorok-800-g-krupa-grechana-m-u.html";
        String bkwtAquaPriceHTML = "<<div class=\"product-price\">40<sup>";
        String bkwtAquaNameHTML = "<td>Хуторок</td>";
        String bkwtAquaCategoryHTML = "<th colspan=\"2\">ХАРАКТЕРИСТИКИ ХУТОРОК, КРУПА ГРЕЧАНА, СМАЖЕНА, 800 Г</th>";
        String bkwtAquaProducerHTML = "<td>Україна</td>";
        String bkwtAquaWeightHTML = "<td>800</td>";
        String imgAquaUrl = "https://aquamarket.ua/26890-small_default/khutorok-800-g-krupa-grechana-m-u.jpg";

        Parsing temp3 = new Parsing(bkwtAquaUrl,bkwtAquaPriceHTML,bkwtAquaNameHTML,bkwtAquaCategoryHTML,
                bkwtAquaWeightHTML,bkwtAquaProducerHTML);


        String bkwtEpicSecUrl = "https://epicentrk.ua/ua/shop/pervotsvit-grechka-s-belymi-gribami-250-g.html";
        String bkwtEpicSecPriceHTML = "<div class=\"p-price__main\" title=\"Ціна: 27 грн/шт.\" data-text=\"грн/шт.\">\r\n27 </div>";
        String bkwtEpicSecNameHTML = "<a href=\"/ua/shop/krupy-i-makaronnye-izdeliya/fs/brend-pervotsvit/\" class=\"link link--blue link--inverted\">Первоцвіт</a>";
        String bkwtEpicSecCategoryHTML = "<a href=\"/ua/shop/krupy-i-makaronnye-izdeliya/fs/vid-krupa-grechnevaya/\" class=\"link link--blue link--inverted\">крупа гречана</a>";
        String bkwtEpicSecProducerHTML = "<span>Україна</span>";
        String bkwtEpicSecWeightHTML = "<span>250&nbsp;г</span>";
        String imgEpicSecUrl = "https://cdn.27.ua/499/3b/2f/1653551_1.jpeg";

        Parsing temp4 = new Parsing(bkwtEpicSecUrl,bkwtEpicSecPriceHTML,bkwtEpicSecNameHTML,bkwtEpicSecCategoryHTML,
                bkwtEpicSecWeightHTML,bkwtEpicSecProducerHTML);


        String bkwtAquaSecUrl = "https://aquamarket.ua/uk/grechka/31537-culinaro-green-buckwheat-grechka-zelena-400-g.html";
        String bkwtAquaSecPriceHTML = "<<div class=\"product-price\">40<sup>";
        String bkwtAquaSecNameHTML = "<td>Culinaro</td>";
        String bkwtAquaSecCategoryHTML = "<td>Гречка</td>";
        String bkwtAquaSecProducerHTML = "<td>Україна</td>";
        String bkwtAquaSecWeightHTML = "<td>800</td>";
        String imgAquaSecUrl = "https://aquamarket.ua/52567-large_default/culinaro-green-buckwheat-grechka-zelena-400-g.jpg";

        Parsing temp5 = new Parsing(bkwtAquaSecUrl,bkwtAquaSecPriceHTML,bkwtAquaSecNameHTML,bkwtAquaSecCategoryHTML,
                bkwtAquaSecWeightHTML,bkwtAquaSecProducerHTML);


        JSONArray arrayFirst = new JSONArray();

        arrayFirst.put("price: " + temp1.parse().getPrice());
        arrayFirst.put("name: " + temp1.parse().getName());
        arrayFirst.put("category: " + temp1.parse().getCategory());
        arrayFirst.put("producer: " + temp1.parse().getProducer());
        arrayFirst.put("weight: " + temp1.parse().getWeight());
        arrayFirst.put("resource: " + temp1.getUrl());
        arrayFirst.put("image URL: " + imgRozUr);

        JSONArray arraySecond = new JSONArray();

        arraySecond.put("price: " + temp2.parse().getPrice());
        arraySecond.put("name: " + temp2.parse().getName());
        arraySecond.put("category: " + temp2.parse().getCategory());
        arraySecond.put("producer: " + temp2.parse().getProducer());
        arraySecond.put("weight: " + temp2.parse().getResource());
        arraySecond.put("resource: " + temp2.getUrl());
        arraySecond.put("image URL: " + imgEpicUrl);

        JSONArray arrayThird = new JSONArray();

        arrayThird.put("price: " + temp3.parse().getPrice());
        arrayThird.put("name: " + temp3.parse().getName());
        arrayThird.put("category: " + temp3.parse().getCategory());
        arrayThird.put("producer: " + temp3.parse().getProducer());
        arrayThird.put("weight: " + temp3.parse().getResource());
        arrayThird.put("resource: " + temp3.getUrl());
        arrayThird.put("image URL: " + imgAquaUrl);

        JSONArray arrayFourth = new JSONArray();

        arrayFourth.put("price: " + temp4.parse().getPrice());
        arrayFourth.put("name: " + temp4.parse().getName());
        arrayFourth.put("category: " + temp4.parse().getCategory());
        arrayFourth.put("producer: " + temp4.parse().getProducer());
        arrayFourth.put("weight: " + temp4.parse().getResource());
        arrayFourth.put("resource: " + temp4.getUrl());
        arrayFourth.put("image URL: " + imgAquaSecUrl);

        JSONArray arrayFifth = new JSONArray();

        arrayFifth.put("price: " + temp5.parse().getPrice());
        arrayFifth.put("name: " + temp5.parse().getName());
        arrayFifth.put("category: " + temp5.parse().getCategory());
        arrayFifth.put("producer: " + temp5.parse().getProducer());
        arrayFifth.put("weight: " + temp5.parse().getResource());
        arrayFifth.put("resource: " + temp5.getUrl());
        arrayFifth.put("image URL: " + imgEpicSecUrl);

        JSONObject bkwtObject = new JSONObject();

        bkwtObject.put("buckwheat #5", arrayFifth);
        bkwtObject.put("buckwheat #4", arrayFourth);
        bkwtObject.put("buckwheat #3", arrayThird);
        bkwtObject.put("buckwheat #2", arraySecond);
        bkwtObject.put("buckwheat #1", arrayFirst);
        FileWriter fileWriter = new FileWriter("json_buckwheat_info.json");
        fileWriter.write(bkwtObject.toString());
        fileWriter.close();
        System.out.println("JSON file with buckwheat info : " + bkwtObject);
    }

    public static void wheat() throws IOException, JSONException {

        String imgRozUrl = "https://i2.rozetka.ua/goods/2243145/terra_4820015730794_images_2243145258.jpg";
        String imgAquaUrl = "https://aquamarket.ua/8193-small_default/ekorod-400-g-pshenichna-krupa-arnaut.jpg";
        String imgEpicUrl = "https://cdn.27.ua/499/44/df/1721567_1.jpeg";
        String imgAquaSecUrl = "https://aquamarket.ua/62183-small_default/avgust-800-g-krupi-pshenichni-z-tverdikh-sortiv.jpg";
        String imgEpicSecUrl = "https://cdn.27.ua/499/58/6a/1726570_1.jpeg";

        String wheatRozetka = "https://rozetka.com.ua/ua/terra_4820015730794/p23653956/characteristics/";
        String wheatPriceHTML = "<div class=\"product-carriage__price\"> 17<span class=\"product-carriage__price-symbol\">";
        String wheatNameHTML = "<a href=\"/ua/krupy/c4628397/vid-225787=pshenichnaya-krupa/\">Пшенична крупа</a>";
        String wheatCategoryHTML = "<a href=\"/ua/krupy/c4628397/vid-225787=pshenichnaya-krupa/\">Пшенична крупа</a>";
        String wheatProducerHTML = "<a href=\"/ua/krupy/c4628397/strana-proizvoditelj-tovara-90098=544338/\">Україна</a>";
        String wheatWeightHTML = "<a href=\"/ua/krupy/c4628397/ves147016=501-g-750-g/\">700 г</a>";

        Parsing temp1 = new Parsing(wheatRozetka,wheatPriceHTML,wheatNameHTML,
                wheatCategoryHTML, wheatWeightHTML,wheatProducerHTML);

        String wheatEpicUrl = "https://epicentrk.ua/ua/shop/krupa-pshenichnaya-terra-bystrogo-prigotovleniya-400-g.html";
        String whtEpicPriceHTML = "<div class=\"p-price__main\" title=\"Ціна: 22.70 грн/шт.\" data-text=\"грн/шт.\">\r\n22.70 </div>";
        String whtEpicNameHTML = "<a href=\"/ua/shop/krupy-i-makaronnye-izdeliya/fs/brend-terra/\" class=\"link link--blue link--inverted\">Терра</a>";
        String whtEpicCategoryHTML = "<span>крупа пшенична</span>";
        String whtEpicProducerHTML = "<span>Україна</span>";
        String whtEpicWeightHTML = "<span class=\"p-char__value\"><span>400&nbsp;г</span>";

        Parsing temp2 = new Parsing(wheatEpicUrl,whtEpicPriceHTML,whtEpicNameHTML,
                whtEpicCategoryHTML, whtEpicWeightHTML,whtEpicProducerHTML);

        String whtAquaUrl = "https://aquamarket.ua/uk/pshenichna-krupa/2353-ekorod-400-g-pshenichna-krupa-arnaut.html";
        String whtAquaPriceHTML = "<div class=\"product-price\">28<sup>";
        String whtAquaNameHTML = "<td>Екород</td>";
        String whtAquaCategoryHTML = "<h1 class=\"product-name\">Екород, Крупа пшенична Арнаут, органічна, 400 г</h1>";
        String whtAquaProducerHTML = "<td>Україна</td>";
        String whtAquaWeightHTML = "<td>0 - 500</td>";

        Parsing temp3 = new Parsing(whtAquaUrl,whtAquaPriceHTML,whtAquaNameHTML,
                whtAquaCategoryHTML, whtAquaWeightHTML,whtAquaProducerHTML);

        String whtEpicSecUrl = "https://epicentrk.ua/ua/shop/krupa-pshenichnaya-sto-pudov-artek-dachka-212-g.html";
        String whtEpicSecPriceHTML = "<div class=\"p-price__main\" title=\"Ціна: 6.80 грн/шт.\" data-text=\"грн/шт.\">\r\n6.80 </div>";
        String whtEpicSecNameHTML = "<span>Артек Дачка</span>";
        String whtEpicSecCategoryHTML = "<span>крупа пшенична</span>";
        String whtEpicSecProducerHTML = "<span>Україна</span>";
        String whtEpicSecWeightHTML = "<span>212&nbsp;г</span>";

        Parsing temp4 = new Parsing(whtEpicSecUrl,whtEpicSecPriceHTML,whtEpicSecNameHTML,
                whtEpicSecCategoryHTML, whtEpicSecWeightHTML,whtEpicSecProducerHTML);

        String whtAquaSecUrl = "https://aquamarket.ua/uk/pshenichna-krupa/38683-avgust-800-g-krupi-pshenichni-z-tverdikh-sortiv.html";
        String whtAquaSecPriceHTML = "<div class=\"product-price\">\r\n                                                            27<sup>";
        String whtAquaSecNameHTML = "<td>Август</td>";
        String whtAquaSecCategoryHTML = "<td>Пшенична</td>";
        String whtAquaSecProducerHTML = "<td>Україна</td>";
        String whtAquaSecWeightHTML = "<td>800</td>";

        Parsing temp5 = new Parsing(whtAquaSecUrl,whtAquaSecPriceHTML,whtAquaSecNameHTML,
                whtAquaSecCategoryHTML, whtAquaSecWeightHTML,whtAquaSecProducerHTML);


        JSONObject wheatJSON = new JSONObject();


        JSONArray arrayFirst = new JSONArray();
        arrayFirst.put("price: " + temp1.parse().getPrice());
        arrayFirst.put("name: " + temp1.parse().getName());
        arrayFirst.put("category: " + temp1.parse().getCategory());
        arrayFirst.put("producer: " + temp1.parse().getProducer());
        arrayFirst.put("weight: " + temp1.parse().getWeight());
        arrayFirst.put("resource: " + temp1.getUrl());

        wheatJSON.put("wheat #1", arrayFirst);


        JSONArray arraySecond = new JSONArray();
        arraySecond.put("price: " + temp2.parse().getPrice());
        arraySecond.put("name: " + temp2.parse().getName());
        arraySecond.put("category: " + temp2.parse().getCategory());
        arraySecond.put("producer: " + temp2.parse().getProducer());
        arraySecond.put("weight: " + temp2.parse().getWeight());
        arraySecond.put("resource: " + temp2.getUrl());
        wheatJSON.put("wheat #2", arraySecond);


        JSONArray arrayThird = new JSONArray();
        arrayThird.put("price: " + temp3.parse().getPrice());
        arrayThird.put("name: " + temp3.parse().getName());
        arrayThird.put("category: " + temp3.parse().getCategory());
        arrayThird.put("producer: " + temp3.parse().getProducer());
        arrayThird.put("weight: " + temp3.parse().getWeight());
        arrayThird.put("resource: " + temp3.getUrl());
        wheatJSON.put("wheat #3", arrayThird);


        JSONArray arrayFourth = new JSONArray();
        arrayFourth.put("price: " + temp4.parse().getPrice());
        arrayFourth.put("name: " + temp4.parse().getName());
        arrayFourth.put("category: " + temp4.parse().getCategory());
        arrayFourth.put("producer: " + temp4.parse().getProducer());
        arrayFourth.put("weight: " + temp4.parse().getWeight());
        arrayFourth.put("resource: " + temp4.getUrl());
        wheatJSON.put("wheat #4", arrayFourth);


        JSONArray arrayFifth = new JSONArray();
        arrayFifth.put("price: " + temp5.parse().getPrice());
        arrayFifth.put("name: " + temp5.parse().getName());
        arrayFifth.put("category: " + temp5.parse().getCategory());
        arrayFifth.put("producer: " + temp5.parse().getProducer());
        arrayFifth.put("weight: " + temp5.parse().getWeight());
        arrayFifth.put("resource: " + temp5.getUrl());
        wheatJSON.put("wheat #5", arrayFifth);

        arrayFirst.put("image URL: " + imgRozUrl);
        arraySecond.put("image URL: " + imgEpicUrl);
        arrayThird.put("image URL: " + imgAquaUrl);
        arrayFourth.put("image URL: " + imgEpicSecUrl);
        arrayFifth.put("image URL: " + imgAquaSecUrl);
        FileWriter fileWriter = new FileWriter("json_wheat_info.json");
        fileWriter.write(wheatJSON.toString());
        fileWriter.close();

        System.out.println("JSON file with wheat info: " + wheatJSON);
    }

    public static void corn() throws JSONException, IOException {
        List<Croap> corns = new ArrayList();
        String imgRozUrl = "https://i8.rozetka.ua/goods/14397645/art_foods_4820191590892_images_14397645428.jpg";
        String imgAquaUrl = "https://aquamarket.ua/62180-small_default/avgust-800-g-krupa-kukurudzyana.jpg";
        String imgEpicUrl = "https://cdn.27.ua/499/44/dd/1721565_1.jpeg";
        String imgAquaSecUrl = "https://aquamarket.ua/59771-small_default/skviryanka-800-g-krupa-kukurudzyana-shlifovana.jpg";
        String imgEpicSecUrl = "https://cdn.27.ua/499/7f/f5/1540085_1.jpeg";


        String cornEpicUrl = "https://epicentrk.ua/ua/shop/krupa-kukuruznaya-terra-shlifovannaya-bystrogo-prigotovleniya-400-g.html";
        String cornEpicPriceHTML = "<div class=\"p-price__main\" title=\"Ціна: 22.70 грн/шт.\" data-text=\"грн/шт.\">\r\n22.70 </div>";
        String cornEpicNameHTML = "<a href=\"/ua/shop/krupy-i-makaronnye-izdeliya/fs/brend-terra/\" class=\"link link--blue link--inverted\">Терра</a>";
        String cornEpicCategoryHTML = "<span>крупа кукурудзяна</span>";
        String cornEpicProducerHTML = "<span>Україна</span>";
        String cornEpicWeightHTML = "<span class=\"p-char__value\"><span>400&nbsp;г</span>";

        Parsing temp1 = new Parsing(cornEpicUrl,cornEpicPriceHTML,cornEpicNameHTML,
                cornEpicCategoryHTML, cornEpicWeightHTML,cornEpicProducerHTML);


        String cornRozUrl = "https://rozetka.com.ua/ua/art_foods_4820191590892/p47649056/characteristics/";
        String cornRozPriceHTML = "<div class=\"product-carriage__price\"> 20";
        String cornRozNameHTML = "<span>Україна</span>";
        String cornRozCategoryHTML = "<a href=\"/ua/krupy/c4628397/vid-225787=kukuruznaya-krupa/\">Кукурудзяна крупа</a>";
        String cornRozProducerHTML = "<a href=\"/ua/krupy/c4628397/strana-proizvoditelj-tovara-90098=544338/\">Україна</a>";
        String cornRozWeightHTML = "<a href=\"/ua/krupy/c4628397/ves147016=501-g-750-g/\">500 г</a>";

        Parsing temp2 = new Parsing(cornRozUrl,cornRozPriceHTML,cornRozNameHTML,
                cornRozCategoryHTML, cornRozWeightHTML,cornRozProducerHTML);


        String cornAquaUrl = "https://aquamarket.ua/uk/kukurudzyana-krupa/38684-avgust-800-g-krupa-kukurudzyana.html";
        String cornAquaPriceHTML = "<div class=\"product-price\">15<sup>";
        String cornAquaNameHTML = "<td>Август</td>";
        String cornAquaCategoryHTML = "<td>Кукурудзяна</td>";
        String cornAquaProducerHTML = "<td>Україна</td>";
        String cornAquaWeightHTML = "<td>800</td>";

        Parsing temp3 = new Parsing(cornAquaUrl,cornAquaPriceHTML,cornAquaNameHTML,
                cornAquaCategoryHTML, cornAquaWeightHTML,cornAquaProducerHTML);



        String cornEpicSecUrl = "https://epicentrk.ua/ua/shop/krupa-kukuruznaya-sto-pudov-750-g.html";
        String cornEpicSecPriceHTML = "<div class=\"p-price__main\" title=\"Ціна: 13 грн/упак.\" data-text=\"грн/упак.\">\r\n13 </div>";
        String cornEpicSecNameHTML = "<a href=\"/ua/shop/krupy-i-makaronnye-izdeliya/fs/brend-sto-pudov/\" class=\"link link--blue link--inverted\">Сто пудов</a>";
        String cornEpicSecCategoryHTML = "<span>крупа кукурудзяна</span>";
        String cornEpicSecProducerHTML = "<span>Україна</span>";
        String cornEpicSecWeightHTML = "<span>750&nbsp;г</span>";

        Parsing temp4 = new Parsing(cornEpicSecUrl,cornEpicSecPriceHTML,cornEpicSecNameHTML,
                cornEpicSecCategoryHTML, cornEpicSecWeightHTML,cornEpicSecProducerHTML);
        
        
        String cornAquaSecUrl = "https://aquamarket.ua/uk/kukurudzyana-krupa/37061-skviryanka-800-g-krupa-kukurudzyana-shlifovana.html";
        String cornAquaSecPriceHTML = "<div class=\"product-price\">\r\n                                                            23<sup>";
        String cornAquaSecNameHTML = "<td>Сквирянка</td>";
        String cornAquaSecCategoryHTML = "<td>Кукурудзяна</td>";
        String cornAquaSecProducerHTML = "<td>Україна</td>";
        String cornAquaSecWeightHTML = "<td>800</td>";

        Parsing temp5 = new Parsing(cornAquaSecUrl,cornAquaSecPriceHTML,cornAquaSecNameHTML,
                cornAquaSecCategoryHTML, cornAquaSecWeightHTML,cornAquaSecProducerHTML);
        
        
        JSONObject cornJson = new JSONObject();
        JSONArray arrayFirst = new JSONArray();
        arrayFirst.put("price: " + temp1.parse().getPrice());
        arrayFirst.put("name: " + temp1.parse().getName());
        arrayFirst.put("category: " + temp1.parse().getCategory());
        arrayFirst.put("producer: " + temp1.parse().getProducer());
        arrayFirst.put("weight: " + temp1.parse().getWeight());
        arrayFirst.put("resource: " + temp1.getUrl());
        cornJson.put("corn #1", arrayFirst);


        JSONArray arraySecond = new JSONArray();
        arraySecond.put("price: " + temp2.parse().getPrice());
        arraySecond.put("name: " + temp2.parse().getName());
        arraySecond.put("category: " + temp2.parse().getCategory());
        arraySecond.put("producer: " + temp2.parse().getProducer());
        arraySecond.put("weight: " + temp2.parse().getWeight());
        arraySecond.put("resource: " + temp2.getUrl());
        cornJson.put("corn #2", arraySecond);


        JSONArray arrayThird = new JSONArray();
        arrayThird.put("price: " + temp3.parse().getPrice());
        arrayThird.put("name: " + temp3.parse().getName());
        arrayThird.put("category: " + temp3.parse().getCategory());
        arrayThird.put("producer: " + temp3.parse().getProducer());
        arrayThird.put("weight: " + temp3.parse().getWeight());
        arrayThird.put("resource: " + temp3.getUrl());
        cornJson.put("corn #3", arrayThird);


        JSONArray arrayFourth = new JSONArray();
        arrayFourth.put("price: " + temp4.parse().getPrice());
        arrayFourth.put("name: " + temp4.parse().getName());
        arrayFourth.put("category: " + temp4.parse().getCategory());
        arrayFourth.put("producer: " + temp4.parse().getProducer());
        arrayFourth.put("weight: " + temp4.parse().getWeight());
        arrayFourth.put("resource: " + temp4.getUrl());
        cornJson.put("corn #4", arrayFourth);


        JSONArray arrayFifth = new JSONArray();
        arrayFifth.put("price: " + temp5.parse().getPrice());
        arrayFifth.put("name: " + temp5.parse().getName());
        arrayFifth.put("category: " + temp5.parse().getCategory());
        arrayFifth.put("producer: " + temp5.parse().getProducer());
        arrayFifth.put("weight: " + temp5.parse().getWeight());
        arrayFifth.put("resource: " + temp5.getUrl());


        arrayFirst.put("image URL: " + imgRozUrl);
        arraySecond.put("image URL: " + imgEpicUrl);
        arrayThird.put("image URL: " + imgAquaUrl);
        arrayFourth.put("image URL: " + imgEpicSecUrl);
        arrayFifth.put("image URL: " + imgAquaSecUrl);
        cornJson.put("corn #5", arrayFifth);

        System.out.println("JSON file with corn info:" + cornJson);

        FileWriter fileWriter = new FileWriter("json_corn_info.json");
        fileWriter.write(cornJson.toString());
        fileWriter.close();
    }

    public static void rice() throws JSONException, IOException {

        String imgEpicUrl = "https://cdn.27.ua/499/61/c4/2712004_2.jpeg";
        String imgRozUrl = "https://i2.rozetka.ua/goods/6132257/copy_pere_4820191590496_5b59df1b374db_images_6132257896.jpg";
        String imgAquaUrl = "https://aquamarket.ua/32374-small_default/ris-scotti-skotti-arborio-dlya-rizotto-500-g.jpg";
        String imgEpicSecUrl = "https://cdn.27.ua/499/58/80/1726592_1.jpeg";
        String imgAquaSecUrl = "https://aquamarket.ua/22411-small_default/avgust-500-g-ris-basmati.jpg";


        String riceEpicUrl = "https://epicentrk.ua/ua/shop/ris-khutorok-dlinnyy-shlifovannyy-800-g-4820211660161.html";
        String riceEpicPriceHTML = "<div class=\"p-price__main\" title=\"Ціна: 26.90 грн/упак.\" data-text=\"грн/упак.\">\r\n26.90 </div>";
        String riceEpicNameHTML = "<span>Хуторок</span>";
        String riceEpicCategoryHTML = "<a href=\"/ua/shop/krupy-i-makaronnye-izdeliya/fs/vid-ris/\" class=\"link link--blue link--inverted\">рис</a>";
        String riceEpicProducerHTML = "<span>Україна</span>";
        String riceEpicWeightHTML = "<span>800&nbsp;г</span>";

        Parsing temp1 = new Parsing(riceEpicUrl,riceEpicPriceHTML,riceEpicNameHTML,
                riceEpicCategoryHTML, riceEpicWeightHTML,riceEpicProducerHTML);


        String riceRozUrl = "https://rozetka.com.ua/ua/pere_4820191590472/p47561880/characteristics/";
        String riceRozPriceHTML = "<div class=\"product-carriage__price\"> 117";
        String riceRozNameHTML = "<a href=\"/ua/krupy/c4628397/tip170414=basmati/\">Басматі</a>";
        String riceRozCategoryHTML = "<a href=\"/ua/krupy/c4628397/vid-225787=ris/\">Рис</a>";
        String riceRozProducerHTML = "<a href=\"/ua/krupy/c4628397/strana-registracii-brenda-87790=429058/\">Україна</a>";
        String riceRozWeightHTML = "<a href=\"/ua/krupy/c4628397/ves147016=751-g-1000-g/\">800 г</a>";

        Parsing temp2 = new Parsing(riceRozUrl,riceRozPriceHTML,riceRozNameHTML,
                riceRozCategoryHTML, riceRozWeightHTML,riceRozProducerHTML);


        String riceAquaUrl = "https://aquamarket.ua/uk/ris/14890-ris-scotti-skotti-arborio-dlya-rizotto-500-g.html";
        String riceAquaPriceHTML = "<div class=\"product-price\">\r\n                                                            108<sup>";
        String riceAquaNameHTML = "<td>Scotti </td>";
        String riceAquaCategoryHTML = "<td>Рис</td>";
        String riceAquaProducerHTML = "<td>Італія</td>";
        String riceAquaWeightHTML = "<td>500</td>";

        Parsing temp3 = new Parsing(riceAquaUrl,riceAquaPriceHTML,riceAquaNameHTML,
                riceAquaCategoryHTML, riceAquaWeightHTML,riceAquaProducerHTML);


        String riceEpicSecUrl = "https://epicentrk.ua/ua/shop/ris-sto-pudov-dlya-sushi-400-g.html";
        String riceEpicSecPriceHTML = "<div class=\"p-price__main\" title=\"Ціна: 24 грн/шт.\" data-text=\"грн/шт.\">\r\n24 </div>";
        String riceEpicSecNameHTML = "<a href=\"/ua/shop/krupy-i-makaronnye-izdeliya/fs/brend-sto-pudov/\" class=\"link link--blue link--inverted\">Сто пудов</a>";
        String riceEpicSecCategoryHTML = "<a href=\"/ua/shop/krupy-i-makaronnye-izdeliya/fs/vid-ris/\" class=\"link link--blue link--inverted\">рис</a>";
        String riceEpicSecProducerHTML = "<span>Україна</span>";
        String riceEpicSecWeightHTML = "<span>400&nbsp;г</span>";

        Parsing temp4 = new Parsing(riceEpicSecUrl,riceEpicSecPriceHTML,riceEpicSecNameHTML,
                riceEpicSecCategoryHTML, riceEpicSecWeightHTML,riceEpicSecProducerHTML);


        String riceAquaSecUrl = "https://aquamarket.ua/uk/ris/6737-avgust-500-g-ris-basmati.html";
        String riceAquaSecPriceHTML = "<div class=\"product-price\">\r\n                                                            46<sup>";
        String riceAquaSecNameHTML = "<td>Август</td>";
        String riceAquaSecCategoryHTML = "<td>Рис</td>";
        String riceAquaSecProducerHTML = " <td>Україна</td>";
        String riceAquaSecWeightHTML = "<td>500</td>";

        Parsing temp5 = new Parsing(riceAquaSecUrl,riceAquaSecPriceHTML,riceAquaSecNameHTML,
                riceAquaSecCategoryHTML, riceAquaSecWeightHTML,riceAquaSecProducerHTML);


        JSONObject riceJson = new JSONObject();
        JSONArray arrayFirst = new JSONArray();
        arrayFirst.put("price: " + temp1.parse().getPrice());
        arrayFirst.put("name: " + temp1.parse().getName());
        arrayFirst.put("category: " + temp1.parse().getCategory());
        arrayFirst.put("producer: " + temp1.parse().getProducer());
        arrayFirst.put("weight: " + temp1.parse().getWeight());
        arrayFirst.put("resource: " + temp1.getUrl());
        riceJson.put("rice #1", arrayFirst);


        JSONArray arraySecond = new JSONArray();
        arraySecond.put("price: " + temp2.parse().getPrice());
        arraySecond.put("name: " + temp2.parse().getName());
        arraySecond.put("category: " + temp2.parse().getCategory());
        arraySecond.put("producer: " + temp2.parse().getProducer());
        arraySecond.put("weight: " + temp2.parse().getWeight());
        arraySecond.put("resource: " + temp2.getUrl());
        riceJson.put("rice #2", arraySecond);


        JSONArray arrayThird = new JSONArray();
        arrayThird.put("price: " + temp3.parse().getPrice());
        arrayThird.put("name: " + temp3.parse().getName());
        arrayThird.put("category: " + temp3.parse().getCategory());
        arrayThird.put("producer: " + temp3.parse().getProducer());
        arrayThird.put("weight: " + temp3.parse().getWeight());
        arrayThird.put("resource: " + temp3.getUrl());
        riceJson.put("rice #3", arrayThird);


        JSONArray arrayFourth = new JSONArray();
        arrayFourth.put("price: " + temp4.parse().getPrice());
        arrayFourth.put("name: " + temp4.parse().getName());
        arrayFourth.put("category: " + temp4.parse().getCategory());
        arrayFourth.put("producer: " + temp4.parse().getProducer());
        arrayFourth.put("weight: " + temp4.parse().getWeight());
        arrayFourth.put("resource: " + temp4.getUrl());
        riceJson.put("rice #4", arrayFourth);


        JSONArray arrayFifth = new JSONArray();
        arrayFifth.put("price: " + temp5.parse().getPrice());
        arrayFifth.put("name: " + temp5.parse().getName());
        arrayFifth.put("category: " + temp5.parse().getCategory());
        arrayFifth.put("producer: " + temp5.parse().getProducer());
        arrayFifth.put("weight: " + temp5.parse().getWeight());
        arrayFifth.put("resource: " + temp5.getUrl());

        arrayFirst.put("image URL: " + imgEpicUrl);
        arraySecond.put("image URL: " + imgRozUrl);
        arrayThird.put("image URL: " + imgAquaUrl);
        arrayFourth.put("image URL: " + imgEpicSecUrl);
        arrayFifth.put("image URL: " + imgAquaSecUrl);
        riceJson.put("rice #5", arrayFifth);


        System.out.println("JSON file with rice info:" + riceJson);
        FileWriter fileWriter = new FileWriter("json_rice_info.json");
        fileWriter.write(riceJson.toString());
        fileWriter.close();
    }

    public static void barley() throws JSONException, IOException {

        String imgEpicUrl = "https://cdn.27.ua/499/32/71/1520241_2.jpeg";
        String imgRozUrl = "https://i2.rozetka.ua/goods/18253364/82804665_images_18253364569.jpg";
        String imgAquaUrl = "https://aquamarket.ua/62182-small_default/avgust-800-g-krupa-yachna.jpg";
        String imgEpicSecUrl = "https://cdn.27.ua/499/44/e5/1721573_1.jpeg";
        String imgAquaSecUrl = "https://aquamarket.ua/71202-small_default/kozub-500-g-krupa-yachna-organichna.jpg";


        String barleyEpicUrl = "https://epicentrk.ua/ua/shop/krupa-yachnevaya-foodsi-1000-g.html";
        String barleyEpicPriceHTML = "<div class=\"p-price__main\" title=\"Ціна: 12 грн/упак.\" data-text=\"грн/упак.\">\r\n12 </div>";
        String barleyEpicNameHTML = "<a href=\"/ua/shop/krupy-i-makaronnye-izdeliya/fs/brend-foodsi/\" class=\"link link--blue link--inverted\">Foodsi</a>";
        String barleyEpicCategoryHTML = "<span>крупа ячмінна</span>";
        String barleyEpicProducerHTML = "<span>Україна</span>";
        String barleyEpicWeightHTML = "<span>1000&nbsp;г</span>";

        Parsing temp1 = new Parsing(barleyEpicUrl,barleyEpicPriceHTML,barleyEpicNameHTML,
                barleyEpicCategoryHTML, barleyEpicWeightHTML,barleyEpicProducerHTML);


        String barleyRozUrl = "https://rozetka.com.ua/ua/82804665/p82804665/characteristics/";
        String barleyRozPriceHTML = "<div class=\"product-carriage__price\"> 31";
        String barleyRozNameHTML = "<span>Україна</span>";
        String barleyRozCategoryHTML = "<a href=\"/ua/krupy/c4628397/vid-225787=yachnevaya-krupa/\">Ячна крупа</a>";
        String barleyRozProducerHTML = "<span>Україна</span>";
        String barleyRozWeightHTML = "<a href=\"/ua/krupy/c4628397/ves147016=301-g-500-g/\">400 г</a>";

        Parsing temp2 = new Parsing(barleyRozUrl,barleyRozPriceHTML,barleyRozNameHTML,
                barleyRozCategoryHTML, barleyRozWeightHTML,barleyRozProducerHTML);


        String barleyAquaUrl = "https://aquamarket.ua/uk/yachna-krupa/38682-avgust-800-g-krupa-yachna.html";
        String barleyAquaPriceHTML = "<div class=\"product-price\">\r\n                                                            18<sup>";
        String barleyAquaNameHTML = "<td>Август</td>";
        String barleyAquaCategoryHTML = "<td>Ячна</td>";
        String barleyAquaProducerHTML = "<td>Україна</td>";
        String barleyAquaWeightHTML = "<td>800</td>";

        Parsing temp3 = new Parsing(barleyAquaUrl,barleyAquaPriceHTML,barleyAquaNameHTML,
                barleyAquaCategoryHTML, barleyAquaWeightHTML,barleyAquaProducerHTML);


        String barleyEpicSecUrl = "https://epicentrk.ua/ua/shop/krupa-yachnevaya-terra-bystrogo-prigotovleniya-400-g.html";
        String barleyEpicSecPriceHTML = "<div class=\"p-price__main\" title=\"Ціна: 18.70 грн/шт.\" data-text=\"грн/шт.\">\r\n18.70 </div>";
        String barleyEpicSecNameHTML = "<a href=\"/ua/shop/krupy-i-makaronnye-izdeliya/fs/brend-terra/\" class=\"link link--blue link--inverted\">Терра</a>";
        String barleyEpicSecCategoryHTML = "<span>крупа ячмінна</span>";
        String barleyEpicSecProducerHTML = "<span>Україна</span>";
        String barleyEpicSecWeightHTML = "<span>400&nbsp;г</span>";

        Parsing temp4 = new Parsing(barleyEpicSecUrl,barleyEpicSecPriceHTML,barleyEpicSecNameHTML,
                barleyEpicSecCategoryHTML, barleyEpicSecWeightHTML,barleyEpicSecProducerHTML);


        String barleyAquaSecUrl = "https://aquamarket.ua/uk/yachna-krupa/44800-kozub-500-g-krupa-yachna-organichna.html";
        String barleyAquaSecPriceHTML = "<div class=\"product-price\">\r\n                                                            36<sup>";
        String barleyAquaSecNameHTML = "<td>Козуб</td>";
        String barleyAquaSecCategoryHTML = "<td>Ячна</td>";
        String barleyAquaSecProducerHTML = " <td>Україна</td>";
        String barleyAquaSecWeightHTML = "<td>500</td>";

        Parsing temp5 = new Parsing(barleyAquaSecUrl,barleyAquaSecPriceHTML,barleyAquaSecNameHTML,
                barleyAquaSecCategoryHTML, barleyAquaSecProducerHTML,barleyAquaSecWeightHTML);


        JSONObject barleyJson = new JSONObject();
        JSONArray arrayFirst = new JSONArray();


        arrayFirst.put("price: " + temp1.parse().getPrice());
        arrayFirst.put("name: " + temp1.parse().getName());
        arrayFirst.put("category: " + temp1.parse().getCategory());
        arrayFirst.put("producer: " + temp1.parse().getProducer());
        arrayFirst.put("weight: " + temp1.parse().getWeight());
        arrayFirst.put("resource: " + temp1.getUrl());
        barleyJson.put("barley #1", arrayFirst);


        JSONArray arraySecond = new JSONArray();
        arraySecond.put("price: " + temp2.parse().getPrice());
        arraySecond.put("name: " + temp2.parse().getName());
        arraySecond.put("category: " + temp2.parse().getCategory());
        arraySecond.put("producer: " + temp2.parse().getProducer());
        arraySecond.put("weight: " + temp2.parse().getWeight());
        arraySecond.put("resource: " + temp2.getUrl());
        barleyJson.put("barley #2", arraySecond);


        JSONArray arrayThird = new JSONArray();
        arrayThird.put("price: " + temp3.parse().getPrice());
        arrayThird.put("name: " + temp3.parse().getName());
        arrayThird.put("category: " + temp3.parse().getCategory());
        arrayThird.put("producer: " + temp3.parse().getProducer());
        arrayThird.put("weight: " + temp3.parse().getWeight());
        arrayThird.put("resource: " + temp3.getUrl());
        barleyJson.put("barley #3", arrayThird);


        JSONArray arrayFourth = new JSONArray();
        arrayFourth.put("price: " + temp4.parse().getPrice());
        arrayFourth.put("name: " + temp4.parse().getName());
        arrayFourth.put("category: " + temp4.parse().getCategory());
        arrayFourth.put("producer: " + temp4.parse().getProducer());
        arrayFourth.put("weight: " + temp4.parse().getWeight());
        arrayFourth.put("resource: " + temp4.getUrl());
        barleyJson.put("barley #4", arrayFourth);


        JSONArray arrayFifth = new JSONArray();
        arrayFifth.put("price: " + temp5.parse().getPrice());
        arrayFifth.put("name: " + temp5.parse().getName());
        arrayFifth.put("category: " + temp5.parse().getCategory());
        arrayFifth.put("producer: " + temp5.parse().getProducer());
        arrayFifth.put("weight: " + temp5.parse().getWeight());
        arrayFifth.put("resource: " + temp5.getUrl());
        barleyJson.put("barley #5", arrayFifth);


        arrayFirst.put("image URL: " + imgEpicUrl);
        arraySecond.put("image URL: " + imgRozUrl);
        arrayThird.put("image URL: " + imgAquaUrl);
        arrayFourth.put("image URL: " + imgEpicSecUrl);
        arrayFifth.put("image URL: " + imgAquaSecUrl);


        System.out.println("JSON file with barley info:" + barleyJson);
        FileWriter fileWriter = new FileWriter("json_barley_info.json");
        fileWriter.write(barleyJson.toString());

        fileWriter.close();
    }

}
