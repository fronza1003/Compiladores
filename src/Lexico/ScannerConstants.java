package Lexico;

public interface ScannerConstants
{
    int[] SCANNER_TABLE_INDEXES = 
    {
        0,
        82,
        85,
        86,
        278,
        469,
        470,
        470,
        470,
        470,
        470,
        470,
        470,
        470,
        471,
        482,
        483,
        484,
        484,
        485,
        548,
        741,
        742,
        742,
        742,
        934,
        934,
        944,
        944,
        944,
        944,
        1007,
        1007,
        1007,
        1008,
        1018
    };

    int[][] SCANNER_TABLE = 
    {
        {9, 1},
        {10, 1},
        {32, 1},
        {33, 2},
        {34, 3},
        {35, 4},
        {38, 5},
        {40, 6},
        {41, 7},
        {42, 8},
        {43, 9},
        {44, 10},
        {45, 11},
        {47, 12},
        {48, 13},
        {49, 14},
        {50, 14},
        {51, 14},
        {52, 14},
        {53, 14},
        {54, 14},
        {55, 14},
        {56, 14},
        {57, 14},
        {58, 15},
        {60, 16},
        {61, 17},
        {62, 18},
        {65, 19},
        {66, 19},
        {67, 19},
        {68, 19},
        {69, 19},
        {70, 19},
        {71, 19},
        {72, 19},
        {73, 19},
        {74, 19},
        {75, 19},
        {76, 19},
        {77, 19},
        {78, 19},
        {79, 19},
        {80, 19},
        {81, 19},
        {82, 19},
        {83, 19},
        {84, 19},
        {85, 19},
        {86, 19},
        {87, 19},
        {88, 19},
        {89, 19},
        {90, 19},
        {97, 19},
        {98, 19},
        {99, 19},
        {100, 19},
        {101, 19},
        {102, 19},
        {103, 19},
        {104, 19},
        {105, 19},
        {106, 19},
        {107, 19},
        {108, 19},
        {109, 19},
        {110, 19},
        {111, 19},
        {112, 19},
        {113, 19},
        {114, 19},
        {115, 19},
        {116, 19},
        {117, 19},
        {118, 19},
        {119, 19},
        {120, 19},
        {121, 19},
        {122, 19},
        {123, 20},
        {124, 21},
        {9, 1},
        {10, 1},
        {32, 1},
        {61, 22},
        {9, 3},
        {13, 3},
        {32, 3},
        {33, 3},
        {34, 23},
        {35, 3},
        {36, 3},
        {37, 3},
        {38, 3},
        {39, 3},
        {40, 3},
        {41, 3},
        {42, 3},
        {43, 3},
        {44, 3},
        {45, 3},
        {46, 3},
        {47, 3},
        {48, 3},
        {49, 3},
        {50, 3},
        {51, 3},
        {52, 3},
        {53, 3},
        {54, 3},
        {55, 3},
        {56, 3},
        {57, 3},
        {58, 3},
        {59, 3},
        {60, 3},
        {61, 3},
        {62, 3},
        {63, 3},
        {64, 3},
        {65, 3},
        {66, 3},
        {67, 3},
        {68, 3},
        {69, 3},
        {70, 3},
        {71, 3},
        {72, 3},
        {73, 3},
        {74, 3},
        {75, 3},
        {76, 3},
        {77, 3},
        {78, 3},
        {79, 3},
        {80, 3},
        {81, 3},
        {82, 3},
        {83, 3},
        {84, 3},
        {85, 3},
        {86, 3},
        {87, 3},
        {88, 3},
        {89, 3},
        {90, 3},
        {91, 3},
        {92, 24},
        {93, 3},
        {94, 3},
        {95, 3},
        {96, 3},
        {97, 3},
        {98, 3},
        {99, 3},
        {100, 3},
        {101, 3},
        {102, 3},
        {103, 3},
        {104, 3},
        {105, 3},
        {106, 3},
        {107, 3},
        {108, 3},
        {109, 3},
        {110, 3},
        {111, 3},
        {112, 3},
        {113, 3},
        {114, 3},
        {115, 3},
        {116, 3},
        {117, 3},
        {118, 3},
        {119, 3},
        {120, 3},
        {121, 3},
        {122, 3},
        {123, 3},
        {124, 3},
        {125, 3},
        {126, 3},
        {161, 3},
        {162, 3},
        {163, 3},
        {164, 3},
        {165, 3},
        {166, 3},
        {167, 3},
        {168, 3},
        {169, 3},
        {170, 3},
        {171, 3},
        {172, 3},
        {173, 3},
        {174, 3},
        {175, 3},
        {176, 3},
        {177, 3},
        {178, 3},
        {179, 3},
        {180, 3},
        {181, 3},
        {182, 3},
        {183, 3},
        {184, 3},
        {185, 3},
        {186, 3},
        {187, 3},
        {188, 3},
        {189, 3},
        {190, 3},
        {191, 3},
        {192, 3},
        {193, 3},
        {194, 3},
        {195, 3},
        {196, 3},
        {197, 3},
        {198, 3},
        {199, 3},
        {200, 3},
        {201, 3},
        {202, 3},
        {203, 3},
        {204, 3},
        {205, 3},
        {206, 3},
        {207, 3},
        {208, 3},
        {209, 3},
        {210, 3},
        {211, 3},
        {212, 3},
        {213, 3},
        {214, 3},
        {215, 3},
        {216, 3},
        {217, 3},
        {218, 3},
        {219, 3},
        {220, 3},
        {221, 3},
        {222, 3},
        {223, 3},
        {224, 3},
        {225, 3},
        {226, 3},
        {227, 3},
        {228, 3},
        {229, 3},
        {230, 3},
        {231, 3},
        {232, 3},
        {233, 3},
        {234, 3},
        {235, 3},
        {236, 3},
        {237, 3},
        {238, 3},
        {239, 3},
        {240, 3},
        {241, 3},
        {242, 3},
        {243, 3},
        {244, 3},
        {245, 3},
        {246, 3},
        {247, 3},
        {248, 3},
        {249, 3},
        {250, 3},
        {251, 3},
        {252, 3},
        {253, 3},
        {254, 3},
        {255, 3},
        {9, 4},
        {32, 4},
        {33, 4},
        {34, 4},
        {35, 4},
        {36, 4},
        {37, 4},
        {38, 4},
        {39, 4},
        {40, 4},
        {41, 4},
        {42, 4},
        {43, 4},
        {44, 4},
        {45, 4},
        {46, 4},
        {47, 4},
        {48, 4},
        {49, 4},
        {50, 4},
        {51, 4},
        {52, 4},
        {53, 4},
        {54, 4},
        {55, 4},
        {56, 4},
        {57, 4},
        {58, 4},
        {59, 4},
        {60, 4},
        {61, 4},
        {62, 4},
        {63, 4},
        {64, 4},
        {65, 4},
        {66, 4},
        {67, 4},
        {68, 4},
        {69, 4},
        {70, 4},
        {71, 4},
        {72, 4},
        {73, 4},
        {74, 4},
        {75, 4},
        {76, 4},
        {77, 4},
        {78, 4},
        {79, 4},
        {80, 4},
        {81, 4},
        {82, 4},
        {83, 4},
        {84, 4},
        {85, 4},
        {86, 4},
        {87, 4},
        {88, 4},
        {89, 4},
        {90, 4},
        {91, 4},
        {92, 4},
        {93, 4},
        {94, 4},
        {95, 4},
        {96, 4},
        {97, 4},
        {98, 4},
        {99, 4},
        {100, 4},
        {101, 4},
        {102, 4},
        {103, 4},
        {104, 4},
        {105, 4},
        {106, 4},
        {107, 4},
        {108, 4},
        {109, 4},
        {110, 4},
        {111, 4},
        {112, 4},
        {113, 4},
        {114, 4},
        {115, 4},
        {116, 4},
        {117, 4},
        {118, 4},
        {119, 4},
        {120, 4},
        {121, 4},
        {122, 4},
        {123, 4},
        {124, 4},
        {125, 4},
        {126, 4},
        {161, 4},
        {162, 4},
        {163, 4},
        {164, 4},
        {165, 4},
        {166, 4},
        {167, 4},
        {168, 4},
        {169, 4},
        {170, 4},
        {171, 4},
        {172, 4},
        {173, 4},
        {174, 4},
        {175, 4},
        {176, 4},
        {177, 4},
        {178, 4},
        {179, 4},
        {180, 4},
        {181, 4},
        {182, 4},
        {183, 4},
        {184, 4},
        {185, 4},
        {186, 4},
        {187, 4},
        {188, 4},
        {189, 4},
        {190, 4},
        {191, 4},
        {192, 4},
        {193, 4},
        {194, 4},
        {195, 4},
        {196, 4},
        {197, 4},
        {198, 4},
        {199, 4},
        {200, 4},
        {201, 4},
        {202, 4},
        {203, 4},
        {204, 4},
        {205, 4},
        {206, 4},
        {207, 4},
        {208, 4},
        {209, 4},
        {210, 4},
        {211, 4},
        {212, 4},
        {213, 4},
        {214, 4},
        {215, 4},
        {216, 4},
        {217, 4},
        {218, 4},
        {219, 4},
        {220, 4},
        {221, 4},
        {222, 4},
        {223, 4},
        {224, 4},
        {225, 4},
        {226, 4},
        {227, 4},
        {228, 4},
        {229, 4},
        {230, 4},
        {231, 4},
        {232, 4},
        {233, 4},
        {234, 4},
        {235, 4},
        {236, 4},
        {237, 4},
        {238, 4},
        {239, 4},
        {240, 4},
        {241, 4},
        {242, 4},
        {243, 4},
        {244, 4},
        {245, 4},
        {246, 4},
        {247, 4},
        {248, 4},
        {249, 4},
        {250, 4},
        {251, 4},
        {252, 4},
        {253, 4},
        {254, 4},
        {255, 4},
        {38, 25},
        {44, 26},
        {44, 26},
        {48, 14},
        {49, 14},
        {50, 14},
        {51, 14},
        {52, 14},
        {53, 14},
        {54, 14},
        {55, 14},
        {56, 14},
        {57, 14},
        {61, 27},
        {61, 28},
        {61, 29},
        {48, 30},
        {49, 30},
        {50, 30},
        {51, 30},
        {52, 30},
        {53, 30},
        {54, 30},
        {55, 30},
        {56, 30},
        {57, 30},
        {65, 19},
        {66, 19},
        {67, 19},
        {68, 19},
        {69, 19},
        {70, 19},
        {71, 19},
        {72, 19},
        {73, 19},
        {74, 19},
        {75, 19},
        {76, 19},
        {77, 19},
        {78, 19},
        {79, 19},
        {80, 19},
        {81, 19},
        {82, 19},
        {83, 19},
        {84, 19},
        {85, 19},
        {86, 19},
        {87, 19},
        {88, 19},
        {89, 19},
        {90, 19},
        {95, 30},
        {97, 19},
        {98, 19},
        {99, 19},
        {100, 19},
        {101, 19},
        {102, 19},
        {103, 19},
        {104, 19},
        {105, 19},
        {106, 19},
        {107, 19},
        {108, 19},
        {109, 19},
        {110, 19},
        {111, 19},
        {112, 19},
        {113, 19},
        {114, 19},
        {115, 19},
        {116, 19},
        {117, 19},
        {118, 19},
        {119, 19},
        {120, 19},
        {121, 19},
        {122, 19},
        {9, 20},
        {10, 20},
        {13, 20},
        {32, 20},
        {33, 20},
        {34, 20},
        {35, 20},
        {36, 20},
        {37, 20},
        {38, 20},
        {39, 20},
        {40, 20},
        {41, 20},
        {42, 20},
        {43, 20},
        {44, 20},
        {45, 20},
        {46, 20},
        {47, 20},
        {48, 20},
        {49, 20},
        {50, 20},
        {51, 20},
        {52, 20},
        {53, 20},
        {54, 20},
        {55, 20},
        {56, 20},
        {57, 20},
        {58, 20},
        {59, 20},
        {60, 20},
        {61, 20},
        {62, 20},
        {63, 20},
        {64, 20},
        {65, 20},
        {66, 20},
        {67, 20},
        {68, 20},
        {69, 20},
        {70, 20},
        {71, 20},
        {72, 20},
        {73, 20},
        {74, 20},
        {75, 20},
        {76, 20},
        {77, 20},
        {78, 20},
        {79, 20},
        {80, 20},
        {81, 20},
        {82, 20},
        {83, 20},
        {84, 20},
        {85, 20},
        {86, 20},
        {87, 20},
        {88, 20},
        {89, 20},
        {90, 20},
        {91, 20},
        {92, 20},
        {93, 20},
        {94, 20},
        {95, 20},
        {96, 20},
        {97, 20},
        {98, 20},
        {99, 20},
        {100, 20},
        {101, 20},
        {102, 20},
        {103, 20},
        {104, 20},
        {105, 20},
        {106, 20},
        {107, 20},
        {108, 20},
        {109, 20},
        {110, 20},
        {111, 20},
        {112, 20},
        {113, 20},
        {114, 20},
        {115, 20},
        {116, 20},
        {117, 20},
        {118, 20},
        {119, 20},
        {120, 20},
        {121, 20},
        {122, 20},
        {123, 20},
        {124, 20},
        {125, 31},
        {126, 20},
        {161, 20},
        {162, 20},
        {163, 20},
        {164, 20},
        {165, 20},
        {166, 20},
        {167, 20},
        {168, 20},
        {169, 20},
        {170, 20},
        {171, 20},
        {172, 20},
        {173, 20},
        {174, 20},
        {175, 20},
        {176, 20},
        {177, 20},
        {178, 20},
        {179, 20},
        {180, 20},
        {181, 20},
        {182, 20},
        {183, 20},
        {184, 20},
        {185, 20},
        {186, 20},
        {187, 20},
        {188, 20},
        {189, 20},
        {190, 20},
        {191, 20},
        {192, 20},
        {193, 20},
        {194, 20},
        {195, 20},
        {196, 20},
        {197, 20},
        {198, 20},
        {199, 20},
        {200, 20},
        {201, 20},
        {202, 20},
        {203, 20},
        {204, 20},
        {205, 20},
        {206, 20},
        {207, 20},
        {208, 20},
        {209, 20},
        {210, 20},
        {211, 20},
        {212, 20},
        {213, 20},
        {214, 20},
        {215, 20},
        {216, 20},
        {217, 20},
        {218, 20},
        {219, 20},
        {220, 20},
        {221, 20},
        {222, 20},
        {223, 20},
        {224, 20},
        {225, 20},
        {226, 20},
        {227, 20},
        {228, 20},
        {229, 20},
        {230, 20},
        {231, 20},
        {232, 20},
        {233, 20},
        {234, 20},
        {235, 20},
        {236, 20},
        {237, 20},
        {238, 20},
        {239, 20},
        {240, 20},
        {241, 20},
        {242, 20},
        {243, 20},
        {244, 20},
        {245, 20},
        {246, 20},
        {247, 20},
        {248, 20},
        {249, 20},
        {250, 20},
        {251, 20},
        {252, 20},
        {253, 20},
        {254, 20},
        {255, 20},
        {124, 32},
        {9, 3},
        {13, 3},
        {32, 3},
        {33, 3},
        {34, 33},
        {35, 3},
        {36, 3},
        {37, 3},
        {38, 3},
        {39, 3},
        {40, 3},
        {41, 3},
        {42, 3},
        {43, 3},
        {44, 3},
        {45, 3},
        {46, 3},
        {47, 3},
        {48, 3},
        {49, 3},
        {50, 3},
        {51, 3},
        {52, 3},
        {53, 3},
        {54, 3},
        {55, 3},
        {56, 3},
        {57, 3},
        {58, 3},
        {59, 3},
        {60, 3},
        {61, 3},
        {62, 3},
        {63, 3},
        {64, 3},
        {65, 3},
        {66, 3},
        {67, 3},
        {68, 3},
        {69, 3},
        {70, 3},
        {71, 3},
        {72, 3},
        {73, 3},
        {74, 3},
        {75, 3},
        {76, 3},
        {77, 3},
        {78, 3},
        {79, 3},
        {80, 3},
        {81, 3},
        {82, 3},
        {83, 3},
        {84, 3},
        {85, 3},
        {86, 3},
        {87, 3},
        {88, 3},
        {89, 3},
        {90, 3},
        {91, 3},
        {92, 24},
        {93, 3},
        {94, 3},
        {95, 3},
        {96, 3},
        {97, 3},
        {98, 3},
        {99, 3},
        {100, 3},
        {101, 3},
        {102, 3},
        {103, 3},
        {104, 3},
        {105, 3},
        {106, 3},
        {107, 3},
        {108, 3},
        {109, 3},
        {110, 3},
        {111, 3},
        {112, 3},
        {113, 3},
        {114, 3},
        {115, 3},
        {116, 3},
        {117, 3},
        {118, 3},
        {119, 3},
        {120, 3},
        {121, 3},
        {122, 3},
        {123, 3},
        {124, 3},
        {125, 3},
        {126, 3},
        {161, 3},
        {162, 3},
        {163, 3},
        {164, 3},
        {165, 3},
        {166, 3},
        {167, 3},
        {168, 3},
        {169, 3},
        {170, 3},
        {171, 3},
        {172, 3},
        {173, 3},
        {174, 3},
        {175, 3},
        {176, 3},
        {177, 3},
        {178, 3},
        {179, 3},
        {180, 3},
        {181, 3},
        {182, 3},
        {183, 3},
        {184, 3},
        {185, 3},
        {186, 3},
        {187, 3},
        {188, 3},
        {189, 3},
        {190, 3},
        {191, 3},
        {192, 3},
        {193, 3},
        {194, 3},
        {195, 3},
        {196, 3},
        {197, 3},
        {198, 3},
        {199, 3},
        {200, 3},
        {201, 3},
        {202, 3},
        {203, 3},
        {204, 3},
        {205, 3},
        {206, 3},
        {207, 3},
        {208, 3},
        {209, 3},
        {210, 3},
        {211, 3},
        {212, 3},
        {213, 3},
        {214, 3},
        {215, 3},
        {216, 3},
        {217, 3},
        {218, 3},
        {219, 3},
        {220, 3},
        {221, 3},
        {222, 3},
        {223, 3},
        {224, 3},
        {225, 3},
        {226, 3},
        {227, 3},
        {228, 3},
        {229, 3},
        {230, 3},
        {231, 3},
        {232, 3},
        {233, 3},
        {234, 3},
        {235, 3},
        {236, 3},
        {237, 3},
        {238, 3},
        {239, 3},
        {240, 3},
        {241, 3},
        {242, 3},
        {243, 3},
        {244, 3},
        {245, 3},
        {246, 3},
        {247, 3},
        {248, 3},
        {249, 3},
        {250, 3},
        {251, 3},
        {252, 3},
        {253, 3},
        {254, 3},
        {255, 3},
        {48, 34},
        {49, 34},
        {50, 34},
        {51, 34},
        {52, 34},
        {53, 34},
        {54, 34},
        {55, 34},
        {56, 34},
        {57, 34},
        {48, 30},
        {49, 30},
        {50, 30},
        {51, 30},
        {52, 30},
        {53, 30},
        {54, 30},
        {55, 30},
        {56, 30},
        {57, 30},
        {65, 30},
        {66, 30},
        {67, 30},
        {68, 30},
        {69, 30},
        {70, 30},
        {71, 30},
        {72, 30},
        {73, 30},
        {74, 30},
        {75, 30},
        {76, 30},
        {77, 30},
        {78, 30},
        {79, 30},
        {80, 30},
        {81, 30},
        {82, 30},
        {83, 30},
        {84, 30},
        {85, 30},
        {86, 30},
        {87, 30},
        {88, 30},
        {89, 30},
        {90, 30},
        {95, 30},
        {97, 30},
        {98, 30},
        {99, 30},
        {100, 30},
        {101, 30},
        {102, 30},
        {103, 30},
        {104, 30},
        {105, 30},
        {106, 30},
        {107, 30},
        {108, 30},
        {109, 30},
        {110, 30},
        {111, 30},
        {112, 30},
        {113, 30},
        {114, 30},
        {115, 30},
        {116, 30},
        {117, 30},
        {118, 30},
        {119, 30},
        {120, 30},
        {121, 30},
        {122, 30},
        {92, 3},
        {48, 34},
        {49, 34},
        {50, 34},
        {51, 34},
        {52, 34},
        {53, 34},
        {54, 34},
        {55, 34},
        {56, 34},
        {57, 34}
    };

    int[] TOKEN_STATE = { 0,  0, 35, -1,  0, -1, 28, 29, 43, 41, 32, 42, 44,  2,  2, 27, 37, 30, 39,  5, -2, -1, 36,  4, -1, 33, -1, 31, 38, 40,  5,  0, 34,  4,  3 };

    int[] SPECIAL_CASES_INDEXES =
        { 0, 0, 0, 0, 0, 0, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21 };

    String[] SPECIAL_CASES_KEYS =
        {  "bool", "consts", "def", "end", "execute", "false", "float", "get", "ifFalse", "ifTrue", "input", "int", "print", "println", "set", "str", "true", "types", "var", "whileFalse", "whileTrue" };

    int[] SPECIAL_CASES_VALUES =
        {  6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26 };

    String[] SCANNER_ERROR =
    {
        "Caractere n�o esperado",
        "",
        "",
        "Erro identificando ct_char",
        "",
        "Erro identificando \"&&\"",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "Erro identificando <ignorar>",
        "Erro identificando \"||\"",
        "",
        "",
        "Erro identificando ct_char",
        "",
        "Erro identificando ct_real",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        ""
    };

}
