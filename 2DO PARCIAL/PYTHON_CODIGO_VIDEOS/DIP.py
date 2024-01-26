from abc import ABC, abstractmethod

class VerificadorOrtografico(ABC):
    @abstractmethod
    def verificar_palabra(self, palabra):
        pass

class Dicionario(VerificadorOrtografico):
    def verificar_palabra(self, palabra):
        # Lógica para verificar palabras si está en el diccionario
        pass
    
class CorrectorOrtografico:
    def __init__(self,verificador):
        self.verificador=verificador
       
    def corregir_texto(self,texto):

        corrector=CorrectorOrtografico(Dicionario())