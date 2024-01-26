#include <iostream>
#include <string>
using namespace std;
class Dog {
public:
    string nombre;
    string raza;
    string color;
    int edad;

    Dog(string nombre, string raza, string color, int edad) {
        this->nombre = nombre;
        this->raza = raza;
        this->color = color;
        this->edad = edad;
    }

    void saltar() {
        cout << nombre << " de raza " << raza << " de color " << color << " de " << edad << " anio/s de edad empezo a saltar." << endl;
    }

    void jugar() {
        cout << nombre << " de raza " << raza << " de color " << color << " de " << edad << " anio/s de edad empezo a jugar." << endl;
    }

    void morder() {
        cout << nombre << " de raza " << raza << " de color " << color << " de " << edad << " anio/s de edad empezo a morder." << endl;
    }

    void ladrar() {
        cout << nombre << " de raza " << raza << " de color " << color << " de " << edad << " anio/s de edad empezo a ladrar." << endl;
    }
};

int main() {

    Dog d1("Benji", "Bulldog", "Marron", 3);
    d1.saltar();
    d1.jugar();
    d1.morder();
    d1.ladrar();

}