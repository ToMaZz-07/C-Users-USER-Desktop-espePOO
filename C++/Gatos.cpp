#include <iostream>
#include <string>
using namespace std;

class Cat {
public:
    string nombre;
    string raza;
    string color;
    int edad;

    Cat(string nombre, string raza, string color, int edad) {
        this->nombre = nombre;
        this->raza = raza;
        this->color = color;
        this->edad = edad;
    }

    void maullar() {
        cout << nombre << " de raza " << raza << " de color " << color << " de " << edad << " anio/s de edad empezo a maullar." << endl;
    }

    void bostesar() {
        cout << nombre << " de raza " << raza << " de color " << color << " de " << edad << " anio/s de edad empezo a bostesar." << endl;
    }

    void dormir() {
        cout << nombre << " de raza " << raza << " de color " << color << " de " << edad << " anio/s de edad empezo a dormir." << endl;
    }

    void ronronear() {
        cout << nombre << " de raza " << raza << " de color " << color << " de " << edad << " anio/s de edad empezo a ronronear." << endl;
    }
};

int main() {
    Cat gato("Pelusa", "Siames", "Gris", 3);
    gato.maullar();
    gato.bostesar();
    gato.dormir();
    gato.ronronear();
}