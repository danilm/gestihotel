/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gesthotel.business;

import gesthotel.reservas.model.Llegadas;
import gesthotel.reservas.model.Ocupacion;
import gesthotel.reservas.model.Salidas;
import java.util.ArrayList;

/**
 *
 * @author daniellopezmesa
 */
public class Reservas implements Ireservas{
    
    public ArrayList<Ocupacion> mostrarOcupacion(){
        ArrayList<Ocupacion > listadoOcupacion = new ArrayList<Ocupacion>();
        
        //Metemos algunos clientes
        Ocupacion ocupacion = new Ocupacion();
        
        ocupacion.setCliente("Daniel Lopez");
        ocupacion.setHabitacion("102");
        ocupacion.setLlegada("01/05/2017");
        ocupacion.setSalida("03/05/2017");
        
        listadoOcupacion.add(ocupacion);
        
        ocupacion = new Ocupacion();
        
        ocupacion.setCliente("Pepe Nuñez");
        ocupacion.setHabitacion("206");
        ocupacion.setLlegada("03/05/2017");
        ocupacion.setSalida("04/05/2017");
        
        listadoOcupacion.add(ocupacion);
        
        ocupacion = new Ocupacion();
        
        ocupacion.setCliente("Javier Ortiz");
        ocupacion.setHabitacion("105");
        ocupacion.setLlegada("01/05/2017");
        ocupacion.setSalida("05/05/2017");
        
        listadoOcupacion.add(ocupacion);
        
        ocupacion = new Ocupacion();
        
        ocupacion.setCliente("Maria Dominguez");
        ocupacion.setHabitacion("305");
        ocupacion.setLlegada("04/05/2017");
        ocupacion.setSalida("07/05/2017");
        
        listadoOcupacion.add(ocupacion);
        return listadoOcupacion;
    }
    public ArrayList<Llegadas> mostrarLlegadas(){
        return null;
    }
    public ArrayList<Salidas> mostrarSalidas(){
        return null;
    }
}
