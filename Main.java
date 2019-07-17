interface I {
  void doIt();
}

class Carro implements I {
  public void doIt() {
    System.out.print("Carro con ");
  }
}

abstract class D implements I {
  private I core;

  public D(I inner) {
    core = inner;
  }

  public void doIt() {
    core.doIt();
  }
}

class Nitro extends D {
  public Nitro(I inner) {
    super(inner);
  }

  public void doIt() {
    super.doIt();
    doNitro();
  }

  private void doNitro() {
    System.out.print("nitro, ");
  }
}

class Neon extends D {
  public Neon(I inner) {
    super(inner);
  }

  public void doIt() {
    super.doIt();
    doNeon();
  }

  private void doNeon() {
    System.out.print("neon, ");
  }
}

class Alarma extends D {
  public Alarma(I inner) {
    super(inner);
  }

  public void doIt() {
    super.doIt();
    doAlarma();
  }

  private void doAlarma() {
    System.out.print("alarma, ");
  }
}

class Aire extends D {
  public Aire(I inner) {
    super(inner);
  }

  public void doIt() {
    super.doIt();
    doAire();
  }

  private void doAire() {
    System.out.print("aire acondicionado, ");
  }
}

class Turbo extends D {
  public Turbo(I inner) {
    super(inner);
  }

  public void doIt() {
    super.doIt();
    doTurbo();
  }

  private void doTurbo() {
    System.out.print("turbo, ");
  }
}

class Oxigeno extends D {
  public Oxigeno(I inner) {
    super(inner);
  }

  public void doIt() {
    super.doIt();
    doOxigeno();
  }

  private void doOxigeno() {
    System.out.print("oxigeno, ");
  }
}

class Rines extends D {
  public Rines(I inner) {
    super(inner);
  }

  public void doIt() {
    super.doIt();
    doRines();
  }

  private void doRines() {
    System.out.print("rines, ");
  }
}


class FibraCarbono extends D {
  public FibraCarbono(I inner) {
    super(inner);
  }

  public void doIt() {
    super.doIt();
    doFibraCarbono();
  }

  private void doFibraCarbono() {
    System.out.print("fibra de carbono, ");
  }
}

class Camaras extends D {
  public Camaras(I inner) {
    super(inner);
  }

  public void doIt() {
    super.doIt();
    doCamaras();
  }

  private void doCamaras() {
    System.out.print("camaras para parquear, ");
  }
}

class Elon extends D {
  public Elon(I inner) {
    super(inner);
  }

  public void doIt() {
    super.doIt();
    doElon();
  }

  private void doElon() {
    System.out.print("el mismisimo Elon Musk, ");
  }
}

class Main {
  public static void main(String[] args) {
    //Decorator
    I[] array = { new Elon(new Carro()), new Neon(new Nitro(new Carro())), new Camaras(new Turbo(new Oxigeno(new Carro()))) };
    for (I anArray : array) {
      anArray.doIt();
      System.out.print("  ");
    }
  }
}