var app = angular.module("app.Controllers");

app.controller("CategoryController", function($scope, $http, $resource, Server) {
	$scope.categories = Server.getCategories();
});
