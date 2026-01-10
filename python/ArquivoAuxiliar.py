#Passo-1: Importar as bibliotecas necessárias para o funcionamento do programa(Automação)
import pyautogui
import time 
#Passo-2: Identificar os valores do eixo X, Y do cursor do mouse
time.sleep(3)
PosicaoMouse = pyautogui.position()
print(PosicaoMouse)
