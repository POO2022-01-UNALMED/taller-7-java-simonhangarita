package comunicacion;
public class Fabula extends Escrito{
  String ensenanza;
  String interpretacion;
  public Fabula(String origen, String titulo, String autor, int paginas,String ensenanza,String interpretacion){
    super(origen,titulo,autor,paginas);
    this.ensenanza= ensenanza;
    this.interpretacion=interpretacion;
  }
  public void setInterpretacion(String idea){
    this.interpretacion=idea;
  }
  public void setEnsenanza(String idea){
    this.ensenanza=idea;
  }
  public String getInterpretacion(){
    return interpretacion;
  }
  public String getEnsenanza(){
    return ensenanza;
  }
  public String interpretacion(){
    return interpretacion;
  }
  public String toString(){
    String r = this.getOrigen() + "\n";
		r += this.getTitulo() + "\n";
		r += this.getAutor() + "\n";
		r += this.getPaginas()+ "\n";
    r +=this.ensenanza ;
    return r;
  }
  public int palabrasTotales(int palabrasPagina){
    return (palabrasPagina);
  }
  
}