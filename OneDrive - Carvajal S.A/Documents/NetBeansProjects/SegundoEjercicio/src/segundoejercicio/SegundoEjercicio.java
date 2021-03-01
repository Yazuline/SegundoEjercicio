package segundoejercicio;
import com.sun.org.apache.xerces.internal.xs.XSNotationDeclaration;
import java.util.*;
import static java.util.Collections.list;
import java.util.function.Function;
import java.util.stream.Stream;
import static javafx.scene.input.KeyCode.R;

/**
 *
 * @author yazvivbe
 */
public class SegundoEjercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
          Empleado emp1 = new Empleado ("Carlos","Torres", 12345, 50000);
          Empleado emp2 = new Empleado ("Sofia","Mejia",  12346,  80000);
          Empleado emp3 = new Empleado ("Lorena","Cajiado", 12347, 90000);
          Empleado emp4 = new Empleado ("Lorena","Cajiado", 12347, 270000);
                  // TODO code application logic here
        
                  
        Set<Empleado> coleccionEmpleado=new HashSet<Empleado>();
        
        coleccionEmpleado.add(emp1);
        coleccionEmpleado.add(emp2);
        coleccionEmpleado.add(emp3);
        coleccionEmpleado.add(emp4);
        
        for(Empleado empleado: coleccionEmpleado )
        {
            System.out.println(empleado.getNombre() +" "+ empleado.getNombre()  + " " +empleado.getId());
        }
        
        //Convierte  la lista en streams
        Stream<Empleado> nombreCompleto;
        nombreCompleto = coleccionEmpleado.stream().filter(coleccionEmpleado-> coleccionEmpleado.getNombre());
         
         
        
        //Empleado con Mayor Salario
        System.out.println("El mayor salario");
        
         //Empleado con Menor  Salario
        System.out.println("El mayor salario");
        
         //Ordenar por nombre
        System.out.println("El mayor salario");
        
         //Suma de Salario mayor a 70000
        System.out.println("El mayor salario");
        
         //Empleado primeros 5 salarios con el mayor salario
        System.out.println("El mayor salario");
        
         //Numero de empleados cuyo primer aapellido empice por A
        System.out.println("El mayor salario");
        
        
        
        
    }
}

    