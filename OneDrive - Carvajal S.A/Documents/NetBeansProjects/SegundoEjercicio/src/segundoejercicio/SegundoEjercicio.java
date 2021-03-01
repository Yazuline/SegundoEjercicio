package segundoejercicio;
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
        
          Empleado emp1 = new Empleado ("Carlos","Arias", 12345, 50000);
          Empleado emp2 = new Empleado ("Sofia","Mejia",  12346,  80000);
          Empleado emp3 = new Empleado ("Lucia","Cajiado", 12347, 90000);
          Empleado emp4 = new Empleado ("Lorena","Cajiado", 12347, 270000);
                  // TODO code application logic here
        
                  
        Set<Empleado> coleccionEmpleado=new HashSet<>();
        
        coleccionEmpleado.add(emp1);
        coleccionEmpleado.add(emp2);
        coleccionEmpleado.add(emp3);
        coleccionEmpleado.add(emp4);
        
        coleccionEmpleado.stream().map((empleado) -> {
            System.out.println(empleado.getNombre() +" "+ empleado.getNombre()  + " " +empleado.getId());
            return empleado;
        }).map((empleado) -> {
            if (empleado.getSalario()> 10000)
            {
                
                System.out.println(empleado.getNombre() + " Gana " +empleado.getSalario());
            }
            return empleado;
        }).map((empleado) -> {
            if (empleado.getSalario() < 70000)
                
            {
                System.out.println(empleado.getNombre() + " Gana menos de (70000)  tan solo  gana =" +empleado.getSalario());
            }
            return empleado;
        }).forEachOrdered((empleado) -> {
            list<String>nombreCompleto = (list<String>) coleccionEmpleado.stream()
                    .filter(empleados->empleado.getSalario()>70000);
            
            System.out.println(empleado.getNombre() + " Gana metodo  " + nombreCompleto);
        });
   
}

        
    }

 