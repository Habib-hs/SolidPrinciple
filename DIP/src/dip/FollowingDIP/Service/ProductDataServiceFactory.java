package dip.FollowingDIP.Service;

import dip.FollowingDIP.Interface.IProductDataService;

public class ProductDataServiceFactory {
    public IProductDataService createService(String source) {
        switch(source.toLowerCase()) {
            case "db":
                return new ProductDataFromDB();
            case "api":
                return new ProductDataFromAPI();
            default:
                throw new IllegalArgumentException("Invalid source");
        }
    }
}
