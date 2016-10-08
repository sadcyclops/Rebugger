rebuggerApp.factory('MachineFactory', ['$http', function ($http)    {
    
    machine = {}
    
    machine.machine = {};

    /*

    machine.machine {
        breakpoints[] <- where the lines of the breakpoints are
        assembly code
        registers[]
        stack[]
        heap[]
    }

    */

    //stop the machine execution
    machine.stop = function()   {

    };

    //load the machine state to the VM and start running
    machine.play = function()   {
        
    };

    //tell VM to step over the function
    //returns the new state of the machine
    machine.stepOver = function(lineNumber) {

    };

    //tell VM to step into the current instruction
    machine.stepInto = function(lineNumber) {

    };

    return machine;
}]);