package Controllers;

import Models.Persona;
import views.ShowConsole;

import java.util.Objects;

public class MetodosBusqueda {

    private Persona[] people;

    private ShowConsole showConsole;

    public MetodosBusqueda(Persona[] persons) {
        showConsole = new ShowConsole();
        this.people = persons;
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

    public int findPersonByName(String code2) {
        for (int i = 0; i < people.length; i++) {
            if (Objects.equals(people[i].getName(), code2)) {
                return i;
            }
        }
        return -1;
    }

    public void showPersonByName() {
        String nameToFind = showConsole.inputName();
        int indexPerson = findPersonByName(nameToFind);
        if (indexPerson >= 0) {
            showConsole.showMessage("Persona de nombre " + nameToFind + " encontrada");
            showConsole.showMessage(people[indexPerson].toString());
        } else {
            showConsole.showMessage("Persona no encontrada");
        }
    }
}
