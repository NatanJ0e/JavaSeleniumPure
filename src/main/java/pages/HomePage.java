package pages;

public class HomePage extends BasePage {

    public void clickAddCartButton(){
        clickElementID("add-to-cart-sauce-labs-bike-light");
    }

    public void clickCartIcon(){
        clickElementID("shopping_cart_container");
    }

    public String asserTextProduct(){
        return getTextID("item_0_title_link");
    }
}
