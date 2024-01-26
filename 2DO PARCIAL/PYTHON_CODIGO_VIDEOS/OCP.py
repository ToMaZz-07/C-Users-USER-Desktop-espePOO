class Notificador:
    def __init__(self, usuario, mensaje):
        self.usuario = usuario
        self.mensaje = mensaje

    def notificar(self):
        raise NotImplementedError

class NotificadorEmail(Notificador):
    def notificar(self):
        print(f'Notificando por email: {self.usuario.email}')

class NotificadorSMS(Notificador):
    def notificar(self):
        print(f'Notificando a por SMS: {self.usuario.sms}')

class NotificadorWhatsapp(Notificador):
    def notificar(self):
        print(f'Notificando por whatsapp: {self.usuario.whatsapp}')
