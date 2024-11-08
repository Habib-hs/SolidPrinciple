package dip;

import dip.FollowingDIP.Interface.IProductDataService;
import dip.FollowingDIP.Service.ProductDataFromDB;
import dip.FollowingDIP.Service.ProductDataServiceFactory;
import dip.ViolatingDIP.Controller.ProductController;

public class Main {
    public static void main(String[] args) {
        // Bad implementation (violating DIP)
        System.out.println("=== Bad Implementation ===");
        ProductController badController = new ProductController();
        System.out.println(badController.getProductData("db"));
        System.out.println(badController.getProductData("api"));

        // Good implementation (Following DIP)
        System.out.println("\n" + "=== Good Implementation ===");
        ////Decouple Factory from Controller
        ProductDataServiceFactory factory = new ProductDataServiceFactory();

        IProductDataService dbService =  factory.createService("db");
        dip.FollowingDIP.Controller.ProductController dbController = new dip.FollowingDIP.Controller.ProductController(dbService);
        System.out.println(dbController.getProductData());

        IProductDataService apiService = factory.createService("api");
        dip.FollowingDIP.Controller.ProductController apiController = new dip.FollowingDIP.Controller.ProductController(apiService);
        System.out.println(apiController.getProductData());


    }
}
