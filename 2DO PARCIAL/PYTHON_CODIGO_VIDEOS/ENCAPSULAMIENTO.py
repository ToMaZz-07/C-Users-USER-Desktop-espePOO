class MiClase:
    def __init__(self):
        self._atributo_privado = "Valor"

    def hablar(self):
        print("hola, como estás")

objeto = MiClase()
print(objeto.hablar())