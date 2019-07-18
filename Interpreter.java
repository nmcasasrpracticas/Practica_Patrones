interface Expression {
   public boolean interpret(String context);
}
class TerminalExpression implements Expression {
	
   private String data;

   public TerminalExpression(String data){
      this.data = data; 
   }

   @Override
   public boolean interpret(String context) {
   
      if(context.contains(data) && (context.contains("OwO") || context.contains("UwU"))){
         return true;
      }
      return false;
   }
}
class OrExpression implements Expression {
	 
   private Expression expr1 = null;
   private Expression expr2 = null;

  public OrExpression(Expression expr1, Expression expr2) { 
      this.expr1 = expr1;
      this.expr2 = expr2;
   }

   @Override
   public boolean interpret(String context) {		
      return expr1.interpret(context) || expr2.interpret(context);
   }
}
class Main {

   public static Expression getOrExpression(){
      Expression owo = new TerminalExpression("Hola");
      Expression uwu = new TerminalExpression("Como");
      return new OrExpression(owo, uwu);		
   }

   public static void main(String[] args) {

      Expression isOwOUwU = getOrExpression();
      System.out.println(isOwOUwU.interpret("Hola esto tiene que tener UwU"));
   }
}
