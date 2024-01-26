
from graphviz import Digraph

# Crear un objeto Digraph
dot = Digraph(comment='Federación de Datos de Redes Sociales')

# Agregar nodos al diagrama
dot.node('A', 'Conectar a Fuentes de Redes Sociales')
dot.node('B', 'Extraer Datos')
dot.node('C', 'Proceso de Federación')
dot.node('D', 'Consulta y Análisis')
dot.node('E', 'Generar Visualizaciones')

# Agregar conexiones entre nodos
dot.edges(['AB', 'BC', 'CD', 'DE'])

# Guardar el diagrama en un archivo
dot.render('diagrama_flujo', format='png', cleanup=True)

# Imprimir la ruta al archivo generado
print("Diagrama de flujo guardado como 'diagrama_flujo.png'")
