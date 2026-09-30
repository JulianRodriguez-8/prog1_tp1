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
package prog1_tp1.ej5;

import java.util.Scanner;

public class main_ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//para ingresar

        Auto auto1 = new Auto("AA12BB", "FIAT", "UNO", 5000);
        Motocicleta moto1 = new Motocicleta("CC456DD", "Honda", "Wave", 2000);
        AutoElectrico electrico1 = new AutoElectrico("EE789FF", "Tesla", "Model 3", 8000, 1500);
        Camioneta camioneta1 = new Camioneta("GG012HH", "Toyota", "Hilux", 7000);

        Vehiculo [] vehiculos={auto1,moto1,electrico1,camioneta1};

        System.out.println("Ingrese la cantidad de dias de alquiler:");
        int dias= sc.nextInt();

        for(Vehiculo v: vehiculos){
            System.out.println(v.getMarca()+" "+v.getModelo()+"("+v.getPatente()+")- Costo alquiler: " + v.calcularAlquiler(dias));
        }

    }
}
