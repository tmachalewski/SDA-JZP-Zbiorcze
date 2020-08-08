package pl.sda.ex27;

public class Joiner<T> {
    String separator;

    public Joiner(String separator) {
        this.separator = separator;
    }

    public String join(T... objects)
    {
        //For consideration: use stringBuilder and there shouldnt be separator after last object
        String output = "";
        for(T obj : objects)
        {
            output+=obj.toString()+separator;
        }
        return output;
    }
}
