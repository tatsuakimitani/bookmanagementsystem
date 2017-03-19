/**
 * 登録確認画面用のコントローラ
 */
angular.module('bookManagementApp', []).controller('RegisterConfirmBookController', ['$scope', function ($scope) {
  var self = this;
  $scope.register = function (book) {
    // 必須項目が入力されてい相場合はエラーを返す。
    if (!book || !book.name
      || !book.author
      || !book.publisher
      || !book.category) {
      alert("エラーです");
    } else {
      self.registerForm(book);
    }
  };
  // 登録情報を取得し、登録確認画面に遷移させる。
  self.submitRegisterForm = function (book) {
    console.log("registerConfirm");
    console.log(book.name);
    console.log($scope);
  };
}]);