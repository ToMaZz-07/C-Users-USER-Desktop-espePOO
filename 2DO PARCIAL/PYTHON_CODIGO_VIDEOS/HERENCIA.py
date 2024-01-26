# Clase Persona con atributos nombre, edad y nacionalidad
class Persona:
   def __init__(self, nombre, edad, nacionalidad):
       self.nombre = nombre
       self.edad = edad
       self.nacionalidad = nacionalidad

   def hablar(self):  # Método para hacer hablar a la persona
       print("Hola, estoy hablando un poco")

class Empleado(Persona):
   def __init__(self, nombre, edad, nacionalidad,trabajo,salario,):
      super().__init__(nombre, edad, nacionalidad)
      self.salario=salario
      self.trabajo=trabajo


class Estudiante(Persona):
   def __init__(self, nombre, edad, nacionalidad, notas, universidad):
       super().__init__(nombre, edad, nacionalidad)  # Herencia de la clase Persona
       self.notas = notas
       self.universidad = universidad


roberto=Empleado("roberto",43,"argentino","programador",10000)
roberto.hablar()
