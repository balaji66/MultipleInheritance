

// implemented two interfaces
public class ChildClass implements Interface_1, Interface_2 {

    //Overridden method 
    @Override
    public void superClassMethod() {
        Interface_1.super.superClassMethod();
        Interface_2.super.superClassMethod();
    }

    public static void main(String [] args)
    {
        ChildClass c =new ChildClass();
        c.superClassMethod();

    }


}
