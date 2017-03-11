
app.controller('createController', function($scope, $http, $location,
		appService) {

	$scope.create = function(){
		
		if(appService.zalogowany=="YES"){
			$location.path("/create");
		}
	}

	$scope.submitTeam = function() {
		if(idTeam.value!= undefined || idTeam.value!= null){
			$http.post(
					url = 'http://localhost:2990/update-team/' + idTeam.value + "/"+ nazwaTeam.value + "/"+ ligaTeam.value + "/"+ captainTeam.value).
					success(function(data) {
						$scope.info = "Dodano team";
			}).error(function(data) {
				$scope.info = " Nie Dodano teamu";
			});
		}
		else{
			$http.post(
					url = 'http://localhost:2990/add-team/' + nazwaTeam.value + "/"+ ligaTeam.value + "/"+ captainTeam.value).
					success(function(data) {
						$scope.info = "Dodano team";
			}).error(function(data) {
				$scope.info = " Nie Dodano teamu";
			});
		}
	
	}
	
	$scope.submitMecz = function() {
		
		if(idMecz.value!= undefined || idMecz.value!= null){
		
			$http.post(
					url = 'http://localhost:2990/update-match/' + idMecz.value + "/"+ team1Mecz.value + "/"+ team2Mecz.value + "/"+ dataMecz.value + "/"+ courtMecz.value + "/"+ reffereMecz.value) .
					success(function(data) {
						$scope.info = "Dodano Przyzly";
			}).error(function(data) {
				$scope.info = " Nie Dodano przyszly";
			});
		}
		else{
			$http.post(
					url = 'http://localhost:2990/add-match/' +  team1Mecz.value + "/"+ team2Mecz.value + "/"+ dataMecz.value + "/"+ courtMecz.value + "/"+ reffereMecz.value) .
					success(function(data) {
						$scope.info = "Dodano Przyzly";
			}).error(function(data) {
				$scope.info = " Nie Dodano przyszly";
			});
		}


	}
	    
	$scope.submitEvent = function() {

		$http.post(
				url = 'http://localhost:2990/insert/wynik/' + idEvent.value + "/" + idTeamuEvent.value + "/"+ minutaEvent.value + "/"+ typEvent.value + "/"+ zawodnikEvent.value + "/"+ wartoscEvent.value + "/" + zawodnikEvent.value).
				success(function(data) {
					$scope.info = "Dodano Wynik";
		}).error(function(data) {
			$scope.info = " Nie Dodano wyniku";
		});
	}
	
	$scope.submitPilkarz= function() {
		if(idPilkarz.value!= undefined || idPilkarz.value!= null)
			{
			$http.post(
					url = 'http://localhost:2990/update-player/'  + idPilkarz.value + "/"+ imiePilkarz.value + "/"+ nazwiskoPilkarz.value + "/"+ pozycjaPilkarz.value + "/"+ teamPilkarz.value + "/"+ narodowscPilkarz.value ).
					success(function(data) {
						$scope.info = "Dodano Pilkarz";
			}).error(function(data) {
				$scope.info = " Nie Dodano Pilkarz";
			});	
			
			}
		else{
			
			$http.post(
					url = 'http://localhost:2990/add-player/'  + imiePilkarz.value + "/"+ nazwiskoPilkarz.value + "/"+ pozycjaPilkarz.value + "/"+ karyPilkarz.value + "/"+ ligaPilkarz.value ).
					success(function(data) {
						$scope.info = "Dodano Pilkarz";
			}).error(function(data) {
				$scope.info = " Nie Dodano Pilkarz";
			});
		}
		
	}

});