rebuggerApp.controller('textEditorController', ['$scope', 'MachineFactory', function($scope, MachineFactory)
{

    $scope.lines = MachineFactory.machine.lines;
    $scope.breakpoints = MachineFactory.machine.breakpoints;
    $scope.currentLine = MachineFactory.machine.currentLine;

}]);