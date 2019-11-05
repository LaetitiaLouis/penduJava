Description du jeu :
Le jeu proposé est le jeu du pendu. Le Pendu est un jeu qui consiste à trouver un mot en devinant quelles sont les lettres qui le composent. Le jeu se joue traditionnellement à deux. L’un des 2 joueurs propose un mot et le deuxième joueur propose des lettres pour trouver le mot. Si le 2ème joueur trouve le mot avant d’avoir puisé son maximum d’erreurs possibles, il gagne la partie. 

Description de l’implémentation technique du jeu (algorithmes principaux, modélisation) :

=> proposer au joueur de jouer

=> choisir un mot 

=> transformer le mot

=> transformer les caractères du mot en _

=> afficher les _

=> proposer au joueur de choisir une lettre

=> vérifier si la lettre est dans le mot

si la lettre n’est pas dans le mot :				Si la lettre est dans le mot

=> afficher que la lettre n’est pas dans le mot		=> Proposer au joueur de choisir une autre 									lettre
=> afficher lettre(s) fausse(s) proposées 

=> afficher nombre de chances restantes

=> proposer de choisir une lettre

=> si le mot n’a pas été trouvé afficher  “perdu”

=> si le mot a été trouvé afficher “bravo”


La notice d’utilisation : 

Le jeu se joue entre la console et un joueur. La console propose un mot à trouver au joueur. Le jouer choisit des lettres une à une afin de trouver le mot caché. Il a 11 chances de rejouer (le nombre de traits qui permet de dessiner un pendu). Chaque lettres « fausses » proposées sont systématiquement affichées. Si le mot est trouvé avant que le nombre de chances de jouer est épuisé, le joueur a gagné, sinon il a perdu. 
 

Exemple d’utilisation ou le joueur gagne :
La console propose le mot caché et demande au joueur s’il est prêt pour jouer 
Bonjour ! Êtes vous prêt à jouer au pendu ?
_ _ _ _ _ _ _ _ _ _ _ .

La console propose au joueur de choisir une lettre 
Choisissez une lettre ! 

Le joueur propose une lettre
m

La lettre choisie n’est pas dans le mot la console indique au joueur le nombre d’erreurs encore possible et lui indique les lettres fausses déjà proposées et les lettres maquées. Elle propose au joueur de proposer une autre lettre.
votre lettre n'est pas dans le mot. Il vous reste 10 choix de lettre possible.
Voici les lettres que vous avez déjà proposées et qui ne sont pas dans le mot : m
_ _ _ _ _ _ _ _ _ _ _ .
Choisissez une lettre !

Le joueur propose une autre lettre. 
B

La console indique les lettres fausses déjà proposées et les lettres restantes maquées et affiche la lettre si elle est présente dans le mot et l’affiche à la place de  l’_. elle propose au joueur de choisir une nouvelle lettre.
Voici les lettres que vous avez déjà proposées et qui ne sont pas dans le mot : m
b _ _ _ _ _ _ _ _ _ _ .
Choisissez une lettre !

Le joueur propose une autre lettre.
O

La console indique les lettres fausses déjà proposées et les lettres restantes maquées et affiche la lettre si elle est présente dans le mot et l’affiche à la place de  l’_. elle propose au joueur de choisir une nouvelle lettre.
Voici les lettres que vous avez déjà proposées et qui ne sont pas dans le mot : m
b o _ _ _ _ _ _ _ _ _.
Choisissez une lettre !
 
Le joueur propose une autre lettre.
P

La lettre choisie n’est pas dans le mot la console indique au joueur le nombre d’erreurs encore possible et lui indique les lettres fausses déjà proposées et les lettres restantes  maquées. Elle propose au joueur de proposer une autre lettre.
votre lettre n'est pas dans le mot. Il vous reste 9 choix de lettre possible.
Voici les lettres que vous avez déjà proposées et qui ne sont pas dans le mot : m p
b o _ _ _ _ _ _ _ _ _ .
Choisissez une lettre !

Le joueur propose une autre lettre.
J

La lettre choisie n’est pas dans le mot la console indique au joueur le nombre d’erreurs encore possible et lui indique les lettres fausses déjà proposées et les lettres restantes  maquées. Elle propose au joueur de proposer une autre lettre.
votre lettre n'est pas dans le mot. Il vous reste 8 choix de lettre possible.
Voici les lettres que vous avez déjà proposées et qui ne sont pas dans le mot : m p j
b o _ _ _ _ _ _ _ _ _ .
Choisissez une lettre !

Le joueur propose une autre lettre.
U

La console indique les lettres fausses déjà proposées et les lettres restantes maquées et affiche la lettre si elle est présente dans le mot et l’affiche à la place de  l’_. elle propose au joueur de choisir une nouvelle lettre.
Voici les lettres que vous avez déjà proposées et qui ne sont pas dans le mot : m p j
b o u _ _ _ _ _ _ _ _. 
Choisissez une lettre !

Le joueur propose une autre lettre.
N

La console indique les lettres fausses déjà proposées et les lettres restantes maquées et affiche la lettre si elle est présente dans le mot et l’affiche à la place de  l’_. elle propose au joueur de choisir une nouvelle lettre.
Voici les lettres que vous avez déjà proposées et qui ne sont pas dans le mot : m p j
b o u _ _ n _ _ _ _ _.
Choisissez une lettre !

Le joueur propose une autre lettre.
Q

La lettre choisie n’est pas dans le mot la console indique au joueur le nombre d’erreurs encore possible et lui indique les lettres fausses déjà proposées et les lettres restantes  maquées. Elle propose au joueur de proposer une autre lettre.
votre lettre n'est pas dans le mot. Il vous reste 7 choix de lettre possible.
Voici les lettres que vous avez déjà proposées et qui ne sont pas dans le mot : m p j q
b o u _ _ n _ _ _ _ _ .
Choisissez une lettre !

Le joueur propose une autre lettre.
A

La console indique les lettres fausses déjà proposées et les lettres restantes maquées et affiche la lettre si elle est présente dans le mot et l’affiche à la place de  l’_. elle propose au joueur de choisir une nouvelle lettre.
Voici les lettres que vous avez déjà proposées et qui ne sont pas dans le mot : m p j q        
b o u _ a n _ _ _ _ _.
Choisissez une lettre !
Le joueur propose une autre lettre.
G

La console indique les lettres fausses déjà proposées et les lettres restantes maquées et affiche la lettre si elle est présente dans le mot et l’affiche à la place de  l’_. elle propose au joueur de choisir une nouvelle lettre.
Voici les lettres que vous avez déjà proposées et qui ne sont pas dans le mot : m p j q        
b o u _ a n g _ _ _ _.
Choisissez une lettre !

Le joueur propose une autre lettre.
E

La console indique les lettres fausses déjà proposées et les lettres restantes maquées et affiche la lettre si elle est présente dans le mot et l’affiche à la place de  l’_. elle propose au joueur de choisir une nouvelle lettre.
Voici les lettres que vous avez déjà proposées et qui ne sont pas dans le mot : m p j q
b o u _ a n g e _ _ e.
Choisissez une lettre !

Le joueur propose une autre lettre.
R

La console indique les lettres fausses déjà proposées et les lettres restantes maquées et affiche la lettre si elle est présente dans le mot et l’affiche à la place de  l’_. elle propose au joueur de choisir une nouvelle lettre.
Voici les lettres que vous avez déjà proposées et qui ne sont pas dans le mot : m p j q
b o u _ a n g e r _ e
Choisissez une lettre !

Le joueur propose une autre lettre.
I

La console indique les lettres fausses déjà proposées et les lettres restantes maquées et affiche la lettre si elle est présente dans le mot et l’affiche à la place de  l’_. elle propose au joueur de choisir une nouvelle lettre.
Voici les lettres que vous avez déjà proposées et qui ne sont pas dans le mot : m p j q
b o u _ a n g e r i e.
Choisissez une lettre !

Le joueur propose une autre lettre.
L

La console indique les lettres fausses déjà proposées félicite le joueur qui a trouvé le mot masqué.
Voici les lettres que vous avez déjà proposées et qui ne sont pas dans le mot : m p j q
Bravo! vous avez réussi !
