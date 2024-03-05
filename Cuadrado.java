public class Cuadrado extends Figura {
 
 private double base;
 private double altura;
 
 
 public Cuadrado(double base, double altura){
  this.base = base;
  this.altura = altura;
  }
  
  @Override
  public double area(){
   return this.base * this.altura;
   }
   
   @Override
  public double perimetro(){
   return this.base * this.altura;
   }
   
