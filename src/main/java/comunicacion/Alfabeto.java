package comunicacion;
public class Alfabeto extends Pictograma{
  static String[] letras=new String[2];
  String interpretacion;
  public Alfabeto(String origen,String[] letras,String interpretacion){
    super(origen);
    Alfabeto.letras=letras;
    this.interpretacion=interpretacion;  
  }
  public void setInterpretacion(String idea){
    this.interpretacion=idea;
  }
  public static void setLetras(String[] idea){
    Alfabeto.letras=idea;
  }
  public String getInterpretacion(){
    return interpretacion;
  }
  public static String[] getLetras(){
    return letras;
  }
  public int cantidadLetras(){
    int c=0;
    for (String l:letras){
      c+=1;
    }
    return c;
  }
  public String interpretacion(){
    return interpretacion;
  }
  public String toString(){
    String r= "";
    for (String l:letras){
      if (l!=letras[-1]){
        r+=l+", ";
      }
      r+=l;
    }
    return r;
  }
}