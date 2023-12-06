#include <iostream>
#include <string>
using namespace std;

class Persona {
public:
    string nombre;
    int edad;

private:
    int cedula;

public:
    Persona(string nombre, int edad) : nombre(nombre), edad(edad) {}

    int getCedula() {
        return cedula;
    }

    void setCedula(int cedula) {
        this->cedula = cedula;
    }
};

class Chofer : public Persona {
public:
    int numeroPlaca;
    int codigoTaxi;

    Chofer(int numeroPlaca, int codigoTaxi, string nombre, int edad) : Persona(nombre, edad),
    numeroPlaca(numeroPlaca), codigoTaxi(codigoTaxi) {}

    void aceptar() {
        cout << "Chofer aceptando carrera" << endl;
    }

    void cancelar() {
        cout << "Chofer cancelando carrera" << endl;
    }
};

class Pasajero : public Persona {
public:
    int numeroID;

    Pasajero(int numeroID, string nombre, int edad) : Persona(nombre, edad), numeroID(numeroID) {}

    void pedir() {
        cout << "Pasajero pidiendo taxi" << endl;
    }

    void cancelar() {
        cout << "Pasajero cancelando taxi" << endl;
    }
};

int main() {
    Pasajero pasajero(12345, "Juan", 41);
    Chofer chofer(12, 34, "Pablo", 42);

    cout << "1.- Pasajero" << endl;
    cout << "2.- Chofer " << endl;
    cout << "Opcion: ";

    int opcion;
    cin >> opcion;

    switch (opcion) {
        case 1: {
            cout << "Ha elegido Pasajero:" << endl;
            cout << "Ingrese el nombre del pasajero: ";
            string nombrePasajero;
            cin >> nombrePasajero;
            cout << "Ingrese la edad del pasajero: ";
            int edadPasajero;
            cin >> edadPasajero;
            cout << "Ingrese el numero de cedula: ";
            int cedulaPasajero;
            cin >> cedulaPasajero;
            cout << "Ingrese el numeroID: ";
            int numeroID;
            cin >> numeroID;
            pasajero.pedir();
            pasajero.cancelar();
            break;
        }
        case 2: {
            cout << "Ha elegido Chofer:" << endl;
            cout << "Ingrese el nombre del chofer: ";
            string nombreChofer;
            cin >> nombreChofer;
            cout << "Ingrese la edad del chofer: ";
            int edadChofer;
            cin >> edadChofer;
            cout << "Ingrese el numero de cedula: ";
            int cedulaChofer;
            cin >> cedulaChofer;
            cout << "Ingrese el numero de Placa: ";
            int numeroPlaca;
            cin >> numeroPlaca;
            cout << "Ingrese el codigo de Taxi: ";
            int codigoTaxi;
            cin >> codigoTaxi;
            chofer.aceptar();
            chofer.cancelar();
            break;
        }
    }
}