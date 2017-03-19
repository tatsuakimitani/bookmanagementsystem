/**
 * 登録画面用のコントローラ
 */
angular.module('bookManagementApp', []).controller('RegisterBookController', ['$scope', '$location', function ($scope, $location) {
  var self = this;
  $scope.submitForm = function () {
    if ($scope.registerForm.$invalid) {
      alert('our form is amazing');
    } else {
      self.submitRegisterForm($scope);
    }
  };

  // $scope.register = function (scope) {
  //   // 必須項目が入力されていない場合はエラーを返す。
  //   if (!book || !book.name
  //     || !book.author
  //     || !book.publisher
  //     || !book.category) {
  //     alert("エラーです");
  //   } else {
  //     self.submitRegisterForm(scope.book.name);
  //   }
  // };

  // 登録情報を取得し、登録確認画面に遷移させる。
  self.submitRegisterForm = function (scope) {
    console.log("register");
    console.log(scope.book.name);
    $scope.value = scope;
    window.location.href = 'createConfirm';

  };
}]);