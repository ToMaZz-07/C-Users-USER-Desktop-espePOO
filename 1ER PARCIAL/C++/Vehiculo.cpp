#include <iostream>
#include <string>

using namespace std;

class Transporte {
public:
    string modelo;
    string color;
    int año;
    int kilometraje;
    int velocidad = 0;

    Transporte(string modelo, string color, int año, int kilometraje) {
        this->modelo = modelo;
        this->color = color;
        this->año = año;
        this->kilometraje = kilometraje;
    }

    void desplazarse(int velocidadNew) {
        this->velocidad = velocidadNew;
        cout << this->modelo << " color " << this->color << " del anio " << this->año << " se mueve a " << this->velocidad << " km/h";

        if (this->velocidad > 50) {
            cout << "\nUsted tiene una multa por exceso de velocidad. Usted rebaso los 50 km/h" << endl;
        } else {
            cout << "\nVelocidad permitida" << endl;
        }
    }

    void rechinar() {
        cout << this->modelo << " color " << this->color << " del anio " << this->año << " empezo a rechinar" << endl;
    }

    void recalentarse() {
        cout << this->modelo << " color " << this->color << " del anio " << this->año << " con kilometraje " << this->kilometraje << " km " << "empezo a recalentarse" << endl;
    }
};

int main() {

    Transporte trans("Chevrolet Aveo", "vino", 2012, 123456);
    trans.rechinar();
    trans.recalentarse();
    trans.desplazarse(120);

}