
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
						url = $location.protocol() + '://'+ $location.host() +':'+  $location.port() + '/' + '/logging/' + $scope.login
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
