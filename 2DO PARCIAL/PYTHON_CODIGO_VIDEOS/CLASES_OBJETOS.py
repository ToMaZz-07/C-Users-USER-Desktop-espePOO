#(min29) Definimos la clase Celular con tres atributos y dos métodos 
class Celular:
    def __init__(self, marca, modelo, camara):
        self.marca = marca
        self.modelo = modelo
        self.camara = camara

    def llamar(self):
        print (f'Estas haciendo un llamado desde un: {self.modelo}')

    def cortar(self):
        print (f'Cortaste la llamada desde tu: {self.modelo}')

# Creamos dos objetos de la clase Celular
celular1 = Celular("Samsung", "S23", "48MP")
celular2 = Celular("Apple", "Iphone 15 Pro", "96MP")

# Llamamos al método llamar() para cada objeto
celular1.llamar()
celular2.llamar()

# Llamamos al método cortar() para cada objeto
celular1.cortar()
celular2.cortar()