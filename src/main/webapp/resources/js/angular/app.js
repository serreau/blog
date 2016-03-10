
	var app = angular.module('app', [  'ngRoute', 
	                                   'ngResource',
	                                   'app.Controllers', 
	                                   'app.Services']);
	
	app.config(function ($routeProvider) {
	  $routeProvider
		  .when('/', {
		    templateUrl: 'pages/accueil.html',
		    controller: 'HomeController'
		  })
		  .when('/categories', {
		    templateUrl: 'pages/categorie-list.html', 
		    controller: 'CategoryController'
		  })
		  .when('/articles/:categoryName', {
		    templateUrl: 'pages/article-list.html', 
		    controller: 'ArticleListController'
		  })
		  .when('/article/:categoryName/:articleId', {
		    templateUrl: 'pages/article-detail.html', 
		    controller: 'ArticleDetailController'
		  })
		  .when('/article/new', {
		    templateUrl: 'pages/article-new.html',
		    controller: 'ArticleNewController'
		  })
		  .otherwise({
		    redirectTo: '/'
		  });
	});
