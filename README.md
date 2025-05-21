# Application pour calculer l'IMC

## C'est quoi l'indice de masse corporel IMC ?


> L'indice de masse corporelle (IMC, en anglais *Body Mass Index*, BMI) est une grandeur qui permet d'estimer la corpulence d'une personne. Elle a été inventée par *Adolphe Quetelet*, scientifique belge fondateur de la statistique moderne; cet indice est aussi appelé indice de *Quetelet*.

Cet indice se calcule en fonction de la **taille** et de la **masse**. Bien qu'il ait été conçu au départ pour les adultes de 18 à 65 ans, de nouveaux diagrammes de croissance ont vu le jour au cours des dernières décennies pour les enfants de 0 à 18 ans. Dans les deux cas, il constitue une indication et intervient dans le calcul de l'IMG. (source *Wikipedia*)

<img width="800px" height="auto" src="images/imc_courbes.png" />


## Comment se calcule l'IMC ?

L'IMC est égale à $\frac{masse}{taille*taille}$ (la taille exprimé en **mètre**).

## Travail à faire

Compléter le projet fourni en vous basant sur les fonctionnalités que vous déduirez de l'application de démonstration. Vous penserez à internationaliser l'application pour le français et l'espagnol.


**Description textuelle du \textit{déroulement type} d'une utilisation de cette application :**
1. l'utilisateur saisi son nom et son prénom,
2. l'utilisateur saisi sa date de naissance,
3. l'utilisateur saisi son poids,
4. l'utilisateur saisi sa taille en centimètres ou en mètre(s). **Il devra indiqué le mode choisi gr\^ace au bouton radio de l'interface afin que le calcul de l'IMC se fasse correctement**.
5. l'utilisateur appuie sur la touche `Calculer` , le résultat s'affiche dans une autre activité.
6. lorsque l'utilisateur appuie sur le bouton `back` de l'application (pas celle du terminal), un historique est affiché en bas de la première activité sous forme de liste (`RecyclerView`).


**De plus :**

* A tout moment l'utilisateur pourra appuyer sur le bouton `RAZ` permettant d'effacer toutes les informations déjà saisies.
* Toutes les erreurs sont indiquées par des Toasts appropriés (par exemple, demande de calcul sans avoir entré les informations nécessaires etc.)




**Avant de commencer !**

Vous disposez :

* d'une [application de démonstration](https://einfo-learning.fr/moodle/mod/resource/view.php?id=13107) sous forme d'archive APK à installer sur l'émulateur.
* d'un **certain nombre de classes** (déjà intégrées au projet Android Studio) et qu'il ne faudra pas modifier :
  * `FicheIMC`: classe `Parcelable` (c'est à dire, dont les instances sont "transportables" par un `Intent` en tant que *données extras* peut-être utilisée pour assurer une communication à l'intérieur d'une application entre activités. 
  > Un `Intent` pourra, par exemple, transporter une instance de cette classe en tant que données extras. 

:dart: En d'autres termes, toutes ces ressources vous permettent de vous concentrer sur les notions abordées lords des cours. 

:pencil: Je vous conseille de bien étudier les sources Java et les ressources XML !


**Question 1 :** Versionnage de votre développement
1. cloner le présent dépôt et vous l'approprier dans votre propre dépôt git.
2. inscrire en première ligne du fichier `README.md` votre *nom*, *prenom* et *groupe*
3. créer votre propre dépôt privée et *pusher* le projet initial en tant que branche `main`
4. inscrire votre enseignant comme participant à votre déopôt git


**Question 1 :** Traduire l'application en français et en espagnol
1. créer la branche `traduction_dev`
2. traduire votre application en français et en espagnol
3. effectuer un *pull request* (ne pas effacer cette branche après l'accepation de de la demande de *pull request*)
   

**Question 2 :** Compléter les layouts pour que les interfaces utilisateurs ressemblent à celles de l'application de démonstration.
1. créer la branche `layouts_dev`
2. développer les layouts
3. effectuer un *pull request*  (ne pas effacer cette branche après l'accepation de de la demande de *pull request*)
   

**Question 3 :** Complétez les classes Java pour permettre la saisie correcte des informations et la préparation correcte de l'intention 

**Note :** On se place juste au point qui précède de lancement de l'activité cible.

1. créer la branche `dev_input_activity`
2. développer les fonctionnalités demandées
3. utiliser le mode déboggage pour vous assurer que l'intention est *correctement péparée* 
4. effectuer un *pull request*  (ne pas effacer cette branche après l'accepation de de la demande de *pull request*)
   

   
**Question 4 :** Complétez les classes Java pour permettre le calcul de l'IMC, son affichage dans l'activité cible et la préparation de l'intention de résultat

**Note :** On se place juste au point qui précède de la *teerminaison* de l'activité cible.

1. créer la branche `dev_calcul_and_print_imc`
2. développer les fonctionnalités demandées
3. utiliser le mode déboggage pour vous assurer que l'intention de résultat est *correctement péparée* 
4. effectuer un *pull request*  (ne pas effacer cette branche après l'accepation de de la demande de *pull request*)
   

   
**Question 5 :** Finaliser le développement de votre application

**Note :** On se place juste au point qui précède de la *teerminaison* de l'activité cible.

1. créer la branche `finalise_dev`
2. développer les fonctionnalités demandées
3. utiliser le mode déboggage pour vous assurer que l'intention de résultat est *correctement péparée* 
4. effectuer un *pull request*  (ne pas effacer cette branche après l'accepation de de la demande de *pull request*)
   