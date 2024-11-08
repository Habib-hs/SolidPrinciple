package dip.FollowingDIP.Service;

import dip.FollowingDIP.Interface.IProductDataService;

public class ProductDataFromDB implements IProductDataService {
    @Override
    public String getProductData() {
        return "Product data from database";
    }
}
