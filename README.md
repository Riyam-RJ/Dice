# Dice
## Introduktion
A) Skapa en klass som heter Dice.
Klassen skall innehålla tre statiska metoder (klassmetoder).
OBS! Klassen Dice får inte innehålla en main-metod.
1. Den första metoden har som uppgift att skapa 1000 slumpmässiga tal mellan 1 och 6.
Metoden skapar en textfil som innehåller alla tal i följd t.ex. 4 5 6 3 5 2 3 6 2 4 ….
Kalla metoden createFile()
2. Den andra metoden skall kunna läsa in textfilen.
Inne i metoden ska du lagrar alla tal som hämtas från textfilen i ett fält,
alltså en array som har 1000 platser.
Metoden ska returnera arrayen.
Kalla metoden createArray()
3. Den tredje metoden ska som inparameter få in arrayen,
som du skapar med hjälp av metoden createArray()
Inne i metoden ska du skapa en ny array som har storleken 6.
Gå igenom alla tal som finns i den stora arrayen och lagra antal
ettor, tvåor, osv. i den nya arrayen (som har storlek 6).
Metoden ska returnera denna array.
Kalla metoden analyseArray() </br></br>


B) Skapa en Main-klass som innehåller en main-metod.
I main skall du använda dina statiska metoder som finns i klassen Dice för att.
1. Generera textfilen med hjälp av metoden createFile()
2. Skapa en array baserad på textfilen med hjälp av metoden createArray()
3. Analysera den stora arrayen och få tillbaka en liten array som innehåller statistik över
resultatet med hjälp av metoden analyseArray()
4. Skriv ut en sammanställning över resultatet i terminalen.
5. Skicka även resultatet till en textfil
(Valfri formatering på sammanställningen).
