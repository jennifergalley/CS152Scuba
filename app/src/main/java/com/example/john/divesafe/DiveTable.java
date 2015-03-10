package com.example.john.divesafe;

/* NAUI Dive Table */
public class DiveTable {
	//Table 1 End-of-Dive Letter Group
	private DecompressionStop[][] depthTimeFeet = new DecompressionStop[12][10];
	
	private MetersFeet[] depth = new MetersFeet[10];
	private char[] letterGroup = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L'};
	
	//Table 2 Surface Interval Time (SIT) Table
	private SurfaceIntervalRange[][] surfaceIntervalTime = new SurfaceIntervalRange[12][12];
	
	//Table 3 Repetitive Dive TimeTable
	private RNTAMDT[][] repetitiveDiveTimeTable = new RNTAMDT[10][12];
	
	public DiveTable () {
		/* Table 1 */
		//Depth column of Table 1
		this.depth[0] = new MetersFeet(12, 40);
		this.depth[1] = new MetersFeet(15, 50);
		this.depth[2] = new MetersFeet(18, 60);
		this.depth[3] = new MetersFeet(21, 70);
		this.depth[4] = new MetersFeet(24, 80);
		this.depth[5] = new MetersFeet(27, 90);
		this.depth[6] = new MetersFeet(30, 100);
		this.depth[7] = new MetersFeet(33, 110);
		this.depth[8] = new MetersFeet(36, 120);
		this.depth[9] = new MetersFeet(40, 130);
		
		//First Column of Table 1
		this.depthTimeFeet[0][0] = new DecompressionStop(5, 0);
		this.depthTimeFeet[0][1] = new DecompressionStop(0, 0);
		this.depthTimeFeet[0][2] = new DecompressionStop(0, 0);
		this.depthTimeFeet[0][3] = new DecompressionStop(0, 0);
		this.depthTimeFeet[0][4] = new DecompressionStop(0, 0);
		this.depthTimeFeet[0][5] = new DecompressionStop(0, 0);
		this.depthTimeFeet[0][6] = new DecompressionStop(0, 0);
		this.depthTimeFeet[0][7] = new DecompressionStop(0, 0);
		this.depthTimeFeet[0][8] = new DecompressionStop(0, 0);
		this.depthTimeFeet[0][9] = new DecompressionStop(0, 0);
		
		//Second Column of Table 1
		this.depthTimeFeet[1][0] = new DecompressionStop(15, 0);
		this.depthTimeFeet[1][1] = new DecompressionStop(10, 0);
		this.depthTimeFeet[1][2] = new DecompressionStop(10, 0);
		this.depthTimeFeet[1][3] = new DecompressionStop(5, 0);
		this.depthTimeFeet[1][4] = new DecompressionStop(5, 0);
		this.depthTimeFeet[1][5] = new DecompressionStop(5, 0);
		this.depthTimeFeet[1][6] = new DecompressionStop(5, 0);
		this.depthTimeFeet[1][7] = new DecompressionStop(0, 0);
		this.depthTimeFeet[1][8] = new DecompressionStop(0, 0);
		this.depthTimeFeet[1][9] = new DecompressionStop(0, 0);
		
		//Third Column of Table 1
		this.depthTimeFeet[2][0] = new DecompressionStop(25, 0);
		this.depthTimeFeet[2][1] = new DecompressionStop(15, 0);
		this.depthTimeFeet[2][2] = new DecompressionStop(15, 0);
		this.depthTimeFeet[2][3] = new DecompressionStop(10, 0);
		this.depthTimeFeet[2][4] = new DecompressionStop(10, 0);
		this.depthTimeFeet[2][5] = new DecompressionStop(10, 0);
		this.depthTimeFeet[2][6] = new DecompressionStop(7, 0);
		this.depthTimeFeet[2][7] = new DecompressionStop(5, 0);
		this.depthTimeFeet[2][8] = new DecompressionStop(5, 0);
		this.depthTimeFeet[2][9] = new DecompressionStop(5, 0);

		//Fourth Column of Table 1
		this.depthTimeFeet[3][0] = new DecompressionStop(30, 0);
		this.depthTimeFeet[3][1] = new DecompressionStop(25, 0);
		this.depthTimeFeet[3][2] = new DecompressionStop(20, 0);
		this.depthTimeFeet[3][3] = new DecompressionStop(15, 0);
		this.depthTimeFeet[3][4] = new DecompressionStop(15, 0);
		this.depthTimeFeet[3][5] = new DecompressionStop(12, 0);
		this.depthTimeFeet[3][6] = new DecompressionStop(10, 0);
		this.depthTimeFeet[3][7] = new DecompressionStop(10, 0);
		this.depthTimeFeet[3][8] = new DecompressionStop(10, 0);
		this.depthTimeFeet[3][9] = new DecompressionStop(8, 0);

		//Fifth Column of Table 1
		this.depthTimeFeet[4][0] = new DecompressionStop(40, 0);
		this.depthTimeFeet[4][1] = new DecompressionStop(30, 0);
		this.depthTimeFeet[4][2] = new DecompressionStop(25, 0);
		this.depthTimeFeet[4][3] = new DecompressionStop(20, 0);
		this.depthTimeFeet[4][4] = new DecompressionStop(20, 0);
		this.depthTimeFeet[4][5] = new DecompressionStop(15, 0);
		this.depthTimeFeet[4][6] = new DecompressionStop(15, 0);
		this.depthTimeFeet[4][7] = new DecompressionStop(13, 0);
		this.depthTimeFeet[4][8] = new DecompressionStop(12, 0);
		this.depthTimeFeet[4][9] = new DecompressionStop(10, 5);

		//Sixth Column of Table 1
		this.depthTimeFeet[5][0] = new DecompressionStop(50, 0);
		this.depthTimeFeet[5][1] = new DecompressionStop(40, 0);
		this.depthTimeFeet[5][2] = new DecompressionStop(30, 0);
		this.depthTimeFeet[5][3] = new DecompressionStop(30, 0);
		this.depthTimeFeet[5][4] = new DecompressionStop(25, 0);
		this.depthTimeFeet[5][5] = new DecompressionStop(20, 0);
		this.depthTimeFeet[5][6] = new DecompressionStop(20, 0);
		this.depthTimeFeet[5][7] = new DecompressionStop(15, 0);
		this.depthTimeFeet[5][8] = new DecompressionStop(15, 5);
		this.depthTimeFeet[5][9] = new DecompressionStop(0, 0);

		//Seventh Column of Table 1
		this.depthTimeFeet[6][0] = new DecompressionStop(70, 0);
		this.depthTimeFeet[6][1] = new DecompressionStop(50, 0);
		this.depthTimeFeet[6][2] = new DecompressionStop(40, 0);
		this.depthTimeFeet[6][3] = new DecompressionStop(35, 0);
		this.depthTimeFeet[6][4] = new DecompressionStop(30, 0);
		this.depthTimeFeet[6][5] = new DecompressionStop(25, 0);
		this.depthTimeFeet[6][6] = new DecompressionStop(22, 0);
		this.depthTimeFeet[6][7] = new DecompressionStop(20, 5);
		this.depthTimeFeet[6][8] = new DecompressionStop(0, 0);
		this.depthTimeFeet[6][9] = new DecompressionStop(0, 0);

		//Eighth Column of Table 1
		this.depthTimeFeet[7][0] = new DecompressionStop(80, 0);
		this.depthTimeFeet[7][1] = new DecompressionStop(60, 0);
		this.depthTimeFeet[7][2] = new DecompressionStop(50, 0);
		this.depthTimeFeet[7][3] = new DecompressionStop(40, 0);
		this.depthTimeFeet[7][4] = new DecompressionStop(35, 0);
		this.depthTimeFeet[7][5] = new DecompressionStop(30, 5);
		this.depthTimeFeet[7][6] = new DecompressionStop(25, 5);
		this.depthTimeFeet[7][7] = new DecompressionStop(0, 0);
		this.depthTimeFeet[7][8] = new DecompressionStop(0, 0);
		this.depthTimeFeet[7][9] = new DecompressionStop(0, 0);

		//Ninth Column of Table 1
		this.depthTimeFeet[8][0] = new DecompressionStop(100, 0);
		this.depthTimeFeet[8][1] = new DecompressionStop(70, 0);
		this.depthTimeFeet[8][2] = new DecompressionStop(55, 0);
		this.depthTimeFeet[8][3] = new DecompressionStop(45, 0);
		this.depthTimeFeet[8][4] = new DecompressionStop(40, 5);
		this.depthTimeFeet[8][5] = new DecompressionStop(0, 0);
		this.depthTimeFeet[8][6] = new DecompressionStop(0, 0);
		this.depthTimeFeet[8][7] = new DecompressionStop(0, 0);
		this.depthTimeFeet[8][8] = new DecompressionStop(25, 6);
		this.depthTimeFeet[8][9] = new DecompressionStop(0, 0);

		//Tenth Column of Table 1
		this.depthTimeFeet[9][0] = new DecompressionStop(110, 0);
		this.depthTimeFeet[9][1] = new DecompressionStop(80, 0);
		this.depthTimeFeet[9][2] = new DecompressionStop(60, 5);
		this.depthTimeFeet[9][3] = new DecompressionStop(50, 5);
		this.depthTimeFeet[9][4] = new DecompressionStop(0, 0);
		this.depthTimeFeet[9][5] = new DecompressionStop(40, 7);
		this.depthTimeFeet[9][6] = new DecompressionStop(0, 0);
		this.depthTimeFeet[9][7] = new DecompressionStop(30, 7);
		this.depthTimeFeet[9][8] = new DecompressionStop(30, 14);
		this.depthTimeFeet[9][9] = new DecompressionStop(25, 10);
		

		//Eleventh Column of Table 1
		this.depthTimeFeet[10][0] = new DecompressionStop(130, 0);
		this.depthTimeFeet[10][1] = new DecompressionStop(0, 0);
		this.depthTimeFeet[10][2] = new DecompressionStop(0, 0);
		this.depthTimeFeet[10][3] = new DecompressionStop(60, 8);
		this.depthTimeFeet[10][4] = new DecompressionStop(50, 10);
		this.depthTimeFeet[10][5] = new DecompressionStop(0, 0);
		this.depthTimeFeet[10][6] = new DecompressionStop(40, 15);
		this.depthTimeFeet[10][7] = new DecompressionStop(0, 0);
		this.depthTimeFeet[10][8] = new DecompressionStop(0, 0);
		this.depthTimeFeet[10][9] = new DecompressionStop(0, 0);
		

		//Twelfth Column of Table 1
		this.depthTimeFeet[11][0] = new DecompressionStop(150, 5);
		this.depthTimeFeet[11][1] = new DecompressionStop(100, 5);
		this.depthTimeFeet[11][2] = new DecompressionStop(80, 7);
		this.depthTimeFeet[11][3] = new DecompressionStop(70, 14);
		this.depthTimeFeet[11][4] = new DecompressionStop(60, 17);
		this.depthTimeFeet[11][5] = new DecompressionStop(50, 18);
		this.depthTimeFeet[11][6] = new DecompressionStop(0, 0);
		this.depthTimeFeet[11][7] = new DecompressionStop(0, 0);
		this.depthTimeFeet[11][8] = new DecompressionStop(0, 0);
		this.depthTimeFeet[11][9] = new DecompressionStop(0, 0);
		/* End of Table 1 */
		
		/* Table 2 */
		//First Column of Table 2 - A
		this.surfaceIntervalTime[0][0] = new SurfaceIntervalRange(10, 1440);
		this.surfaceIntervalTime[0][1] = new SurfaceIntervalRange(0, 0);
		this.surfaceIntervalTime[0][2] = new SurfaceIntervalRange(0, 0);
		this.surfaceIntervalTime[0][3] = new SurfaceIntervalRange(0, 0);
		this.surfaceIntervalTime[0][4] = new SurfaceIntervalRange(0, 0);
		this.surfaceIntervalTime[0][5] = new SurfaceIntervalRange(0, 0);
		this.surfaceIntervalTime[0][6] = new SurfaceIntervalRange(0, 0);
		this.surfaceIntervalTime[0][7] = new SurfaceIntervalRange(0, 0);
		this.surfaceIntervalTime[0][8] = new SurfaceIntervalRange(0, 0);
		this.surfaceIntervalTime[0][9] = new SurfaceIntervalRange(0, 0);
		this.surfaceIntervalTime[0][10] = new SurfaceIntervalRange(0, 0);
		this.surfaceIntervalTime[0][11] = new SurfaceIntervalRange(0, 0);
		
		//Second Column of Table 2 - B
		this.surfaceIntervalTime[1][0] = new SurfaceIntervalRange(201, 1440);
		this.surfaceIntervalTime[1][1] = new SurfaceIntervalRange(10, 200);
		this.surfaceIntervalTime[1][2] = new SurfaceIntervalRange(0, 0);
		this.surfaceIntervalTime[1][3] = new SurfaceIntervalRange(0, 0);
		this.surfaceIntervalTime[1][4] = new SurfaceIntervalRange(0, 0);
		this.surfaceIntervalTime[1][5] = new SurfaceIntervalRange(0, 0);
		this.surfaceIntervalTime[1][6] = new SurfaceIntervalRange(0, 0);
		this.surfaceIntervalTime[1][7] = new SurfaceIntervalRange(0, 0);
		this.surfaceIntervalTime[1][8] = new SurfaceIntervalRange(0, 0);
		this.surfaceIntervalTime[1][9] = new SurfaceIntervalRange(0, 0);
		this.surfaceIntervalTime[1][10] = new SurfaceIntervalRange(0, 0);
		this.surfaceIntervalTime[1][11] = new SurfaceIntervalRange(0, 0);
		
		//Third Column of Table 2 - C
		this.surfaceIntervalTime[2][0] = new SurfaceIntervalRange(290, 1440);
		this.surfaceIntervalTime[2][1] = new SurfaceIntervalRange(100, 289);
		this.surfaceIntervalTime[2][2] = new SurfaceIntervalRange(10, 99);
		this.surfaceIntervalTime[2][3] = new SurfaceIntervalRange(0, 0);
		this.surfaceIntervalTime[2][4] = new SurfaceIntervalRange(0, 0);
		this.surfaceIntervalTime[2][5] = new SurfaceIntervalRange(0, 0);
		this.surfaceIntervalTime[2][6] = new SurfaceIntervalRange(0, 0);
		this.surfaceIntervalTime[2][7] = new SurfaceIntervalRange(0, 0);
		this.surfaceIntervalTime[2][8] = new SurfaceIntervalRange(0, 0);
		this.surfaceIntervalTime[2][9] = new SurfaceIntervalRange(0, 0);
		this.surfaceIntervalTime[2][10] = new SurfaceIntervalRange(0, 0);
		this.surfaceIntervalTime[2][11] = new SurfaceIntervalRange(0, 0);

		//Fourth Column of Table 2 - D
		this.surfaceIntervalTime[3][0] = new SurfaceIntervalRange(349, 1440);
		this.surfaceIntervalTime[3][1] = new SurfaceIntervalRange(159, 348);
		this.surfaceIntervalTime[3][2] = new SurfaceIntervalRange(70, 158);
		this.surfaceIntervalTime[3][3] = new SurfaceIntervalRange(10, 69);
		this.surfaceIntervalTime[3][4] = new SurfaceIntervalRange(0, 0);
		this.surfaceIntervalTime[3][5] = new SurfaceIntervalRange(0, 0);
		this.surfaceIntervalTime[3][6] = new SurfaceIntervalRange(0, 0);
		this.surfaceIntervalTime[3][7] = new SurfaceIntervalRange(0, 0);
		this.surfaceIntervalTime[3][8] = new SurfaceIntervalRange(0, 0);
		this.surfaceIntervalTime[3][9] = new SurfaceIntervalRange(0, 0);
		this.surfaceIntervalTime[3][10] = new SurfaceIntervalRange(0, 0);
		this.surfaceIntervalTime[3][11] = new SurfaceIntervalRange(0, 0);

		//Fifth Column of Table 2 - E
		this.surfaceIntervalTime[4][0] = new SurfaceIntervalRange(395, 1440);
		this.surfaceIntervalTime[4][1] = new SurfaceIntervalRange(205, 394);
		this.surfaceIntervalTime[4][2] = new SurfaceIntervalRange(118, 204);
		this.surfaceIntervalTime[4][3] = new SurfaceIntervalRange(55, 117);
		this.surfaceIntervalTime[4][4] = new SurfaceIntervalRange(10, 54);
		this.surfaceIntervalTime[4][5] = new SurfaceIntervalRange(0, 0);
		this.surfaceIntervalTime[4][6] = new SurfaceIntervalRange(0, 0);
		this.surfaceIntervalTime[4][7] = new SurfaceIntervalRange(0, 0);
		this.surfaceIntervalTime[4][8] = new SurfaceIntervalRange(0, 0);
		this.surfaceIntervalTime[4][9] = new SurfaceIntervalRange(0, 0);
		this.surfaceIntervalTime[4][10] = new SurfaceIntervalRange(0, 0);
		this.surfaceIntervalTime[4][11] = new SurfaceIntervalRange(0, 0);

		//Sixth Column of Table 2 - F
		this.surfaceIntervalTime[5][0] = new SurfaceIntervalRange(426, 1440);
		this.surfaceIntervalTime[5][1] = new SurfaceIntervalRange(238, 425);
		this.surfaceIntervalTime[5][2] = new SurfaceIntervalRange(149, 237);
		this.surfaceIntervalTime[5][3] = new SurfaceIntervalRange(90, 148);
		this.surfaceIntervalTime[5][4] = new SurfaceIntervalRange(46, 89);
		this.surfaceIntervalTime[5][5] = new SurfaceIntervalRange(10, 45);
		this.surfaceIntervalTime[5][6] = new SurfaceIntervalRange(0, 0);
		this.surfaceIntervalTime[5][7] = new SurfaceIntervalRange(0, 0);
		this.surfaceIntervalTime[5][8] = new SurfaceIntervalRange(0, 0);
		this.surfaceIntervalTime[5][9] = new SurfaceIntervalRange(0, 0);
		this.surfaceIntervalTime[5][10] = new SurfaceIntervalRange(0, 0);
		this.surfaceIntervalTime[5][11] = new SurfaceIntervalRange(0, 0);

		//Seventh Column of Table 2 - G
		this.surfaceIntervalTime[6][0] = new SurfaceIntervalRange(456, 1440);
		this.surfaceIntervalTime[6][1] = new SurfaceIntervalRange(266, 455);
		this.surfaceIntervalTime[6][2] = new SurfaceIntervalRange(179, 265);
		this.surfaceIntervalTime[6][3] = new SurfaceIntervalRange(120, 178);
		this.surfaceIntervalTime[6][4] = new SurfaceIntervalRange(76, 119);
		this.surfaceIntervalTime[6][5] = new SurfaceIntervalRange(41, 75);
		this.surfaceIntervalTime[6][6] = new SurfaceIntervalRange(10, 40);
		this.surfaceIntervalTime[6][7] = new SurfaceIntervalRange(0, 0);
		this.surfaceIntervalTime[6][8] = new SurfaceIntervalRange(0, 0);
		this.surfaceIntervalTime[6][9] = new SurfaceIntervalRange(0, 0);
		this.surfaceIntervalTime[6][10] = new SurfaceIntervalRange(0, 0);
		this.surfaceIntervalTime[6][11] = new SurfaceIntervalRange(0, 0);

		//Eighth Column of Table 2 - H
		this.surfaceIntervalTime[7][0] = new SurfaceIntervalRange(480, 1440);
		this.surfaceIntervalTime[7][1] = new SurfaceIntervalRange(290, 479);
		this.surfaceIntervalTime[7][2] = new SurfaceIntervalRange(201, 289);
		this.surfaceIntervalTime[7][3] = new SurfaceIntervalRange(144, 200);
		this.surfaceIntervalTime[7][4] = new SurfaceIntervalRange(102, 143);
		this.surfaceIntervalTime[7][5] = new SurfaceIntervalRange(67, 101);
		this.surfaceIntervalTime[7][6] = new SurfaceIntervalRange(37, 66);
		this.surfaceIntervalTime[7][7] = new SurfaceIntervalRange(10, 36);
		this.surfaceIntervalTime[7][8] = new SurfaceIntervalRange(0, 0);
		this.surfaceIntervalTime[7][9] = new SurfaceIntervalRange(0, 0);
		this.surfaceIntervalTime[7][10] = new SurfaceIntervalRange(0, 0);
		this.surfaceIntervalTime[7][11] = new SurfaceIntervalRange(0, 0);

		//Ninth Column of Table 2 - I
		this.surfaceIntervalTime[8][0] = new SurfaceIntervalRange(502, 1440);
		this.surfaceIntervalTime[8][1] = new SurfaceIntervalRange(313, 501);
		this.surfaceIntervalTime[8][2] = new SurfaceIntervalRange(224, 312);
		this.surfaceIntervalTime[8][3] = new SurfaceIntervalRange(165, 223);
		this.surfaceIntervalTime[8][4] = new SurfaceIntervalRange(123, 164);
		this.surfaceIntervalTime[8][5] = new SurfaceIntervalRange(90, 122);
		this.surfaceIntervalTime[8][6] = new SurfaceIntervalRange(60, 89);
		this.surfaceIntervalTime[8][7] = new SurfaceIntervalRange(34, 59);
		this.surfaceIntervalTime[8][8] = new SurfaceIntervalRange(10, 33);
		this.surfaceIntervalTime[8][9] = new SurfaceIntervalRange(0, 0);
		this.surfaceIntervalTime[8][10] = new SurfaceIntervalRange(0, 0);
		this.surfaceIntervalTime[8][11] = new SurfaceIntervalRange(0, 0);

		//Tenth Column of Table 2 - J
		this.surfaceIntervalTime[9][0] = new SurfaceIntervalRange(531, 1440);
		this.surfaceIntervalTime[9][1] = new SurfaceIntervalRange(341, 530);
		this.surfaceIntervalTime[9][2] = new SurfaceIntervalRange(243, 340);
		this.surfaceIntervalTime[9][3] = new SurfaceIntervalRange(185, 242);
		this.surfaceIntervalTime[9][4] = new SurfaceIntervalRange(141, 184);
		this.surfaceIntervalTime[9][5] = new SurfaceIntervalRange(108, 140);
		this.surfaceIntervalTime[9][6] = new SurfaceIntervalRange(80, 107);
		this.surfaceIntervalTime[9][7] = new SurfaceIntervalRange(55, 79);
		this.surfaceIntervalTime[9][8] = new SurfaceIntervalRange(32, 54);
		this.surfaceIntervalTime[9][9] = new SurfaceIntervalRange(10, 31);
		this.surfaceIntervalTime[9][10] = new SurfaceIntervalRange(0, 0);
		this.surfaceIntervalTime[9][11] = new SurfaceIntervalRange(0, 0);

		//Eleventh Column of Table 2 - K
		this.surfaceIntervalTime[10][0] = new SurfaceIntervalRange(539, 1440);
		this.surfaceIntervalTime[10][1] = new SurfaceIntervalRange(349, 538);
		this.surfaceIntervalTime[10][2] = new SurfaceIntervalRange(260, 348);
		this.surfaceIntervalTime[10][3] = new SurfaceIntervalRange(202, 259);
		this.surfaceIntervalTime[10][4] = new SurfaceIntervalRange(159, 201);
		this.surfaceIntervalTime[10][5] = new SurfaceIntervalRange(124, 158);
		this.surfaceIntervalTime[10][6] = new SurfaceIntervalRange(96, 123);
		this.surfaceIntervalTime[10][7] = new SurfaceIntervalRange(72, 95);
		this.surfaceIntervalTime[10][8] = new SurfaceIntervalRange(50, 71);
		this.surfaceIntervalTime[10][9] = new SurfaceIntervalRange(29, 49);
		this.surfaceIntervalTime[10][10] = new SurfaceIntervalRange(10, 28);
		this.surfaceIntervalTime[10][11] = new SurfaceIntervalRange(0, 0);

		//Twelfth Column of Table 2 - L
		this.surfaceIntervalTime[11][0] = new SurfaceIntervalRange(553, 1440);
		this.surfaceIntervalTime[11][1] = new SurfaceIntervalRange(363, 552);
		this.surfaceIntervalTime[11][2] = new SurfaceIntervalRange(276, 362);
		this.surfaceIntervalTime[11][3] = new SurfaceIntervalRange(217, 275);
		this.surfaceIntervalTime[11][4] = new SurfaceIntervalRange(174, 216);
		this.surfaceIntervalTime[11][5] = new SurfaceIntervalRange(140, 173);
		this.surfaceIntervalTime[11][6] = new SurfaceIntervalRange(110, 139);
		this.surfaceIntervalTime[11][7] = new SurfaceIntervalRange(86, 109);
		this.surfaceIntervalTime[11][8] = new SurfaceIntervalRange(65, 85);
		this.surfaceIntervalTime[11][9] = new SurfaceIntervalRange(46, 64);
		this.surfaceIntervalTime[11][10] = new SurfaceIntervalRange(27, 45);
		this.surfaceIntervalTime[11][11] = new SurfaceIntervalRange(10, 26);
		/* End of Table 2 */
		
		/* Table 3 */
		//First Column of Table 3
		this.repetitiveDiveTimeTable[0][0] = new RNTAMDT (7, 123);
		this.repetitiveDiveTimeTable[0][1] = new RNTAMDT (17, 113);
		this.repetitiveDiveTimeTable[0][2] = new RNTAMDT (25, 105);
		this.repetitiveDiveTimeTable[0][3] = new RNTAMDT (37, 93);
		this.repetitiveDiveTimeTable[0][4] = new RNTAMDT (49, 81);
		this.repetitiveDiveTimeTable[0][5] = new RNTAMDT (61, 69);
		this.repetitiveDiveTimeTable[0][6] = new RNTAMDT (73, 57);
		this.repetitiveDiveTimeTable[0][7] = new RNTAMDT (87, 43);
		this.repetitiveDiveTimeTable[0][8] = new RNTAMDT (101, 29);
		this.repetitiveDiveTimeTable[0][9] = new RNTAMDT (116, 14);
		this.repetitiveDiveTimeTable[0][10] = new RNTAMDT (138, 0);
		this.repetitiveDiveTimeTable[0][11] = new RNTAMDT (161, 0);
		
		//Second Column of Table 3
		this.repetitiveDiveTimeTable[1][0] = new RNTAMDT (6, 74);
		this.repetitiveDiveTimeTable[1][1] = new RNTAMDT (13, 67);
		this.repetitiveDiveTimeTable[1][2] = new RNTAMDT (21, 59);
		this.repetitiveDiveTimeTable[1][3] = new RNTAMDT (29, 51);
		this.repetitiveDiveTimeTable[1][4] = new RNTAMDT (38, 42);
		this.repetitiveDiveTimeTable[1][5] = new RNTAMDT (47, 33);
		this.repetitiveDiveTimeTable[1][6] = new RNTAMDT (56, 24);
		this.repetitiveDiveTimeTable[1][7] = new RNTAMDT (66, 14);
		this.repetitiveDiveTimeTable[1][8] = new RNTAMDT (76, 4);
		this.repetitiveDiveTimeTable[1][9] = new RNTAMDT (87, 0);
		this.repetitiveDiveTimeTable[1][10] = new RNTAMDT (99, 0);
		this.repetitiveDiveTimeTable[1][11] = new RNTAMDT (111, 0);
		
		//Third Column of Table 3
		this.repetitiveDiveTimeTable[2][0] = new RNTAMDT (5, 50);
		this.repetitiveDiveTimeTable[2][1] = new RNTAMDT (11, 44);
		this.repetitiveDiveTimeTable[2][2] = new RNTAMDT (17, 38);
		this.repetitiveDiveTimeTable[2][3] = new RNTAMDT (24, 31);
		this.repetitiveDiveTimeTable[2][4] = new RNTAMDT (30, 25);
		this.repetitiveDiveTimeTable[2][5] = new RNTAMDT (36, 19);
		this.repetitiveDiveTimeTable[2][6] = new RNTAMDT (44, 11);
		this.repetitiveDiveTimeTable[2][7] = new RNTAMDT (52, 0);
		this.repetitiveDiveTimeTable[2][8] = new RNTAMDT (61, 0);
		this.repetitiveDiveTimeTable[2][9] = new RNTAMDT (70, 0);
		this.repetitiveDiveTimeTable[2][10] = new RNTAMDT (79, 0);
		this.repetitiveDiveTimeTable[2][11] = new RNTAMDT (88, 0);
		
		//Fourth Column of Table 3
		this.repetitiveDiveTimeTable[3][0] = new RNTAMDT (4, 41);
		this.repetitiveDiveTimeTable[3][1] = new RNTAMDT (9, 36);
		this.repetitiveDiveTimeTable[3][2] = new RNTAMDT (15, 30);
		this.repetitiveDiveTimeTable[3][3] = new RNTAMDT (20, 25);
		this.repetitiveDiveTimeTable[3][4] = new RNTAMDT (26, 19);
		this.repetitiveDiveTimeTable[3][5] = new RNTAMDT (31, 14);
		this.repetitiveDiveTimeTable[3][6] = new RNTAMDT (37, 8);
		this.repetitiveDiveTimeTable[3][7] = new RNTAMDT (43, 0);
		this.repetitiveDiveTimeTable[3][8] = new RNTAMDT (50, 0);
		this.repetitiveDiveTimeTable[3][9] = new RNTAMDT (57, 0);
		this.repetitiveDiveTimeTable[3][10] = new RNTAMDT (64, 0);
		this.repetitiveDiveTimeTable[3][11] = new RNTAMDT (72, 0);
		
		//Fifth Column of Table 3
		this.repetitiveDiveTimeTable[4][0] = new RNTAMDT (4, 31);
		this.repetitiveDiveTimeTable[4][1] = new RNTAMDT (8, 27);
		this.repetitiveDiveTimeTable[4][2] = new RNTAMDT (13, 22);
		this.repetitiveDiveTimeTable[4][3] = new RNTAMDT (18, 17);
		this.repetitiveDiveTimeTable[4][4] = new RNTAMDT (23, 12);
		this.repetitiveDiveTimeTable[4][5] = new RNTAMDT (28, 7);
		this.repetitiveDiveTimeTable[4][6] = new RNTAMDT (32, 0);
		this.repetitiveDiveTimeTable[4][7] = new RNTAMDT (38, 0);
		this.repetitiveDiveTimeTable[4][8] = new RNTAMDT (43, 0);
		this.repetitiveDiveTimeTable[4][9] = new RNTAMDT (48, 0);
		this.repetitiveDiveTimeTable[4][10] = new RNTAMDT (54, 0);
		this.repetitiveDiveTimeTable[4][11] = new RNTAMDT (61, 0);
		
		//Sixth Column of Table 3
		this.repetitiveDiveTimeTable[5][0] = new RNTAMDT (3, 22);
		this.repetitiveDiveTimeTable[5][1] = new RNTAMDT (7, 18);
		this.repetitiveDiveTimeTable[5][2] = new RNTAMDT (11, 14);
		this.repetitiveDiveTimeTable[5][3] = new RNTAMDT (16, 9);
		this.repetitiveDiveTimeTable[5][4] = new RNTAMDT (20, 5);
		this.repetitiveDiveTimeTable[5][5] = new RNTAMDT (24, 0);
		this.repetitiveDiveTimeTable[5][6] = new RNTAMDT (29, 0);
		this.repetitiveDiveTimeTable[5][7] = new RNTAMDT (33, 0);
		this.repetitiveDiveTimeTable[5][8] = new RNTAMDT (38, 0);
		this.repetitiveDiveTimeTable[5][9] = new RNTAMDT (43, 0);
		this.repetitiveDiveTimeTable[5][10] = new RNTAMDT (47, 0);
		this.repetitiveDiveTimeTable[5][11] = new RNTAMDT (53, 0);
		
		//Seventh Column of Table 3
		this.repetitiveDiveTimeTable[6][0] = new RNTAMDT (3, 19);
		this.repetitiveDiveTimeTable[6][1] = new RNTAMDT (7, 15);
		this.repetitiveDiveTimeTable[6][2] = new RNTAMDT (10, 12);
		this.repetitiveDiveTimeTable[6][3] = new RNTAMDT (14, 8);
		this.repetitiveDiveTimeTable[6][4] = new RNTAMDT (18, 4);
		this.repetitiveDiveTimeTable[6][5] = new RNTAMDT (22, 0);
		this.repetitiveDiveTimeTable[6][6] = new RNTAMDT (26, 0);
		this.repetitiveDiveTimeTable[6][7] = new RNTAMDT (30, 0);
		this.repetitiveDiveTimeTable[6][8] = new RNTAMDT (34, 0);
		this.repetitiveDiveTimeTable[6][9] = new RNTAMDT (38, 0);
		this.repetitiveDiveTimeTable[6][10] = new RNTAMDT (0, 0);
		this.repetitiveDiveTimeTable[6][11] = new RNTAMDT (0, 0);
		
		//Eighth Column of Table 3
		this.repetitiveDiveTimeTable[7][0] = new RNTAMDT (3, 12);
		this.repetitiveDiveTimeTable[7][1] = new RNTAMDT (6, 9);
		this.repetitiveDiveTimeTable[7][2] = new RNTAMDT (10, 5);
		this.repetitiveDiveTimeTable[7][3] = new RNTAMDT (13, 0);
		this.repetitiveDiveTimeTable[7][4] = new RNTAMDT (16, 0);
		this.repetitiveDiveTimeTable[7][5] = new RNTAMDT (20, 0);
		this.repetitiveDiveTimeTable[7][6] = new RNTAMDT (24, 0);
		this.repetitiveDiveTimeTable[7][7] = new RNTAMDT (27, 0);
		this.repetitiveDiveTimeTable[7][8] = new RNTAMDT (31, 0);
		this.repetitiveDiveTimeTable[7][9] = new RNTAMDT (0, 0);
		this.repetitiveDiveTimeTable[7][10] = new RNTAMDT (0, 0);
		this.repetitiveDiveTimeTable[7][11] = new RNTAMDT (0, 0);
		
		//Ninth Column of Table 3
		this.repetitiveDiveTimeTable[8][0] = new RNTAMDT (3, 9);
		this.repetitiveDiveTimeTable[8][1] = new RNTAMDT (6, 6);
		this.repetitiveDiveTimeTable[8][2] = new RNTAMDT (9, 0);
		this.repetitiveDiveTimeTable[8][3] = new RNTAMDT (12, 0);
		this.repetitiveDiveTimeTable[8][4] = new RNTAMDT (15, 0);
		this.repetitiveDiveTimeTable[8][5] = new RNTAMDT (18, 0);
		this.repetitiveDiveTimeTable[8][6] = new RNTAMDT (21, 0);
		this.repetitiveDiveTimeTable[8][7] = new RNTAMDT (25, 0);
		this.repetitiveDiveTimeTable[8][8] = new RNTAMDT (28, 0);
		this.repetitiveDiveTimeTable[8][9] = new RNTAMDT (0, 0);
		this.repetitiveDiveTimeTable[8][10] = new RNTAMDT (0, 0);
		this.repetitiveDiveTimeTable[8][11] = new RNTAMDT (0, 0);
		
		//Tenth Column of Table 3
		this.repetitiveDiveTimeTable[9][0] = new RNTAMDT (3, 5);
		this.repetitiveDiveTimeTable[9][1] = new RNTAMDT (6, 0);
		this.repetitiveDiveTimeTable[9][2] = new RNTAMDT (8, 0);
		this.repetitiveDiveTimeTable[9][3] = new RNTAMDT (11, 0);
		this.repetitiveDiveTimeTable[9][4] = new RNTAMDT (13, 0);
		this.repetitiveDiveTimeTable[9][5] = new RNTAMDT (16, 0);
		this.repetitiveDiveTimeTable[9][6] = new RNTAMDT (19, 0);
		this.repetitiveDiveTimeTable[9][7] = new RNTAMDT (22, 0);
		this.repetitiveDiveTimeTable[9][8] = new RNTAMDT (25, 0);
		this.repetitiveDiveTimeTable[9][9] = new RNTAMDT (0, 0);
		this.repetitiveDiveTimeTable[9][10] = new RNTAMDT (0, 0);
		this.repetitiveDiveTimeTable[9][11] = new RNTAMDT (0, 0);
		
	}
	
	//get letter group after first dive, given depth of dive in feet and minutes of bottom time
	//depth must be one of the values in Table 1 exactly. minutes will round up
	public char getLetterGroupFirstDiveFeet (int depth, int minutes) {
		int row;
		for (row = 0; row < 10; row++) {
			int feet = this.depth[row].getFeet();
			if (feet == depth) {
				break; //get row of table 1
			}
		}
		
		int col;
		for (col = 0; col < 12; col++) {
			int diveTime = this.depthTimeFeet[col][row].getDiveTime();
			if (diveTime >= minutes) {
				break; //get column of table 1
			}
		}
		
		return this.letterGroup[col]; //return letter group
	}
	
	//get letter group after first dive, given depth of dive in meters and minutes of bottom time
	//depth must be one of the values in Table 1 exactly. minutes will round up
	public char getLetterGroupFirstDiveMeters (int depth, int minutes) {
		int row;
		for (row = 0; row < 10; row++) {
			int meters = this.depth[row].getMeters();
			if (meters == depth) {
				break; //get row of table 1
			}
		}
		
		int col;
		for (col = 0; col < 12; col++) {
			int diveTime = this.depthTimeFeet[col][row].getDiveTime();
			if (diveTime >= minutes) {
				break; //get column of table 1
			}
		}
		
		return this.letterGroup[col]; //return letter group
	}
	
	//returns the index in letterGroup of a given letter
	//letter must be A - L
	public int getLetterNumber (char letter) {
		int index;
		for (index = 0; index < 12; index++) { //replace loop with direct mapping to numbers? Switch statement?
			if (this.letterGroup[index] == letter) {
				break; //get column of Table 2
			}
		}
		return index;
	}
	
	//gets the letter group after being in a given letter group and being on the surface for this many minutes
	//minutes must be >= 10, letter must be A - L
	public char getLetterGroupSurfaceIntervalTime (char letter, int minutes) {
		int col = getLetterNumber (letter); //get column of Table 2
		
		int row;
		for (row = 0; row < 12; row++) {
			int min = this.surfaceIntervalTime[col][row].getMin();
			if (minutes > min) {
				break; //get row of Table 2
			}
		}
		
		return this.letterGroup[row];
	}
}
