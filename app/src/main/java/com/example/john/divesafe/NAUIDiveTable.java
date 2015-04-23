package com.example.john.divesafe;

/* NAUI Dive Table */
public class NAUIDiveTable {
	//Table 1 End-of-Dive Letter Group
	private DecompressionStop[][] firstDiveTable = new DecompressionStop[12][10];
	
	private MetersFeet[] depth = new MetersFeet[10];
	private char[] letterGroup = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L'};
	
	//Table 2 Surface Interval Time (SIT) Table
	private SurfaceIntervalRange[][] surfaceIntervalTime = new SurfaceIntervalRange[12][12];
	
	//Table 3 Repetitive Dive TimeTable
	private RNTAMDT[][] repetitiveDiveTable = new RNTAMDT[10][12];
	
	public NAUIDiveTable () {
		/* Table 1 */
		//Depth column of Table 1
		depth[0] = new MetersFeet(12, 40);
		depth[1] = new MetersFeet(15, 50);
		depth[2] = new MetersFeet(18, 60);
		depth[3] = new MetersFeet(21, 70);
		depth[4] = new MetersFeet(24, 80);
		depth[5] = new MetersFeet(27, 90);
		depth[6] = new MetersFeet(30, 100);
		depth[7] = new MetersFeet(33, 110);
		depth[8] = new MetersFeet(36, 120);
		depth[9] = new MetersFeet(40, 130);
		
		//First Column of Table 1
		firstDiveTable[0][0] = new DecompressionStop(5, 0);
		firstDiveTable[0][1] = new DecompressionStop(0, 0);
		firstDiveTable[0][2] = new DecompressionStop(0, 0);
		firstDiveTable[0][3] = new DecompressionStop(0, 0);
		firstDiveTable[0][4] = new DecompressionStop(0, 0);
		firstDiveTable[0][5] = new DecompressionStop(0, 0);
		firstDiveTable[0][6] = new DecompressionStop(0, 0);
		firstDiveTable[0][7] = new DecompressionStop(0, 0);
		firstDiveTable[0][8] = new DecompressionStop(0, 0);
		firstDiveTable[0][9] = new DecompressionStop(0, 0);
		
		//Second Column of Table 1
		firstDiveTable[1][0] = new DecompressionStop(15, 0);
		firstDiveTable[1][1] = new DecompressionStop(10, 0);
		firstDiveTable[1][2] = new DecompressionStop(10, 0);
		firstDiveTable[1][3] = new DecompressionStop(5, 0);
		firstDiveTable[1][4] = new DecompressionStop(5, 0);
		firstDiveTable[1][5] = new DecompressionStop(5, 0);
		firstDiveTable[1][6] = new DecompressionStop(5, 0);
		firstDiveTable[1][7] = new DecompressionStop(0, 0);
		firstDiveTable[1][8] = new DecompressionStop(0, 0);
		firstDiveTable[1][9] = new DecompressionStop(0, 0);
		
		//Third Column of Table 1
		firstDiveTable[2][0] = new DecompressionStop(25, 0);
		firstDiveTable[2][1] = new DecompressionStop(15, 0);
		firstDiveTable[2][2] = new DecompressionStop(15, 0);
		firstDiveTable[2][3] = new DecompressionStop(10, 0);
		firstDiveTable[2][4] = new DecompressionStop(10, 0);
		firstDiveTable[2][5] = new DecompressionStop(10, 0);
		firstDiveTable[2][6] = new DecompressionStop(7, 0);
		firstDiveTable[2][7] = new DecompressionStop(5, 0);
		firstDiveTable[2][8] = new DecompressionStop(5, 0);
		firstDiveTable[2][9] = new DecompressionStop(5, 0);

		//Fourth Column of Table 1
		firstDiveTable[3][0] = new DecompressionStop(30, 0);
		firstDiveTable[3][1] = new DecompressionStop(25, 0);
		firstDiveTable[3][2] = new DecompressionStop(20, 0);
		firstDiveTable[3][3] = new DecompressionStop(15, 0);
		firstDiveTable[3][4] = new DecompressionStop(15, 0);
		firstDiveTable[3][5] = new DecompressionStop(12, 0);
		firstDiveTable[3][6] = new DecompressionStop(10, 0);
		firstDiveTable[3][7] = new DecompressionStop(10, 0);
		firstDiveTable[3][8] = new DecompressionStop(10, 0);
		firstDiveTable[3][9] = new DecompressionStop(8, 0);

		//Fifth Column of Table 1
		firstDiveTable[4][0] = new DecompressionStop(40, 0);
		firstDiveTable[4][1] = new DecompressionStop(30, 0);
		firstDiveTable[4][2] = new DecompressionStop(25, 0);
		firstDiveTable[4][3] = new DecompressionStop(20, 0);
		firstDiveTable[4][4] = new DecompressionStop(20, 0);
		firstDiveTable[4][5] = new DecompressionStop(15, 0);
		firstDiveTable[4][6] = new DecompressionStop(15, 0);
		firstDiveTable[4][7] = new DecompressionStop(13, 0);
		firstDiveTable[4][8] = new DecompressionStop(12, 0);
		firstDiveTable[4][9] = new DecompressionStop(10, 5);

		//Sixth Column of Table 1
		firstDiveTable[5][0] = new DecompressionStop(50, 0);
		firstDiveTable[5][1] = new DecompressionStop(40, 0);
		firstDiveTable[5][2] = new DecompressionStop(30, 0);
		firstDiveTable[5][3] = new DecompressionStop(30, 0);
		firstDiveTable[5][4] = new DecompressionStop(25, 0);
		firstDiveTable[5][5] = new DecompressionStop(20, 0);
		firstDiveTable[5][6] = new DecompressionStop(20, 0);
		firstDiveTable[5][7] = new DecompressionStop(15, 0);
		firstDiveTable[5][8] = new DecompressionStop(15, 5);
		firstDiveTable[5][9] = new DecompressionStop(0, 0);

		//Seventh Column of Table 1
		firstDiveTable[6][0] = new DecompressionStop(70, 0);
		firstDiveTable[6][1] = new DecompressionStop(50, 0);
		firstDiveTable[6][2] = new DecompressionStop(40, 0);
		firstDiveTable[6][3] = new DecompressionStop(35, 0);
		firstDiveTable[6][4] = new DecompressionStop(30, 0);
		firstDiveTable[6][5] = new DecompressionStop(25, 0);
		firstDiveTable[6][6] = new DecompressionStop(22, 0);
		firstDiveTable[6][7] = new DecompressionStop(20, 5);
		firstDiveTable[6][8] = new DecompressionStop(0, 0);
		firstDiveTable[6][9] = new DecompressionStop(0, 0);

		//Eighth Column of Table 1
		firstDiveTable[7][0] = new DecompressionStop(80, 0);
		firstDiveTable[7][1] = new DecompressionStop(60, 0);
		firstDiveTable[7][2] = new DecompressionStop(50, 0);
		firstDiveTable[7][3] = new DecompressionStop(40, 0);
		firstDiveTable[7][4] = new DecompressionStop(35, 0);
		firstDiveTable[7][5] = new DecompressionStop(30, 5);
		firstDiveTable[7][6] = new DecompressionStop(25, 5);
		firstDiveTable[7][7] = new DecompressionStop(0, 0);
		firstDiveTable[7][8] = new DecompressionStop(0, 0);
		firstDiveTable[7][9] = new DecompressionStop(0, 0);

		//Ninth Column of Table 1
		firstDiveTable[8][0] = new DecompressionStop(100, 0);
		firstDiveTable[8][1] = new DecompressionStop(70, 0);
		firstDiveTable[8][2] = new DecompressionStop(55, 0);
		firstDiveTable[8][3] = new DecompressionStop(45, 0);
		firstDiveTable[8][4] = new DecompressionStop(40, 5);
		firstDiveTable[8][5] = new DecompressionStop(0, 0);
		firstDiveTable[8][6] = new DecompressionStop(0, 0);
		firstDiveTable[8][7] = new DecompressionStop(0, 0);
		firstDiveTable[8][8] = new DecompressionStop(25, 6);
		firstDiveTable[8][9] = new DecompressionStop(0, 0);

		//Tenth Column of Table 1
		firstDiveTable[9][0] = new DecompressionStop(110, 0);
		firstDiveTable[9][1] = new DecompressionStop(80, 0);
		firstDiveTable[9][2] = new DecompressionStop(60, 5);
		firstDiveTable[9][3] = new DecompressionStop(50, 5);
		firstDiveTable[9][4] = new DecompressionStop(0, 0);
		firstDiveTable[9][5] = new DecompressionStop(40, 7);
		firstDiveTable[9][6] = new DecompressionStop(0, 0);
		firstDiveTable[9][7] = new DecompressionStop(30, 7);
		firstDiveTable[9][8] = new DecompressionStop(30, 14);
		firstDiveTable[9][9] = new DecompressionStop(25, 10);
		

		//Eleventh Column of Table 1
		firstDiveTable[10][0] = new DecompressionStop(130, 0);
		firstDiveTable[10][1] = new DecompressionStop(0, 0);
		firstDiveTable[10][2] = new DecompressionStop(0, 0);
		firstDiveTable[10][3] = new DecompressionStop(60, 8);
		firstDiveTable[10][4] = new DecompressionStop(50, 10);
		firstDiveTable[10][5] = new DecompressionStop(0, 0);
		firstDiveTable[10][6] = new DecompressionStop(40, 15);
		firstDiveTable[10][7] = new DecompressionStop(0, 0);
		firstDiveTable[10][8] = new DecompressionStop(0, 0);
		firstDiveTable[10][9] = new DecompressionStop(0, 0);
		

		//Twelfth Column of Table 1
		firstDiveTable[11][0] = new DecompressionStop(150, 5);
		firstDiveTable[11][1] = new DecompressionStop(100, 5);
		firstDiveTable[11][2] = new DecompressionStop(80, 7);
		firstDiveTable[11][3] = new DecompressionStop(70, 14);
		firstDiveTable[11][4] = new DecompressionStop(60, 17);
		firstDiveTable[11][5] = new DecompressionStop(50, 18);
		firstDiveTable[11][6] = new DecompressionStop(0, 0);
		firstDiveTable[11][7] = new DecompressionStop(0, 0);
		firstDiveTable[11][8] = new DecompressionStop(0, 0);
		firstDiveTable[11][9] = new DecompressionStop(0, 0);
		/* End of Table 1 */
		
		/* Table 2 */
		//First Column of Table 2 - A
		surfaceIntervalTime[0][0] = new SurfaceIntervalRange(10, 1440);
		surfaceIntervalTime[0][1] = new SurfaceIntervalRange(0, 0);
		surfaceIntervalTime[0][2] = new SurfaceIntervalRange(0, 0);
		surfaceIntervalTime[0][3] = new SurfaceIntervalRange(0, 0);
		surfaceIntervalTime[0][4] = new SurfaceIntervalRange(0, 0);
		surfaceIntervalTime[0][5] = new SurfaceIntervalRange(0, 0);
		surfaceIntervalTime[0][6] = new SurfaceIntervalRange(0, 0);
		surfaceIntervalTime[0][7] = new SurfaceIntervalRange(0, 0);
		surfaceIntervalTime[0][8] = new SurfaceIntervalRange(0, 0);
		surfaceIntervalTime[0][9] = new SurfaceIntervalRange(0, 0);
		surfaceIntervalTime[0][10] = new SurfaceIntervalRange(0, 0);
		surfaceIntervalTime[0][11] = new SurfaceIntervalRange(0, 0);
		
		//Second Column of Table 2 - B
		surfaceIntervalTime[1][0] = new SurfaceIntervalRange(201, 1440);
		surfaceIntervalTime[1][1] = new SurfaceIntervalRange(10, 200);
		surfaceIntervalTime[1][2] = new SurfaceIntervalRange(0, 0);
		surfaceIntervalTime[1][3] = new SurfaceIntervalRange(0, 0);
		surfaceIntervalTime[1][4] = new SurfaceIntervalRange(0, 0);
		surfaceIntervalTime[1][5] = new SurfaceIntervalRange(0, 0);
		surfaceIntervalTime[1][6] = new SurfaceIntervalRange(0, 0);
		surfaceIntervalTime[1][7] = new SurfaceIntervalRange(0, 0);
		surfaceIntervalTime[1][8] = new SurfaceIntervalRange(0, 0);
		surfaceIntervalTime[1][9] = new SurfaceIntervalRange(0, 0);
		surfaceIntervalTime[1][10] = new SurfaceIntervalRange(0, 0);
		surfaceIntervalTime[1][11] = new SurfaceIntervalRange(0, 0);
		
		//Third Column of Table 2 - C
		surfaceIntervalTime[2][0] = new SurfaceIntervalRange(290, 1440);
		surfaceIntervalTime[2][1] = new SurfaceIntervalRange(100, 289);
		surfaceIntervalTime[2][2] = new SurfaceIntervalRange(10, 99);
		surfaceIntervalTime[2][3] = new SurfaceIntervalRange(0, 0);
		surfaceIntervalTime[2][4] = new SurfaceIntervalRange(0, 0);
		surfaceIntervalTime[2][5] = new SurfaceIntervalRange(0, 0);
		surfaceIntervalTime[2][6] = new SurfaceIntervalRange(0, 0);
		surfaceIntervalTime[2][7] = new SurfaceIntervalRange(0, 0);
		surfaceIntervalTime[2][8] = new SurfaceIntervalRange(0, 0);
		surfaceIntervalTime[2][9] = new SurfaceIntervalRange(0, 0);
		surfaceIntervalTime[2][10] = new SurfaceIntervalRange(0, 0);
		surfaceIntervalTime[2][11] = new SurfaceIntervalRange(0, 0);

		//Fourth Column of Table 2 - D
		surfaceIntervalTime[3][0] = new SurfaceIntervalRange(349, 1440);
		surfaceIntervalTime[3][1] = new SurfaceIntervalRange(159, 348);
		surfaceIntervalTime[3][2] = new SurfaceIntervalRange(70, 158);
		surfaceIntervalTime[3][3] = new SurfaceIntervalRange(10, 69);
		surfaceIntervalTime[3][4] = new SurfaceIntervalRange(0, 0);
		surfaceIntervalTime[3][5] = new SurfaceIntervalRange(0, 0);
		surfaceIntervalTime[3][6] = new SurfaceIntervalRange(0, 0);
		surfaceIntervalTime[3][7] = new SurfaceIntervalRange(0, 0);
		surfaceIntervalTime[3][8] = new SurfaceIntervalRange(0, 0);
		surfaceIntervalTime[3][9] = new SurfaceIntervalRange(0, 0);
		surfaceIntervalTime[3][10] = new SurfaceIntervalRange(0, 0);
		surfaceIntervalTime[3][11] = new SurfaceIntervalRange(0, 0);

		//Fifth Column of Table 2 - E
		surfaceIntervalTime[4][0] = new SurfaceIntervalRange(395, 1440);
		surfaceIntervalTime[4][1] = new SurfaceIntervalRange(205, 394);
		surfaceIntervalTime[4][2] = new SurfaceIntervalRange(118, 204);
		surfaceIntervalTime[4][3] = new SurfaceIntervalRange(55, 117);
		surfaceIntervalTime[4][4] = new SurfaceIntervalRange(10, 54);
		surfaceIntervalTime[4][5] = new SurfaceIntervalRange(0, 0);
		surfaceIntervalTime[4][6] = new SurfaceIntervalRange(0, 0);
		surfaceIntervalTime[4][7] = new SurfaceIntervalRange(0, 0);
		surfaceIntervalTime[4][8] = new SurfaceIntervalRange(0, 0);
		surfaceIntervalTime[4][9] = new SurfaceIntervalRange(0, 0);
		surfaceIntervalTime[4][10] = new SurfaceIntervalRange(0, 0);
		surfaceIntervalTime[4][11] = new SurfaceIntervalRange(0, 0);

		//Sixth Column of Table 2 - F
		surfaceIntervalTime[5][0] = new SurfaceIntervalRange(426, 1440);
		surfaceIntervalTime[5][1] = new SurfaceIntervalRange(238, 425);
		surfaceIntervalTime[5][2] = new SurfaceIntervalRange(149, 237);
		surfaceIntervalTime[5][3] = new SurfaceIntervalRange(90, 148);
		surfaceIntervalTime[5][4] = new SurfaceIntervalRange(46, 89);
		surfaceIntervalTime[5][5] = new SurfaceIntervalRange(10, 45);
		surfaceIntervalTime[5][6] = new SurfaceIntervalRange(0, 0);
		surfaceIntervalTime[5][7] = new SurfaceIntervalRange(0, 0);
		surfaceIntervalTime[5][8] = new SurfaceIntervalRange(0, 0);
		surfaceIntervalTime[5][9] = new SurfaceIntervalRange(0, 0);
		surfaceIntervalTime[5][10] = new SurfaceIntervalRange(0, 0);
		surfaceIntervalTime[5][11] = new SurfaceIntervalRange(0, 0);

		//Seventh Column of Table 2 - G
		surfaceIntervalTime[6][0] = new SurfaceIntervalRange(456, 1440);
		surfaceIntervalTime[6][1] = new SurfaceIntervalRange(266, 455);
		surfaceIntervalTime[6][2] = new SurfaceIntervalRange(179, 265);
		surfaceIntervalTime[6][3] = new SurfaceIntervalRange(120, 178);
		surfaceIntervalTime[6][4] = new SurfaceIntervalRange(76, 119);
		surfaceIntervalTime[6][5] = new SurfaceIntervalRange(41, 75);
		surfaceIntervalTime[6][6] = new SurfaceIntervalRange(10, 40);
		surfaceIntervalTime[6][7] = new SurfaceIntervalRange(0, 0);
		surfaceIntervalTime[6][8] = new SurfaceIntervalRange(0, 0);
		surfaceIntervalTime[6][9] = new SurfaceIntervalRange(0, 0);
		surfaceIntervalTime[6][10] = new SurfaceIntervalRange(0, 0);
		surfaceIntervalTime[6][11] = new SurfaceIntervalRange(0, 0);

		//Eighth Column of Table 2 - H
		surfaceIntervalTime[7][0] = new SurfaceIntervalRange(480, 1440);
		surfaceIntervalTime[7][1] = new SurfaceIntervalRange(290, 479);
		surfaceIntervalTime[7][2] = new SurfaceIntervalRange(201, 289);
		surfaceIntervalTime[7][3] = new SurfaceIntervalRange(144, 200);
		surfaceIntervalTime[7][4] = new SurfaceIntervalRange(102, 143);
		surfaceIntervalTime[7][5] = new SurfaceIntervalRange(67, 101);
		surfaceIntervalTime[7][6] = new SurfaceIntervalRange(37, 66);
		surfaceIntervalTime[7][7] = new SurfaceIntervalRange(10, 36);
		surfaceIntervalTime[7][8] = new SurfaceIntervalRange(0, 0);
		surfaceIntervalTime[7][9] = new SurfaceIntervalRange(0, 0);
		surfaceIntervalTime[7][10] = new SurfaceIntervalRange(0, 0);
		surfaceIntervalTime[7][11] = new SurfaceIntervalRange(0, 0);

		//Ninth Column of Table 2 - I
		surfaceIntervalTime[8][0] = new SurfaceIntervalRange(502, 1440);
		surfaceIntervalTime[8][1] = new SurfaceIntervalRange(313, 501);
		surfaceIntervalTime[8][2] = new SurfaceIntervalRange(224, 312);
		surfaceIntervalTime[8][3] = new SurfaceIntervalRange(165, 223);
		surfaceIntervalTime[8][4] = new SurfaceIntervalRange(123, 164);
		surfaceIntervalTime[8][5] = new SurfaceIntervalRange(90, 122);
		surfaceIntervalTime[8][6] = new SurfaceIntervalRange(60, 89);
		surfaceIntervalTime[8][7] = new SurfaceIntervalRange(34, 59);
		surfaceIntervalTime[8][8] = new SurfaceIntervalRange(10, 33);
		surfaceIntervalTime[8][9] = new SurfaceIntervalRange(0, 0);
		surfaceIntervalTime[8][10] = new SurfaceIntervalRange(0, 0);
		surfaceIntervalTime[8][11] = new SurfaceIntervalRange(0, 0);

		//Tenth Column of Table 2 - J
		surfaceIntervalTime[9][0] = new SurfaceIntervalRange(531, 1440);
		surfaceIntervalTime[9][1] = new SurfaceIntervalRange(341, 530);
		surfaceIntervalTime[9][2] = new SurfaceIntervalRange(243, 340);
		surfaceIntervalTime[9][3] = new SurfaceIntervalRange(185, 242);
		surfaceIntervalTime[9][4] = new SurfaceIntervalRange(141, 184);
		surfaceIntervalTime[9][5] = new SurfaceIntervalRange(108, 140);
		surfaceIntervalTime[9][6] = new SurfaceIntervalRange(80, 107);
		surfaceIntervalTime[9][7] = new SurfaceIntervalRange(55, 79);
		surfaceIntervalTime[9][8] = new SurfaceIntervalRange(32, 54);
		surfaceIntervalTime[9][9] = new SurfaceIntervalRange(10, 31);
		surfaceIntervalTime[9][10] = new SurfaceIntervalRange(0, 0);
		surfaceIntervalTime[9][11] = new SurfaceIntervalRange(0, 0);

		//Eleventh Column of Table 2 - K
		surfaceIntervalTime[10][0] = new SurfaceIntervalRange(539, 1440);
		surfaceIntervalTime[10][1] = new SurfaceIntervalRange(349, 538);
		surfaceIntervalTime[10][2] = new SurfaceIntervalRange(260, 348);
		surfaceIntervalTime[10][3] = new SurfaceIntervalRange(202, 259);
		surfaceIntervalTime[10][4] = new SurfaceIntervalRange(159, 201);
		surfaceIntervalTime[10][5] = new SurfaceIntervalRange(124, 158);
		surfaceIntervalTime[10][6] = new SurfaceIntervalRange(96, 123);
		surfaceIntervalTime[10][7] = new SurfaceIntervalRange(72, 95);
		surfaceIntervalTime[10][8] = new SurfaceIntervalRange(50, 71);
		surfaceIntervalTime[10][9] = new SurfaceIntervalRange(29, 49);
		surfaceIntervalTime[10][10] = new SurfaceIntervalRange(10, 28);
		surfaceIntervalTime[10][11] = new SurfaceIntervalRange(0, 0);

		//Twelfth Column of Table 2 - L
		surfaceIntervalTime[11][0] = new SurfaceIntervalRange(553, 1440);
		surfaceIntervalTime[11][1] = new SurfaceIntervalRange(363, 552);
		surfaceIntervalTime[11][2] = new SurfaceIntervalRange(276, 362);
		surfaceIntervalTime[11][3] = new SurfaceIntervalRange(217, 275);
		surfaceIntervalTime[11][4] = new SurfaceIntervalRange(174, 216);
		surfaceIntervalTime[11][5] = new SurfaceIntervalRange(140, 173);
		surfaceIntervalTime[11][6] = new SurfaceIntervalRange(110, 139);
		surfaceIntervalTime[11][7] = new SurfaceIntervalRange(86, 109);
		surfaceIntervalTime[11][8] = new SurfaceIntervalRange(65, 85);
		surfaceIntervalTime[11][9] = new SurfaceIntervalRange(46, 64);
		surfaceIntervalTime[11][10] = new SurfaceIntervalRange(27, 45);
		surfaceIntervalTime[11][11] = new SurfaceIntervalRange(10, 26);
		/* End of Table 2 */
		
		/* Table 3 */
		//First Column of Table 3
		repetitiveDiveTable[0][0] = new RNTAMDT (7, 123);
		repetitiveDiveTable[0][1] = new RNTAMDT (17, 113);
		repetitiveDiveTable[0][2] = new RNTAMDT (25, 105);
		repetitiveDiveTable[0][3] = new RNTAMDT (37, 93);
		repetitiveDiveTable[0][4] = new RNTAMDT (49, 81);
		repetitiveDiveTable[0][5] = new RNTAMDT (61, 69);
		repetitiveDiveTable[0][6] = new RNTAMDT (73, 57);
		repetitiveDiveTable[0][7] = new RNTAMDT (87, 43);
		repetitiveDiveTable[0][8] = new RNTAMDT (101, 29);
		repetitiveDiveTable[0][9] = new RNTAMDT (116, 14);
		repetitiveDiveTable[0][10] = new RNTAMDT (138, 0);
		repetitiveDiveTable[0][11] = new RNTAMDT (161, 0);
		
		//Second Column of Table 3
		repetitiveDiveTable[1][0] = new RNTAMDT (6, 74);
		repetitiveDiveTable[1][1] = new RNTAMDT (13, 67);
		repetitiveDiveTable[1][2] = new RNTAMDT (21, 59);
		repetitiveDiveTable[1][3] = new RNTAMDT (29, 51);
		repetitiveDiveTable[1][4] = new RNTAMDT (38, 42);
		repetitiveDiveTable[1][5] = new RNTAMDT (47, 33);
		repetitiveDiveTable[1][6] = new RNTAMDT (56, 24);
		repetitiveDiveTable[1][7] = new RNTAMDT (66, 14);
		repetitiveDiveTable[1][8] = new RNTAMDT (76, 4);
		repetitiveDiveTable[1][9] = new RNTAMDT (87, 0);
		repetitiveDiveTable[1][10] = new RNTAMDT (99, 0);
		repetitiveDiveTable[1][11] = new RNTAMDT (111, 0);
		
		//Third Column of Table 3
		repetitiveDiveTable[2][0] = new RNTAMDT (5, 50);
		repetitiveDiveTable[2][1] = new RNTAMDT (11, 44);
		repetitiveDiveTable[2][2] = new RNTAMDT (17, 38);
		repetitiveDiveTable[2][3] = new RNTAMDT (24, 31);
		repetitiveDiveTable[2][4] = new RNTAMDT (30, 25);
		repetitiveDiveTable[2][5] = new RNTAMDT (36, 19);
		repetitiveDiveTable[2][6] = new RNTAMDT (44, 11);
		repetitiveDiveTable[2][7] = new RNTAMDT (52, 0);
		repetitiveDiveTable[2][8] = new RNTAMDT (61, 0);
		repetitiveDiveTable[2][9] = new RNTAMDT (70, 0);
		repetitiveDiveTable[2][10] = new RNTAMDT (79, 0);
		repetitiveDiveTable[2][11] = new RNTAMDT (88, 0);
		
		//Fourth Column of Table 3
		repetitiveDiveTable[3][0] = new RNTAMDT (4, 41);
		repetitiveDiveTable[3][1] = new RNTAMDT (9, 36);
		repetitiveDiveTable[3][2] = new RNTAMDT (15, 30);
		repetitiveDiveTable[3][3] = new RNTAMDT (20, 25);
		repetitiveDiveTable[3][4] = new RNTAMDT (26, 19);
		repetitiveDiveTable[3][5] = new RNTAMDT (31, 14);
		repetitiveDiveTable[3][6] = new RNTAMDT (37, 8);
		repetitiveDiveTable[3][7] = new RNTAMDT (43, 0);
		repetitiveDiveTable[3][8] = new RNTAMDT (50, 0);
		repetitiveDiveTable[3][9] = new RNTAMDT (57, 0);
		repetitiveDiveTable[3][10] = new RNTAMDT (64, 0);
		repetitiveDiveTable[3][11] = new RNTAMDT (72, 0);
		
		//Fifth Column of Table 3
		repetitiveDiveTable[4][0] = new RNTAMDT (4, 31);
		repetitiveDiveTable[4][1] = new RNTAMDT (8, 27);
		repetitiveDiveTable[4][2] = new RNTAMDT (13, 22);
		repetitiveDiveTable[4][3] = new RNTAMDT (18, 17);
		repetitiveDiveTable[4][4] = new RNTAMDT (23, 12);
		repetitiveDiveTable[4][5] = new RNTAMDT (28, 7);
		repetitiveDiveTable[4][6] = new RNTAMDT (32, 0);
		repetitiveDiveTable[4][7] = new RNTAMDT (38, 0);
		repetitiveDiveTable[4][8] = new RNTAMDT (43, 0);
		repetitiveDiveTable[4][9] = new RNTAMDT (48, 0);
		repetitiveDiveTable[4][10] = new RNTAMDT (54, 0);
		repetitiveDiveTable[4][11] = new RNTAMDT (61, 0);
		
		//Sixth Column of Table 3
		repetitiveDiveTable[5][0] = new RNTAMDT (3, 22);
		repetitiveDiveTable[5][1] = new RNTAMDT (7, 18);
		repetitiveDiveTable[5][2] = new RNTAMDT (11, 14);
		repetitiveDiveTable[5][3] = new RNTAMDT (16, 9);
		repetitiveDiveTable[5][4] = new RNTAMDT (20, 5);
		repetitiveDiveTable[5][5] = new RNTAMDT (24, 0);
		repetitiveDiveTable[5][6] = new RNTAMDT (29, 0);
		repetitiveDiveTable[5][7] = new RNTAMDT (33, 0);
		repetitiveDiveTable[5][8] = new RNTAMDT (38, 0);
		repetitiveDiveTable[5][9] = new RNTAMDT (43, 0);
		repetitiveDiveTable[5][10] = new RNTAMDT (47, 0);
		repetitiveDiveTable[5][11] = new RNTAMDT (53, 0);
		
		//Seventh Column of Table 3
		repetitiveDiveTable[6][0] = new RNTAMDT (3, 19);
		repetitiveDiveTable[6][1] = new RNTAMDT (7, 15);
		repetitiveDiveTable[6][2] = new RNTAMDT (10, 12);
		repetitiveDiveTable[6][3] = new RNTAMDT (14, 8);
		repetitiveDiveTable[6][4] = new RNTAMDT (18, 4);
		repetitiveDiveTable[6][5] = new RNTAMDT (22, 0);
		repetitiveDiveTable[6][6] = new RNTAMDT (26, 0);
		repetitiveDiveTable[6][7] = new RNTAMDT (30, 0);
		repetitiveDiveTable[6][8] = new RNTAMDT (34, 0);
		repetitiveDiveTable[6][9] = new RNTAMDT (38, 0);
		repetitiveDiveTable[6][10] = new RNTAMDT (0, 0);
		repetitiveDiveTable[6][11] = new RNTAMDT (0, 0);
		
		//Eighth Column of Table 3
		repetitiveDiveTable[7][0] = new RNTAMDT (3, 12);
		repetitiveDiveTable[7][1] = new RNTAMDT (6, 9);
		repetitiveDiveTable[7][2] = new RNTAMDT (10, 5);
		repetitiveDiveTable[7][3] = new RNTAMDT (13, 0);
		repetitiveDiveTable[7][4] = new RNTAMDT (16, 0);
		repetitiveDiveTable[7][5] = new RNTAMDT (20, 0);
		repetitiveDiveTable[7][6] = new RNTAMDT (24, 0);
		repetitiveDiveTable[7][7] = new RNTAMDT (27, 0);
		repetitiveDiveTable[7][8] = new RNTAMDT (31, 0);
		repetitiveDiveTable[7][9] = new RNTAMDT (0, 0);
		repetitiveDiveTable[7][10] = new RNTAMDT (0, 0);
		repetitiveDiveTable[7][11] = new RNTAMDT (0, 0);
		
		//Ninth Column of Table 3
		repetitiveDiveTable[8][0] = new RNTAMDT (3, 9);
		repetitiveDiveTable[8][1] = new RNTAMDT (6, 6);
		repetitiveDiveTable[8][2] = new RNTAMDT (9, 0);
		repetitiveDiveTable[8][3] = new RNTAMDT (12, 0);
		repetitiveDiveTable[8][4] = new RNTAMDT (15, 0);
		repetitiveDiveTable[8][5] = new RNTAMDT (18, 0);
		repetitiveDiveTable[8][6] = new RNTAMDT (21, 0);
		repetitiveDiveTable[8][7] = new RNTAMDT (25, 0);
		repetitiveDiveTable[8][8] = new RNTAMDT (28, 0);
		repetitiveDiveTable[8][9] = new RNTAMDT (0, 0);
		repetitiveDiveTable[8][10] = new RNTAMDT (0, 0);
		repetitiveDiveTable[8][11] = new RNTAMDT (0, 0);
		
		//Tenth Column of Table 3
		repetitiveDiveTable[9][0] = new RNTAMDT (3, 5);
		repetitiveDiveTable[9][1] = new RNTAMDT (6, 0);
		repetitiveDiveTable[9][2] = new RNTAMDT (8, 0);
		repetitiveDiveTable[9][3] = new RNTAMDT (11, 0);
		repetitiveDiveTable[9][4] = new RNTAMDT (13, 0);
		repetitiveDiveTable[9][5] = new RNTAMDT (16, 0);
		repetitiveDiveTable[9][6] = new RNTAMDT (19, 0);
		repetitiveDiveTable[9][7] = new RNTAMDT (22, 0);
		repetitiveDiveTable[9][8] = new RNTAMDT (25, 0);
		repetitiveDiveTable[9][9] = new RNTAMDT (0, 0);
		repetitiveDiveTable[9][10] = new RNTAMDT (0, 0);
		repetitiveDiveTable[9][11] = new RNTAMDT (0, 0);
		
	}
	
	
	/*
	 * Helper Functions - DO NOT CALL
	 * You should not need to worry about how these are implemented
	 */
	
	public int getIndexDepthFeet (int depth) {
		int index;
		boolean valid = false;
		for (index = 0; index < 10; index++) {
			if (this.depth[index].getFeet() >= depth) {
				valid = true;
				break; //get row of table 1
			}
		}
		
		if (!valid) {
			return -1; //out of range - return an error to user
		}
		
		return index;
	}
	
	public int getIndexDepthMeters (int depth) {
		int index;
		boolean valid = false;
		for (index = 0; index < 10; index++) {
			if (this.depth[index].getMeters() >= depth) {
				valid = true;
				break; //get row of table 1
			}
		}
		
		if (!valid) {
			return -1; //out of range - return an error to user
		}
		
		return index;
	}
	
	public int getColFirstDiveTable (int row, int minutes) {
		int col;
		boolean valid = false;
		for (col = 0; col < 12; col++) {
			if (firstDiveTable[col][row].getDiveTime() >= minutes) {
				valid = true;
				break; //get column of table 1
			}
		}
		
		if (!valid) {
			return -1; //error - out of range
		}
		
		return col;
	}

	//returns the index in letterGroup of a given letter
	//letter must be A - L
	public int getLetterNumber (char letter) {
		int index;
		boolean valid = false;
		for (index = 0; index < 12; index++) { //replace loop with direct mapping to numbers? Switch statement?
			if (letterGroup[index] == letter) {
				valid = true;
				break; //get column of Table 2
			}
		}
		if (!valid) {
			return -1; //error - out of range
		}
		return index;
	}
	
	public int getTotalDiveTimeFeet (char group, int depth, int minutes){
		int row = getLetterNumber (group);
		if (row == -1) {
			return -1; //error - out of range
		}
		int col = getIndexDepthFeet (depth);
		if (col == -1) {
			return -1; //error - depth out of range
		}
		int rnt = repetitiveDiveTable[col][row].getRNT();
		if (rnt == 0) {
			return -1; //error - this depth is out of range!
		}
		int amdt = repetitiveDiveTable[col][row].getAMDT();
		if (minutes > amdt) {
			return -1; //error - this time is out of range!
		}
		return rnt + minutes;
	}
	
	public int getTotalDiveTimeMeters (char group, int depth, int minutes) {
		int row = getLetterNumber (group);
		if (row == -1) {
			return -1; //error - out of range
		}
		int col = getIndexDepthMeters (depth);
		if (col == -1) {
			return -1; //error - depth out of range
		}
		int rnt = repetitiveDiveTable[col][row].getRNT();
		if (rnt == 0) {
			return -1; //error - this depth is out of range!
		}
		int amdt = repetitiveDiveTable[col][row].getAMDT();
		if (minutes > amdt) {
			return -1; //error - this time is out of range!
		}
		return rnt + minutes;
	}
	
	/*
	 * End of helper functions
	 */
	
	//get letter group after first dive, given depth of dive in feet and minutes of bottom time
	//depth must be one of the values in Table 1 exactly. minutes will round up
	public char getLetterGroupFirstDiveFeet (int depth, int minutes) {
		int row = getIndexDepthFeet(depth);
		if (row == -1) {
			return '1'; //error - depth out of range
		}
		
		int col = getColFirstDiveTable (row, minutes);
		if (col == -1) {
			return '1'; //error - minutes out of range
		}
			
		return letterGroup[col]; //return letter group
	}
	
	//get letter group after first dive, given depth of dive in meters and minutes of bottom time
	//depth must be one of the values in Table 1 exactly. minutes will round up
	public char getLetterGroupFirstDiveMeters (int depth, int minutes) {
		int row = getIndexDepthMeters(depth);
		if (row == -1) {
			return '1'; //error - depth out of range
		}
		
		int col = getColFirstDiveTable (row, minutes);
		if (col == -1) {
			return '1'; //error - minutes out of range
		}
			
		return letterGroup[col]; //return letter group
	}
	
	//gets the letter group after being in a given letter group and being on the surface for this many minutes
	//minutes must be >= 10, letter must be A - L
	public char getLetterGroupSurfaceIntervalTime (char letter, int minutes) {
		if (minutes < 10) {
			return '1'; //error - surface interval time must be at least 10 minutes
		} else if (minutes > 1440) {
			//a wait of more than 24 hours means another dive is not considered a repetitive dive 
			//pressure group is none in that case
			return '2';
		}
		
		int col = getLetterNumber (letter); //get column of Table 2
		if (col == -1) {
			return '1'; //error - pressure group out of range
		}
		
		int row;
		for (row = 0; row < 12; row++) {
			int min = surfaceIntervalTime[col][row].getMin();
			if (minutes >= min) {
				break; //get row of Table 2
			}
		}
		
		return letterGroup[row];
	}
	
	//get the pressure group after a repetitive dive given the starting pressure group,
	//the depth in feet, and the bottom time in minutes
	public char getLetterGroupRepetitiveDiveFeet (char group, int depth, int minutes) {
		int totalDiveTime = getTotalDiveTimeFeet(group, depth, minutes);
		if (totalDiveTime == -1) {
			return '1'; //error - either depth, pressure group, or minutes is out of range
		}
		return getLetterGroupFirstDiveFeet(depth, totalDiveTime);
	}

	//get the pressure group after a repetitive dive given the starting pressure group,
	//the depth in meters, and the bottom time in minutes
	public char getLetterGroupRepetitiveDiveMeters (char group, int depth, int minutes) {
		int totalDiveTime = getTotalDiveTimeMeters(group, depth, minutes);
		if (totalDiveTime == -1) {
			return '1'; //error - either depth, pressure group, or minutes is out of range
		}
		return getLetterGroupFirstDiveMeters(depth, totalDiveTime);
	}
	
	//returns true if the dive is at a safe elevation to be used with the NAUI dive table
	//if the elevation is above 1000 feet, the NAUI dive table should not be used
	public boolean safeDiveElevationFeet (int elevation) {
		return elevation <= 1000;
	}

	//returns true if the dive is at a safe elevation to be used with the NAUI dive table
	//if the elevation is above 304 meters (1000 feet), the NAUI dive table should not be used
	public boolean safeDiveElevationMeters (int elevation) {
		return elevation <= 304.8;
	}
	
	//returns the number of HOURS to wait to fly, given total dive time in MINUTES
	public int flyingTime (int totalDiveTime) {
		if (totalDiveTime <= 120) { //total dive time 2 hours or less
			return 12; //wait 12 hours
		} else {
			return 24; //wait 24 hours
		}
	}
	
	//for all cases where a decompression stop is required, that stop is at 15 feet
	//if minutes is 0, no decompression stop is required
	public int decompressionStopMinutesFirstDiveFeet (int depth, int minutes) {
		int row = getIndexDepthFeet (depth);
		if (row == -1) {
			return -1; //error - depth out of range
		}
		
		int col = getColFirstDiveTable (row, minutes);
		if (col == -1) {
			return -1; //error - minutes out of range
		}
		return firstDiveTable[col][row].getStopTime();
	}
	
	//for all cases where a decompression stop is required, that stop is at 15 feet
	//if minutes is 0, no decompression stop is required
	public int decompressionStopMinutesFirstDiveMeters (int depth, int minutes) {
		int row = getIndexDepthMeters (depth);
		if (row == -1) {
			return -1; //error - depth out of range
		}
		
		int col = getColFirstDiveTable (row, minutes);
		if (col == -1) {
			return -1; //error - minutes out of range
		}
		return firstDiveTable[col][row].getStopTime();
	}
	
	//for all cases where a decompression stop is required, that stop is at 15 feet
	//if minutes is 0, no decompression stop is required
	public int decompressionStopMinutesRepetitiveDiveFeet (char group, int depth, int minutes) {
		int totalDiveTime = getTotalDiveTimeFeet (group, depth, minutes);
		if (totalDiveTime == -1) {
			return -1; //error - either depth, pressure group, or minutes is out of range
		}
		
		int row = getIndexDepthFeet (depth);
		if (row == -1) {
			return -1; //error - depth time out of range
		}
		
		int col = getColFirstDiveTable (row, totalDiveTime);
		if (col == -1) {
			return -1; //error - dive time out of range
		}
		return firstDiveTable[col][row].getStopTime();
	}
	
	//for all cases where a decompression stop is required, that stop is at 15 feet
	//if minutes is 0, no decompression stop is required
	public int decompressionStopMinutesRepetitiveDiveMeters (char group, int depth, int minutes) {
		int totalDiveTime = getTotalDiveTimeMeters (group, depth, minutes);
		if (totalDiveTime == -1) {
			return -1; //error - either depth, pressure group, or minutes is out of range
		}
		
		int row = getIndexDepthMeters (depth);
		if (row == -1) {
			return -1; //error - depth time out of range
		}
		
		int col = getColFirstDiveTable (row, totalDiveTime);
		if (col == -1) {
			return -1; //error - dive time out of range
		}
		return firstDiveTable[col][row].getStopTime();
	}
}
