import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.lang.*;
//package primerejercicio;

/**
 *
 * @author yazvivbe
 */
public class EnmascararCuenta {
  private String expRegular = "(?=(?!^)(?:\\d{4})+$)";
  private String numCuenta = "3481619235837588";
  private String espCuenta = " ";
  
  //Constructor 
  EnmascararCuenta(){}

  public void Convertir()
  {
  final Pattern pat  = Pattern.compile(expRegular);
  final Matcher mat = pat.matcher(numCuenta);
  String resultado = mat.replaceAll(espCuenta);
  StringBuilder nuevoResultado = new StringBuilder(resultado);
  nuevoResultado.setCharAt(5, '*');
  nuevoResultado.setCharAt(6, '*');
  nuevoResultado.setCharAt(7, '*');
  nuevoResultado.setCharAt(8, '*');
  nuevoResultado.setCharAt(10, '*');
  nuevoResultado.setCharAt(11, '*');
  nuevoResultado.setCharAt(12, '*');
  nuevoResultado.setCharAt(13, '*');
  resultado= nuevoResultado.toString();
  System.out.println("El numero de cuenta: " + resultado);

  }

    
}
