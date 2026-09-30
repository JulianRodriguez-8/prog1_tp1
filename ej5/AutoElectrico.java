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
public class AutoElectrico extends Vehiculo { //para heredar de otras
    private double tarifaPorDia;
    private double recargoPorDia; //le doy un costo extra
    public AutoElectrico (String patente, String marca,String modelo,double tarifaPorDia,double recargoPorDia){
        super(patente,marca,modelo);
        this.tarifaPorDia=tarifaPorDia;
        this.recargoPorDia=recargoPorDia;
    }

    //get
    public double getRecargoPorDia(){
        return recargoPorDia;
    }

    @Override 
    public double calcularAlquiler(int dias){
        //uso el tarifa por dias y le sumo recargo
        return (tarifaPorDia*dias)+ (recargoPorDia*dias);

    }

}
