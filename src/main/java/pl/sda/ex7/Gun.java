package pl.sda.ex7;

import java.util.Stack;

public class Gun {
    private Stack<String> magazine = new Stack<>();
    private int initialCapacity;
    public Gun(int initialCapacity) {
        this.initialCapacity = initialCapacity;
    }

    public boolean loadBullet(String s) {
        if(initialCapacity>magazine.size())
        {
            magazine.add(s);
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isLoaded(){
        return !magazine.empty();
    }

    public String shoot(){
        if(isLoaded()){
            String bullet = magazine.pop();
            System.out.println(bullet);
            return bullet;
        }
        System.out.println("pusty magazynek");
        return("pusty magazynek");

    }
}
