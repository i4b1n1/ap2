var test = "1";

app.controller('loginController',
		function($scope, $http, $location, appService) {

			$scope.name = "  ";

			$scope.create = function(){
				
				if(appService.zalogowany=="YES"){
					$location.path("/create");
				}
			}
			$scope.loguj = function() {
				var key = $scope.key;
				var login = $scope.login;
				var input = {
					key : key,
					login : login
				};
				$http.get(
						url = 'http://localhost:2990/logging/' + $scope.login
								+ "/" + $scope.key).success(function(data) {
					if (data.status == "true") {
						$location.path("/create");
						appService.zalogowany = "YES";
						
					} else {
						$location.path("/panel");
						$scope.name = "Nie poprawny";
					}
				}).error(function(data) {
					$scope.name = "Problem z bazka";
				});
				test = "adam";

			}

		});

app.controller('panelController',
		function($scope, $http, $location, appService) {
			
			$scope.editData = function(){
				
				appService.incomingData=appService.data;
				$scope.id=appService.incomingData.id;
				$scope.team1name =appService.incomingData.team1.name;
				$scope.team1score = appService.incomingData.scoreT1;
				$scope.team2name =appService.incomingData.team2.name;
				$scope.team2score = appService.incomingData.scoreT2;
				$scope.date = appService.incomingData.date;
				$scope.liga = appService.incomingData.judge
			}
			
			$scope.saveEditData = function(){
				
				$http.post(
						url = 'http://localhost:2990/save/' + $scope.id + "/"+ $scope.team1name + "/"+ $scope.team1score + "/"+ $scope.team2name + "/"+ $scope.team2score + "/"+ $scope.date + "/"+ $scope.liga).
						success(function(data) {
							$scope.info = "Dodano team";
				}).error(function(data) {
					$scope.info = " Nie Dodano teamu";
				});	
				
			}
			
			var infoMatch;
			$scope.showData = function(data) {
				appService.data=data;
				var infoMatch = data;
				var team1Name = data.team1.name;
				var team2Name = data.team2.name;
				var listTeam1 = data.team1.listFootballer;
				var listTeam2 = data.team2.listFootballer;
				var team1Pos = data.team1.positionInLeague;
				var team2Pos = data.team2.positionInLeague;
				$scope.nameTeam1 = data.team1.name;
				$scope.nameTeam2 = data.team2.name;
				$scope.listFootballer1 = data.team1.listFootballer;
				$scope.listFootballer2 = data.team2.listFootballer;
				$scope.teamPos1 = data.team1.positionInLeague;
				$scope.teamPos2 = data.team2.positionInLeague;
			}
			
			$scope.liga = function(data) {
				appService.idLeague = data;

			}

			$scope.getData = function(id) {
				$scope.leagueId = id;

				$http.get(
						url = 'http://localhost:2990/scoreMatchs/'
								+ $scope.leagueId).success(function(data) {
					$scope.scoreMatchs = data;
				}).error(function(data) {
					$scope.name = "Problem z bazka";
				});

				$http.get(
						url = 'http://localhost:2990/futureMatchs/'
								+ $scope.leagueId).success(function(data) {
					$scope.futureMatchs = data
				}).error(function(data) {
					$scope.name = "Problem z bazka";
				});
			}

			$scope.getData(appService.idLeague);

		});

app.controller('scoreController',
		function($scope, $http, $location, appService) {

			$scope.liga = function(id) {
				$scope.leagueId = id;

				$http.get(
						url = 'http://localhost:2990/scoreAll/'
								+ $scope.leagueId).success(function(data) {
					$scope.scoreTeam = data
				}).error(function(data) {
					$scope.name = "Problem z bazka";
				});

				$http.get(
						url = 'http://localhost:2990/lastMatchs/'
								+ $scope.leagueId).success(function(data) {
					$scope.scoreTeam = data
				}).error(function(data) {
					$scope.name = "Problem z bazka";
				});

				$http.get(
						url = 'http://localhost:2990/futureMatchs/'
								+ $scope.leagueId).success(function(data) {
					$scope.scoreTeam = data
				}).error(function(data) {
					$scope.name = "Problem z bazka";
				});
			}
			
			$scope.create = function(){
				
				if(appService.zalogowany=="YES"){
					$location.path("/create");
				}
			}

		});

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