package pl.sda;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello");
        try {
            try{
                try{
                    System.out.print("A");
                    throw new Exception ("1");

                } catch (Exception e){
                    System.out.print("B");
                    Exception exc = new Exception ("2");
                    throw exc;

                } finally {
                    System.out.print("C");
                    throw new Exception ("3");
                }
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

    }
}
