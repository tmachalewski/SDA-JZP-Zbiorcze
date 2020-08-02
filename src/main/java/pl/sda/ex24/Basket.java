package pl.sda.ex24;

public class Basket {
    int counter=0;
    public void addToBasket(){
        if(counter==10){
            throw new BasketFullException();
        }
        counter++;
    }

    public void removeFromBasket(){
        if(counter==0){
            throw new BasketEmptyException();
        }
        counter++;
    }
}
