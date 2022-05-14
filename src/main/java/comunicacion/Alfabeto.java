package comunicacion;
import java.util.ArrayList;
public class Alfabeto extends Pictograma{
  static ArrayList<String> letras=new ArrayList<String>();
  String interpretacion;
  public Alfabeto(String origen,ArrayList<String> letras,String interpretacion){
    super(origen);
    Alfabeto.letras=letras;
    this.interpretacion=interpretacion;  
  }
  public void setInterpretacion(String idea){
    this.interpretacion=idea;
  }
  public static void setLetras(ArrayList<String> idea){
    Alfabeto.letras=idea;
  }
  public String getInterpretacion(){
    return interpretacion;
  }
  public static ArrayList<String> getLetras(){
    return letras;
  }
  public int cantidadLetras(){
    return letras.size();
  }
  public String interpretacion(){
    return interpretacion;
  }
  public String toString(){
    String r= "";
    for (String l:letras){
      r+=l+", ";
    }
    return r;
  }
}