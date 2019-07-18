import java.util.HashMap;
interface Transporte {
   void draw();
}
class Carro implements Transporte {
   private String tipo;
   private String color;
  

   public Carro(String tipo){
      this.tipo = tipo;		
   }

   public void setColor(String color) {
      this.color = color;
   }


   @Override
   public void draw() {
      System.out.println("Es un carro de tipo " + tipo + " de color " + color );
   }
}

class ShapeFactory {

   private static final HashMap<String,Carro> carroMap = new HashMap<String,Carro>();

   public static Transporte getCarro(String tipo) {
      Carro carro = (Carro)carroMap.get(tipo);

      if(carro == null) {
         carro = new Carro(tipo);
         carroMap.put(tipo, carro);
         System.out.println("Creando carro de tipo : " + tipo);
      }
      return carro;
   }
}
class Main {
   static String tipos[] = { "gas", "electrico", "hibrido", "combustible"};
   static String colores[] = { "rojo", "verde", "azul"};
   public static void main(String[] args) {

      for(int i=0; i < 20; ++i) {
         Carro carro = (Carro)ShapeFactory.getCarro(getRandomTipo());
         carro.setColor(getRandomColor());
         carro.draw();
      }
   }
   private static String getRandomTipo() {
      return tipos[(int)(Math.random()*tipos.length)];
   }
   private static String getRandomColor() {
      return colores[(int)(Math.random()*colores.length)];
   }
}
