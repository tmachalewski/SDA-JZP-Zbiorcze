package pl.sda.ex24;

public class Basket {
    int counter=0;
    public void addToBasket(){
        try {
            if (counter == 10) {
                throw new BasketFullException();
            }
            counter++;
        }catch (BasketFullException e){
            System.out.println("Basket is full");
        }
    }

    public void removeFromBasket() throws BasketEmptyException {
        if(counter==0){
            throw new BasketEmptyException();
        }
        counter++;
    }
}
