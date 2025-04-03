import javax.swing.JOptionPane;

public class Operaciones{
  int i=0;
  int[] page=new int [500];
  String[] Nombre;
  String[] Autor;

  
  public Operaciones(int n){
    Nombre = new String[n];
    Autor = new String[n];
  }
  public void llenar(){
    Nombre[i]=JOptionPane.showInputDialog("Inserte el nombre del libro:");
    Autor[i]=JOptionPane.showInputDialog("Inserte el nombre del autor:");
  page[i]=Integer.parseInt(JOptionPane.showInputDialog("Inserte la cantidad de páginas"));
    i++;
  }
  public void mostrar(){
    for(int j=0;j<i;j++){
      System.out.println(j+1+". Título "+Nombre[j]+" Autor: "+Autor[j]+" Cantidad de paginas: "+page[j]);
    }
  }
  public int contar(){
    int cantidad=i;
    return cantidad;
  }
}