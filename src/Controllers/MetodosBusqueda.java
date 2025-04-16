package Controllers;

import Models.Persona;
import views.ShowConsole;

public class MetodosBusqueda {

    private Persona[] people;

    private ShowConsole showConsole;

    public MetodosBusqueda(Persona[] persons) {
        showConsole = new ShowConsole();
        this.people = persons;
        showPerson();
    }

    public int busquedaLineal(int[] array, int elemento) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elemento) {
                return i;
            }
        }
        return -1;
    }

    /*
     * @parametro code a buscar
     * 
     * @return posicion de la persona encontrada
     */

    public int findPersonByCode(int code) {
        for (int i = 0; i < people.length; i++) {
            if (people[i].getCode() == code) {
                return i;
            }
        }
        return -1;
    }

    public void showPerson() {
        int codeToFind = showConsole.inputCode();
        int indexPerson = findPersonByCode(codeToFind);
        if (indexPerson >= 0) {
            showConsole.showMessage("Persona con codigo " + codeToFind + " encontrada");
            showConsole.showMessage(people[indexPerson].toString());

        } else {
            showConsole.showMessage("Persona no encontrada");
        }
    }

    public int findPersonByName() {
        return -1;
    }

    public void showPErsonByName() {
        String nameToFind = showConsole.inputName();
        int indexPerson = findPersonByName(nameToFind);

    }
}