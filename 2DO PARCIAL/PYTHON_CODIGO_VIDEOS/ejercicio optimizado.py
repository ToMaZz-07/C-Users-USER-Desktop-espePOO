from textblob import TextBlob

system_rol = 'Imagine that you are a sentiment analyzer. I provide you with sentiments, and you analyze the sentiment of the messages, giving me a response with at least 1 character and at most 4 characters, ONLY NUMERIC RESPONSES. Where -1 is maximum negativity, 0 is neutral, and 1 is maximum positivity. You can go between those ranges, for example, 0.3, 0.5 are also valid, etc. (You can respond only with integers or floats).'

mensajes = [{"role": "system", "content": system_rol}]

class Sentimiento:
    def __init__(self,nombre,color) :
        self.nombre=nombre
        self.color=color

    def __str__(self):
        return "\x1b[1;{}m{}\x1b[0;37m".format(self.color,self.nombre)
    

class AnalizadorDeSentimientos:

    def __init__(self,rangos):
        self.rangos=rangos

    def analizar_sentimiento(self, polaridad):
        for rango, sentimiento in self.rangos:
            if rango[0] < polaridad <=rango[1]:
                return sentimiento
            return Sentimiento("Muy Negativo","31")
        
rangos =[
    ((-0.6,-0.3), Sentimiento("negativo","31")),
    ((-0.3,-0.1), Sentimiento("algo negativo","31")),
    ((-0.1,0.1), Sentimiento("neutral","33")),
    ((0.1,0.4), Sentimiento("algo positivo","32")),
    ((0.4,0.9), Sentimiento("positivo","32")),
    ((0.9,1), Sentimiento("muy positivo","32")),

]

analizador = AnalizadorDeSentimientos(rangos)

while True:
    user_prompt = input("\x1b[1;32m" + "\n Decime algo" + "\x1b[0;37m")
    mensajes.append({"role": "user", "content": user_prompt})

    # Usamos TextBlob para analizar el sentimiento del mensaje del usuario
    blob = TextBlob(user_prompt)
    polaridad = blob.sentiment.polarity

    # Luego, actualizamos el sistema con el resultado del análisis de sentimiento
    mensajes[-1]["content"] = f"El sentimiento es: {polaridad}"

    respuesta = f"{polaridad:.2f}"
    mensajes.append({"role": "assistant", "content": respuesta})

    sentimiento = analizador.analizar_sentimiento(float(respuesta))
    print(sentimiento)
