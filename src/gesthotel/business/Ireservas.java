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
public interface Ireservas {
    public ArrayList<Ocupacion> mostrarOcupacion();
    public ArrayList<Llegadas> mostrarLlegadas();
    public ArrayList<Salidas> mostrarSalidas();
}
