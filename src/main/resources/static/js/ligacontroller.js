
app.controller('ligaController',function($scope, $http, $location, appService) {
			
	$scope.liga = function(ligaId){
		appService.leagueId=ligaId;
	}
	
	
	$http.get(
			url = 'http://localhost:2990//scorers-classification/ '+ 1).
			success(function(data) {
				$scope.info = "Pobrano scorers-classification/ " + appService.leagueId;
				$scope.scorersclassification = data;
	}).error(function(data) {
		$scope.info = " Pobrano scorers-classification/ " + appService.leagueId;
	});

		});
