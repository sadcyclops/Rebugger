rebuggerApp.controller('memoryController', ['$scope', 'MachineFactory', function($scope, MachineFactory)
{
    $scope.formats = [
        {id : 0, type : "decimal", selected : true},
        {id : 1, type : "hex", selected : false},
        {id : 2, type : "binary", selected : false}
    ];

    $scope.contents = [
        "35391341",
        "391258315",
        "57892634",
        "548375632"
    ]

    //num is always in hex format
    $scope.convertBase = function(num) {
        return num;
    }
}]);