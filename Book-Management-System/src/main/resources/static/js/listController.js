/**
 * List画面用のコントローラ
 */
angular.module('bookManagementApp', []).controller('ListController', ['$scope', function ($scope) {
  // 書籍情報
  $scope.dataList = [{
    no: 1,
    title: 'JUnit実践入門',
    author: '渡辺 修司',
    price: 12000,
    publisher: 'WEB+DB PRESS plus',
    category: 'コンピュータ・IT',
    isBorrowed: false,
    published: new Date(2016, 1, 18)
  }, {
    no: 2,
    title: '仕事の思想',
    author: '田坂 広志',
    price: 15000,
    publisher: 'PHP文庫',
    category: '文学・評論',
    isBorrowed: false,
    published: new Date(2016, 4, 18)
  }];
}]);