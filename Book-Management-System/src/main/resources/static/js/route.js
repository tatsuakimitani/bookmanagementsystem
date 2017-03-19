angular.module('bookManagementApp', ['ngRoute'])
  // 1configメソッドに$routeProviderプロバイダーを注入
  .config(['$routeProvider', function ($routeProvider) {
    $routeProvider
      .when('/', {
        templateUrl: 'templates/list.html',
        controller: 'ListController',
        scope: $scope
      })
      .when('/create', {
        templateUrl: 'templates/create.html',
        controller: 'RegisterBookController',
        scope: $scope
      })
      .when('/createConfirm', {
        templateUrl: 'templates/createConfirm.html',
        controller: 'RegisterConfirmBookController',
        scope: $scope
      })
      .otherwise({
        redirectTo: '/'
      });
  }]);