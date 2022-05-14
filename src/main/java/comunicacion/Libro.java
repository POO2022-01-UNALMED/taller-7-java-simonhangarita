package comunicacion;
public class Libro extends Escrito{
  String co_autor;
  String editorial;
  String edicion;
  String interpretacion;
  public Libro(String origen, String titulo, String autor, int paginas,String co_autor,String editorial,String edicion,String interpretacion){
    super(origen,titulo,autor,paginas);
    this.co_autor=co_autor;
    this.editorial=editorial;
    this.edicion=edicion;
    this.interpretacion=interpretacion;
  }
  public void setInterpretacion(String idea){
    this.interpretacion=idea;
  }
  public void setCo_autor(String idea){
    this.co_autor=idea;
  }
  public void setEditorial(String idea){
    this.editorial=idea;
  }
  public void setEdicion(String idea){
    this.edicion=idea;
  }
  public String getInterpretacion(){
    return interpretacion;
  }
  public String getCo_autor(){
    return co_autor;
  }
  public String getEditorial(){
    return editorial;
  }
  public String getEdicion(){
    return edicion;
  }
  public String interpretacion(){
    return interpretacion;
  }
  public String toString(){
    String r = this.getOrigen() + "\n";
		r += this.getTitulo() + "\n";
		r += this.getAutor() + "\n";
		r += this.getPaginas()+ "\n";
    r +=this.co_autor+ "\n";
    r+=this.editorial+ "\n";
    r+=this.edicion;
    return r;
  }
  public int palabrasTotales(int palabrasPagina){
    return (2*palabrasPagina*getPaginas());
  }
}