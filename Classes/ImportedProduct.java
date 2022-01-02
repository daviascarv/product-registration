package Products.Classes;


public class ImportedProduct extends Products{
    private Double customsFee;

    public ImportedProduct(){
        super();
    }
    public ImportedProduct(String name, Double price, Double customsFee){
        super(name, price);
        this.customsFee = customsFee;
    }
    public Double getCustomsFee() {
        return customsFee;
    }
    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }
    public double totalPrice(){
        return getPrice() + customsFee;
    }
    public String priceTag(){
        return getName()

                    +"(imported)"
                    +"$";
    }

    
    
}
