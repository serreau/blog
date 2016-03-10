var app = angular.module("app.Controllers");

app.controller("ArticleDetailController", function($scope, $http, $routeParams, $resource, Server) {
	var categoryName = $routeParams.categoryName;
	var articleId = $routeParams.articleId;
	$scope.article = {};
	$scope.commentaire = {};
	
	$scope.article = Server.getArticleDetail(articleId);
	$scope.commentaires = Server.getCommentairesByArticleId(articleId);

	$scope.addComment = function(com){
		var commentaire = {};
		angular.copy(com, commentaire);
		angular.copy({}, com);
		
		commentaire.article = {id:articleId};
		$scope.commentaires.push(Server.saveComment(commentaire));
	}
});
