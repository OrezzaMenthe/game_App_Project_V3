# Projet Application design

Dans le cadre de ce projet en Application design,notre mission à étée de créer une application mobile en utilisant l'un des designs Figma fournis.
L'objectif prééminent est de respecter de manière méticuleuse le design sélectionné afin de développer une application dont l'interface reflète fidèlement les détails élaborés sur Figma.


### 1. Choix du design

La première étape cruciale de ce projet a été de sélectionner le design qui servira de base à mon application parmi une liste de 5 propositions distinctes. Après une rapide analyse, mon choix s’est orienté vers le **design numéro 5**. Ce choix à été motivé par le thème de l’application liée aux plantes qui m’a particulièrement plu.

### 2. Création du projet

Pour la réalisation de mon application j’ai choisi de coder sur android studio et de réaliser mon projet en XML.
Ce choix s'est avéré judicieux pour plusieurs raisons. En effet, le XML offre une approche déclarative qui facilite la mise en page de l'interface utilisateur, tout en assurant une séparation claire entre le design et la logique de programmation. Cette approche a permis une gestion efficace des éléments visuels et leur adaptation aux spécifications précises du design Figma. Finalement, ayant déjà codé en XML par le passé, j’ai préféré opter pour un langage déjà connu.

La reproduction du design Figma a été une étape minutieuse, impliquant la création des différents boutons, la gestion des images conformément aux exigences du design, et l'assurance d'une fidélité visuelle optimale pour tous types d’écrans. 
La conception de l'interface principale à été une partie cruciale du processus dans laquelle il a été question de disposer les différents éléments créés au bons emplacements conformément au design Figma. Pour cela les repères disponibles sur Figma ont été très utiles.
À ce stade du projet, l'application comprend une page d'accueil respectant le design initial, avec des boutons soigneusement positionnés pour garantir une navigation intuitive ainsi que des polices conformes à celles du design attendu. 

J’ai dû faire face à de nombreux problèmes durant  la conception de ce projet que j’ai pu contourner de différentes manières. Par exemple, dans le design choisi, les boutons étant des cercles possédant un dégradé. J’ai du réaliser sur android studio un cardview pour créer mes cercles avec leur dégradé, puis par la suite positionner un bouton transparent par dessus car je n’ai pas trouvé de manières de faire un dégradé sur mon bouton. Un autre problème que j’ai rencontré fut lors de l’insert de gros  textes que je voulais justifier dans un souci d'esthétisme, mais sans succès malgré plusieurs essais.


### 4. Parties bonus

En plus de réaliser le design proposé sur Figma, j’ai souhaité apporter une valeur ajoutée à l’application en ajoutant des fonctionnalités interactives.

J'ai étendu l'application en créant des boutons interactifs pour chaque plante présente sur la page d'accueil. Lorsqu'un utilisateur clique sur l'une de ces images, l'application le redirige vers une nouvelle activité dédiée à la plante sélectionnée. 
Comme le but de l’application n’était pas clairement exprimé dans le Figma, je ne savais pas si l’application permettait d’acheter des plantes (pas de prix sur le design de base) ou simplement de se renseigner dessus. 
J’ai opté pour la deuxième option qui me paraissait plus logique à la vue du design principal. 
J’ai donc recréé une nouvelle activité pour chaque plante visible sur le design de base et j’ai créé un design de base donnant à chaque fois une information sur la plante sélectionnée. 
J’ai créé la liaison entre les deux activités dans mon code Kotlin, me permettant de naviguer facilement entre les différents écrans créés. 

Finalement, j'ai utilisé le même procédé pour rendre interactive la barre de navigation entre les différents types de plantes/arbres disponible sur l’application. 
Dans un souci de cohérence j’ai gardé le même design pour tous les types de plantes et j’ai donc uniquement changé le nom et l’image des différents types.

### Conclusion

En conclusion, ce projet d’Application Design a été une opportunité enrichissante pour mettre en pratique mes compétences en développement d'applications mobiles. En respectant scrupuleusement le design Figma initial, j'ai réussi à créer une interface utilisateur fonctionnelle et conforme à la consigne.  Le projet m'a permis d'explorer des aspects techniques du développement mobile et d'approfondir ma compréhension des langages XML et Kotlin sur Android Studio. Finalement, cette expérience a renforcé mes compétences en conception d'interface et en développement d'applications Android.
