package dip.ViolatingDIP.Controller;

import dip.ViolatingDIP.Service.ProductDataFromAPI;
import dip.ViolatingDIP.Service.ProductDataFromDB;

public class ProductController {
    private ProductDataFromDB dbService;
    private ProductDataFromAPI apiService;

    public ProductController() {
        this.dbService = new ProductDataFromDB();
        this.apiService = new ProductDataFromAPI();
    }

    public String getProductData(String source) {
        if ("db".equals(source)) {
            return dbService.getProductDataFromDB();
        } else {
            return apiService.getProductDataFromAPI();
        }
    }
}
