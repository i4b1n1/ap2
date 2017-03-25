
app.controller('glownaController',function($scope, $http, $location, appService) {

	var newsNumber = 7;
	$http.get(
			'http://localhost:2990//news/get/'+ newsNumber + '').success(
			function(data) {
				$scope.info = "Pobrano news/ ";
				$scope.news = data;
			}).error(
			function(data) {
				$scope.info = " Error news/ ";
			});


	
	
	
});
