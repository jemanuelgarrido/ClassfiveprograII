package edu.ejercicios.Hijo;

import edu.ejercicios.Padre.Empleado;

public class ScrumMaster extends Empleado {

    private String Departamento;

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String departamento) {
        Departamento = departamento;
    }
@Override
public String obntenerDetalles(){
        return  super.obntenerDetalles()+"\nDepto\n"+this.getDepartamento();
        //return "Nombre"+this.getNombre()+"Sueldo"+this.getSueldo()+"Depto"+this.getDepartamento();

}
    public ScrumMaster(String nombre, Double sueldo, String departamento) {
        super(nombre, sueldo);
        Departamento = departamento;
    }
}
