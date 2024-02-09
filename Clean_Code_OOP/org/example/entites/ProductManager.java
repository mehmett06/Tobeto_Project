package org.example.entites;

import java.math.BigDecimal;
import java.sql.SQLOutput;
import java.util.Currency;

public class ProductManager implements IProductService{

    private  IBankService _bankService;
    public ProductManager(IBankService bankService) {
        this._bankService = bankService;
    }

    @Override
    public void Sell(Product product, Customer customer) {

        double price =product.getPrice();

        System.out.println("Alışverişinizi için teşekkürler ");
        System.out.println("ürünlerinizin toplam tutarı : "+product.getPrice());
        System.out.println("Alıcının adı ve soyadı : "+customer.getName());
        System.out.println("-----------------------------");

        CurrecyRate currecyRate =new CurrecyRate(price,1);
        _bankService.convertRate(currecyRate);
        System.out.println(price);
        CurrecyRate currencyRates = new CurrecyRate(price,2);
        price =  _bankService.convertRate(currencyRates);
        System.out.println(price);

    }
    public void sell(Product product, Military military){
        double price = product.getPrice() * military.getDiscountRate();
        System.out.println("Askeri indirim olduğu için %20 indirim kazandınız");
        System.out.println("Toplam fiyat " + product.getPrice());
        System.out.println("Askeri indirimli fiyatınız: " + price);
    }

}
