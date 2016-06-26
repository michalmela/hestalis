//'use strict';

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
        $http({
            method:'POST',
            url: 'rest/v1/login',
            data: $.param({
                'username' : $scope.username,
                'password' : $scope.password
            }),
            headers: { 'Content-Type' : 'application/x-www-form-urlencoded' }
        }).success(function(data){
            console.log(' data ');
        });
    }
}]);
