var app = angular.module('app.Services', []);


app.service('Server', function($resource) {
	var baseUrl = 'http://localhost:8080/blog/';
	
	this.getCategories = function(){
		var url = baseUrl+'categorie/findAll';
		return $resource(url).query();		
	}
	this.getArticlesByCategories = function(_categoryName){
		var url = baseUrl+'article/list/category/nom/:categoryName';
		var params = {categoryName : _categoryName};
		return $resource(url, params).query();		
	}
	this.getArticleDetail = function(_id){
		var url = baseUrl+'article/detail/articleId/:id';
		var params = {id : '@id'};
		return $resource(url, params).get({id : _id});	
	}
	this.saveArticle = function(_article){
		_article.auteur = {id:1};
		
		var url = baseUrl+'article/add';
		var Article = $resource(url/*, {nom:'@nom', chapeau:'@chapeau', contenu:'@contenu', dateCreation:'@dateCreation'}*/);
		var a = new Article();
		a.nom = _article.nom;
		a.chapeau = _article.chapeau;
		a.contenu = _article.contenu;
		a.dateCreation = new Date();
		a.categorie = _article.categorie;
		a.auteur = _article.auteur;
		
		a.$save();
	}
	this.removeArticle = function(_articleId){
		var url = baseUrl+'article/remove/articleId/:articleId';
		var params = {articleId : '@id'};
		var Article = $resource(url,params).remove({articleId : _articleId});
	}
	this.getCommentairesByArticleId = function(_id){
		var url = baseUrl+'commentaire/list/articleId/:articleId';
		var params = {articleId : _id};
		return $resource(url, params).query();	
	}
	this.saveComment = function(_commentaire){
		_commentaire.dateCreation = new Date();
		_commentaire.email = 'my_mail@gmail.fr';
		_commentaire.validation = true;
		
		var url = baseUrl+'commentaire/addComment';
		var Commentaire = $resource(url);
		var c = new Commentaire();
		
		c.dateCreation = _commentaire.dateCreation;
		c.email = _commentaire.email;
		c.nom = _commentaire.nom;
		c.texte = _commentaire.texte;
		c.validation = _commentaire.validation;
		c.article = _commentaire.article;
		c.$save();
		return _commentaire;
	}
});