public class ChildrenBook extends Book{
    int age;
    public double getPrice(){
        System.out.println(getTitle()+" is on sale 70%");
        return super.getPrice()*0.3;
    }
}
