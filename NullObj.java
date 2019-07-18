abstract class AbstractCarro {
   protected String tipo;
   public abstract boolean isNil();
   public abstract String getTipo();
}
 class RealCarro extends AbstractCarro {

   public RealCarro(String tipo) {
      this.tipo = tipo;		
   }
   
   @Override
   public String getTipo() {
      return tipo;
   }
   
   @Override
   public boolean isNil() {
      return false;
   }
}
 class NullCarro extends AbstractCarro {

   @Override
   public String getTipo() {
      return "No existe ese modelo de carro";
   }

   @Override
   public boolean isNil() {
      return true;
   }
}
 class CarroFactory {
	
   public static final String[] tipos = {"Toyota", "Mazda", "Chevrolet"};

   public static AbstractCarro getCarro(String tipo){
   
      for (int i = 0; i < tipos.length; i++) {
         if (tipos[i].equalsIgnoreCase(tipo)){
            return new RealCarro(tipo);
         }
      }
      return new NullCarro();
   }
}
 class Main {
   public static void main(String[] args) {

      AbstractCarro Carro1 = CarroFactory.getCarro("Mazda");
      AbstractCarro Carro2 = CarroFactory.getCarro("Honda");
      AbstractCarro Carro3 = CarroFactory.getCarro("Toyota");
      AbstractCarro Carro4 = CarroFactory.getCarro("Audi");

      System.out.println("Carros");
      System.out.println(Carro1.getTipo());
      System.out.println(Carro2.getTipo());
      System.out.println(Carro3.getTipo());
      System.out.println(Carro4.getTipo());
   }
}
