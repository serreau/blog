/**
* database : Blog


insert into Categorie (id, nom) values (3, 'categorie BonBon');
insert into Categorie (id, nom) values (1, 'categorie marshmallow');
insert into Categorie (id, nom) values (2, 'cattegorie reglis');
insert into Categorie (id, nom) values (4, 'categorie sucette');



insert into Auteur (id, nom) values (4, 'francois hollande');
insert into Auteur (id, nom) values (1, 'nicolas sarkozy');
insert into Auteur (id, nom) values (2, 'jacque chirac');
insert into Auteur (id, nom) values (3, 'giscard');


insert into Article (id, auteur_id, categorie_id, nom) values (9,4,3, 'article joyeux');
insert into Article (id, auteur_id, categorie_id, nom) values (10,4,3, 'article malheureux');
insert into Article (id, auteur_id, categorie_id, nom) values (1,4,3, 'article mitigé');
insert into Article (id, auteur_id, categorie_id, nom) values (2,4,1, 'article festif');
insert into Article (id, auteur_id, categorie_id, nom) values (3,4,2, 'article blazé');
insert into Article (id, auteur_id, categorie_id, nom) values (4,1,1, 'article goumand');
insert into Article (id, auteur_id, categorie_id, nom) values (5,1,2, 'article costaud');
insert into Article (id, auteur_id, categorie_id, nom) values (6,1,3, 'article honnete');
insert into Article (id, auteur_id, categorie_id, nom) values (7,2,1, 'article vicieux');
insert into Article (id, auteur_id, categorie_id, nom) values (8,3,2, 'article choqué');

insert into Commentaire (id, article_id, nom) values (16,1, 'commentaire 1');
insert into Commentaire (id, article_id, nom) values (1,2,'commentaire 2');
insert into Commentaire (id, article_id, nom) values (2,3,'commentaire 3');
insert into Commentaire (id, article_id, nom) values (3,4,'commentaire 4');
insert into Commentaire (id, article_id, nom) values (4,5,'commentaire 5');
insert into Commentaire (id, article_id, nom) values (5,6,'commentaire 6');
insert into Commentaire (id, article_id, nom) values (6,7,'commentaire 7');
insert into Commentaire (id, article_id, nom) values (7,8,'commentaire 8');
insert into Commentaire (id, article_id, nom) values (8,9,'commentaire 9');
insert into Commentaire (id, article_id, nom) values (9,1,'commentaire 10');
insert into Commentaire (id, article_id, nom) values (10,2,'commentaire 11');
insert into Commentaire (id, article_id, nom) values (11,3,'commentaire 12');
insert into Commentaire (id, article_id, nom) values (12,4,'commentaire 13');
insert into Commentaire (id, article_id, nom) values (13,5,'commentaire 14');
insert into Commentaire (id, article_id, nom) values (14,6,'commentaire 15');
insert into Commentaire (id, article_id, nom) values (15,7,'commentaire 16');
*/