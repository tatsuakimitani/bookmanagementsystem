angular.module('bookManagementApp', []).controller('RegisterBookController', ['$scope',function ($scope) {
  var self = this;
  $scope.register = function (book) {
    console.log(book);  // 確認用
  };
}]);