import java.util.ArrayList;
import java.util.List;

public class ListAds implements Ads{

    private List<Ad> ads = new ArrayList<>();

    public ListAds(){
        insert(new Ad("iPhone 12", "One gently used Iphone 12...no charger", 0, 1));
        insert(new Ad("iPhone 11 Pro", "One gently used Iphone 11 Pro...no charger", 1, 1));
        insert(new Ad("iPhone X", "One gently used Iphone X...no charger", 2, 1));
    }


    @Override
    public List<Ad> all() {
        return this.ads;
    }

    @Override
    public void insert(Ad ad) {
        this.ads.add(ad);

    }
}
