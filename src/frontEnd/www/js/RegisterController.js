rebuggerApp.controller('registerController', ['$scope', 'MachineFactory', function($scope, MachineFactory)
{
$scope.registers = MachineFactory.machine.registers;
}]);