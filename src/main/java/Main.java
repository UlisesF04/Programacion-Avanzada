import javax.swing.JOptionPane;

public class Main {
  public static void main(String[] args) {
    Operaciones biblioteca = new Operaciones(500);
    int opcion=Integer.parseInt(JOptionPane.showInputDialog("Bienvenido a la biblioteca\n1. Agregar libro\n2. Mostrar libros\n3. Contar libros\n4.SALIR"));
    while(opcion!=4){
        switch(opcion){
          case 0:
      opcion=Integer.parseInt(JOptionPane.showInputDialog("Bienvenido a la biblioteca\n1. Agregar libro\n2. Mostrar libros\n3. Contar libros\n4.SALIR"));
          break;
          case 1:
            biblioteca.llenar();
            opcion=0;
          break;
          case 2:
            biblioteca.mostrar();
            opcion=0;
          break;
          case 3:
            System.out.println("La cantidad de libros en la biblioteca actualmente son: "+biblioteca.contar());
            opcion=0;
          break;
          case 4:
            System.exit(0);
          break;
          default:
            opcion=0;
          break;
        }
    }
  }
}