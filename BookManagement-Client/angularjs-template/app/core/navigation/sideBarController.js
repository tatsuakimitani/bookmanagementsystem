(function () {
    'use strict';

    angular.module('app.nav.sidebar', ['ui.router'])

            .controller('SideBarController', SideBarController);

    SideBarController.$inject = ['$state'];

    function SideBarController($state) {
        var vm = this;

        vm.getClass = getClass;

        function getClass(path) {
            if ($state.current.name.substr(0, path.length) === path) {
                return 'active';
            } else {
                return '';
            }
        }
    }
})();
