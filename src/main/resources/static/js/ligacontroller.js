app.controller('ligaController',
		function($scope, $http, $location, appService) {

			$scope.liga = function(ligaId) {
				appService.leagueId = ligaId;
			}

			$http.get(
					$location.protocol() + '://'+ $location.host() +':'+  $location.port() + '/' + '/scorers-classification/ '
							+ appService.leagueId + '').success(
					function(data) {
						$scope.info = "Pobrano scorers-classification/ "
								+ appService.leagueId;
						$scope.scorersclassification = data;
					}).error(
					function(data) {
						$scope.info = " Error scorers-classification/ "
								+ appService.leagueId;
					});

			$http.get(
					$location.protocol() + '://'+ $location.host() +':'+  $location.port() + '/' + '/results/last-matchweek/ '
							+ appService.leagueId + '').success(
					function(data) {
						$scope.info = "Pobrano results/last-matchweek/  "
								+ appService.leagueId;
						$scope.lastmatchweek = data;
					}).error(
					function(data) {
						$scope.info = " Error in results/last-matchweek/  "
								+ appService.leagueId;
					});

			$http.get(
					$location.protocol() + '://'+ $location.host() +':'+  $location.port() + '/' + '/table/'
									+ appService.leagueId + '').success(
							function(data) {
								$scope.info = "Pobrano table//  "
										+ appService.leagueId;
								$scope.bestTeam = data;
							}).error(
							function(data) {
								$scope.info = " Error in table//  "
										+ appService.leagueId;
							});

			$scope.getTeamDetails = function(teamId) {

				$http
						.get(
								$location.protocol() + '://'+ $location.host() +':'+  $location.port() + '/' + '/players/list/ '
										+ teamId + '').success(function(data) {
							$scope.info = "players/list/ " + teamId;
							$scope.playerListTeam = data;
						}).error(function(data) {
							$scope.info = " Error players/list/ " + teamId;
						});

			}

			$scope.getMatchDetails = function(awayTeamId, homeTeamId) {

				$http.get(
						$location.protocol() + '://'+ $location.host() +':'+  $location.port() + '/' + '/players/list/' + awayTeamId
								+ '').success(function(data) {
					$scope.info = "Pobrano players/list/ " + awayTeamId;
					$scope.playerListAway = data;
				}).error(function(data) {
					$scope.info = " Error players/list/ " + awayTeamId;
				});

				$http.get(
						$location.protocol() + '://'+ $location.host() +':'+  $location.port() + '/' + '/players/list/' + homeTeamId
								+ '').success(function(data) {
					$scope.info = "Pobrano players/list/ " + homeTeamId;
					$scope.playerListHome = data;
				}).error(function(data) {
					$scope.info = " Error players/list/ " + homeTeamId;
				});

			}

		});
