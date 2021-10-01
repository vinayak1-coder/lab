/*
Anonymous class(name less classes)
by using abstract
by using interface
if you do now know the behavior then we use abstract modifier
with class
with method

illegal combination

1. private and abstract
2. final and abstract

object arr[] = new object[5];
arr[0] = new Cresult(;
arr[1] = new string("GLA");
 */
abstract class Result
{
   abstract public void calcResult();
}
//class Cresult extends Result
//{

  // @Override
   // public void calcResult() {
      //System.out.println("p p (pagal prayas)");
   //}
//}
public class test {
   public static void main(String[] args) {
      //Cresult obj = new Cresult();
      //obj.calcResult();
      //new Cresult().calcResult();
      new Result() {
         @Override
         public void calcResult() {
            System.out.println("pagal kashish");
         }
      }.calcResult();
   }
}
