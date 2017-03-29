
app.controller('createController', function($scope, $http, $location,
		appService) {

	$scope.create = function(){
		
		if(appService.zalogowany=="YES"){
			$location.path("/create");
		}
	}

	$scope.submitTeam = function() {

		var dane = {
				 'faundationDate' : "date" ,
				 'leagueId' : $scope.ligaTeam ,
				 'name' : $scope.nazwaTeam , 
				 'capitainId' : $scope.captainTeam 
				 }
		
		if($scope.idTeam!= ""){
			$http.post(
					$location.protocol() + '://'+ $location.host() +':'+  $location.port() + '/' + '/update-team/' + $scope.idTeam + '',dane
					).success(function(data) {
						$scope.info = "update team";
			}).error(function(data) {
				$scope.info = " Nie update teamu";
			});
		}
		else{
			$http.post(
					$location.protocol() + '://'+ $location.host() +':'+  $location.port() + '/' + '/add-team/',dane).
					success(function(data) {
						$scope.info = "Dodano team";
			}).error(function(data) {
				$scope.info = " Nie Dodano teamu";
			});
		}
	
	}
	
	$scope.submitMecz = function() {
				
		var dane = {
				 'isFinished' : "true" ,
				'matchDate' : $scope.dataMecz ,
				'team1Id' : $scope.team1Mecz , 
				'team2Id' : $scope.team2Mecz 
				 }
		
		if($scope.idMecz!= ""){
		
			$http.post(
					$location.protocol() + '://'+ $location.host() +':'+  $location.port() + '/' + '/update-match/' + $scope.idMecz + '',dane
					).success(function(data) {
						$scope.info = "update-match";
			}).error(function(data) {
				$scope.info = " Nie update-match";
			});
		}
		else{
			$http.post(
					$location.protocol() + '://'+ $location.host() +':'+  $location.port() + '/' + '/add-match/',dane 
					 ).success(function(data) {
						$scope.info = "Dodano add-match";
			}).error(function(data) {
				$scope.info = " Nie add-match";
			});
		}


	}
	    
	$scope.submitNews = function() {

		var dane = {
				'title' : $scope.titleNews ,
				'body' : $scope.bodyNews 				
				}
		
		$http.post(
				url = $location.protocol() + '://'+ $location.host() +':'+  $location.port() + '/' + 'news/add/',dane).
				success(function(data) {
					$scope.info = "Dodano News";
		}).error(function(data) {
			$scope.info = " Nie News";
		});
	}
	
	$scope.submitPilkarz= function() {
		
		var dane = {
				 'name' : $scope.imiePilkarz + " " + $scope.nazwiskoPilkarz, 
				'nationality' : $scope.narodowscPilkarz ,
				'position' : $scope.pozycjaPilkarz , 
				'teamId' : $scope.teamPilkarz 
				 }
		
		if($scope.idPilkarz!= "" )
			{					
			$http.post(
					$location.protocol() + '://'+ $location.host() +':'+  $location.port() + '/' + '/update-player/' + $scope.idPilkarz +'',	dane
					).success(function(data) {
						$scope.info = "update Pilkarz";
					}).error(function(data) {
						$scope.info = " Nie update Pilkarz";
					});			
			}
		else{
			$http.post(
					$location.protocol() + '://'+ $location.host() +':'+  $location.port() + '/' + '/add-player/',dane
					).success(function(data) {
						$scope.info = "Dodano Pilkarz";
			}).error(function(data) {
				$scope.info = " Nie Dodano Pilkarz";
			});
		}
		
	}
	
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//lISTY ROZWIJANE////////////////////////////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////////////////////////////////////
	   $scope.listLeague = {
			    availableOptions: [
			      {id: '1', name: 'Liga 1'},
			      {id: '2', name: 'Liga 2'},
			      {id: '3', name: 'Liga 3'}
			    ]
			   };
	   
	   
	   $scope.updateSelectTeam = function(option){
		   $http.get(
				   $location.protocol() + '://'+ $location.host() +':'+  $location.port() + '/' + '/teams/list/'+ option.id + '').success(
					function(data) {
						$scope.info = "Pobrano scorers-classification/ "
								+ $scope.selectedLieagueId;
						$scope.selectedlistTeam = data;
					}).error(
					function(data) {
						$scope.info = " Error scorers-classification/ "
								+ appService.leagueId;
					});

	   }
	   
	   $scope.updateTeam = function(data){
		   $http.get(
				   $location.protocol() + '://'+ $location.host() +':'+  $location.port() + '/' + '/team-info/'+ data.id + '').success(
					function(data) {
						$scope.idTeam = data.id;
						$scope.nazwaTeam =data.name;
						$scope.ligaTeam = data.leagueId;
						$scope.captainTeam = data.player;
						
						$scope.info = " http://localhost:2990//team-info/ ";
					}).error(
					function(data) {
						$scope.info = " http://localhost:2990//team-info/ ";
					});

	   }
	      
	   
	   $scope.updateSelectMatch = function(option){
		   $http.get(
				   $location.protocol() + '://'+ $location.host() +':'+  $location.port() + '/' + '/teams/list/'+ option.id + '').success(
					function(data) {
						$scope.info = "Pobrano scorers-classification/ "
								+ $scope.selectedLieagueId;
						$scope.selectedlistMatch = data;
					}).error(
					function(data) {
						$scope.info = " Error scorers-classification/ "
								+ appService.leagueId;
					});

	   }
	   
	   $scope.updateMatch = function(data){
		   $http.get(
				   $location.protocol() + '://'+ $location.host() +':'+  $location.port() + '/' + '/teams/list/'+ option.id + '').success(
					function(data) {
						$scope.info = "Pobrano scorers-classification/ "
								+ $scope.selectedLieagueId;
						$scope.selectedlistTeam = data;
					}).error(
					function(data) {
						$scope.info = " Error scorers-classification/ "
								+ appService.leagueId;
					});

	   }
	   
	   
	   
	   $scope.updateSelectTeamofPlayer = function(option){
		   $http.get(
				   $location.protocol() + '://'+ $location.host() +':'+  $location.port() + '/' + 'teams/list/'+ option.id + '').success(
					function(data) {
						$scope.selectedlistTeamofPlayer = data;
					}).error(
					function(data) {
						$scope.info = " Error scorers-classification/ "
								+ appService.leagueId;
					});   

	   }
	   $scope.updateTeamofPlayer = function(data){
		   
		   $http.get(
				   $location.protocol() + '://'+ $location.host() +':'+  $location.port() + '/' + 'players/list/'+ data.id + '').success(
					function(data) {
						$scope.selectedlistPlayer = data;
					}).error(
					function(data) {
						$scope.info = " http://localhost:2990//players/list/"
					});   
		   
	   }
	   $scope.updatePlayer = function(data){
		   $scope.idPilkarz = data.id;
		   var afterSplitName = data.name.split(" ");
		   $scope.imiePilkarz = afterSplitName[0];
		   $scope.nazwiskoPilkarz = afterSplitName[1];
		   $scope.pozycjaPilkarz= data.position;
		   $scope.teamPilkarz = data.team;
		   $scope.narodowscPilkarz = data.nationality;
	   }
	   
	  
	   
	   
	   $scope.updateSelectEvent = function(option){
		   $http.get(
				   
				   $location.protocol() + '://'+ $location.host() +':'+  $location.port() + '/' + 'teams/list/'+ option.id + '').success(
					function(data) {
						$scope.selectedlistTeamofEvent = data;
					}).error(
					function(data) {
						$scope.info = " Error scorers-classification/ "
								+ appService.leagueId;
					});   

	   }
	  $scope.updateTeamofEvent = function(data){
		   $http.get(
				   $location.protocol() + '://'+ $location.host() +':'+  $location.port() + '/' + '/teams/matches/'+ data.id + '').success(
					function(data) {
						$scope.selectedEvent = data;
					}).error(
					function(data) {
						$scope.info = " Error scorers-classification/ "
								+ appService.leagueId;
					});  
		  
	  }
	  
	  $scope.updateEvent = function(data){
		  $scope.updateEventMatchId = data.matchId;
	  }

	  
		$scope.submitEvent= function() {
		
			var dane = {
					 'playerId' : $scope.playerIdEvent , 
					'teamId' : $scope.teamIdEvent ,
					'eventTypeId' : $scope.eventTypeIdEvent , 
					'eventMinute' : $scope.eventMinuteEvent 
					 }
									
				$http.post(
						$location.protocol() + '://'+ $location.host() +':'+  $location.port() + '/' + '/add-result/' + $scope.updateEventMatchId +'',dane
						).success(function(data) {
							$scope.info = "http://localhost:2990/add-result/";
						}).error(function(data) {
							$scope.info = " http://localhost:2990/add-result/";
						});				
			
		}
	  
});