Palindrome   j++  i--  --->  j--  i++ ;


Anagram       for (int i = 0; i <= s1.length(); i++)   ---> for (int i = 0; i < s1.length(); i++)


BinarySearch  while (low < high)  --->  while (low <= high) //  else if (array[mid] <= element) --->   else if (array[mid] < element)


QuadraticEquation
RomanNumeral
FizzBuzz

########### TP MOCKUP ###########
Exercice 04:
Q1.Dans un test unitaire pour la méthode jouer de la classe Jeu, les objets dépendants qui doivent être mockés sont :Joueur/De/Banque car :
Joueur:Le joueur interagit avec la classe Jeu (créer un mock pour le joueur afin de contrôler son comportement pendant le test et d'assurer que les interactions avec lui se déroulent comme prévu.)
De :Les dés sont utilisés pour générer des nombres aléatoires lors du jeu(assurer que les résultats des lancers de dés sont prévisibles pendant le test et qu'ils peuvent être contrôlés)
Banque:La classe Jeu interagit avec la banque pour débiter ou créditer le joueur (contrôler son comportement et de simuler différentes conditions pendant le test)
Q2.Les scénarios :Scénario de réussite - Somme égale à 7/Scénario de réussite - Somme différente de 7/Scénario d'échec - Joueur insolvable/Scénario d'échec - Banque insolvable après un gain /Scénario d'échec - Jeu fermé
Q4.Le test du cas où le jeu est fermé est un test d'état, car il vérifie  le comportement du jeu lorsqu'il  est fermé, sans prendre en considération l'interactions avec les autres classes(Banque/De/Joueur)
Q5.Pour tester le cas où le joueur est insolvable et vérifier que le jeu ne touche pas aux dés, il faut simuler une situation où le joueur n'a pas assez d'argent pour couvrir sa mise , aussi il faut vérifier que le jeu ne tente pas de lancer les dés si le joueur est insolvable. C'est un test d'état, car il vérifie le comportement du jeu lorsque le joueur est dans un état particulier (insolvable)




