var app = angular.module("app.Controllers");

app.controller("ArticleListController", function($scope, $http, $routeParams, Server) {
	
	$scope.categoryName = $routeParams.categoryName
	$scope.articles = Server.getArticlesByCategories($routeParams.categoryName);

//	$http({
//		method : 'GET',
//		url : 'http://localhost:8080/blog/article/list/category/nom/'+$routeParams.categoryName
//	}).success(function(data, status, headers, config) {
//		$scope.articles = data;
//	}).error(function(data, status, headers, config) {
//		console.log('request error oui oui oui');
//	});
});
