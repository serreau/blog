
	var app = angular.module('app', ['ngRoute', 
	                                 'ngResource',
	                                 'app.Controllers', 
	                                 'app.Services']);
	
	app.config(function ($routeProvider) {
	  $routeProvider
	  		//###HOME###
		  .when('/', {
		    templateUrl: 'pages/accueil.html',
		    controller: 'HomeController'
		  })
		  	//###LISTE DES CATEGORIES###
		  .when('/categories', {
		    templateUrl: 'pages/categorie-list.html', 
		    controller: 'CategoryController'
		  })
		  //###LISTE DES ARTICLES BY CATEGORIE###
		  .when('/articles/:categoryName', {
		    templateUrl: 'pages/article-list.html', 
		    controller: 'ArticleListController'
		  })
		  //###DETAIL DE L'ARTICLE###
		  .when('/article/:categoryName/:articleId', {
		    templateUrl: 'pages/article-detail.html', 
		    controller: 'ArticleDetailController'
		  })
		  //###FORMULAIRE CREER UN ARTICLE###
		  .when('/article/new', {
		    templateUrl: 'pages/article-new.html',
		    controller: 'ArticleNewController'
		  })
		  .otherwise({
		    redirectTo: '/'
		  });
	});
