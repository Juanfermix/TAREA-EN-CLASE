/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.ups.estructurat2;

/**
 *
 * @author JUAN ALVAREZ
 */
public class EstructuraT2 {

    public static void main(String[] args) {
    System.out.println("colas y pilas implementos generica");
        //instancias de las clases
        ColaTarea<String> colaTareas = new ColaTarea<>();
        ColaTarea<Integer> colaTareasInt = new ColaTarea<>();
        ColaTarea<int[]> colaTareasArregloEnteros = new ColaTarea<>();
        ColaTarea<String[]> colaTareasArregloString = new ColaTarea<>();
        
             //clase pilatarea
        PilaTareas<Integer>pilaTareas = new PilaTareas<>();
        PilaTareas<ColaTarea>pilaTareasDeColas = new PilaTareas<>();
        
        //Insercion de tareas a la cola
        colaTareas.agregarTarea(new Tarea(1, "Taea1"));
        colaTareas.agregarTarea(new Tarea(2, "Taea2"));
        colaTareas.agregarTarea(new Tarea(3, "Taea3"));
        colaTareas.agregarTarea(new Tarea(4, "Taea4"));
        colaTareas.agregarTarea(new Tarea(5, "Taea5"));
        
        colaTareasInt.agregarTarea(new Tarea(6,6 ));
        colaTareasInt.agregarTarea(new Tarea(7,7 ));
        colaTareasInt.agregarTarea(new Tarea(8,8));
        
        a = new []{212,21};
        
        
          //Iinsercion
        pilaTareas.agregarTarea(new Tarea(6,6));
        pilaTareas.agregarTarea(new Tarea(7,7));
        pilaTareas.agregarTarea(new Tarea(8,8));

        //procesar las tareas de la cola<Srtrng>
        while (!colaTareas.estaVacia()) {
            Tarea<String> tareaProcesada = colaTareas.procesarTarea();

            System.out.println("Prosecado tarea de la cola: \n\t sale-->" + tareaProcesada.getId() + "-" + tareaProcesada.getAtributo());
        }
        System.out.println("\n------------\n");
        while (!colaTareas.estaVacia()) {
            Tarea<String> tareaProcesada = colaTareas.procesarTarea();

            System.out.println("Prosecado tarea de la cola: \n\t sale-->" + tareaProcesada.getId() + "-" + tareaProcesada.getAtributo());


        } 
    }
}
