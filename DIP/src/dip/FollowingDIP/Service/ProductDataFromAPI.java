package dip.FollowingDIP.Service;

import dip.FollowingDIP.Interface.IProductDataService;

public class ProductDataFromAPI implements IProductDataService {
    @Override
    public String getProductData() {
        return "Product data from API";
    }
}
