public interface Interface_1 {

    //Interface one method name is superClassMethod
    //java 8 on wards interface supports default method.
   default void superClassMethod()
   {
       System.out.println("this is from Interface one");
   }
}
