rebuggerApp.controller('textEditorController', ['$scope', 'MachineFactory', function($scope, MachineFactory)
{

    $scope.lines = MachineFactory.machine.lines;
    $scope.breakpoints = MachineFactory.machine.breakpoints;
    $scope.currentLine = MachineFactory.machine.currentLine;


    //add or remove the breakpoint form the breakpoints array
    $scope.toggleBreakpoint = function (lineNum) {
        $scope.breakpoints.indexOf(lineNum) > -1 ? $scope.breakpoints.splice($scope.breakpoints.indexOf(lineNum), 1) : $scope.breakpoints.push(lineNum);
    }

    $scope.stop = function()    {
        MachineFactory.machine.stop();
    }

    $scope.play = function()    {
        MachineFactory.machine.play();
    }

    $scope.stepOver = function()    {
        MachineFactory.machine.stepOver();
    }

    $scope.stepInto = function()    {
        MachineFactory.machine.stepInto();
    }

}]);