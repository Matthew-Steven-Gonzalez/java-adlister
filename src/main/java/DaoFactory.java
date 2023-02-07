public class DaoFactory {
    private static Ads adsDao;

    public static Ads getProductsDao() {
        if (adsDao == null) {
            adsDao = new ListAds();
        }
        return adsDao;
    }
}

