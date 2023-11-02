public class ComicBook extends Book{
    String characterName;

    @Override
    public double getPrice(){
        System.out.println(getTitle() + "was sold on a 60% discount");
        return super.getPrice()*0.4;
    }
     public double getPrice(double priceReduction){
        System.out.println(getTitle() + "is on sale "+ priceReduction + "%");
        return super.getPrice()*(1.0-priceReduction/100);
    }
}
