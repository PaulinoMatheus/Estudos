#Passo-1: Importar as bibliotecas necessárias para o funcionamento do programa (automação)
import time
import pyautogui

#Passa-2: Colocar o tempo necessário para que as etapas sejam concluídas
pyautogui.PAUSE = 1.0

#Passo-3: Abrir o programa de formatação de texto (Word)
pyautogui.press('win')
pyautogui.write('Word')
pyautogui.press('enter')
time.sleep(5)
pyautogui.click(x=356, y=265)

#Passo-4: Fazer as formatação necessárias para as normas da ABNT2
#Começando com os estilos da fonte e títulos
pyautogui.click(x=245, y=128)
pyautogui.write('Arial')
pyautogui.press('enter')
pyautogui.click(x=340, y=124)
pyautogui.write('12')
pyautogui.rightClick(x=1198, y=142)
pyautogui.click(x=1253, y=192)
pyautogui.click(x=742, y=385)
pyautogui.click(x=629, y=464)
pyautogui.click(x=792, y=384)
pyautogui.write('14') 
pyautogui.click(x=1089, y=384)
pyautogui.click(x=981, y=481) 
pyautogui.click(x=718, y=428)
pyautogui.click(x=821, y=426)
pyautogui.click(x=625, y=808) 
pyautogui.click(x=659, y=547)
pyautogui.click(x=1073, y=537)
pyautogui.click(x=1057, y=790)
pyautogui.click(x=1163, y=809)

#Passo-5: Repetindo as linhas de código para formatação do subtítulo
pyautogui.rightClick(x=1352, y=138)
pyautogui.click(x=1393, y=196)
pyautogui.click(x=742, y=385)
pyautogui.click(x=629, y=464)
pyautogui.click(x=792, y=384)
pyautogui.write('14') 
pyautogui.click(x=1089, y=384) 
pyautogui.click(x=981, y=481) 
pyautogui.click(x=719, y=430)
pyautogui.click(x=821, y=426) 
pyautogui.click(x=1163, y=809)

#Passo-6: Fazer formatação de margem e espaçamento de linhas
pyautogui.click(x=733, y=161)
pyautogui.click(x=765, y=264)
pyautogui.click(x=476, y=78)
pyautogui.click(x=52, y=174)
pyautogui.click(x=156, y=765)
pyautogui.write('3 cm')
pyautogui.press('tab')
pyautogui.write('2 cm')
pyautogui.press('tab')
pyautogui.write('3 cm')
pyautogui.press('tab')
pyautogui.write('2 cm')
pyautogui.click(x=1103, y=812)
pyautogui.click(x=144, y=71)