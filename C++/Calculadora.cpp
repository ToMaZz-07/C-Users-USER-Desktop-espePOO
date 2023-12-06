#include <iostream>
#include <limits>
#include <cmath>

using namespace std;

class Calculator {
private:
    int operando1;
    int operando2;

public:
    Calculator() {}

    Calculator(int operando1, int operando2) {
        this->operando1 = operando1;
        this->operando2 = operando2;
    }

    int sumar() {
        return operando1 + operando2;
    }

    int restar() {
        return operando1 - operando2;
    }

    int multiplicar() {
        return operando1 * operando2;
    }

    double dividir() {
        if (operando2 != 0) {
            return static_cast<double>(operando1) / operando2;
        } else {
            cout << "SYNTAX ERROR (no existe la division para cero)." << endl;
            return numeric_limits<double>::quiet_NaN();
        }
    }
};

int main() {
    int num1, num2;

    do {
        cout << "Ingrese el primer numero: ";
        while (!(cin >> num1)) {
            cout << "Por favor, ingrese un numero entero: ";
            cin.clear();
            cin.ignore(numeric_limits<streamsize>::max(), '\n');
        }
    } while (cin.fail());

    do {
        cout << "Ingrese el segundo numero: ";
        while (!(cin >> num2)) {
            cout << "Por favor, ingrese un numero entero: ";
            cin.clear();
            cin.ignore(numeric_limits<streamsize>::max(), '\n');
        }
    } while (cin.fail());

    Calculator calculadora(num1, num2);

    char operacion;

    do {
        cout << "Ingrese la operacion que desea realizar (+, -, *, /): ";
        cin >> operacion;
        if (operacion != '+' and operacion != '-' and operacion != '*' and operacion != '/') {
            cout << "Por favor, ingrese una operacion valida." << endl;
        }
    } while (operacion != '+' and operacion != '-' and operacion != '*' and operacion != '/');

    switch (operacion) {
        case '+': {
            cout << "Suma: " << calculadora.sumar() << endl;
            break;
        }
        case '-': {
            cout << "Resta: " << calculadora.restar() << endl;
            break;
        }
        case '*': {
            cout << "Multiplicación: " << calculadora.multiplicar() << endl;
            break;
        }
        case '/': {
            double resultado = calculadora.dividir();
            if (!isnan(resultado)) {
                cout << "Division: " << resultado << endl;
            }
            break;
        }
        default:
            cout << "SYNTAX ERROR" << endl;
    }
}