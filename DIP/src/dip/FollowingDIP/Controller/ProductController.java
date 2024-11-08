package dip.FollowingDIP.Controller;

import dip.FollowingDIP.Interface.IProductDataService;
import dip.FollowingDIP.Service.ProductDataServiceFactory;

public class ProductController {
    private final IProductDataService dataService;

    // Constructor for dependency injection
    public ProductController(IProductDataService dataService) {
        this.dataService = dataService;
    }
    public String getProductData(){
        return dataService.getProductData();
    }
}

