package diveTable;

public class PADIDiveTable {
	/* Front of PADI Table, top left */
	//depth across top, in feet
	private int[] depthFeet = {35, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140};
	//letter group along side
	private char[] letterGroup = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
	//Table 1 - No Decompression Limits and Group Designation Table
	private int[][] minutesFirst = {
			{10, 9, 7, 6, 5, 4, 4, 3, 3, 3, 3, 4},
			{19, 16, 13, 11, 9, 8, 7, 6, 6, 5, 5, 4},
			{25, 22, 17, 14, 12, 10, 9, 8, 7, 6, 6, 5},
			{29, 25, 19, 16, 13, 11, 10, 9, 8, 7, 7, 6},
			{32, 27, 21, 17, 15, 13, 11, 10, 9, 8, 8, 7},
			{36, 31, 24, 19, 16, 14, 12, 11, 10, 9, 8, 8},
			{40, 34, 26, 21, 18, 15, 13, 12, 11, 10, 9, 0},
			{44, 37, 28, 23, 19, 17, 15, 13, 12, 11, 10, 0},
			{48, 40, 31, 25, 21, 18, 16, 14, 13, 12, 0, 0},
			{52, 44, 33, 27, 22, 19, 17, 15, 14, 12, 0, 0},
			{57, 48, 36, 29, 24, 21, 18, 16, 14, 13, 0, 0},
			{62, 51, 39, 31, 26, 22, 19, 17, 15, 0, 0, 0},
			{67, 55, 41, 33, 27, 23, 21, 18, 16, 0, 0, 0},
			{73, 60, 44, 35, 29, 25, 22, 19, 0, 0, 0, 0},
			{79, 64, 47, 37, 31, 26, 23, 20, 0, 0, 0, 0},
			{85, 69, 50, 39, 33, 28, 24, 0, 0, 0, 0, 0},
			{92, 74, 53, 42, 35, 29, 25, 0, 0, 0, 0, 0},
			{100, 79, 57, 44, 36, 30, 0, 0, 0, 0, 0, 0},
			{108, 85, 60, 47, 38, 0, 0, 0, 0, 0, 0, 0},
			{117, 91, 63, 49, 40, 0, 0, 0, 0, 0, 0, 0},
			{127, 97, 67, 52, 0, 0, 0, 0, 0, 0, 0, 0},
			{139, 104, 71, 54, 0, 0, 0, 0, 0, 0, 0, 0},
			{152, 111, 75, 55, 0, 0, 0, 0, 0, 0, 0, 0},
			{168, 120, 80, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			{168, 129, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			{205, 140, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
	};
	//Table 2 - Surface Interval Credit Table
	private SurfaceIntervalRange[][] surfaceIntervalTime = new SurfaceIntervalRange[26][26];
	//Table 3 - Repetitive Dive Timetable
	private RNTABT[][] repetitiveDiveTimeTable = new RNTABT[26][11];
	
	public PADIDiveTable () {
		//Table 2
		//Column 1 (Z, Z)
		for (int i = 0; i < 25; i++)
			this.surfaceIntervalTime[0][i] = new SurfaceIntervalRange(0, 0);
		this.surfaceIntervalTime[0][25] = new SurfaceIntervalRange(0, 2);
		
		//Column 2 (Y, Y)
		for (int i = 0; i < 24; i++)
			this.surfaceIntervalTime[1][i] = new SurfaceIntervalRange(0, 0);
		this.surfaceIntervalTime[1][24] = new SurfaceIntervalRange(0, 2);
		this.surfaceIntervalTime[1][25] = new SurfaceIntervalRange(3, 5);
		
		//Column 3 (X, X)
		for (int i = 0; i < 23; i++)
			this.surfaceIntervalTime[2][i] = new SurfaceIntervalRange(0, 0);
		this.surfaceIntervalTime[2][23] = new SurfaceIntervalRange(0, 2);
		this.surfaceIntervalTime[2][24] = new SurfaceIntervalRange(3, 5);
		this.surfaceIntervalTime[2][25] = new SurfaceIntervalRange(6, 8);
		
		//Column 4 (W, W)
		for (int i = 0; i < 22; i++)
			this.surfaceIntervalTime[3][i] = new SurfaceIntervalRange(0, 0);
		this.surfaceIntervalTime[3][22] = new SurfaceIntervalRange(0, 2);
		this.surfaceIntervalTime[3][23] = new SurfaceIntervalRange(3, 5);
		this.surfaceIntervalTime[3][24] = new SurfaceIntervalRange(6, 8);
		this.surfaceIntervalTime[3][25] = new SurfaceIntervalRange(9, 11);

		//Column 4 (V, V)
		for (int i = 0; i < 21; i++)
			this.surfaceIntervalTime[4][i] = new SurfaceIntervalRange(0, 0);
		this.surfaceIntervalTime[4][21] = new SurfaceIntervalRange(0, 2);
		this.surfaceIntervalTime[4][22] = new SurfaceIntervalRange(3, 5);
		this.surfaceIntervalTime[4][23] = new SurfaceIntervalRange(6, 8);
		this.surfaceIntervalTime[4][24] = new SurfaceIntervalRange(9, 11);
		this.surfaceIntervalTime[4][25] = new SurfaceIntervalRange(12, 14);
		
		//Column 4 (U, U)
		for (int i = 0; i < 20; i++)
			this.surfaceIntervalTime[5][i] = new SurfaceIntervalRange(0, 0);
		this.surfaceIntervalTime[5][20] = new SurfaceIntervalRange(0, 2);
		this.surfaceIntervalTime[5][21] = new SurfaceIntervalRange(3, 5);
		this.surfaceIntervalTime[5][22] = new SurfaceIntervalRange(6, 8);
		this.surfaceIntervalTime[5][23] = new SurfaceIntervalRange(9, 11);
		this.surfaceIntervalTime[5][24] = new SurfaceIntervalRange(12, 14);
		this.surfaceIntervalTime[5][25] = new SurfaceIntervalRange(15, 17);

		//Column 4 (T, T)
		for (int i = 0; i < 19; i++)
			this.surfaceIntervalTime[6][i] = new SurfaceIntervalRange(0, 0);
		this.surfaceIntervalTime[6][19] = new SurfaceIntervalRange(0, 2);
		this.surfaceIntervalTime[6][20] = new SurfaceIntervalRange(3, 6);
		this.surfaceIntervalTime[6][21] = new SurfaceIntervalRange(6, 9);
		this.surfaceIntervalTime[6][22] = new SurfaceIntervalRange(9, 12);
		this.surfaceIntervalTime[6][23] = new SurfaceIntervalRange(12, 15);
		this.surfaceIntervalTime[6][24] = new SurfaceIntervalRange(15, 18);
		this.surfaceIntervalTime[6][25] = new SurfaceIntervalRange(18, 20);
		

		//Column 4 (S, S)
		for (int i = 0; i < 18; i++)
			this.surfaceIntervalTime[7][i] = new SurfaceIntervalRange(0, 0);
		this.surfaceIntervalTime[7][18] = new SurfaceIntervalRange(0, 3);
		this.surfaceIntervalTime[7][19] = new SurfaceIntervalRange(3, 6);
		this.surfaceIntervalTime[7][20] = new SurfaceIntervalRange(7, 9);
		this.surfaceIntervalTime[7][21] = new SurfaceIntervalRange(10, 12);
		this.surfaceIntervalTime[7][22] = new SurfaceIntervalRange(13, 15);
		this.surfaceIntervalTime[7][23] = new SurfaceIntervalRange(16, 18);
		this.surfaceIntervalTime[7][24] = new SurfaceIntervalRange(19, 21);
		this.surfaceIntervalTime[7][25] = new SurfaceIntervalRange(21, 24);

		//Column 4 (R, R)
		for (int i = 0; i < 17; i++)
			this.surfaceIntervalTime[8][i] = new SurfaceIntervalRange(0, 0);
		this.surfaceIntervalTime[8][17] = new SurfaceIntervalRange(0, 3);
		this.surfaceIntervalTime[8][18] = new SurfaceIntervalRange(4, 6);
		this.surfaceIntervalTime[8][19] = new SurfaceIntervalRange(7, 10);
		this.surfaceIntervalTime[8][20] = new SurfaceIntervalRange(10, 13);
		this.surfaceIntervalTime[8][21] = new SurfaceIntervalRange(13, 16);
		this.surfaceIntervalTime[8][22] = new SurfaceIntervalRange(16, 19);
		this.surfaceIntervalTime[8][23] = new SurfaceIntervalRange(19, 22);
		this.surfaceIntervalTime[8][24] = new SurfaceIntervalRange(22, 25);
		this.surfaceIntervalTime[8][25] = new SurfaceIntervalRange(25, 28);

		//Column 4 (Q, Q)
		for (int i = 0; i < 16; i++)
			this.surfaceIntervalTime[9][i] = new SurfaceIntervalRange(0, 0);
		this.surfaceIntervalTime[9][16] = new SurfaceIntervalRange(0, 3);
		this.surfaceIntervalTime[9][17] = new SurfaceIntervalRange(4, 7);
		this.surfaceIntervalTime[9][18] = new SurfaceIntervalRange(7, 10);
		this.surfaceIntervalTime[9][19] = new SurfaceIntervalRange(11, 13);
		this.surfaceIntervalTime[9][20] = new SurfaceIntervalRange(14, 17);
		this.surfaceIntervalTime[9][21] = new SurfaceIntervalRange(17, 20);
		this.surfaceIntervalTime[9][22] = new SurfaceIntervalRange(20, 23);
		this.surfaceIntervalTime[9][23] = new SurfaceIntervalRange(23, 26);
		this.surfaceIntervalTime[9][24] = new SurfaceIntervalRange(26, 29);
		this.surfaceIntervalTime[9][25] = new SurfaceIntervalRange(29, 31);

		//Column 4 (P, P)
		for (int i = 0; i < 15; i++)
			this.surfaceIntervalTime[10][i] = new SurfaceIntervalRange(0, 0);
		this.surfaceIntervalTime[10][15] = new SurfaceIntervalRange(0, 3);
		this.surfaceIntervalTime[10][16] = new SurfaceIntervalRange(4, 7);
		this.surfaceIntervalTime[10][17] = new SurfaceIntervalRange(8, 11);
		this.surfaceIntervalTime[10][18] = new SurfaceIntervalRange(11, 14);
		this.surfaceIntervalTime[10][19] = new SurfaceIntervalRange(14, 17);
		this.surfaceIntervalTime[10][20] = new SurfaceIntervalRange(18, 21);
		this.surfaceIntervalTime[10][21] = new SurfaceIntervalRange(21, 24);
		this.surfaceIntervalTime[10][22] = new SurfaceIntervalRange(24, 27);
		this.surfaceIntervalTime[10][23] = new SurfaceIntervalRange(27, 30);
		this.surfaceIntervalTime[10][24] = new SurfaceIntervalRange(30, 33);
		this.surfaceIntervalTime[10][25] = new SurfaceIntervalRange(32, 35);

		//Column 4 (O, O)
		for (int i = 0; i < 14; i++)
			this.surfaceIntervalTime[11][i] = new SurfaceIntervalRange(0, 0);
		this.surfaceIntervalTime[11][14] = new SurfaceIntervalRange(0, 3);
		this.surfaceIntervalTime[11][15] = new SurfaceIntervalRange(4, 7);
		this.surfaceIntervalTime[11][16] = new SurfaceIntervalRange(8, 11);
		this.surfaceIntervalTime[11][17] = new SurfaceIntervalRange(12, 15);
		this.surfaceIntervalTime[11][18] = new SurfaceIntervalRange(15, 18);
		this.surfaceIntervalTime[11][19] = new SurfaceIntervalRange(18, 22);
		this.surfaceIntervalTime[11][20] = new SurfaceIntervalRange(22, 25);
		this.surfaceIntervalTime[11][21] = new SurfaceIntervalRange(25, 28);
		this.surfaceIntervalTime[11][22] = new SurfaceIntervalRange(28, 31);
		this.surfaceIntervalTime[11][23] = new SurfaceIntervalRange(31, 34);
		this.surfaceIntervalTime[11][24] = new SurfaceIntervalRange(34, 37);
		this.surfaceIntervalTime[11][25] = new SurfaceIntervalRange(36, 40);

		//Column 4 (N, N)
		for (int i = 0; i < 13; i++)
			this.surfaceIntervalTime[12][i] = new SurfaceIntervalRange(0, 0);
		this.surfaceIntervalTime[12][13] = new SurfaceIntervalRange(0, 3);
		this.surfaceIntervalTime[12][14] = new SurfaceIntervalRange(4, 8);
		this.surfaceIntervalTime[12][15] = new SurfaceIntervalRange(8, 12);
		this.surfaceIntervalTime[12][16] = new SurfaceIntervalRange(12, 16);
		this.surfaceIntervalTime[12][17] = new SurfaceIntervalRange(16, 19);
		this.surfaceIntervalTime[12][18] = new SurfaceIntervalRange(19, 23);
		this.surfaceIntervalTime[12][19] = new SurfaceIntervalRange(23, 26);
		this.surfaceIntervalTime[12][20] = new SurfaceIntervalRange(26, 29);
		this.surfaceIntervalTime[12][21] = new SurfaceIntervalRange(29, 33);
		this.surfaceIntervalTime[12][22] = new SurfaceIntervalRange(32, 36);
		this.surfaceIntervalTime[12][23] = new SurfaceIntervalRange(35, 39);
		this.surfaceIntervalTime[12][24] = new SurfaceIntervalRange(38, 41);
		this.surfaceIntervalTime[12][25] = new SurfaceIntervalRange(41, 44);

		//Column 4 (M, M)
		for (int i = 0; i < 12; i++)
			this.surfaceIntervalTime[13][i] = new SurfaceIntervalRange(0, 0);
		this.surfaceIntervalTime[13][12] = new SurfaceIntervalRange(0, 4);
		this.surfaceIntervalTime[13][13] = new SurfaceIntervalRange(4, 8);
		this.surfaceIntervalTime[13][14] = new SurfaceIntervalRange(9, 12);
		this.surfaceIntervalTime[13][15] = new SurfaceIntervalRange(13, 16);
		this.surfaceIntervalTime[13][16] = new SurfaceIntervalRange(17, 20);
		this.surfaceIntervalTime[13][17] = new SurfaceIntervalRange(20, 24);
		this.surfaceIntervalTime[13][18] = new SurfaceIntervalRange(24, 27);
		this.surfaceIntervalTime[13][19] = new SurfaceIntervalRange(27, 31);
		this.surfaceIntervalTime[13][20] = new SurfaceIntervalRange(30, 34);
		this.surfaceIntervalTime[13][21] = new SurfaceIntervalRange(34, 37);
		this.surfaceIntervalTime[13][22] = new SurfaceIntervalRange(37, 40);
		this.surfaceIntervalTime[13][23] = new SurfaceIntervalRange(40, 43);
		this.surfaceIntervalTime[13][24] = new SurfaceIntervalRange(42, 46);
		this.surfaceIntervalTime[13][25] = new SurfaceIntervalRange(45, 49);

		//Column 4 (L, L)
		for (int i = 0; i < 11; i++)
			this.surfaceIntervalTime[14][i] = new SurfaceIntervalRange(0, 0);
		this.surfaceIntervalTime[14][11] = new SurfaceIntervalRange(0, 4);
		this.surfaceIntervalTime[14][12] = new SurfaceIntervalRange(5, 9);
		this.surfaceIntervalTime[14][13] = new SurfaceIntervalRange(9, 13);
		this.surfaceIntervalTime[14][14] = new SurfaceIntervalRange(13, 17);
		this.surfaceIntervalTime[14][15] = new SurfaceIntervalRange(17, 21);
		this.surfaceIntervalTime[14][16] = new SurfaceIntervalRange(21, 25);
		this.surfaceIntervalTime[14][17] = new SurfaceIntervalRange(25, 29);
		this.surfaceIntervalTime[14][18] = new SurfaceIntervalRange(28, 32);
		this.surfaceIntervalTime[14][19] = new SurfaceIntervalRange(32, 36);
		this.surfaceIntervalTime[14][20] = new SurfaceIntervalRange(35, 39);
		this.surfaceIntervalTime[14][21] = new SurfaceIntervalRange(38, 42);
		this.surfaceIntervalTime[14][22] = new SurfaceIntervalRange(41, 45);
		this.surfaceIntervalTime[14][23] = new SurfaceIntervalRange(44, 48);
		this.surfaceIntervalTime[14][24] = new SurfaceIntervalRange(47, 51);
		this.surfaceIntervalTime[14][25] = new SurfaceIntervalRange(50, 54);

		//Column 4 (K, K)
		for (int i = 0; i < 10; i++)
			this.surfaceIntervalTime[15][i] = new SurfaceIntervalRange(0, 0);
		this.surfaceIntervalTime[15][10] = new SurfaceIntervalRange(0, 4);
		this.surfaceIntervalTime[15][11] = new SurfaceIntervalRange(5, 9);
		this.surfaceIntervalTime[15][12] = new SurfaceIntervalRange(10, 14);
		this.surfaceIntervalTime[15][13] = new SurfaceIntervalRange(14, 18);
		this.surfaceIntervalTime[15][14] = new SurfaceIntervalRange(18, 23);
		this.surfaceIntervalTime[15][15] = new SurfaceIntervalRange(22, 27);
		this.surfaceIntervalTime[15][16] = new SurfaceIntervalRange(26, 30);
		this.surfaceIntervalTime[15][17] = new SurfaceIntervalRange(30, 34);
		this.surfaceIntervalTime[15][18] = new SurfaceIntervalRange(33, 38);
		this.surfaceIntervalTime[15][19] = new SurfaceIntervalRange(37, 41);
		this.surfaceIntervalTime[15][20] = new SurfaceIntervalRange(40, 44);
		this.surfaceIntervalTime[15][21] = new SurfaceIntervalRange(43, 47);
		this.surfaceIntervalTime[15][22] = new SurfaceIntervalRange(46, 50);
		this.surfaceIntervalTime[15][23] = new SurfaceIntervalRange(49, 53);
		this.surfaceIntervalTime[15][24] = new SurfaceIntervalRange(52, 56);
		this.surfaceIntervalTime[15][25] = new SurfaceIntervalRange(55, 59);

		//Column 4 (J, J)
		for (int i = 0; i < 9; i++)
			this.surfaceIntervalTime[16][i] = new SurfaceIntervalRange(0, 0);
		this.surfaceIntervalTime[16][9] = new SurfaceIntervalRange(0, 5);
		this.surfaceIntervalTime[16][10] = new SurfaceIntervalRange(5, 10);
		this.surfaceIntervalTime[16][11] = new SurfaceIntervalRange(10, 15);
		this.surfaceIntervalTime[16][12] = new SurfaceIntervalRange(15, 19);
		this.surfaceIntervalTime[16][13] = new SurfaceIntervalRange(19, 24);
		this.surfaceIntervalTime[16][14] = new SurfaceIntervalRange(24, 28);
		this.surfaceIntervalTime[16][15] = new SurfaceIntervalRange(28, 32);
		this.surfaceIntervalTime[16][16] = new SurfaceIntervalRange(31, 36);
		this.surfaceIntervalTime[16][17] = new SurfaceIntervalRange(35, 40);
		this.surfaceIntervalTime[16][18] = new SurfaceIntervalRange(39, 43);
		this.surfaceIntervalTime[16][19] = new SurfaceIntervalRange(42, 47);
		this.surfaceIntervalTime[16][20] = new SurfaceIntervalRange(45, 50);
		this.surfaceIntervalTime[16][21] = new SurfaceIntervalRange(48, 53);
		this.surfaceIntervalTime[16][22] = new SurfaceIntervalRange(51, 56);
		this.surfaceIntervalTime[16][23] = new SurfaceIntervalRange(54, 59);
		this.surfaceIntervalTime[16][24] = new SurfaceIntervalRange(57, 62);
		this.surfaceIntervalTime[16][25] = new SurfaceIntervalRange(60, 65);

		//Column 4 (I, I)
		for (int i = 0; i < 8; i++)
			this.surfaceIntervalTime[17][i] = new SurfaceIntervalRange(0, 0);
		this.surfaceIntervalTime[17][8] = new SurfaceIntervalRange(0, 5);
		this.surfaceIntervalTime[17][9] = new SurfaceIntervalRange(6, 11);
		this.surfaceIntervalTime[17][10] = new SurfaceIntervalRange(11, 16);
		this.surfaceIntervalTime[17][11] = new SurfaceIntervalRange(16, 21);
		this.surfaceIntervalTime[17][12] = new SurfaceIntervalRange(20, 25);
		this.surfaceIntervalTime[17][13] = new SurfaceIntervalRange(25, 30);
		this.surfaceIntervalTime[17][14] = new SurfaceIntervalRange(29, 34);
		this.surfaceIntervalTime[17][15] = new SurfaceIntervalRange(33, 38);
		this.surfaceIntervalTime[17][16] = new SurfaceIntervalRange(37, 42);
		this.surfaceIntervalTime[17][17] = new SurfaceIntervalRange(41, 46);
		this.surfaceIntervalTime[17][18] = new SurfaceIntervalRange(44, 49);
		this.surfaceIntervalTime[17][19] = new SurfaceIntervalRange(48, 53);
		this.surfaceIntervalTime[17][20] = new SurfaceIntervalRange(51, 56);
		this.surfaceIntervalTime[17][21] = new SurfaceIntervalRange(54, 59);
		this.surfaceIntervalTime[17][22] = new SurfaceIntervalRange(57, 62);
		this.surfaceIntervalTime[17][23] = new SurfaceIntervalRange(60, 65);
		this.surfaceIntervalTime[17][24] = new SurfaceIntervalRange(63, 68);
		this.surfaceIntervalTime[17][25] = new SurfaceIntervalRange(68, 71);

		//Column 4 (H, H)
		for (int i = 0; i < 7; i++)
			this.surfaceIntervalTime[18][i] = new SurfaceIntervalRange(0, 0);
		this.surfaceIntervalTime[18][7] = new SurfaceIntervalRange(0, 5);
		this.surfaceIntervalTime[18][8] = new SurfaceIntervalRange(6, 11);
		this.surfaceIntervalTime[18][9] = new SurfaceIntervalRange(12, 17);
		this.surfaceIntervalTime[18][10] = new SurfaceIntervalRange(17, 22);
		this.surfaceIntervalTime[18][11] = new SurfaceIntervalRange(22, 27);
		this.surfaceIntervalTime[18][12] = new SurfaceIntervalRange(26, 32);
		this.surfaceIntervalTime[18][13] = new SurfaceIntervalRange(31, 36);
		this.surfaceIntervalTime[18][14] = new SurfaceIntervalRange(35, 41);
		this.surfaceIntervalTime[18][15] = new SurfaceIntervalRange(39, 45);
		this.surfaceIntervalTime[18][16] = new SurfaceIntervalRange(43, 48);
		this.surfaceIntervalTime[18][17] = new SurfaceIntervalRange(47, 52);
		this.surfaceIntervalTime[18][18] = new SurfaceIntervalRange(50, 56);
		this.surfaceIntervalTime[18][19] = new SurfaceIntervalRange(54, 59);
		this.surfaceIntervalTime[18][20] = new SurfaceIntervalRange(57, 62);
		this.surfaceIntervalTime[18][21] = new SurfaceIntervalRange(60, 65);
		this.surfaceIntervalTime[18][22] = new SurfaceIntervalRange(63, 68);
		this.surfaceIntervalTime[18][23] = new SurfaceIntervalRange(66, 71);
		this.surfaceIntervalTime[18][24] = new SurfaceIntervalRange(69, 74);
		this.surfaceIntervalTime[18][25] = new SurfaceIntervalRange(72, 77);

		//Column 4 (G, G)
		for (int i = 0; i < 6; i++)
			this.surfaceIntervalTime[19][i] = new SurfaceIntervalRange(0, 0);
		this.surfaceIntervalTime[19][6] = new SurfaceIntervalRange(0, 6);
		this.surfaceIntervalTime[19][7] = new SurfaceIntervalRange(6, 12);
		this.surfaceIntervalTime[19][8] = new SurfaceIntervalRange(12, 18);
		this.surfaceIntervalTime[19][9] = new SurfaceIntervalRange(18, 24);
		this.surfaceIntervalTime[19][10] = new SurfaceIntervalRange(23, 29);
		this.surfaceIntervalTime[19][11] = new SurfaceIntervalRange(28, 34);
		this.surfaceIntervalTime[19][12] = new SurfaceIntervalRange(33, 39);
		this.surfaceIntervalTime[19][13] = new SurfaceIntervalRange(37, 43);
		this.surfaceIntervalTime[19][14] = new SurfaceIntervalRange(42, 47);
		this.surfaceIntervalTime[19][15] = new SurfaceIntervalRange(46, 51);
		this.surfaceIntervalTime[19][16] = new SurfaceIntervalRange(49, 55);
		this.surfaceIntervalTime[19][17] = new SurfaceIntervalRange(53, 59);
		this.surfaceIntervalTime[19][18] = new SurfaceIntervalRange(57, 63);
		this.surfaceIntervalTime[19][19] = new SurfaceIntervalRange(60, 66);
		this.surfaceIntervalTime[19][20] = new SurfaceIntervalRange(63, 69);
		this.surfaceIntervalTime[19][21] = new SurfaceIntervalRange(66, 72);
		this.surfaceIntervalTime[19][22] = new SurfaceIntervalRange(69, 75);
		this.surfaceIntervalTime[19][23] = new SurfaceIntervalRange(72, 78);
		this.surfaceIntervalTime[19][24] = new SurfaceIntervalRange(75, 81);
		this.surfaceIntervalTime[19][25] = new SurfaceIntervalRange(78, 84);

		//Column 4 (F, F)
		for (int i = 0; i < 5; i++)
			this.surfaceIntervalTime[20][i] = new SurfaceIntervalRange(0, 0);
		this.surfaceIntervalTime[20][5] = new SurfaceIntervalRange(0, 7);
		this.surfaceIntervalTime[20][6] = new SurfaceIntervalRange(7, 13);
		this.surfaceIntervalTime[20][7] = new SurfaceIntervalRange(13, 20);
		this.surfaceIntervalTime[20][8] = new SurfaceIntervalRange(19, 26);
		this.surfaceIntervalTime[20][9] = new SurfaceIntervalRange(25, 31);
		this.surfaceIntervalTime[20][10] = new SurfaceIntervalRange(30, 37);
		this.surfaceIntervalTime[20][11] = new SurfaceIntervalRange(35, 42);
		this.surfaceIntervalTime[20][12] = new SurfaceIntervalRange(40, 46);
		this.surfaceIntervalTime[20][13] = new SurfaceIntervalRange(44, 51);
		this.surfaceIntervalTime[20][14] = new SurfaceIntervalRange(48, 55);
		this.surfaceIntervalTime[20][15] = new SurfaceIntervalRange(52, 59);
		this.surfaceIntervalTime[20][16] = new SurfaceIntervalRange(56, 63);
		this.surfaceIntervalTime[20][17] = new SurfaceIntervalRange(60, 67);
		this.surfaceIntervalTime[20][18] = new SurfaceIntervalRange(64, 70);
		this.surfaceIntervalTime[20][19] = new SurfaceIntervalRange(67, 73);
		this.surfaceIntervalTime[20][20] = new SurfaceIntervalRange(70, 77);
		this.surfaceIntervalTime[20][21] = new SurfaceIntervalRange(73, 80);
		this.surfaceIntervalTime[20][22] = new SurfaceIntervalRange(76, 83);
		this.surfaceIntervalTime[20][23] = new SurfaceIntervalRange(79, 86);
		this.surfaceIntervalTime[20][24] = new SurfaceIntervalRange(82, 89);
		this.surfaceIntervalTime[20][25] = new SurfaceIntervalRange(85, 91);

		//Column 4 (E, E)
		for (int i = 0; i < 4; i++)
			this.surfaceIntervalTime[21][i] = new SurfaceIntervalRange(0, 0);
		this.surfaceIntervalTime[21][4] = new SurfaceIntervalRange(0, 7);
		this.surfaceIntervalTime[21][5] = new SurfaceIntervalRange(8, 15);
		this.surfaceIntervalTime[21][6] = new SurfaceIntervalRange(14, 22);
		this.surfaceIntervalTime[21][7] = new SurfaceIntervalRange(21, 28);
		this.surfaceIntervalTime[21][8] = new SurfaceIntervalRange(27, 34);
		this.surfaceIntervalTime[21][9] = new SurfaceIntervalRange(32, 40);
		this.surfaceIntervalTime[21][10] = new SurfaceIntervalRange(38, 45);
		this.surfaceIntervalTime[21][11] = new SurfaceIntervalRange(43, 50);
		this.surfaceIntervalTime[21][12] = new SurfaceIntervalRange(47, 55);
		this.surfaceIntervalTime[21][13] = new SurfaceIntervalRange(52, 59);
		this.surfaceIntervalTime[21][14] = new SurfaceIntervalRange(56, 63);
		this.surfaceIntervalTime[21][15] = new SurfaceIntervalRange(60, 67);
		this.surfaceIntervalTime[21][16] = new SurfaceIntervalRange(64, 71);
		this.surfaceIntervalTime[21][17] = new SurfaceIntervalRange(68, 75);
		this.surfaceIntervalTime[21][18] = new SurfaceIntervalRange(71, 78);
		this.surfaceIntervalTime[21][19] = new SurfaceIntervalRange(74, 82);
		this.surfaceIntervalTime[21][20] = new SurfaceIntervalRange(78, 85);
		this.surfaceIntervalTime[21][21] = new SurfaceIntervalRange(81, 88);
		this.surfaceIntervalTime[21][22] = new SurfaceIntervalRange(84, 91);
		this.surfaceIntervalTime[21][23] = new SurfaceIntervalRange(87, 94);
		this.surfaceIntervalTime[21][24] = new SurfaceIntervalRange(90, 97);
		this.surfaceIntervalTime[21][25] = new SurfaceIntervalRange(92, 100);

		//Column 4 (D, D)
		for (int i = 0; i < 3; i++)
			this.surfaceIntervalTime[22][i] = new SurfaceIntervalRange(0, 0);
		this.surfaceIntervalTime[22][3] = new SurfaceIntervalRange(0, 8);
		this.surfaceIntervalTime[22][4] = new SurfaceIntervalRange(8, 16);
		this.surfaceIntervalTime[22][5] = new SurfaceIntervalRange(16, 24);
		this.surfaceIntervalTime[22][6] = new SurfaceIntervalRange(23, 31);
		this.surfaceIntervalTime[22][7] = new SurfaceIntervalRange(29, 37);
		this.surfaceIntervalTime[22][8] = new SurfaceIntervalRange(35, 43);
		this.surfaceIntervalTime[22][9] = new SurfaceIntervalRange(41, 49);
		this.surfaceIntervalTime[22][10] = new SurfaceIntervalRange(46, 54);
		this.surfaceIntervalTime[22][11] = new SurfaceIntervalRange(51, 59);
		this.surfaceIntervalTime[22][12] = new SurfaceIntervalRange(56, 64);
		this.surfaceIntervalTime[22][13] = new SurfaceIntervalRange(60, 68);
		this.surfaceIntervalTime[22][14] = new SurfaceIntervalRange(64, 72);
		this.surfaceIntervalTime[22][15] = new SurfaceIntervalRange(68, 76);
		this.surfaceIntervalTime[22][16] = new SurfaceIntervalRange(72, 80);
		this.surfaceIntervalTime[22][17] = new SurfaceIntervalRange(76, 84);
		this.surfaceIntervalTime[22][18] = new SurfaceIntervalRange(79, 87);
		this.surfaceIntervalTime[22][19] = new SurfaceIntervalRange(83, 91);
		this.surfaceIntervalTime[22][20] = new SurfaceIntervalRange(86, 94);
		this.surfaceIntervalTime[22][21] = new SurfaceIntervalRange(89, 97);
		this.surfaceIntervalTime[22][22] = new SurfaceIntervalRange(92, 100);
		this.surfaceIntervalTime[22][23] = new SurfaceIntervalRange(95, 103);
		this.surfaceIntervalTime[22][24] = new SurfaceIntervalRange(98, 106);
		this.surfaceIntervalTime[22][25] = new SurfaceIntervalRange(101, 109);

		//Column 4 (C, C)
		this.surfaceIntervalTime[23][0] = new SurfaceIntervalRange(0, 0);
		this.surfaceIntervalTime[23][1] = new SurfaceIntervalRange(0, 0);
		this.surfaceIntervalTime[23][2] = new SurfaceIntervalRange(0, 21);
		this.surfaceIntervalTime[23][3] = new SurfaceIntervalRange(9, 30);
		this.surfaceIntervalTime[23][4] = new SurfaceIntervalRange(17, 38);
		this.surfaceIntervalTime[23][5] = new SurfaceIntervalRange(25, 46);
		this.surfaceIntervalTime[23][6] = new SurfaceIntervalRange(32, 53);
		this.surfaceIntervalTime[23][7] = new SurfaceIntervalRange(38, 59);
		this.surfaceIntervalTime[23][8] = new SurfaceIntervalRange(44, 65);
		this.surfaceIntervalTime[23][9] = new SurfaceIntervalRange(50, 71);
		this.surfaceIntervalTime[23][10] = new SurfaceIntervalRange(55, 76);
		this.surfaceIntervalTime[23][11] = new SurfaceIntervalRange(60, 81);
		this.surfaceIntervalTime[23][12] = new SurfaceIntervalRange(65, 85);
		this.surfaceIntervalTime[23][13] = new SurfaceIntervalRange(69, 90);
		this.surfaceIntervalTime[23][14] = new SurfaceIntervalRange(73, 94);
		this.surfaceIntervalTime[23][15] = new SurfaceIntervalRange(77, 98);
		this.surfaceIntervalTime[23][16] = new SurfaceIntervalRange(81, 102);
		this.surfaceIntervalTime[23][17] = new SurfaceIntervalRange(85, 106);
		this.surfaceIntervalTime[23][18] = new SurfaceIntervalRange(88, 109);
		this.surfaceIntervalTime[23][19] = new SurfaceIntervalRange(92, 113);
		this.surfaceIntervalTime[23][20] = new SurfaceIntervalRange(95, 116);
		this.surfaceIntervalTime[23][21] = new SurfaceIntervalRange(98, 119);
		this.surfaceIntervalTime[23][22] = new SurfaceIntervalRange(101, 122);
		this.surfaceIntervalTime[23][23] = new SurfaceIntervalRange(104, 125);
		this.surfaceIntervalTime[23][24] = new SurfaceIntervalRange(107, 128);
		this.surfaceIntervalTime[23][25] = new SurfaceIntervalRange(110, 131);

		//Column 4 (B, B)
		this.surfaceIntervalTime[24][0] = new SurfaceIntervalRange(0, 0);
		this.surfaceIntervalTime[24][1] = new SurfaceIntervalRange(0, 47);
		this.surfaceIntervalTime[24][2] = new SurfaceIntervalRange(22, 69);
		this.surfaceIntervalTime[24][3] = new SurfaceIntervalRange(31, 78);
		this.surfaceIntervalTime[24][4] = new SurfaceIntervalRange(39, 87);
		this.surfaceIntervalTime[24][5] = new SurfaceIntervalRange(47, 94);
		this.surfaceIntervalTime[24][6] = new SurfaceIntervalRange(54, 101);
		this.surfaceIntervalTime[24][7] = new SurfaceIntervalRange(60, 107);
		this.surfaceIntervalTime[24][8] = new SurfaceIntervalRange(66, 113);
		this.surfaceIntervalTime[24][9] = new SurfaceIntervalRange(72, 119);
		this.surfaceIntervalTime[24][10] = new SurfaceIntervalRange(77, 124);
		this.surfaceIntervalTime[24][11] = new SurfaceIntervalRange(82, 129);
		this.surfaceIntervalTime[24][12] = new SurfaceIntervalRange(86, 134);
		this.surfaceIntervalTime[24][13] = new SurfaceIntervalRange(91, 138);
		this.surfaceIntervalTime[24][14] = new SurfaceIntervalRange(95, 143);
		this.surfaceIntervalTime[24][15] = new SurfaceIntervalRange(99, 147);
		this.surfaceIntervalTime[24][16] = new SurfaceIntervalRange(103, 150);
		this.surfaceIntervalTime[24][17] = new SurfaceIntervalRange(107, 154);
		this.surfaceIntervalTime[24][18] = new SurfaceIntervalRange(110, 158);
		this.surfaceIntervalTime[24][19] = new SurfaceIntervalRange(114, 161);
		this.surfaceIntervalTime[24][20] = new SurfaceIntervalRange(117, 164);
		this.surfaceIntervalTime[24][21] = new SurfaceIntervalRange(120, 167);
		this.surfaceIntervalTime[24][22] = new SurfaceIntervalRange(123, 170);
		this.surfaceIntervalTime[24][23] = new SurfaceIntervalRange(126, 173);
		this.surfaceIntervalTime[24][24] = new SurfaceIntervalRange(129, 176);
		this.surfaceIntervalTime[24][25] = new SurfaceIntervalRange(132, 179);

		//Column 4 (A, A)
		this.surfaceIntervalTime[25][0] = new SurfaceIntervalRange(0, 180);
		this.surfaceIntervalTime[25][1] = new SurfaceIntervalRange(48, 228);
		this.surfaceIntervalTime[25][2] = new SurfaceIntervalRange(70, 250);
		this.surfaceIntervalTime[25][3] = new SurfaceIntervalRange(79, 259);
		this.surfaceIntervalTime[25][4] = new SurfaceIntervalRange(88, 268);
		this.surfaceIntervalTime[25][5] = new SurfaceIntervalRange(95, 275);
		this.surfaceIntervalTime[25][6] = new SurfaceIntervalRange(102, 282);
		this.surfaceIntervalTime[25][7] = new SurfaceIntervalRange(108, 288);
		this.surfaceIntervalTime[25][8] = new SurfaceIntervalRange(114, 294);
		this.surfaceIntervalTime[25][9] = new SurfaceIntervalRange(120, 300);
		this.surfaceIntervalTime[25][10] = new SurfaceIntervalRange(125, 305);
		this.surfaceIntervalTime[25][11] = new SurfaceIntervalRange(130, 310);
		this.surfaceIntervalTime[25][12] = new SurfaceIntervalRange(135, 315);
		this.surfaceIntervalTime[25][13] = new SurfaceIntervalRange(139, 319);
		this.surfaceIntervalTime[25][14] = new SurfaceIntervalRange(144, 324);
		this.surfaceIntervalTime[25][15] = new SurfaceIntervalRange(148, 328);
		this.surfaceIntervalTime[25][16] = new SurfaceIntervalRange(151, 331);
		this.surfaceIntervalTime[25][17] = new SurfaceIntervalRange(155, 335);
		this.surfaceIntervalTime[25][18] = new SurfaceIntervalRange(159, 339);
		this.surfaceIntervalTime[25][19] = new SurfaceIntervalRange(162, 342);
		this.surfaceIntervalTime[25][20] = new SurfaceIntervalRange(165, 345);
		this.surfaceIntervalTime[25][21] = new SurfaceIntervalRange(168, 348);
		this.surfaceIntervalTime[25][22] = new SurfaceIntervalRange(171, 351);
		this.surfaceIntervalTime[25][23] = new SurfaceIntervalRange(174, 354);
		this.surfaceIntervalTime[25][24] = new SurfaceIntervalRange(177, 357);
		this.surfaceIntervalTime[25][25] = new SurfaceIntervalRange(180, 360);
		
		//Table 3
		//Column 1 - Z
		this.repetitiveDiveTimeTable[0][0] = new RNTABT(205, 0);
		this.repetitiveDiveTimeTable[0][1] = new RNTABT(140, 0);
		for (int i = 2; i < 11; i++)
			this.repetitiveDiveTimeTable[0][i] = new RNTABT(0, 0);

		//Column 2 - Y
		this.repetitiveDiveTimeTable[1][0] = new RNTABT(188, 17);
		this.repetitiveDiveTimeTable[1][1] = new RNTABT(129, 11);
		for (int i = 2; i < 11; i++)
			this.repetitiveDiveTimeTable[1][i] = new RNTABT(0, 0);

		//Column 3 - X
		this.repetitiveDiveTimeTable[2][0] = new RNTABT(168, 37);
		this.repetitiveDiveTimeTable[2][1] = new RNTABT(120, 20);
		this.repetitiveDiveTimeTable[2][2] = new RNTABT(80, 0);
		for (int i = 3; i < 11; i++)
			this.repetitiveDiveTimeTable[2][i] = new RNTABT(0, 0);
		
		//Column 4 - W
		this.repetitiveDiveTimeTable[3][0] = new RNTABT(152, 53);
		this.repetitiveDiveTimeTable[3][1] = new RNTABT(111, 29);
		this.repetitiveDiveTimeTable[3][2] = new RNTABT(75, 5);
		this.repetitiveDiveTimeTable[3][3] = new RNTABT(55, 0);
		for (int i = 4; i < 11; i++)
			this.repetitiveDiveTimeTable[3][i] = new RNTABT(0, 0);

		//Column 5 - V
		this.repetitiveDiveTimeTable[4][0] = new RNTABT(139, 66);
		this.repetitiveDiveTimeTable[4][1] = new RNTABT(104, 36);
		this.repetitiveDiveTimeTable[4][2] = new RNTABT(71, 9);
		this.repetitiveDiveTimeTable[4][3] = new RNTABT(54, 1);
		for (int i = 4; i < 11; i++)
			this.repetitiveDiveTimeTable[4][i] = new RNTABT(0, 0);

		//Column 6 - U
		this.repetitiveDiveTimeTable[5][0] = new RNTABT(127, 78);
		this.repetitiveDiveTimeTable[5][1] = new RNTABT(97, 43);
		this.repetitiveDiveTimeTable[5][2] = new RNTABT(67, 13);
		this.repetitiveDiveTimeTable[5][3] = new RNTABT(52, 3);
		for (int i = 4; i < 11; i++)
			this.repetitiveDiveTimeTable[5][i] = new RNTABT(0, 0);

		//Column 7 - T
		this.repetitiveDiveTimeTable[6][0] = new RNTABT(117, 88);
		this.repetitiveDiveTimeTable[6][1] = new RNTABT(91, 49);
		this.repetitiveDiveTimeTable[6][2] = new RNTABT(63, 17);
		this.repetitiveDiveTimeTable[6][3] = new RNTABT(49, 6);
		this.repetitiveDiveTimeTable[6][4] = new RNTABT(40, 0);
		for (int i = 5; i < 11; i++)
			this.repetitiveDiveTimeTable[6][i] = new RNTABT(0, 0);
		
		//Column 8 - S
		this.repetitiveDiveTimeTable[7][0] = new RNTABT(108, 97);
		this.repetitiveDiveTimeTable[7][1] = new RNTABT(85, 55);
		this.repetitiveDiveTimeTable[7][2] = new RNTABT(60, 20);
		this.repetitiveDiveTimeTable[7][3] = new RNTABT(47, 8);
		this.repetitiveDiveTimeTable[7][4] = new RNTABT(38, 2);
		for (int i = 5; i < 11; i++)
			this.repetitiveDiveTimeTable[7][i] = new RNTABT(0, 0);

		//Column 9 - R
		this.repetitiveDiveTimeTable[8][0] = new RNTABT(100, 105);
		this.repetitiveDiveTimeTable[8][1] = new RNTABT(79, 61);
		this.repetitiveDiveTimeTable[8][2] = new RNTABT(57, 23);
		this.repetitiveDiveTimeTable[8][3] = new RNTABT(44, 11);
		this.repetitiveDiveTimeTable[8][4] = new RNTABT(36, 4);
		this.repetitiveDiveTimeTable[8][5] = new RNTABT(30, 0);
		for (int i = 6; i < 11; i++)
			this.repetitiveDiveTimeTable[8][i] = new RNTABT(0, 0);	
		
		//Column 10 - Q
		this.repetitiveDiveTimeTable[9][0] = new RNTABT(92, 113);
		this.repetitiveDiveTimeTable[9][1] = new RNTABT(74, 66);
		this.repetitiveDiveTimeTable[9][2] = new RNTABT(53, 27);
		this.repetitiveDiveTimeTable[9][3] = new RNTABT(42, 13);
		this.repetitiveDiveTimeTable[9][4] = new RNTABT(34, 6);
		this.repetitiveDiveTimeTable[9][5] = new RNTABT(29, 0);
		this.repetitiveDiveTimeTable[9][6] = new RNTABT(25, 0);
		for (int i = 7; i < 11; i++)
			this.repetitiveDiveTimeTable[9][i] = new RNTABT(0, 0);	
		
		//Column 11 - P
		this.repetitiveDiveTimeTable[10][0] = new RNTABT(85, 120);
		this.repetitiveDiveTimeTable[10][1] = new RNTABT(69, 71);
		this.repetitiveDiveTimeTable[10][2] = new RNTABT(50, 30);
		this.repetitiveDiveTimeTable[10][3] = new RNTABT(39, 15);
		this.repetitiveDiveTimeTable[10][4] = new RNTABT(33, 7);
		this.repetitiveDiveTimeTable[10][5] = new RNTABT(28, 2);
		this.repetitiveDiveTimeTable[10][6] = new RNTABT(24, 0);
		for (int i = 7; i < 11; i++)
			this.repetitiveDiveTimeTable[10][i] = new RNTABT(0, 0);	

		//Column 12 - O
		this.repetitiveDiveTimeTable[11][0] = new RNTABT(79, 126);
		this.repetitiveDiveTimeTable[11][1] = new RNTABT(64, 76);
		this.repetitiveDiveTimeTable[11][2] = new RNTABT(47, 33);
		this.repetitiveDiveTimeTable[11][3] = new RNTABT(37, 18);
		this.repetitiveDiveTimeTable[11][4] = new RNTABT(31, 9);
		this.repetitiveDiveTimeTable[11][5] = new RNTABT(26, 4);
		this.repetitiveDiveTimeTable[11][6] = new RNTABT(23, 2);
		this.repetitiveDiveTimeTable[11][7] = new RNTABT(20, 0);
		for (int i = 8; i < 11; i++)
			this.repetitiveDiveTimeTable[11][i] = new RNTABT(0, 0);	

		//Column 13 - N
		this.repetitiveDiveTimeTable[12][0] = new RNTABT(73, 132);
		this.repetitiveDiveTimeTable[12][1] = new RNTABT(60, 80);
		this.repetitiveDiveTimeTable[12][2] = new RNTABT(44, 36);
		this.repetitiveDiveTimeTable[12][3] = new RNTABT(35, 20);
		this.repetitiveDiveTimeTable[12][4] = new RNTABT(29, 11);
		this.repetitiveDiveTimeTable[12][5] = new RNTABT(25, 5);
		this.repetitiveDiveTimeTable[12][6] = new RNTABT(22, 3);
		this.repetitiveDiveTimeTable[12][7] = new RNTABT(19, 0);
		for (int i = 8; i < 11; i++)
			this.repetitiveDiveTimeTable[12][i] = new RNTABT(0, 0);	

		//Column 14 - M
		this.repetitiveDiveTimeTable[13][0] = new RNTABT(67, 138);
		this.repetitiveDiveTimeTable[13][1] = new RNTABT(55, 85);
		this.repetitiveDiveTimeTable[13][2] = new RNTABT(41, 39);
		this.repetitiveDiveTimeTable[13][3] = new RNTABT(33, 22);
		this.repetitiveDiveTimeTable[13][4] = new RNTABT(27, 13);
		this.repetitiveDiveTimeTable[13][5] = new RNTABT(23, 7);
		this.repetitiveDiveTimeTable[13][6] = new RNTABT(21, 4);
		this.repetitiveDiveTimeTable[13][7] = new RNTABT(18, 2);
		this.repetitiveDiveTimeTable[13][8] = new RNTABT(16, 0);
		this.repetitiveDiveTimeTable[13][9] = new RNTABT(0, 0);	
		this.repetitiveDiveTimeTable[13][10] = new RNTABT(0, 0);	

		//Column 15 - L
		this.repetitiveDiveTimeTable[14][0] = new RNTABT(62, 143);
		this.repetitiveDiveTimeTable[14][1] = new RNTABT(51, 89);
		this.repetitiveDiveTimeTable[14][2] = new RNTABT(38, 42);
		this.repetitiveDiveTimeTable[14][3] = new RNTABT(31, 24);
		this.repetitiveDiveTimeTable[14][4] = new RNTABT(26, 14);
		this.repetitiveDiveTimeTable[14][5] = new RNTABT(22, 8);
		this.repetitiveDiveTimeTable[14][6] = new RNTABT(19, 6);
		this.repetitiveDiveTimeTable[14][7] = new RNTABT(17, 3);
		this.repetitiveDiveTimeTable[14][8] = new RNTABT(15, 0);
		this.repetitiveDiveTimeTable[14][9] = new RNTABT(0, 0);	
		this.repetitiveDiveTimeTable[14][10] = new RNTABT(0, 0);	

		//Column 16 - K
		this.repetitiveDiveTimeTable[15][0] = new RNTABT(57, 148);
		this.repetitiveDiveTimeTable[15][1] = new RNTABT(48, 92);
		this.repetitiveDiveTimeTable[15][2] = new RNTABT(36, 44);
		this.repetitiveDiveTimeTable[15][3] = new RNTABT(29, 25);
		this.repetitiveDiveTimeTable[15][4] = new RNTABT(24, 16);
		this.repetitiveDiveTimeTable[15][5] = new RNTABT(21, 9);
		this.repetitiveDiveTimeTable[15][6] = new RNTABT(18, 7);
		this.repetitiveDiveTimeTable[15][7] = new RNTABT(16, 4);
		this.repetitiveDiveTimeTable[15][8] = new RNTABT(14, 2);
		this.repetitiveDiveTimeTable[15][9] = new RNTABT(13, 0);	
		this.repetitiveDiveTimeTable[15][10] = new RNTABT(0, 0);	

		//Column 17 - J
		this.repetitiveDiveTimeTable[16][0] = new RNTABT(52, 153);
		this.repetitiveDiveTimeTable[16][1] = new RNTABT(44, 96);
		this.repetitiveDiveTimeTable[16][2] = new RNTABT(33, 47);
		this.repetitiveDiveTimeTable[16][3] = new RNTABT(27, 28);
		this.repetitiveDiveTimeTable[16][4] = new RNTABT(22, 18);
		this.repetitiveDiveTimeTable[16][5] = new RNTABT(19, 11);
		this.repetitiveDiveTimeTable[16][6] = new RNTABT(17, 8);
		this.repetitiveDiveTimeTable[16][7] = new RNTABT(15, 5);
		this.repetitiveDiveTimeTable[16][8] = new RNTABT(14, 2);
		this.repetitiveDiveTimeTable[16][9] = new RNTABT(12, 0);	
		this.repetitiveDiveTimeTable[16][10] = new RNTABT(0, 0);	

		//Column 18 - I
		this.repetitiveDiveTimeTable[17][0] = new RNTABT(48, 157);
		this.repetitiveDiveTimeTable[17][1] = new RNTABT(40, 100);
		this.repetitiveDiveTimeTable[17][2] = new RNTABT(31, 49);
		this.repetitiveDiveTimeTable[17][3] = new RNTABT(25, 30);
		this.repetitiveDiveTimeTable[17][4] = new RNTABT(21, 19);
		this.repetitiveDiveTimeTable[17][5] = new RNTABT(18, 12);
		this.repetitiveDiveTimeTable[17][6] = new RNTABT(16, 9);
		this.repetitiveDiveTimeTable[17][7] = new RNTABT(14, 5);
		this.repetitiveDiveTimeTable[17][8] = new RNTABT(13, 3);
		this.repetitiveDiveTimeTable[17][9] = new RNTABT(12, 0);	
		this.repetitiveDiveTimeTable[17][10] = new RNTABT(0, 0);	

		//Column 19 - H
		this.repetitiveDiveTimeTable[18][0] = new RNTABT(44, 161);
		this.repetitiveDiveTimeTable[18][1] = new RNTABT(37, 103);
		this.repetitiveDiveTimeTable[18][2] = new RNTABT(28, 52);
		this.repetitiveDiveTimeTable[18][3] = new RNTABT(23, 32);
		this.repetitiveDiveTimeTable[18][4] = new RNTABT(19, 21);
		this.repetitiveDiveTimeTable[18][5] = new RNTABT(17, 13);
		this.repetitiveDiveTimeTable[18][6] = new RNTABT(15, 10);
		this.repetitiveDiveTimeTable[18][7] = new RNTABT(13, 7);
		this.repetitiveDiveTimeTable[18][8] = new RNTABT(12, 4);
		this.repetitiveDiveTimeTable[18][9] = new RNTABT(11, 2);	
		this.repetitiveDiveTimeTable[18][10] = new RNTABT(10, 0);	

		//Column 20 - G
		this.repetitiveDiveTimeTable[19][0] = new RNTABT(40, 165);
		this.repetitiveDiveTimeTable[19][1] = new RNTABT(34, 106);
		this.repetitiveDiveTimeTable[19][2] = new RNTABT(26, 54);
		this.repetitiveDiveTimeTable[19][3] = new RNTABT(21, 34);
		this.repetitiveDiveTimeTable[19][4] = new RNTABT(18, 22);
		this.repetitiveDiveTimeTable[19][5] = new RNTABT(15, 15);
		this.repetitiveDiveTimeTable[19][6] = new RNTABT(13, 12);
		this.repetitiveDiveTimeTable[19][7] = new RNTABT(12, 8);
		this.repetitiveDiveTimeTable[19][8] = new RNTABT(11, 5);
		this.repetitiveDiveTimeTable[19][9] = new RNTABT(10, 3);	
		this.repetitiveDiveTimeTable[19][10] = new RNTABT(9, 0);	

		//Column 21 - F
		this.repetitiveDiveTimeTable[20][0] = new RNTABT(36, 169);
		this.repetitiveDiveTimeTable[20][1] = new RNTABT(31, 109);
		this.repetitiveDiveTimeTable[20][2] = new RNTABT(24, 56);
		this.repetitiveDiveTimeTable[20][3] = new RNTABT(19, 36);
		this.repetitiveDiveTimeTable[20][4] = new RNTABT(16, 24);
		this.repetitiveDiveTimeTable[20][5] = new RNTABT(14, 16);
		this.repetitiveDiveTimeTable[20][6] = new RNTABT(12, 13);
		this.repetitiveDiveTimeTable[20][7] = new RNTABT(11, 9);
		this.repetitiveDiveTimeTable[20][8] = new RNTABT(10, 6);
		this.repetitiveDiveTimeTable[20][9] = new RNTABT(9, 4);	
		this.repetitiveDiveTimeTable[20][10] = new RNTABT(8, 0);	

		//Column 22 - E
		this.repetitiveDiveTimeTable[21][0] = new RNTABT(32, 173);
		this.repetitiveDiveTimeTable[21][1] = new RNTABT(27, 113);
		this.repetitiveDiveTimeTable[21][2] = new RNTABT(21, 59);
		this.repetitiveDiveTimeTable[21][3] = new RNTABT(17, 38);
		this.repetitiveDiveTimeTable[21][4] = new RNTABT(15, 25);
		this.repetitiveDiveTimeTable[21][5] = new RNTABT(13, 17);
		this.repetitiveDiveTimeTable[21][6] = new RNTABT(11, 14);
		this.repetitiveDiveTimeTable[21][7] = new RNTABT(10, 10);
		this.repetitiveDiveTimeTable[21][8] = new RNTABT(9, 7);
		this.repetitiveDiveTimeTable[21][9] = new RNTABT(8, 5);	
		this.repetitiveDiveTimeTable[21][10] = new RNTABT(8, 0);	

		//Column 23 - D
		this.repetitiveDiveTimeTable[22][0] = new RNTABT(29, 176);
		this.repetitiveDiveTimeTable[22][1] = new RNTABT(25, 115);
		this.repetitiveDiveTimeTable[22][2] = new RNTABT(19, 61);
		this.repetitiveDiveTimeTable[22][3] = new RNTABT(16, 39);
		this.repetitiveDiveTimeTable[22][4] = new RNTABT(13, 27);
		this.repetitiveDiveTimeTable[22][5] = new RNTABT(11, 19);
		this.repetitiveDiveTimeTable[22][6] = new RNTABT(10, 15);
		this.repetitiveDiveTimeTable[22][7] = new RNTABT(9, 11);
		this.repetitiveDiveTimeTable[22][8] = new RNTABT(8, 8);
		this.repetitiveDiveTimeTable[22][9] = new RNTABT(7, 6);	
		this.repetitiveDiveTimeTable[22][10] = new RNTABT(7, 3);	

		//Column 24 - C
		this.repetitiveDiveTimeTable[23][0] = new RNTABT(25, 180);
		this.repetitiveDiveTimeTable[23][1] = new RNTABT(22, 118);
		this.repetitiveDiveTimeTable[23][2] = new RNTABT(17, 63);
		this.repetitiveDiveTimeTable[23][3] = new RNTABT(14, 41);
		this.repetitiveDiveTimeTable[23][4] = new RNTABT(12, 28);
		this.repetitiveDiveTimeTable[23][5] = new RNTABT(10, 20);
		this.repetitiveDiveTimeTable[23][6] = new RNTABT(9, 16);
		this.repetitiveDiveTimeTable[23][7] = new RNTABT(8, 12);
		this.repetitiveDiveTimeTable[23][8] = new RNTABT(7, 9);
		this.repetitiveDiveTimeTable[23][9] = new RNTABT(6, 7);	
		this.repetitiveDiveTimeTable[23][10] = new RNTABT(6, 4);	

		//Column 25 - B
		this.repetitiveDiveTimeTable[24][0] = new RNTABT(19, 186);
		this.repetitiveDiveTimeTable[24][1] = new RNTABT(16, 124);
		this.repetitiveDiveTimeTable[24][2] = new RNTABT(13, 67);
		this.repetitiveDiveTimeTable[24][3] = new RNTABT(11, 44);
		this.repetitiveDiveTimeTable[24][4] = new RNTABT(9, 31);
		this.repetitiveDiveTimeTable[24][5] = new RNTABT(8, 22);
		this.repetitiveDiveTimeTable[24][6] = new RNTABT(7, 18);
		this.repetitiveDiveTimeTable[24][7] = new RNTABT(6, 14);
		this.repetitiveDiveTimeTable[24][8] = new RNTABT(6, 10);
		this.repetitiveDiveTimeTable[24][9] = new RNTABT(5, 8);	
		this.repetitiveDiveTimeTable[24][10] = new RNTABT(5, 5);	

		//Column 26 - A
		this.repetitiveDiveTimeTable[25][0] = new RNTABT(10, 195);
		this.repetitiveDiveTimeTable[25][1] = new RNTABT(9, 131);
		this.repetitiveDiveTimeTable[25][2] = new RNTABT(7, 73);
		this.repetitiveDiveTimeTable[25][3] = new RNTABT(6, 49);
		this.repetitiveDiveTimeTable[25][4] = new RNTABT(5, 35);
		this.repetitiveDiveTimeTable[25][5] = new RNTABT(4, 26);
		this.repetitiveDiveTimeTable[25][6] = new RNTABT(4, 21);
		this.repetitiveDiveTimeTable[25][7] = new RNTABT(3, 17);
		this.repetitiveDiveTimeTable[25][8] = new RNTABT(3, 13);
		this.repetitiveDiveTimeTable[25][9] = new RNTABT(3, 10);	
		this.repetitiveDiveTimeTable[25][10] = new RNTABT(3, 7);	
		
	}


	//get letter group after first dive, given depth of dive in feet and minutes of bottom time
	//depth must be one of the values in Table 1 exactly. minutes will round up
	public char getLetterGroupFirstDiveFeet (int depth, int minutes) {
		int col;
		for (col = 0; col < 12; col++) {
			if (depth == this.depthFeet[col]) {
				break; //get column of table 1
			}
		}
		
		int row;
		for (row = 0; row < 26; row++) {
			if (this.minutesFirst[row][col] >= minutes) {
				break; //get row of table 1
			}
		}
		
		return this.letterGroup[row]; //return letter group
	}
	
	//returns the index in letterGroup of a given letter
	//letter must be A - L
	public int getLetterNumber (char letter) {
		int index;
		for (index = 0; index < 26; index++) { //replace loop with direct mapping to numbers? Switch statement?
			if (this.letterGroup[index] == letter) {
				break; //get column of Table 2
			}
		}
		return index;
	}
	
	//gets the letter group after being in a given letter group and being on the surface for this many minutes
	//minutes must be >= 10, letter must be A - L
	public char getLetterGroupSurfaceIntervalTime (char letter, int minutes) {
		int row = getLetterNumber (letter); //get column of Table 2
		
		int col;
		for (col = 0; col < 26; col++) {
			int max = this.surfaceIntervalTime[col][row].getMax();
			if (minutes < max) {
				break; //get row of Table 2
			}
		}
		
		return this.letterGroup[25-col];
	}
}
