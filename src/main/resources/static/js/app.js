var app = angular.module('app', [ 'ngRoute', 'ngResource' ,'angularModalService']);
app.config(function($routeProvider) {
	$routeProvider.when('/login', {
		templateUrl : '/views/login.html',
		controller : 'loginController'
	}).when('/liga1', {
		templateUrl : '/views/liga1.html',
		controller : 'ligaController'
	}).when('/liga2', {
		templateUrl : '/views/liga2.html',
		controller : 'ligaController'
	}).when('/liga3', {
		templateUrl : '/views/liga3.html',
		controller : 'ligaController'
	}).when('/kontakt', {
		templateUrl : '/views/kontakt.html',
		controller : 'contactController'
	}).when('/create', {
		templateUrl : '/views/create.html',
		controller : 'createController'
	}).otherwise({
		redirectTo : '/'
	});
});
