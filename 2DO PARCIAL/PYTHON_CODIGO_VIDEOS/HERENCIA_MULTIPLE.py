# Clase Persona con atributos nombre, edad y nacionalidad
class Persona:
   def __init__(self, nombre, edad, nacionalidad):
       self.nombre = nombre
       self.edad = edad
       self.nacionalidad = nacionalidad

   def hablar(self):  # Método para hacer hablar a la persona
       print("Hola, estoy hablando un poco")

# Clase Artista con atributo habilidad
class Artista:
   def __init__(self, habilidad):
       self.habilidad = habilidad
    
   def mostrar_habilidad(self):
       return f"Mi habilidad es:{self.habilidad}"


class EmpleadoArtista(Persona,Artista):
   def __init__(self, nombre, edad, nacionalidad,habilidad,salario,empresa):
      Persona.__init__(self,nombre, edad, nacionalidad)
      Artista.__init__(self,habilidad)
      self.salario=salario
      self.empresa=empresa

   def presentarse(self):
       print(f'Hola soy:{self.nombre},{self.mostrar_habilidad()}y trabajo en {self.empresa}')

roberto = Artista("cantar")

herencia = issubclass(EmpleadoArtista,Persona)
instancia = isinstance(roberto,Artista)

print(instancia)