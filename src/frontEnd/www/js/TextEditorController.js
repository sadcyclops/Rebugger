rebuggerApp.controller('textEditorController', ['$scope', 'MachineFactory', function($scope, MachineFactory)
{

    $scope.lines = MachineFactory.machine.lines;
    $scope.breakpoints = MachineFactory.breakpoints;
    $scope.fuckyou = 5;

}]);