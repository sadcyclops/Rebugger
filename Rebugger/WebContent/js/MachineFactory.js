rebuggerApp.factory('MachineFactory', ['$http', function ($http)    {
    
    machine = {}

    
    machine.machine = {
        "lines" : [
            "mov     %r0, $1     /* fd -> stdout",
            "ldr     %r1, =msg   /* buf -> msg ",
            "ldr     %r2, =len   /* count -> len(msg) ",
            "mov     %r7, $4     /* write is syscall #4 ",
            "swi     $0          /* invoke syscall */"
            ],
        "registers" : [
            8402, 20878, 23185, 28336, 29536, 42810, 49392, 57312, 60611, 78124, 85601, 106051, 108939, 111462, 124515, 140942, 142738, 154669, 157276, 161962, 172600, 174513, 175214, 182114, 182944, 193207, 208009, 226715, 240269, 248819, 259633, 261943, 272617, 285868, 311915, 312629, 332842, 332914, 337140, 338883, 342824, 356201, 357603, 358578, 421013, 433499, 448271, 454536, 462644, 465159, 465670, 472260, 472277, 485802, 517417, 531655, 562338, 573452, 577847, 588668, 590153, 606333, 624286, 624908, 628764, 628990, 642657, 643387, 653689, 653730, 667700, 672572, 676811, 703893, 706922, 711297, 715624, 740155, 740949, 778420, 782115, 803549, 819183, 836199, 869611, 880525, 881025, 883453, 886107, 886144, 902432, 907385, 909352, 916562, 949719, 964064, 972782, 998042, 998183, 999753
        ],
        "stack" : [
            3370, 3377, 12742, 20407, 20689, 20843, 31046, 37163, 39994, 55532, 71607, 73135, 79779, 95289, 98991, 100531, 116705, 140784, 147443, 182670, 189807, 227605, 228221, 240952, 242410, 243004, 251521, 279324, 301648, 317016, 320675, 322099, 346361, 350700, 355070, 358589, 360973, 368736, 368973, 372740, 380255, 397414, 430794, 443192, 456159, 463525, 465875, 475976, 496568, 535779, 541992, 542372, 546163, 552362, 558578, 564145, 564508, 564935, 580262, 587262, 602308, 607202, 610881, 618745, 620709, 621749, 647074, 670876, 674108, 685792, 691109, 693489, 695909, 703292, 703828, 716457, 725777, 732962, 734137, 755279, 759576, 765978, 773161, 776022, 806707, 811552, 814699, 825466, 862820, 867323, 887306, 906826, 908120, 918009, 921579, 949614, 966119, 977417, 990177, 992805
        ],
        "heap" : [
            2304, 12226, 30997, 33592, 44689, 49793, 66837, 72015, 73517, 105660, 124805, 143178, 147092, 150119, 163148, 167161, 184629, 211488, 212527, 215841, 228232, 236021, 254792, 262914, 283780, 287557, 290658, 295525, 297622, 303280, 349747, 357541, 416311, 427026, 428388, 436073, 437148, 440776, 447130, 451006, 469741, 474460, 482354, 494669, 501455, 508784, 509599, 527840, 547436, 555215, 576513, 587413, 604218, 604284, 617339, 617637, 624651, 628295, 631736, 639943, 640515, 646312, 647706, 659478, 664569, 672790, 678360, 689565, 702400, 707753, 708811, 712075, 734975, 735295, 765111, 767739, 788762, 791078, 799194, 820192, 826361, 826782, 829000, 837138, 848218, 850298, 872972, 886507, 905885, 908116, 929430, 951461, 959805, 978191, 978862, 981518, 988239, 991358, 993298, 996406
        ],
        "breakpoints" : [
            0,4
        ],
        "currentLine" : 0
    };

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