#include <iostream>
#include <limits>

using namespace std;

class Persona {
public:
    string nombre;
    int edad;

private:
    string cedula;

public:
    Persona(string nombre, int edad) : nombre(nombre), edad(edad) {
        bool validInput = false;
        while (!validInput) {
            try {
                cout << "Ingrese la cedula: ";
                cin >> this->cedula;
                validInput = true;
            } catch (exception& e) {
                cout << "Error!!! Ingresa una cedula válida." << endl;
                cin.clear();
                cin.ignore(numeric_limits<streamsize>::max(), '\n');
            }
        }
    }

    void comer() {
        cout << "Persona comiendo" << endl;
    }

    void dormir() {
        cout << "Persona durmiendo" << endl;
    }
};

class Visitante : public Persona {
public:
    int numeroCarnet;

    Visitante(string nombre, int edad, int numeroCarnet) : Persona(nombre, edad), numeroCarnet(numeroCarnet) {}

    void comprar() {
        cout << "Visitante comprando" << endl;
    }
};

class Cuidador : public Persona {
public:
    int numeroId;

    Cuidador(string nombre, int edad, int numeroId) : Persona(nombre, edad), numeroId(numeroId) {}

    void alimentarAnimales() {
        cout << "Cuidador alimentando animales" << endl;
    }
};

class Zoo {
public:
    string nombre;
    int edad;

private:
    int numeroRegistro;

public:
    Zoo(string nombre, int edad) : nombre(nombre), edad(edad) {
        bool validInput = false;
        while (!validInput) {
            try {
                cout << "Ingrese el número de registro: ";
                cin >> this->numeroRegistro;
                validInput = true;
            } catch (exception& e) {
                cout << "Error!!! Ingresa un número de registro válido." << endl;
                cin.clear();
                cin.ignore(numeric_limits<streamsize>::max(), '\n');
            }
        }
    }

    void comer() {
        cout << "Zoo comiendo" << endl;
    }

    void dormir() {
        cout << "Zoo durmiendo" << endl;
    }
};

class Leon : public Zoo {
public:
    int numeroVacunas;

    Leon(string nombre, int edad, int numeroVacunas) : Zoo(nombre, edad), numeroVacunas(numeroVacunas) {}

    void rugir() {
        cout << "León rugiendo" << endl;
    }

    void cazar() {
        cout << "León cazando" << endl;
    }
};

class Pinguino : public Zoo {
public:
    Pinguino(string nombre, int edad) : Zoo(nombre, edad) {}

    void nadar() {
        cout << "Pingüino nadando" << endl;
    }

    void pescar() {
        cout << "Pingüino pescando" << endl;
    }
};

Visitante visitantecons() {
    string nombre;
    int edad, numeroCarnet;
    cin.ignore(numeric_limits<streamsize>::max(), '\n');
    cout << "Ingrese el nombre del visitante: ";
    getline(cin, nombre);
    cout << "Ingrese la edad del visitante: ";
    cin >> edad;
    cout << "Ingrese el número de carnet del visitante: ";
    cin >> numeroCarnet;
    return Visitante(nombre, edad, numeroCarnet);
}

Cuidador cuidadorcon() {
    string nombre;
    int edad, numeroId;
    cin.ignore(numeric_limits<streamsize>::max(), '\n');
    cout << "Ingrese el nombre del cuidador: ";
    getline(cin, nombre);
    cout << "Ingrese la edad del cuidador: ";
    cin >> edad;
    cout << "Ingrese el número de ID del cuidador: ";
    cin >> numeroId;
    return Cuidador(nombre, edad, numeroId);
}

Leon leoncons() {
    string nombre;
    int edad, numeroVacunas;
    cin.ignore(numeric_limits<streamsize>::max(), '\n');
    cout << "Ingrese el nombre del león: ";
    getline(cin, nombre);
    cout << "Ingrese la edad del león: ";
    cin >> edad;
    cout << "Ingrese el número de vacunas del león: ";
    cin >> numeroVacunas;
    return Leon(nombre, edad, numeroVacunas);
}

Pinguino pinguinocons() {
    string nombre;
    int edad;
    cin.ignore(numeric_limits<streamsize>::max(), '\n');
    cout << "Ingrese el nombre del pingüino: ";
    getline(cin, nombre);
    cout << "Ingrese la edad del pingüino: ";
    cin >> edad;
    return Pinguino(nombre, edad);
}

int main() {
    Visitante visitante = visitantecons();
    visitante.comer();
    visitante.dormir();
    visitante.comprar();

    Cuidador cuidador = cuidadorcon();
    cuidador.comer();
    cuidador.dormir();
    cuidador.alimentarAnimales();

    Leon leon = leoncons();
    leon.comer();
    leon.dormir();
    leon.rugir();
    leon.cazar();

    Pinguino pinguino = pinguinocons();
    pinguino.comer();
    pinguino.dormir();
    pinguino.nadar();
    pinguino.pescar();

    return 0;
}