package Model;

import Controller.Employee;

public class Ordenamiento {
    public Employee[] Ordenar(Employee[] employees, int n){
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = employees[i].getID();
        }
        // Mover el límite del subarray no ordenado
        for (int i = 0; i < n - 1; i++) {
            // Encontrar el mínimo elemento en el subarray no ordenado
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            // Intercambiar el elemento encontrado con el primer elemento
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }

        Employee[] TempEmployee = new Employee[employees.length];

        int cont = 0;
        for(int index : array){
            for(int i = 0; i <= n; i++){
                if(employees[i].getID() == index){
                    TempEmployee[cont] = employees[i];
                    cont++;
                }
            }
        }
        return TempEmployee;
    }
}
