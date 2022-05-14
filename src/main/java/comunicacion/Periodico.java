package comunicacion;
public class Periodico extends Escrito{
  String fecha;
  String primicia;
  String interpretacion;
  public Periodico(String origen, String titulo, String autor, int paginas,String fecha,String primicia,String interpretacion){
    super(origen,titulo,autor,paginas);
    this.fecha=fecha;
    this.primicia=primicia;
    this.interpretacion=interpretacion;
  }
  public void setInterpretacion(String idea){
    this.interpretacion=idea;
  }
  public void setFecha(String idea){
    this.fecha=idea;
  }
  public void setPrimicia(String idea){
    this.primicia=idea;
  }
  public String getInterpretacion(){
    return interpretacion;
  }
  public String getFecha(){
    return fecha;
  }
  public String getPrimicia(){
    return primicia;
  }
  public String interpretacion(){
    return interpretacion;
  }
  public String toString(){
    String r = this.getOrigen() + "\n";
		r += this.getTitulo() + "\n";
		r += this.getAutor() + "\n";
		r += this.getPaginas()+ "\n";
    r+=this.fecha+ "\n";
    r+=this.primicia;
    return r;
  }
  public int palabrasTotales(int palabrasPagina){
    return (10*palabrasPagina);
  }
}