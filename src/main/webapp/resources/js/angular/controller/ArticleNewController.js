var app = angular.module("app.Controllers");

app.controller("ArticleNewController", function($scope, $http, $routeParams, Server) {
	$scope.categories = Server.getCategories();
	
	$scope.addArticle = function(article){
		Server.saveArticle(article);
		angular.copy({}, article);
	};
	$scope.reset = function(article){
		angular.copy({}, article);
	};
});
