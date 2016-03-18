var app = angular.module("app.Controllers");

app.controller("ArticleListController", function($scope, $http, $routeParams, Server) {
	
	$scope.categoryName = $routeParams.categoryName
	$scope.articles = Server.getArticlesByCategories($routeParams.categoryName);
	
	$scope.deleteArticle = function(article){
		Server.removeArticle(article.id);
		var index = $scope.articles.indexOf(article);
		$scope.articles.splice(index, 1);
	}
});
