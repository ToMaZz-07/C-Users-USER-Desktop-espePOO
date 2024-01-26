from textblob import TextBlob

system_rol = 'Imagine that you are a sentiment analyzer. I provide you with sentiments, and you analyze the sentiment of the messages, giving me a response with at least 1 character and at most 4 characters, ONLY NUMERIC RESPONSES. Where -1 is maximum negativity, 0 is neutral, and 1 is maximum positivity. You can go between those ranges, for example, 0.3, 0.5 are also valid, etc. (You can respond only with integers or floats).'

mensajes = [{"role": "system", "content": system_rol}]

class AnalizadorDeSentimientos:
    def analizar_sentimiento(self, polaridad):
        if polaridad > -0.6 and polaridad <= 0.3:
            return "\x1b[1;31m" + "Negativo" + "\x1b[0;37m"
        elif polaridad > -0.3 and polaridad < 0.1:
            return "\x1b[1;31m" + "Algo negativo" + "\x1b[0;37m"
        elif polaridad >= -0.1 and polaridad <= 0.1:
            return "\x1b[1;33m" + "Neutral" + "\x1b[0;37m"
        elif polaridad > 0.1 and polaridad < 0.4:
            return "\x1b[1;32m" + "Algo Positivo" + "\x1b[0;37m"
        elif polaridad > 0.4 and polaridad < 0.9:
            return "\x1b[1;32m" + "Positivo" + "\x1b[0;37m"
        elif polaridad > 0.9:
            return "\x1b[1;32m" + "Muy positivo" + "\x1b[0;37m"
        else:
            return "\x1b[1;31m" + "Muy Negativo" + "\x1b[0;37m"

analizador = AnalizadorDeSentimientos()

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
