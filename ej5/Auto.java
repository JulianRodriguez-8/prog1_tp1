package prog1_tp1.ej5;
/*  Ejercicio 5: Integración de conceptos
Una empresa de alquiler de vehículos necesita desarrollar un sistema para administrar sus
vehículos.
Diseñar en Java una jerarquía de clases cuya clase base sea una clase abstracta Vehiculo,
con los atributos y métodos comunes que considere necesarios. La clase deberá definir un
método abstracto calcularAlquiler(int dias).
Crear al menos las clases Auto, Motocicleta y AutoElectrico, implementando en cada una
el cálculo correspondiente del alquiler.
Utilizar encapsulamiento, herencia, constructores con super(...), sobrescritura mediante
@Override y polimorfismo.
En Main, crear un arreglo de tipo Vehiculo que contenga objetos de las distintas clases.
Solicitar al usuario la cantidad de días y mostrar el costo del alquiler de cada vehículo.
No utilizar if ni switch para determinar qué cálculo corresponde a cada vehículo.
Como ampliación, agregar una clase Camioneta a la jerarquía y utilizarla mediante el mismo
mecanismo de polimorfismo. */
public class Auto extends Vehiculo {
    private double tarifaPorDia; //Un atributo propio de Auto

    public Auto(String patente, String marca, String modelo,double tarfiaPorDia){
        super(patente, marca, modelo);
        this.tarifaPorDia=tarfiaPorDia;
    }
    //getter para poder leer tarifaPorDia desde afuera de la clase
    public double getTarifaPorDia(){
        return tarifaPorDia;
    }
    @Override 
    public double calcularAlquiler(int dias){
        return tarifaPorDia*dias;
    }

}
