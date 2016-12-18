app.controller('usersController', function($scope) {
	$scope.headingTitle = "User List";
});


app.controller('rolesController', function($scope, $http) {
	$http.get("http://localhost:2990/controler/get").
			then(function(data) {
				$scope.headingTitle = data.data.name;
			});
	
	
	
} )

