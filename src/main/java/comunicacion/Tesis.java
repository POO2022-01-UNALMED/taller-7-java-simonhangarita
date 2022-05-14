package comunicacion;
import java.util.ArrayList;
public class Tesis extends Escrito{
  String idea;
  static ArrayList<String> argumentos=new ArrayList<String>();
  String conclusion;
  String referencias;
  String interpretacion;
  public Tesis(String origen, String titulo, String autor, int paginas,String idea,ArrayList<String> argumentos ,String conclusion,String referencias, String interpretacion){
    super(origen,titulo,autor,paginas);
    this.idea=idea;
    Tesis.argumentos=argumentos;
    this.conclusion=conclusion;
    this.referencias=referencias;
    this.interpretacion=interpretacion;
  }
  public void setIdea(String idea){
    this.idea=idea;
  }
  public static void setArgumentos(ArrayList<String> argumentos){
    Tesis.argumentos=argumentos;
  }
  public void setConclusion(String idea){
    this.conclusion=idea;
  }
  public void setReferencias(String idea){
    this.referencias=idea;
  }
  public void setInterpretacion(String idea){
    this.interpretacion=idea;
  }
  public String getIdea(){
    return idea;
  }
  public String getConclusion(){
    return conclusion;
  }
  public String getReferencias(){
    return referencias;
  }
  public String getInterpretacion(){
    return interpretacion;
  }
  public ArrayList<String> getArgumentos(){
    return argumentos;
  }
  public String interpretacion(){
    return interpretacion;
  }
  public String toString(){
    String r = this.getOrigen() + "\n";
		r += this.getTitulo() + "\n";
		r += this.getAutor() + "\n";
		r += this.getPaginas()+ "\n";
    r +=this.idea+ "\n";
    r+=this.conclusion+ "\n";
    r+=this.referencias;
    return r;
  }
  public int palabrasTotales(int palabrasPagina){
    return (5*palabrasPagina);
  }
}