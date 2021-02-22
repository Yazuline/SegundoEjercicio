package segundoejercicio;
import java.util.*;

/**
 *
 * @author yazvivbe
 */
public class SegundoEjercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
          Empleado emp1 = new Empleado ("Carlos","Torres", 12345, 250000);
          Empleado emp2 = new Empleado ("Sofia","Mejia",  12346, 250000);
          Empleado emp3 = new Empleado ("Lorena","Cajiado", 12347, 250000);
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
        
        
    }
}

    