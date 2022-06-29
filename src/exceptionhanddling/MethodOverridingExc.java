package exceptionhanddling;

public class MethodOverridingExc {
    public void show() throws ArithmeticException{
        System.out.println("in show");
    }
}

 class Sample extends MethodOverridingExc{
     @Override
     public void show() throws ArithmeticException {
         super.show();
     }
 }


//  If parent class declare exception then you can declare same exception in child
//  if parent class declare no exception then you can declare unchecked exception in child
//  if parent class declare unchecked exception then you can not declare parent exception in child
