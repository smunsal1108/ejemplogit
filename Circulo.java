public class Circulo extends Figura {
 private double radio;
 
 public Circulo(double radio){
  this.radio = radio;
  }
  
  @Override
  public double area(){
   return Math.PI * radio * radio;
   }
   
   @Override
  public double perimetro(){
   return Math.PI * radio * 2;
   }
   
