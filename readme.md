## Description du jeu�: ##

Le jeu propos� est le jeu du pendu. Le Pendu est un jeu qui consiste � trouver un mot en devinant quelles sont les lettres qui le composent. Le jeu se joue traditionnellement � deux. L�un des 2 joueurs propose un mot et le deuxi�me joueur propose des lettres pour trouver le mot. Si le 2�me joueur trouve le mot avant d�avoir puis� son maximum d�erreurs possibles, il gagne la partie. 

## Description de l�impl�mentation technique du jeu (algorithmes principaux, mod�lisation)�: ##

#### Pr�sentation de la m�thode verifierMot() : ####

Cette méthode compare caratère par caractère le mot proposé par le joueur et le mot à trouver. La méthode renvoie un bouléen "résultat" qui sera true si les 2 mots sont égaux et false si tous les caractères des 2 mots ne sont pas identiques. 

#### Présentation de la **boucle principale** : ####

Cette boucle principale propose au joueur de choisir une lettre tant qu'il lui reste des chances de jouer et tant que le mot "masqué" n'a pas été trouvé. 
On détermine s'il reste des chances de jouer grâce à un int nbErreursRestantes.
On détermine si le mot masqué a été trouvé grâce à un bouléen motJuste.

On étudie la lettre proposée par le joueur via la méthode lettreTrouvée qui renvoie un bouléen true si la lettre choisie par le joueur se trouve dans le mot à trouver et false dans le cas contraire.
Si le retour est false, on impute une chance de jouer au joueur et on lui propose de rejouer après lui avoir précisé les lettres fausses qu'il a déjà utilisées.
Si le retour est true on propose au joueur de rejouer.
Dans les 2 cas rejouer correspond à un nouveau tour de boucle.

#### Sortie de la boucle principale : ####

Lorsque l'on sort de la boucle, si le nombre de chances de jouer est épuisé on dit au joueur qu'il a perdu. Dans le cas où il a trouvé le mot caché, on le félicite et on lui dit qu'il a gagné. 


## La notice d�utilisation� : ##

Le jeu se joue entre l'ordinateur et un joueur. L'ordinateur propose au joueur via la console un mot � trouver. Chaque lettre � trouver est repr�sent�e par un underscore. Le joueur choisit des lettres une � une afin de trouver le mot cach�. Il a 11 chances de rejouer (= au nombre de traits qui permettent de dessiner un pendu). Chaque lettre ��fausse�� propos�e (non comprise dans le mot) est syst�matiquement affich�e. Si le mot est trouv� avant que le nombre de chances de jouer soit �puis�, le joueur a gagn�, sinon il a perdu. 
 

## Exemple d�utilisation : ##

La console propose le mot cach� et demande au joueur s�il est pr�t pour jouer.

*Bonjour ! �tes vous pr�t � jouer au pendu ?*
_ _ _ _ _ _ _ _ _ _ _.

La console propose au joueur de choisir une lettre 
*Choisissez une lettre !*

Le joueur propose une lettre
*m*

Si la lettre choisie n�est pas dans le mot, la console indique au joueur le nombre d�erreurs encore possible et lui indique les lettres "fausses" d�j� propos�es. Elle affiche ensuite les underscores qui reprsentent les lettres � trouver. Elle demande au joueur de choisir une autre lettre.

*Votre lettre n'est pas dans le mot. Il vous reste 10 choix de lettre possible.*
*Voici les lettres que vous avez d�j� propos�es et qui ne sont pas dans le mot : m*
*_ _ _ _ _ _ _ _ _ _ _*
*Choisissez une lettre !*

Le joueur propose une autre lettre. 
*B*

Si la lettre choisie est dans le mot, la console indique les lettres "fausses" d�j� propos�es. Elle affiche la lettre trouv�e en rempla�ant les underscores correspondant par celle-ci. Elle demande au joueur de choisir une nouvelle lettre.

*Voici les lettres que vous avez d�j� propos�es et qui ne sont pas dans le mot : m*
*b _ _ _ _ _ _ _ _ _ _*
*Choisissez une lettre !*

Le joueur propose une autre lettre.
*O*

La console indique les lettres fausses d�j� propos�es et les lettres restantes maqu�es et affiche la lettre si elle est pr�sente dans le mot et l�affiche � la place de  l�_. elle propose au joueur de choisir une nouvelle lettre.

*Voici les lettres que vous avez d�j� propos�es et qui ne sont pas dans le mot : m*
*b o _ _ _ _ _ _ _ _ _*
*Choisissez une lettre !*
 
......

Si le joueur trouve toutes les lettres du mot, la console lui indique les lettres fausses d�j� propos�es et le f�licite.

*Voici les lettres que vous avez d�j� propos�es et qui ne sont pas dans le mot : m p j q*
*Bravo! vous avez r�ussi !*

Si le joueur utilise toutes ses chances avant de trouver le mot la console lui indique le mot qu'il fallait trouver et lui dit qu'il a perdu.

*Votre lettre n'est pas dans le mot. Il vous reste 0 choix de lettre possible.*
*Voici les lettres que vous avez déjà proposées et qui ne sont pas dans le mot : m p j q b b b b b b b*
*Vous avez perdu! Le mot qu'il fallait trouvé est : restaurant.*