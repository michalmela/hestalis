'use strict';

/* Controllers */


var app = angular.module('ngdemo.controllers', []);


// Clear browser cache (in development mode)
// http://stackoverflow.com/questions/14718826/angularjs-disable-partial-caching-on-dev-machine
app.run(function ($rootScope, $templateCache) {
    $rootScope.$on('$viewContentLoaded', function () {
        $templateCache.removeAll();
    });
});

app.controller('MyCtrl1', ['$scope', '$http', function ($scope, $http) {
    $scope.login = function () {
        //$scope.firstname = "Sukces";

        var encodedString = 'username=' +
            encodeURIComponent($scope.username) +
            '&password=' +
            encodeURIComponent($scope.password);
        $http({
            method:'POST',
            url: 'rest/users',
            data: encodedString,
            headers: {'Accept': 'application/x-www-form-urlencoded',
                'Content-Type' : 'application/x-www-form-urlencoded'}
        });
    }
}]);
