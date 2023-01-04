
<h1 align="center">Grundlagen der Programmierung</h1>
<h3 align="center">Listen</h3>
<br>

<p align="center">
  <img src="img/img.png" />
</p>

#### Beschreibung:

Willkommen zurück zu den Übungen an Tag 12 mit dem Thema Funktionen und Rückgabewerte!




#### Hinweise zur Bearbeitung:

- Achte auf einen sauberen Quellcode, insbesondere Einrückungen sind wichtig!
- Wichtige Materialien für heute:
  - [Handbuch: Funktionen → verstehen → Rückgabewerte](https://docs.google.com/document/d/13SyoQ3tgIr4T9tiUl42V5kiBGQwV4Lk-XA2SsKf-va0/edit#heading=h.aatkaqflpfcc)
  - [Handbuch: Funktionen → implementieren → Rückgabewerte](https://docs.google.com/document/d/13SyoQ3tgIr4T9tiUl42V5kiBGQwV4Lk-XA2SsKf-va0/edit#heading=h.4vbpsnw0nape)
  - [Handbuch: Variablen & Datentypen → Nachschlagen → Kochrezept: Compilerfehler lösen](https://docs.google.com/document/d/13SyoQ3tgIr4T9tiUl42V5kiBGQwV4Lk-XA2SsKf-va0/edit#heading=h.bpw3da2qtpg9)


---


<details>
<summary><b>Aufgabe 0 - Funktion + Rückgabewert implementieren und aufrufen | Login Simulieren </b></summary>

In der nullten Aufgabe sollst du eine Funktion und einen Rückgabewert anhand der Vorgaben implementieren.

Vorgaben:
- Schreibt ein Kleines Programm, welches ein Login simuliert.
- Es wird separat ein Loginname und Passwort vom Benutzer angenommen.
- Ihr sollt mithilfe der Funktionen, welche ihr schon kennt die Logininformationen, welche Bereits in einer Map gegeben ist mit der Eingabe vergleichen.
    - Wenn ein Loginpaar stimmt, so soll eure Funktion einen Boolean (true,false) zurückgeben, welcher Rückmeldung über die Richtigkeit der Daten gibt.
        - Hierzu könnt ihr einen Vergleichsoperator benutzen : ```==```
        - Hier ein Beispiel für Rückgabewert : True

``` 
var i = 10
    var j = 10
    var acc = i==j
    println(acc)
```
- Implementiert auch ein geeigneten Aufruf in der main Funktion.

**Datei für die Aufgabe:** *ModulA → src → 0_Anmeldefenster.kt*

</details>



---


<details>
<summary> <b>Aufgabe 1 - Wetten, Wetten, Wetten, wo sind meine Tabletten.
 </b> </summary>
 
 In der ersten Aufgabe sollst du eine Funktion und einen Rückgabewert anhand der Vorgaben implementieren.
 
 Szenario:
 Ihr habt etwas Geld gespart und habt jetzt richtig Bock ins Casino zu gehen und das Geld zu vermehren. Ihr geht an einen Automaten bei dem du dein Geld verdoppeln, verdreifachen, die Hälfte verlieren oder komplett verlieren kannst.
 
Vorgaben:
1. Fange oberhalb der main-Funktion an
2. Schreibe das Keyword für Funktionen "fun"
3. Nenne deine Funktion "quote" die einen Double-Wert zurückgibt
4. Erstelle eine veränderbare Liste und fülle sie bei der Initianlisierung(beim Erstellen der Liste) mit folgenden Double Werten: 0.0 0.5 0.0 0.0 0.25 0.0 2.0 1.5 1.5 3.0
5. Nutze eine Funktion, die einen zufälligen Wert der Liste enttnimmt und speichert den Wert in einer neuen Double Variable namens "mulitplikator" ein
6. Die Funktion gibt am Ende den Wert der multiplikator Variable zurück

7.Nun gehst du wieder in die main-Funktion und erstellst eine Double Variable mit dem Namen "einsatz" und übergibst beim Erstellen einen Wert wie zum Beispiel 5.0
8. Nun soll mit Hilfe eines Aufrufs der quoten-Funktion die Wette ausgeführt werden
9. Gib dabei diesen Text aus "Du hast aus deinem Einsatz von: HIERKOMMT DER EINSATZ hin so viel gemacht: HIER KOMMT DAS ERGEBNIS HIN"  

Hinweis: Das Ergebnis rechnest du aus indem du den Einsatz und den Mulitplikator multiplizierst einsatz*quote() 

Das Ergebnis könnte so aussehen, je nachdem welcher Multiplikator zufällig ausgewählt wurde:

Du hast aus deinem Einsatz: 5.0 so viel gemacht: 15.0
Du hast aus deinem Einsatz: 5.0 so viel gemacht: 0.0
Du hast aus deinem Einsatz: 5.0 so viel gemacht: 2.5
Du hast aus deinem Einsatz: 5.0 so viel gemacht: 10

**Datei für die Aufgabe:** *1_Wetten.kt*
</details>

---

<details>
<summary> <b> Aufgabe 2 - Taschenrechner (Achtung mit Parametern, kommt morgen in der Vorlesung dran!)</b> </summary>

Szenario:
Ihr wollt einen kleinen Taschenrechner bauen, bei dem ihr die gängigen Rechenoperationen wie Addition(+), Subtraktion(-), Division(/) und Mulitplikation(*) durchführen könnt

1.Erstelle für jede Rechenoperation eine eigene Funktion mit zwei Double Parametern die jeweils eine Gleitkommazahl (Kommazahl) annehmen Bsp: fun addtion(zahl1:Double,zahl2:Double):Double
2. Die jeweilige Funktion gibt dann das Ergebnis der übergebenen Zahlen zurück. (Bei der Additions-Funktion würde dann zahl1+zahl2 gerechnet und ausgegeben werden)
3. Nachdem alle Rechenfunktionen erstellt wurden solltet ihr insgesamt 5 Funktionen haben:
fun addition
fun subtraktion
fun division
fun mulitplikation
fun main

4.Die Main-Funktion sollte dann jeweils jede Funktion einmal aufrufen und das Ergebnis ausgeben. Nimm für jede Funktion die Zahlen zahl1=12.0 zahl2=3.0 als Parameter
Bei der Addition sollte dann dieses Ergebnis ausgegeben werden:
"Das Ergebnis der Addition der Zahlen 12.0 und 3.0 ist 15.0"

Das Endergebnis der Main-Funktion sollte dann so aussehen (Falls ihr die gleiche Reihenfolge wie in Punkt 3. habt)

"Das Ergebnis der Addition der Zahlen 12.0 und 3.0 ist 15.0"
"Das Ergebnis der Subtraktion der Zahlen 12.0 und 3.0 ist 9.0"
"Das Ergebnis der Division der Zahlen 12.0 und 3.0 ist 4.0"
"Das Ergebnis der Mulitplikation der Zahlen 12.0 und 3.0 ist 36.0"

**Datei für die Aufgabe:** *2_Taschenrechner.kt

</details>

---
