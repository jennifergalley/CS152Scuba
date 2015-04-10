package com.example.john.divesafe;

public class PADIDiveTable {
	/* Front of PADI Table, top left */
	//depth across top, in feet
	private int[] depthFeet = {35, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140};
	//depth across top, in meters
	private int[] depthMeters = {10, 12, 14, 16, 18, 20, 22, 25, 30, 35, 40, 42};
	//letter group along side
	private char[] letterGroup = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
	//Table 1 - No Decompression Limits and Group Designation Table - Feet
	private int[][] firstDiveFeet = {
			{10, 9, 7, 6, 5, 4, 4, 3, 3, 3, 3, 4}, //A
			{19, 16, 13, 11, 9, 8, 7, 6, 6, 5, 5, 4}, //B
			{25, 22, 17, 14, 12, 10, 9, 8, 7, 6, 6, 5}, //C
			{29, 25, 19, 16, 13, 11, 10, 9, 8, 7, 7, 6}, //D
			{32, 27, 21, 17, 15, 13, 11, 10, 9, 8, 8, 7}, //E
			{36, 31, 24, 19, 16, 14, 12, 11, 10, 9, 8, 8}, //F
			{40, 34, 26, 21, 18, 15, 13, 12, 11, 10, 9, 0}, //G
			{44, 37, 28, 23, 19, 17, 15, 13, 12, 11, 10, 0}, //H
			{48, 40, 31, 25, 21, 18, 16, 14, 13, 12, 0, 0}, //I
			{52, 44, 33, 27, 22, 19, 17, 15, 14, 12, 0, 0}, //J
			{57, 48, 36, 29, 24, 21, 18, 16, 14, 13, 0, 0}, //K
			{62, 51, 39, 31, 26, 22, 19, 17, 15, 0, 0, 0}, //L
			{67, 55, 41, 33, 27, 23, 21, 18, 16, 0, 0, 0}, //M
			{73, 60, 44, 35, 29, 25, 22, 19, 0, 0, 0, 0}, //N
			{79, 64, 47, 37, 31, 26, 23, 20, 0, 0, 0, 0}, //O
			{85, 69, 50, 39, 33, 28, 24, 0, 0, 0, 0, 0}, //P
			{92, 74, 53, 42, 35, 29, 25, 0, 0, 0, 0, 0}, //Q
			{100, 79, 57, 44, 36, 30, 0, 0, 0, 0, 0, 0}, //R
			{108, 85, 60, 47, 38, 0, 0, 0, 0, 0, 0, 0}, //S
			{117, 91, 63, 49, 40, 0, 0, 0, 0, 0, 0, 0}, //T
			{127, 97, 67, 52, 0, 0, 0, 0, 0, 0, 0, 0}, //U
			{139, 104, 71, 54, 0, 0, 0, 0, 0, 0, 0, 0}, //V
			{152, 111, 75, 55, 0, 0, 0, 0, 0, 0, 0, 0}, //W
			{168, 120, 80, 0, 0, 0, 0, 0, 0, 0, 0, 0}, //X
			{168, 129, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, //Y
			{205, 140, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0} //Z
	};
	//Table 1 - No Decompression Limits and Group Designation Table - Meters
	private int[][] firstDiveMeters = {
			{10, 9, 8, 7, 6, 6, 5, 4, 3, 3, 5, 4}, //A
			{20, 17, 15, 13, 11, 10, 9, 8, 6, 5, 5, 4}, //B
			{26, 23, 19, 17, 15, 13, 12, 10, 8, 7, 6, 6}, //C
			{30, 26, 22, 19, 16, 15, 13, 11, 9, 8, 7, 6}, //D
			{34, 29, 24, 21, 18, 16, 15, 13, 10, 9, 7, 7}, //E
			{37, 32, 27, 23, 20, 18, 16, 14, 11, 9, 8, 8}, //F
			{41, 35, 29, 25, 22, 20, 18, 15, 12, 10, 9, 0}, //G
			{45, 38, 32, 27, 24, 21, 19, 17, 13, 11, 0, 0}, //H
			{50, 42, 35, 29, 26, 23, 21, 18, 14, 12, 0, 0}, //I
			{54, 45, 37, 32, 28, 25, 22, 19, 15, 13, 0, 0}, //J
			{59, 49, 40, 34, 30, 26, 24, 21, 16, 14, 0, 0}, //K
			{64, 53, 43, 37, 32, 28, 25, 22, 17, 0, 0, 0}, //L
			{70, 57, 47, 39, 34, 30, 27, 23, 19, 0, 0, 0}, //M
			{75, 62, 50, 42, 36, 32, 29, 25, 20, 0, 0, 0}, //N
			{82, 66, 53, 45, 39, 34, 30, 26, 0, 0, 0, 0}, //O
			{88, 71, 57, 48, 41, 36, 32, 28, 0, 0, 0, 0}, //P
			{95, 76, 61, 50, 43, 38, 34, 29, 0, 0, 0, 0}, //Q
			{104, 82, 64, 53, 46, 40, 36, 0, 0, 0, 0, 0}, //R
			{112, 88, 68, 56, 48, 42, 37, 0, 0, 0, 0, 0}, //S
			{122, 94, 73, 60, 51, 44, 0, 0, 0, 0, 0, 0}, //T
			{133, 101, 77, 63, 53, 45, 0, 0, 0, 0, 0, 0}, //U
			{145, 108, 82, 67, 55, 0, 0, 0, 0, 0, 0, 0}, //V
			{160, 116, 87, 70, 56, 0, 0, 0, 0, 0, 0, 0}, //W
			{178, 125, 92, 72, 0, 0, 0, 0, 0, 0, 0, 0}, //X
			{199, 134, 98, 0, 0, 0, 0, 0, 0, 0, 0, 0}, //Y
			{219, 147, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0} //Z
	};
	//Table 2 - Surface Interval Credit Table
	private SurfaceIntervalRange[][] surfaceIntervalTime = new SurfaceIntervalRange[26][26];
	//Table 3 - Repetitive Dive Timetable
	private RNTABT[][] repetitiveDiveFeet = new RNTABT[26][11];
	private RNTABT[][] repetitiveDiveMeters = new RNTABT[26][11];
	
	public PADIDiveTable () {
		initializeRepetitiveDiveFeet();
		intializeRepetitiveDiveMeters();
		intializeSurfaceIntervalTime();
	}

	/*
	 * Helper Functions - DO NOT CALL
	 * You should not need to worry about how these are implemented
	 */
	
	private void intializeSurfaceIntervalTime () {
		//Table 2
		//Column 1 (Z, Z)
		for (int i = 0; i < 25; i++)
			surfaceIntervalTime[0][i] = new SurfaceIntervalRange(0, 0);
		surfaceIntervalTime[0][25] = new SurfaceIntervalRange(0, 2);
		
		//Column 2 (Y, Y)
		for (int i = 0; i < 24; i++)
			surfaceIntervalTime[1][i] = new SurfaceIntervalRange(0, 0);
		surfaceIntervalTime[1][24] = new SurfaceIntervalRange(0, 2);
		surfaceIntervalTime[1][25] = new SurfaceIntervalRange(3, 5);
		
		//Column 3 (X, X)
		for (int i = 0; i < 23; i++)
			surfaceIntervalTime[2][i] = new SurfaceIntervalRange(0, 0);
		surfaceIntervalTime[2][23] = new SurfaceIntervalRange(0, 2);
		surfaceIntervalTime[2][24] = new SurfaceIntervalRange(3, 5);
		surfaceIntervalTime[2][25] = new SurfaceIntervalRange(6, 8);
		
		//Column 4 (W, W)
		for (int i = 0; i < 22; i++)
			surfaceIntervalTime[3][i] = new SurfaceIntervalRange(0, 0);
		surfaceIntervalTime[3][22] = new SurfaceIntervalRange(0, 2);
		surfaceIntervalTime[3][23] = new SurfaceIntervalRange(3, 5);
		surfaceIntervalTime[3][24] = new SurfaceIntervalRange(6, 8);
		surfaceIntervalTime[3][25] = new SurfaceIntervalRange(9, 11);

		//Column 4 (V, V)
		for (int i = 0; i < 21; i++)
			surfaceIntervalTime[4][i] = new SurfaceIntervalRange(0, 0);
		surfaceIntervalTime[4][21] = new SurfaceIntervalRange(0, 2);
		surfaceIntervalTime[4][22] = new SurfaceIntervalRange(3, 5);
		surfaceIntervalTime[4][23] = new SurfaceIntervalRange(6, 8);
		surfaceIntervalTime[4][24] = new SurfaceIntervalRange(9, 11);
		surfaceIntervalTime[4][25] = new SurfaceIntervalRange(12, 14);
		
		//Column 4 (U, U)
		for (int i = 0; i < 20; i++)
			surfaceIntervalTime[5][i] = new SurfaceIntervalRange(0, 0);
		surfaceIntervalTime[5][20] = new SurfaceIntervalRange(0, 2);
		surfaceIntervalTime[5][21] = new SurfaceIntervalRange(3, 5);
		surfaceIntervalTime[5][22] = new SurfaceIntervalRange(6, 8);
		surfaceIntervalTime[5][23] = new SurfaceIntervalRange(9, 11);
		surfaceIntervalTime[5][24] = new SurfaceIntervalRange(12, 14);
		surfaceIntervalTime[5][25] = new SurfaceIntervalRange(15, 17);

		//Column 4 (T, T)
		for (int i = 0; i < 19; i++)
			surfaceIntervalTime[6][i] = new SurfaceIntervalRange(0, 0);
		surfaceIntervalTime[6][19] = new SurfaceIntervalRange(0, 2);
		surfaceIntervalTime[6][20] = new SurfaceIntervalRange(3, 6);
		surfaceIntervalTime[6][21] = new SurfaceIntervalRange(6, 9);
		surfaceIntervalTime[6][22] = new SurfaceIntervalRange(9, 12);
		surfaceIntervalTime[6][23] = new SurfaceIntervalRange(12, 15);
		surfaceIntervalTime[6][24] = new SurfaceIntervalRange(15, 18);
		surfaceIntervalTime[6][25] = new SurfaceIntervalRange(18, 20);
		

		//Column 4 (S, S)
		for (int i = 0; i < 18; i++)
			surfaceIntervalTime[7][i] = new SurfaceIntervalRange(0, 0);
		surfaceIntervalTime[7][18] = new SurfaceIntervalRange(0, 3);
		surfaceIntervalTime[7][19] = new SurfaceIntervalRange(3, 6);
		surfaceIntervalTime[7][20] = new SurfaceIntervalRange(7, 9);
		surfaceIntervalTime[7][21] = new SurfaceIntervalRange(10, 12);
		surfaceIntervalTime[7][22] = new SurfaceIntervalRange(13, 15);
		surfaceIntervalTime[7][23] = new SurfaceIntervalRange(16, 18);
		surfaceIntervalTime[7][24] = new SurfaceIntervalRange(19, 21);
		surfaceIntervalTime[7][25] = new SurfaceIntervalRange(21, 24);

		//Column 4 (R, R)
		for (int i = 0; i < 17; i++)
			surfaceIntervalTime[8][i] = new SurfaceIntervalRange(0, 0);
		surfaceIntervalTime[8][17] = new SurfaceIntervalRange(0, 3);
		surfaceIntervalTime[8][18] = new SurfaceIntervalRange(4, 6);
		surfaceIntervalTime[8][19] = new SurfaceIntervalRange(7, 10);
		surfaceIntervalTime[8][20] = new SurfaceIntervalRange(10, 13);
		surfaceIntervalTime[8][21] = new SurfaceIntervalRange(13, 16);
		surfaceIntervalTime[8][22] = new SurfaceIntervalRange(16, 19);
		surfaceIntervalTime[8][23] = new SurfaceIntervalRange(19, 22);
		surfaceIntervalTime[8][24] = new SurfaceIntervalRange(22, 25);
		surfaceIntervalTime[8][25] = new SurfaceIntervalRange(25, 28);

		//Column 4 (Q, Q)
		for (int i = 0; i < 16; i++)
			surfaceIntervalTime[9][i] = new SurfaceIntervalRange(0, 0);
		surfaceIntervalTime[9][16] = new SurfaceIntervalRange(0, 3);
		surfaceIntervalTime[9][17] = new SurfaceIntervalRange(4, 7);
		surfaceIntervalTime[9][18] = new SurfaceIntervalRange(7, 10);
		surfaceIntervalTime[9][19] = new SurfaceIntervalRange(11, 13);
		surfaceIntervalTime[9][20] = new SurfaceIntervalRange(14, 17);
		surfaceIntervalTime[9][21] = new SurfaceIntervalRange(17, 20);
		surfaceIntervalTime[9][22] = new SurfaceIntervalRange(20, 23);
		surfaceIntervalTime[9][23] = new SurfaceIntervalRange(23, 26);
		surfaceIntervalTime[9][24] = new SurfaceIntervalRange(26, 29);
		surfaceIntervalTime[9][25] = new SurfaceIntervalRange(29, 31);

		//Column 4 (P, P)
		for (int i = 0; i < 15; i++)
			surfaceIntervalTime[10][i] = new SurfaceIntervalRange(0, 0);
		surfaceIntervalTime[10][15] = new SurfaceIntervalRange(0, 3);
		surfaceIntervalTime[10][16] = new SurfaceIntervalRange(4, 7);
		surfaceIntervalTime[10][17] = new SurfaceIntervalRange(8, 11);
		surfaceIntervalTime[10][18] = new SurfaceIntervalRange(11, 14);
		surfaceIntervalTime[10][19] = new SurfaceIntervalRange(14, 17);
		surfaceIntervalTime[10][20] = new SurfaceIntervalRange(18, 21);
		surfaceIntervalTime[10][21] = new SurfaceIntervalRange(21, 24);
		surfaceIntervalTime[10][22] = new SurfaceIntervalRange(24, 27);
		surfaceIntervalTime[10][23] = new SurfaceIntervalRange(27, 30);
		surfaceIntervalTime[10][24] = new SurfaceIntervalRange(30, 33);
		surfaceIntervalTime[10][25] = new SurfaceIntervalRange(32, 35);

		//Column 4 (O, O)
		for (int i = 0; i < 14; i++)
			surfaceIntervalTime[11][i] = new SurfaceIntervalRange(0, 0);
		surfaceIntervalTime[11][14] = new SurfaceIntervalRange(0, 3);
		surfaceIntervalTime[11][15] = new SurfaceIntervalRange(4, 7);
		surfaceIntervalTime[11][16] = new SurfaceIntervalRange(8, 11);
		surfaceIntervalTime[11][17] = new SurfaceIntervalRange(12, 15);
		surfaceIntervalTime[11][18] = new SurfaceIntervalRange(15, 18);
		surfaceIntervalTime[11][19] = new SurfaceIntervalRange(18, 22);
		surfaceIntervalTime[11][20] = new SurfaceIntervalRange(22, 25);
		surfaceIntervalTime[11][21] = new SurfaceIntervalRange(25, 28);
		surfaceIntervalTime[11][22] = new SurfaceIntervalRange(28, 31);
		surfaceIntervalTime[11][23] = new SurfaceIntervalRange(31, 34);
		surfaceIntervalTime[11][24] = new SurfaceIntervalRange(34, 37);
		surfaceIntervalTime[11][25] = new SurfaceIntervalRange(36, 40);

		//Column 4 (N, N)
		for (int i = 0; i < 13; i++)
			surfaceIntervalTime[12][i] = new SurfaceIntervalRange(0, 0);
		surfaceIntervalTime[12][13] = new SurfaceIntervalRange(0, 3);
		surfaceIntervalTime[12][14] = new SurfaceIntervalRange(4, 8);
		surfaceIntervalTime[12][15] = new SurfaceIntervalRange(8, 12);
		surfaceIntervalTime[12][16] = new SurfaceIntervalRange(12, 16);
		surfaceIntervalTime[12][17] = new SurfaceIntervalRange(16, 19);
		surfaceIntervalTime[12][18] = new SurfaceIntervalRange(19, 23);
		surfaceIntervalTime[12][19] = new SurfaceIntervalRange(23, 26);
		surfaceIntervalTime[12][20] = new SurfaceIntervalRange(26, 29);
		surfaceIntervalTime[12][21] = new SurfaceIntervalRange(29, 33);
		surfaceIntervalTime[12][22] = new SurfaceIntervalRange(32, 36);
		surfaceIntervalTime[12][23] = new SurfaceIntervalRange(35, 39);
		surfaceIntervalTime[12][24] = new SurfaceIntervalRange(38, 41);
		surfaceIntervalTime[12][25] = new SurfaceIntervalRange(41, 44);

		//Column 4 (M, M)
		for (int i = 0; i < 12; i++)
			surfaceIntervalTime[13][i] = new SurfaceIntervalRange(0, 0);
		surfaceIntervalTime[13][12] = new SurfaceIntervalRange(0, 4);
		surfaceIntervalTime[13][13] = new SurfaceIntervalRange(4, 8);
		surfaceIntervalTime[13][14] = new SurfaceIntervalRange(9, 12);
		surfaceIntervalTime[13][15] = new SurfaceIntervalRange(13, 16);
		surfaceIntervalTime[13][16] = new SurfaceIntervalRange(17, 20);
		surfaceIntervalTime[13][17] = new SurfaceIntervalRange(20, 24);
		surfaceIntervalTime[13][18] = new SurfaceIntervalRange(24, 27);
		surfaceIntervalTime[13][19] = new SurfaceIntervalRange(27, 31);
		surfaceIntervalTime[13][20] = new SurfaceIntervalRange(30, 34);
		surfaceIntervalTime[13][21] = new SurfaceIntervalRange(34, 37);
		surfaceIntervalTime[13][22] = new SurfaceIntervalRange(37, 40);
		surfaceIntervalTime[13][23] = new SurfaceIntervalRange(40, 43);
		surfaceIntervalTime[13][24] = new SurfaceIntervalRange(42, 46);
		surfaceIntervalTime[13][25] = new SurfaceIntervalRange(45, 49);

		//Column 4 (L, L)
		for (int i = 0; i < 11; i++)
			surfaceIntervalTime[14][i] = new SurfaceIntervalRange(0, 0);
		surfaceIntervalTime[14][11] = new SurfaceIntervalRange(0, 4);
		surfaceIntervalTime[14][12] = new SurfaceIntervalRange(5, 9);
		surfaceIntervalTime[14][13] = new SurfaceIntervalRange(9, 13);
		surfaceIntervalTime[14][14] = new SurfaceIntervalRange(13, 17);
		surfaceIntervalTime[14][15] = new SurfaceIntervalRange(17, 21);
		surfaceIntervalTime[14][16] = new SurfaceIntervalRange(21, 25);
		surfaceIntervalTime[14][17] = new SurfaceIntervalRange(25, 29);
		surfaceIntervalTime[14][18] = new SurfaceIntervalRange(28, 32);
		surfaceIntervalTime[14][19] = new SurfaceIntervalRange(32, 36);
		surfaceIntervalTime[14][20] = new SurfaceIntervalRange(35, 39);
		surfaceIntervalTime[14][21] = new SurfaceIntervalRange(38, 42);
		surfaceIntervalTime[14][22] = new SurfaceIntervalRange(41, 45);
		surfaceIntervalTime[14][23] = new SurfaceIntervalRange(44, 48);
		surfaceIntervalTime[14][24] = new SurfaceIntervalRange(47, 51);
		surfaceIntervalTime[14][25] = new SurfaceIntervalRange(50, 54);

		//Column 4 (K, K)
		for (int i = 0; i < 10; i++)
			surfaceIntervalTime[15][i] = new SurfaceIntervalRange(0, 0);
		surfaceIntervalTime[15][10] = new SurfaceIntervalRange(0, 4);
		surfaceIntervalTime[15][11] = new SurfaceIntervalRange(5, 9);
		surfaceIntervalTime[15][12] = new SurfaceIntervalRange(10, 14);
		surfaceIntervalTime[15][13] = new SurfaceIntervalRange(14, 18);
		surfaceIntervalTime[15][14] = new SurfaceIntervalRange(18, 23);
		surfaceIntervalTime[15][15] = new SurfaceIntervalRange(22, 27);
		surfaceIntervalTime[15][16] = new SurfaceIntervalRange(26, 30);
		surfaceIntervalTime[15][17] = new SurfaceIntervalRange(30, 34);
		surfaceIntervalTime[15][18] = new SurfaceIntervalRange(33, 38);
		surfaceIntervalTime[15][19] = new SurfaceIntervalRange(37, 41);
		surfaceIntervalTime[15][20] = new SurfaceIntervalRange(40, 44);
		surfaceIntervalTime[15][21] = new SurfaceIntervalRange(43, 47);
		surfaceIntervalTime[15][22] = new SurfaceIntervalRange(46, 50);
		surfaceIntervalTime[15][23] = new SurfaceIntervalRange(49, 53);
		surfaceIntervalTime[15][24] = new SurfaceIntervalRange(52, 56);
		surfaceIntervalTime[15][25] = new SurfaceIntervalRange(55, 59);

		//Column 4 (J, J)
		for (int i = 0; i < 9; i++)
			surfaceIntervalTime[16][i] = new SurfaceIntervalRange(0, 0);
		surfaceIntervalTime[16][9] = new SurfaceIntervalRange(0, 5);
		surfaceIntervalTime[16][10] = new SurfaceIntervalRange(5, 10);
		surfaceIntervalTime[16][11] = new SurfaceIntervalRange(10, 15);
		surfaceIntervalTime[16][12] = new SurfaceIntervalRange(15, 19);
		surfaceIntervalTime[16][13] = new SurfaceIntervalRange(19, 24);
		surfaceIntervalTime[16][14] = new SurfaceIntervalRange(24, 28);
		surfaceIntervalTime[16][15] = new SurfaceIntervalRange(28, 32);
		surfaceIntervalTime[16][16] = new SurfaceIntervalRange(31, 36);
		surfaceIntervalTime[16][17] = new SurfaceIntervalRange(35, 40);
		surfaceIntervalTime[16][18] = new SurfaceIntervalRange(39, 43);
		surfaceIntervalTime[16][19] = new SurfaceIntervalRange(42, 47);
		surfaceIntervalTime[16][20] = new SurfaceIntervalRange(45, 50);
		surfaceIntervalTime[16][21] = new SurfaceIntervalRange(48, 53);
		surfaceIntervalTime[16][22] = new SurfaceIntervalRange(51, 56);
		surfaceIntervalTime[16][23] = new SurfaceIntervalRange(54, 59);
		surfaceIntervalTime[16][24] = new SurfaceIntervalRange(57, 62);
		surfaceIntervalTime[16][25] = new SurfaceIntervalRange(60, 65);

		//Column 4 (I, I)
		for (int i = 0; i < 8; i++)
			surfaceIntervalTime[17][i] = new SurfaceIntervalRange(0, 0);
		surfaceIntervalTime[17][8] = new SurfaceIntervalRange(0, 5);
		surfaceIntervalTime[17][9] = new SurfaceIntervalRange(6, 11);
		surfaceIntervalTime[17][10] = new SurfaceIntervalRange(11, 16);
		surfaceIntervalTime[17][11] = new SurfaceIntervalRange(16, 21);
		surfaceIntervalTime[17][12] = new SurfaceIntervalRange(20, 25);
		surfaceIntervalTime[17][13] = new SurfaceIntervalRange(25, 30);
		surfaceIntervalTime[17][14] = new SurfaceIntervalRange(29, 34);
		surfaceIntervalTime[17][15] = new SurfaceIntervalRange(33, 38);
		surfaceIntervalTime[17][16] = new SurfaceIntervalRange(37, 42);
		surfaceIntervalTime[17][17] = new SurfaceIntervalRange(41, 46);
		surfaceIntervalTime[17][18] = new SurfaceIntervalRange(44, 49);
		surfaceIntervalTime[17][19] = new SurfaceIntervalRange(48, 53);
		surfaceIntervalTime[17][20] = new SurfaceIntervalRange(51, 56);
		surfaceIntervalTime[17][21] = new SurfaceIntervalRange(54, 59);
		surfaceIntervalTime[17][22] = new SurfaceIntervalRange(57, 62);
		surfaceIntervalTime[17][23] = new SurfaceIntervalRange(60, 65);
		surfaceIntervalTime[17][24] = new SurfaceIntervalRange(63, 68);
		surfaceIntervalTime[17][25] = new SurfaceIntervalRange(68, 71);

		//Column 4 (H, H)
		for (int i = 0; i < 7; i++)
			surfaceIntervalTime[18][i] = new SurfaceIntervalRange(0, 0);
		surfaceIntervalTime[18][7] = new SurfaceIntervalRange(0, 5);
		surfaceIntervalTime[18][8] = new SurfaceIntervalRange(6, 11);
		surfaceIntervalTime[18][9] = new SurfaceIntervalRange(12, 17);
		surfaceIntervalTime[18][10] = new SurfaceIntervalRange(17, 22);
		surfaceIntervalTime[18][11] = new SurfaceIntervalRange(22, 27);
		surfaceIntervalTime[18][12] = new SurfaceIntervalRange(26, 32);
		surfaceIntervalTime[18][13] = new SurfaceIntervalRange(31, 36);
		surfaceIntervalTime[18][14] = new SurfaceIntervalRange(35, 41);
		surfaceIntervalTime[18][15] = new SurfaceIntervalRange(39, 45);
		surfaceIntervalTime[18][16] = new SurfaceIntervalRange(43, 48);
		surfaceIntervalTime[18][17] = new SurfaceIntervalRange(47, 52);
		surfaceIntervalTime[18][18] = new SurfaceIntervalRange(50, 56);
		surfaceIntervalTime[18][19] = new SurfaceIntervalRange(54, 59);
		surfaceIntervalTime[18][20] = new SurfaceIntervalRange(57, 62);
		surfaceIntervalTime[18][21] = new SurfaceIntervalRange(60, 65);
		surfaceIntervalTime[18][22] = new SurfaceIntervalRange(63, 68);
		surfaceIntervalTime[18][23] = new SurfaceIntervalRange(66, 71);
		surfaceIntervalTime[18][24] = new SurfaceIntervalRange(69, 74);
		surfaceIntervalTime[18][25] = new SurfaceIntervalRange(72, 77);

		//Column 4 (G, G)
		for (int i = 0; i < 6; i++)
			surfaceIntervalTime[19][i] = new SurfaceIntervalRange(0, 0);
		surfaceIntervalTime[19][6] = new SurfaceIntervalRange(0, 6);
		surfaceIntervalTime[19][7] = new SurfaceIntervalRange(6, 12);
		surfaceIntervalTime[19][8] = new SurfaceIntervalRange(12, 18);
		surfaceIntervalTime[19][9] = new SurfaceIntervalRange(18, 24);
		surfaceIntervalTime[19][10] = new SurfaceIntervalRange(23, 29);
		surfaceIntervalTime[19][11] = new SurfaceIntervalRange(28, 34);
		surfaceIntervalTime[19][12] = new SurfaceIntervalRange(33, 39);
		surfaceIntervalTime[19][13] = new SurfaceIntervalRange(37, 43);
		surfaceIntervalTime[19][14] = new SurfaceIntervalRange(42, 47);
		surfaceIntervalTime[19][15] = new SurfaceIntervalRange(46, 51);
		surfaceIntervalTime[19][16] = new SurfaceIntervalRange(49, 55);
		surfaceIntervalTime[19][17] = new SurfaceIntervalRange(53, 59);
		surfaceIntervalTime[19][18] = new SurfaceIntervalRange(57, 63);
		surfaceIntervalTime[19][19] = new SurfaceIntervalRange(60, 66);
		surfaceIntervalTime[19][20] = new SurfaceIntervalRange(63, 69);
		surfaceIntervalTime[19][21] = new SurfaceIntervalRange(66, 72);
		surfaceIntervalTime[19][22] = new SurfaceIntervalRange(69, 75);
		surfaceIntervalTime[19][23] = new SurfaceIntervalRange(72, 78);
		surfaceIntervalTime[19][24] = new SurfaceIntervalRange(75, 81);
		surfaceIntervalTime[19][25] = new SurfaceIntervalRange(78, 84);

		//Column 4 (F, F)
		for (int i = 0; i < 5; i++)
			surfaceIntervalTime[20][i] = new SurfaceIntervalRange(0, 0);
		surfaceIntervalTime[20][5] = new SurfaceIntervalRange(0, 7);
		surfaceIntervalTime[20][6] = new SurfaceIntervalRange(7, 13);
		surfaceIntervalTime[20][7] = new SurfaceIntervalRange(13, 20);
		surfaceIntervalTime[20][8] = new SurfaceIntervalRange(19, 26);
		surfaceIntervalTime[20][9] = new SurfaceIntervalRange(25, 31);
		surfaceIntervalTime[20][10] = new SurfaceIntervalRange(30, 37);
		surfaceIntervalTime[20][11] = new SurfaceIntervalRange(35, 42);
		surfaceIntervalTime[20][12] = new SurfaceIntervalRange(40, 46);
		surfaceIntervalTime[20][13] = new SurfaceIntervalRange(44, 51);
		surfaceIntervalTime[20][14] = new SurfaceIntervalRange(48, 55);
		surfaceIntervalTime[20][15] = new SurfaceIntervalRange(52, 59);
		surfaceIntervalTime[20][16] = new SurfaceIntervalRange(56, 63);
		surfaceIntervalTime[20][17] = new SurfaceIntervalRange(60, 67);
		surfaceIntervalTime[20][18] = new SurfaceIntervalRange(64, 70);
		surfaceIntervalTime[20][19] = new SurfaceIntervalRange(67, 73);
		surfaceIntervalTime[20][20] = new SurfaceIntervalRange(70, 77);
		surfaceIntervalTime[20][21] = new SurfaceIntervalRange(73, 80);
		surfaceIntervalTime[20][22] = new SurfaceIntervalRange(76, 83);
		surfaceIntervalTime[20][23] = new SurfaceIntervalRange(79, 86);
		surfaceIntervalTime[20][24] = new SurfaceIntervalRange(82, 89);
		surfaceIntervalTime[20][25] = new SurfaceIntervalRange(85, 91);

		//Column 4 (E, E)
		for (int i = 0; i < 4; i++)
			surfaceIntervalTime[21][i] = new SurfaceIntervalRange(0, 0);
		surfaceIntervalTime[21][4] = new SurfaceIntervalRange(0, 7);
		surfaceIntervalTime[21][5] = new SurfaceIntervalRange(8, 15);
		surfaceIntervalTime[21][6] = new SurfaceIntervalRange(14, 22);
		surfaceIntervalTime[21][7] = new SurfaceIntervalRange(21, 28);
		surfaceIntervalTime[21][8] = new SurfaceIntervalRange(27, 34);
		surfaceIntervalTime[21][9] = new SurfaceIntervalRange(32, 40);
		surfaceIntervalTime[21][10] = new SurfaceIntervalRange(38, 45);
		surfaceIntervalTime[21][11] = new SurfaceIntervalRange(43, 50);
		surfaceIntervalTime[21][12] = new SurfaceIntervalRange(47, 55);
		surfaceIntervalTime[21][13] = new SurfaceIntervalRange(52, 59);
		surfaceIntervalTime[21][14] = new SurfaceIntervalRange(56, 63);
		surfaceIntervalTime[21][15] = new SurfaceIntervalRange(60, 67);
		surfaceIntervalTime[21][16] = new SurfaceIntervalRange(64, 71);
		surfaceIntervalTime[21][17] = new SurfaceIntervalRange(68, 75);
		surfaceIntervalTime[21][18] = new SurfaceIntervalRange(71, 78);
		surfaceIntervalTime[21][19] = new SurfaceIntervalRange(74, 82);
		surfaceIntervalTime[21][20] = new SurfaceIntervalRange(78, 85);
		surfaceIntervalTime[21][21] = new SurfaceIntervalRange(81, 88);
		surfaceIntervalTime[21][22] = new SurfaceIntervalRange(84, 91);
		surfaceIntervalTime[21][23] = new SurfaceIntervalRange(87, 94);
		surfaceIntervalTime[21][24] = new SurfaceIntervalRange(90, 97);
		surfaceIntervalTime[21][25] = new SurfaceIntervalRange(92, 100);

		//Column 4 (D, D)
		for (int i = 0; i < 3; i++)
			surfaceIntervalTime[22][i] = new SurfaceIntervalRange(0, 0);
		surfaceIntervalTime[22][3] = new SurfaceIntervalRange(0, 8);
		surfaceIntervalTime[22][4] = new SurfaceIntervalRange(8, 16);
		surfaceIntervalTime[22][5] = new SurfaceIntervalRange(16, 24);
		surfaceIntervalTime[22][6] = new SurfaceIntervalRange(23, 31);
		surfaceIntervalTime[22][7] = new SurfaceIntervalRange(29, 37);
		surfaceIntervalTime[22][8] = new SurfaceIntervalRange(35, 43);
		surfaceIntervalTime[22][9] = new SurfaceIntervalRange(41, 49);
		surfaceIntervalTime[22][10] = new SurfaceIntervalRange(46, 54);
		surfaceIntervalTime[22][11] = new SurfaceIntervalRange(51, 59);
		surfaceIntervalTime[22][12] = new SurfaceIntervalRange(56, 64);
		surfaceIntervalTime[22][13] = new SurfaceIntervalRange(60, 68);
		surfaceIntervalTime[22][14] = new SurfaceIntervalRange(64, 72);
		surfaceIntervalTime[22][15] = new SurfaceIntervalRange(68, 76);
		surfaceIntervalTime[22][16] = new SurfaceIntervalRange(72, 80);
		surfaceIntervalTime[22][17] = new SurfaceIntervalRange(76, 84);
		surfaceIntervalTime[22][18] = new SurfaceIntervalRange(79, 87);
		surfaceIntervalTime[22][19] = new SurfaceIntervalRange(83, 91);
		surfaceIntervalTime[22][20] = new SurfaceIntervalRange(86, 94);
		surfaceIntervalTime[22][21] = new SurfaceIntervalRange(89, 97);
		surfaceIntervalTime[22][22] = new SurfaceIntervalRange(92, 100);
		surfaceIntervalTime[22][23] = new SurfaceIntervalRange(95, 103);
		surfaceIntervalTime[22][24] = new SurfaceIntervalRange(98, 106);
		surfaceIntervalTime[22][25] = new SurfaceIntervalRange(101, 109);

		//Column 4 (C, C)
		surfaceIntervalTime[23][0] = new SurfaceIntervalRange(0, 0);
		surfaceIntervalTime[23][1] = new SurfaceIntervalRange(0, 0);
		surfaceIntervalTime[23][2] = new SurfaceIntervalRange(0, 21);
		surfaceIntervalTime[23][3] = new SurfaceIntervalRange(9, 30);
		surfaceIntervalTime[23][4] = new SurfaceIntervalRange(17, 38);
		surfaceIntervalTime[23][5] = new SurfaceIntervalRange(25, 46);
		surfaceIntervalTime[23][6] = new SurfaceIntervalRange(32, 53);
		surfaceIntervalTime[23][7] = new SurfaceIntervalRange(38, 59);
		surfaceIntervalTime[23][8] = new SurfaceIntervalRange(44, 65);
		surfaceIntervalTime[23][9] = new SurfaceIntervalRange(50, 71);
		surfaceIntervalTime[23][10] = new SurfaceIntervalRange(55, 76);
		surfaceIntervalTime[23][11] = new SurfaceIntervalRange(60, 81);
		surfaceIntervalTime[23][12] = new SurfaceIntervalRange(65, 85);
		surfaceIntervalTime[23][13] = new SurfaceIntervalRange(69, 90);
		surfaceIntervalTime[23][14] = new SurfaceIntervalRange(73, 94);
		surfaceIntervalTime[23][15] = new SurfaceIntervalRange(77, 98);
		surfaceIntervalTime[23][16] = new SurfaceIntervalRange(81, 102);
		surfaceIntervalTime[23][17] = new SurfaceIntervalRange(85, 106);
		surfaceIntervalTime[23][18] = new SurfaceIntervalRange(88, 109);
		surfaceIntervalTime[23][19] = new SurfaceIntervalRange(92, 113);
		surfaceIntervalTime[23][20] = new SurfaceIntervalRange(95, 116);
		surfaceIntervalTime[23][21] = new SurfaceIntervalRange(98, 119);
		surfaceIntervalTime[23][22] = new SurfaceIntervalRange(101, 122);
		surfaceIntervalTime[23][23] = new SurfaceIntervalRange(104, 125);
		surfaceIntervalTime[23][24] = new SurfaceIntervalRange(107, 128);
		surfaceIntervalTime[23][25] = new SurfaceIntervalRange(110, 131);

		//Column 4 (B, B)
		surfaceIntervalTime[24][0] = new SurfaceIntervalRange(0, 0);
		surfaceIntervalTime[24][1] = new SurfaceIntervalRange(0, 47);
		surfaceIntervalTime[24][2] = new SurfaceIntervalRange(22, 69);
		surfaceIntervalTime[24][3] = new SurfaceIntervalRange(31, 78);
		surfaceIntervalTime[24][4] = new SurfaceIntervalRange(39, 87);
		surfaceIntervalTime[24][5] = new SurfaceIntervalRange(47, 94);
		surfaceIntervalTime[24][6] = new SurfaceIntervalRange(54, 101);
		surfaceIntervalTime[24][7] = new SurfaceIntervalRange(60, 107);
		surfaceIntervalTime[24][8] = new SurfaceIntervalRange(66, 113);
		surfaceIntervalTime[24][9] = new SurfaceIntervalRange(72, 119);
		surfaceIntervalTime[24][10] = new SurfaceIntervalRange(77, 124);
		surfaceIntervalTime[24][11] = new SurfaceIntervalRange(82, 129);
		surfaceIntervalTime[24][12] = new SurfaceIntervalRange(86, 134);
		surfaceIntervalTime[24][13] = new SurfaceIntervalRange(91, 138);
		surfaceIntervalTime[24][14] = new SurfaceIntervalRange(95, 143);
		surfaceIntervalTime[24][15] = new SurfaceIntervalRange(99, 147);
		surfaceIntervalTime[24][16] = new SurfaceIntervalRange(103, 150);
		surfaceIntervalTime[24][17] = new SurfaceIntervalRange(107, 154);
		surfaceIntervalTime[24][18] = new SurfaceIntervalRange(110, 158);
		surfaceIntervalTime[24][19] = new SurfaceIntervalRange(114, 161);
		surfaceIntervalTime[24][20] = new SurfaceIntervalRange(117, 164);
		surfaceIntervalTime[24][21] = new SurfaceIntervalRange(120, 167);
		surfaceIntervalTime[24][22] = new SurfaceIntervalRange(123, 170);
		surfaceIntervalTime[24][23] = new SurfaceIntervalRange(126, 173);
		surfaceIntervalTime[24][24] = new SurfaceIntervalRange(129, 176);
		surfaceIntervalTime[24][25] = new SurfaceIntervalRange(132, 179);

		//Column 4 (A, A)
		surfaceIntervalTime[25][0] = new SurfaceIntervalRange(0, 180);
		surfaceIntervalTime[25][1] = new SurfaceIntervalRange(48, 228);
		surfaceIntervalTime[25][2] = new SurfaceIntervalRange(70, 250);
		surfaceIntervalTime[25][3] = new SurfaceIntervalRange(79, 259);
		surfaceIntervalTime[25][4] = new SurfaceIntervalRange(88, 268);
		surfaceIntervalTime[25][5] = new SurfaceIntervalRange(95, 275);
		surfaceIntervalTime[25][6] = new SurfaceIntervalRange(102, 282);
		surfaceIntervalTime[25][7] = new SurfaceIntervalRange(108, 288);
		surfaceIntervalTime[25][8] = new SurfaceIntervalRange(114, 294);
		surfaceIntervalTime[25][9] = new SurfaceIntervalRange(120, 300);
		surfaceIntervalTime[25][10] = new SurfaceIntervalRange(125, 305);
		surfaceIntervalTime[25][11] = new SurfaceIntervalRange(130, 310);
		surfaceIntervalTime[25][12] = new SurfaceIntervalRange(135, 315);
		surfaceIntervalTime[25][13] = new SurfaceIntervalRange(139, 319);
		surfaceIntervalTime[25][14] = new SurfaceIntervalRange(144, 324);
		surfaceIntervalTime[25][15] = new SurfaceIntervalRange(148, 328);
		surfaceIntervalTime[25][16] = new SurfaceIntervalRange(151, 331);
		surfaceIntervalTime[25][17] = new SurfaceIntervalRange(155, 335);
		surfaceIntervalTime[25][18] = new SurfaceIntervalRange(159, 339);
		surfaceIntervalTime[25][19] = new SurfaceIntervalRange(162, 342);
		surfaceIntervalTime[25][20] = new SurfaceIntervalRange(165, 345);
		surfaceIntervalTime[25][21] = new SurfaceIntervalRange(168, 348);
		surfaceIntervalTime[25][22] = new SurfaceIntervalRange(171, 351);
		surfaceIntervalTime[25][23] = new SurfaceIntervalRange(174, 354);
		surfaceIntervalTime[25][24] = new SurfaceIntervalRange(177, 357);
		surfaceIntervalTime[25][25] = new SurfaceIntervalRange(180, 360);
	}
	
	private void initializeRepetitiveDiveFeet () {
		//Table 3
		//Column 1 - Z
		repetitiveDiveFeet[0][0] = new RNTABT(205, 0);
		repetitiveDiveFeet[0][1] = new RNTABT(140, 0);
		for (int i = 2; i < 11; i++)
			repetitiveDiveFeet[0][i] = new RNTABT(0, 0);

		//Column 2 - Y
		repetitiveDiveFeet[1][0] = new RNTABT(188, 17);
		repetitiveDiveFeet[1][1] = new RNTABT(129, 11);
		for (int i = 2; i < 11; i++)
			repetitiveDiveFeet[1][i] = new RNTABT(0, 0);

		//Column 3 - X
		repetitiveDiveFeet[2][0] = new RNTABT(168, 37);
		repetitiveDiveFeet[2][1] = new RNTABT(120, 20);
		repetitiveDiveFeet[2][2] = new RNTABT(80, 0);
		for (int i = 3; i < 11; i++)
			repetitiveDiveFeet[2][i] = new RNTABT(0, 0);
		
		//Column 4 - W
		repetitiveDiveFeet[3][0] = new RNTABT(152, 53);
		repetitiveDiveFeet[3][1] = new RNTABT(111, 29);
		repetitiveDiveFeet[3][2] = new RNTABT(75, 5);
		repetitiveDiveFeet[3][3] = new RNTABT(55, 0);
		for (int i = 4; i < 11; i++)
			repetitiveDiveFeet[3][i] = new RNTABT(0, 0);

		//Column 5 - V
		repetitiveDiveFeet[4][0] = new RNTABT(139, 66);
		repetitiveDiveFeet[4][1] = new RNTABT(104, 36);
		repetitiveDiveFeet[4][2] = new RNTABT(71, 9);
		repetitiveDiveFeet[4][3] = new RNTABT(54, 1);
		for (int i = 4; i < 11; i++)
			repetitiveDiveFeet[4][i] = new RNTABT(0, 0);

		//Column 6 - U
		repetitiveDiveFeet[5][0] = new RNTABT(127, 78);
		repetitiveDiveFeet[5][1] = new RNTABT(97, 43);
		repetitiveDiveFeet[5][2] = new RNTABT(67, 13);
		repetitiveDiveFeet[5][3] = new RNTABT(52, 3);
		for (int i = 4; i < 11; i++)
			repetitiveDiveFeet[5][i] = new RNTABT(0, 0);

		//Column 7 - T
		repetitiveDiveFeet[6][0] = new RNTABT(117, 88);
		repetitiveDiveFeet[6][1] = new RNTABT(91, 49);
		repetitiveDiveFeet[6][2] = new RNTABT(63, 17);
		repetitiveDiveFeet[6][3] = new RNTABT(49, 6);
		repetitiveDiveFeet[6][4] = new RNTABT(40, 0);
		for (int i = 5; i < 11; i++)
			repetitiveDiveFeet[6][i] = new RNTABT(0, 0);
		
		//Column 8 - S
		repetitiveDiveFeet[7][0] = new RNTABT(108, 97);
		repetitiveDiveFeet[7][1] = new RNTABT(85, 55);
		repetitiveDiveFeet[7][2] = new RNTABT(60, 20);
		repetitiveDiveFeet[7][3] = new RNTABT(47, 8);
		repetitiveDiveFeet[7][4] = new RNTABT(38, 2);
		for (int i = 5; i < 11; i++)
			repetitiveDiveFeet[7][i] = new RNTABT(0, 0);

		//Column 9 - R
		repetitiveDiveFeet[8][0] = new RNTABT(100, 105);
		repetitiveDiveFeet[8][1] = new RNTABT(79, 61);
		repetitiveDiveFeet[8][2] = new RNTABT(57, 23);
		repetitiveDiveFeet[8][3] = new RNTABT(44, 11);
		repetitiveDiveFeet[8][4] = new RNTABT(36, 4);
		repetitiveDiveFeet[8][5] = new RNTABT(30, 0);
		for (int i = 6; i < 11; i++)
			repetitiveDiveFeet[8][i] = new RNTABT(0, 0);	
		
		//Column 10 - Q
		repetitiveDiveFeet[9][0] = new RNTABT(92, 113);
		repetitiveDiveFeet[9][1] = new RNTABT(74, 66);
		repetitiveDiveFeet[9][2] = new RNTABT(53, 27);
		repetitiveDiveFeet[9][3] = new RNTABT(42, 13);
		repetitiveDiveFeet[9][4] = new RNTABT(34, 6);
		repetitiveDiveFeet[9][5] = new RNTABT(29, 0);
		repetitiveDiveFeet[9][6] = new RNTABT(25, 0);
		for (int i = 7; i < 11; i++)
			repetitiveDiveFeet[9][i] = new RNTABT(0, 0);	
		
		//Column 11 - P
		repetitiveDiveFeet[10][0] = new RNTABT(85, 120);
		repetitiveDiveFeet[10][1] = new RNTABT(69, 71);
		repetitiveDiveFeet[10][2] = new RNTABT(50, 30);
		repetitiveDiveFeet[10][3] = new RNTABT(39, 15);
		repetitiveDiveFeet[10][4] = new RNTABT(33, 7);
		repetitiveDiveFeet[10][5] = new RNTABT(28, 2);
		repetitiveDiveFeet[10][6] = new RNTABT(24, 0);
		for (int i = 7; i < 11; i++)
			repetitiveDiveFeet[10][i] = new RNTABT(0, 0);	

		//Column 12 - O
		repetitiveDiveFeet[11][0] = new RNTABT(79, 126);
		repetitiveDiveFeet[11][1] = new RNTABT(64, 76);
		repetitiveDiveFeet[11][2] = new RNTABT(47, 33);
		repetitiveDiveFeet[11][3] = new RNTABT(37, 18);
		repetitiveDiveFeet[11][4] = new RNTABT(31, 9);
		repetitiveDiveFeet[11][5] = new RNTABT(26, 4);
		repetitiveDiveFeet[11][6] = new RNTABT(23, 2);
		repetitiveDiveFeet[11][7] = new RNTABT(20, 0);
		for (int i = 8; i < 11; i++)
			repetitiveDiveFeet[11][i] = new RNTABT(0, 0);	

		//Column 13 - N
		repetitiveDiveFeet[12][0] = new RNTABT(73, 132);
		repetitiveDiveFeet[12][1] = new RNTABT(60, 80);
		repetitiveDiveFeet[12][2] = new RNTABT(44, 36);
		repetitiveDiveFeet[12][3] = new RNTABT(35, 20);
		repetitiveDiveFeet[12][4] = new RNTABT(29, 11);
		repetitiveDiveFeet[12][5] = new RNTABT(25, 5);
		repetitiveDiveFeet[12][6] = new RNTABT(22, 3);
		repetitiveDiveFeet[12][7] = new RNTABT(19, 0);
		for (int i = 8; i < 11; i++)
			repetitiveDiveFeet[12][i] = new RNTABT(0, 0);	

		//Column 14 - M
		repetitiveDiveFeet[13][0] = new RNTABT(67, 138);
		repetitiveDiveFeet[13][1] = new RNTABT(55, 85);
		repetitiveDiveFeet[13][2] = new RNTABT(41, 39);
		repetitiveDiveFeet[13][3] = new RNTABT(33, 22);
		repetitiveDiveFeet[13][4] = new RNTABT(27, 13);
		repetitiveDiveFeet[13][5] = new RNTABT(23, 7);
		repetitiveDiveFeet[13][6] = new RNTABT(21, 4);
		repetitiveDiveFeet[13][7] = new RNTABT(18, 2);
		repetitiveDiveFeet[13][8] = new RNTABT(16, 0);
		repetitiveDiveFeet[13][9] = new RNTABT(0, 0);	
		repetitiveDiveFeet[13][10] = new RNTABT(0, 0);	

		//Column 15 - L
		repetitiveDiveFeet[14][0] = new RNTABT(62, 143);
		repetitiveDiveFeet[14][1] = new RNTABT(51, 89);
		repetitiveDiveFeet[14][2] = new RNTABT(38, 42);
		repetitiveDiveFeet[14][3] = new RNTABT(31, 24);
		repetitiveDiveFeet[14][4] = new RNTABT(26, 14);
		repetitiveDiveFeet[14][5] = new RNTABT(22, 8);
		repetitiveDiveFeet[14][6] = new RNTABT(19, 6);
		repetitiveDiveFeet[14][7] = new RNTABT(17, 3);
		repetitiveDiveFeet[14][8] = new RNTABT(15, 0);
		repetitiveDiveFeet[14][9] = new RNTABT(0, 0);	
		repetitiveDiveFeet[14][10] = new RNTABT(0, 0);	

		//Column 16 - K
		repetitiveDiveFeet[15][0] = new RNTABT(57, 148);
		repetitiveDiveFeet[15][1] = new RNTABT(48, 92);
		repetitiveDiveFeet[15][2] = new RNTABT(36, 44);
		repetitiveDiveFeet[15][3] = new RNTABT(29, 25);
		repetitiveDiveFeet[15][4] = new RNTABT(24, 16);
		repetitiveDiveFeet[15][5] = new RNTABT(21, 9);
		repetitiveDiveFeet[15][6] = new RNTABT(18, 7);
		repetitiveDiveFeet[15][7] = new RNTABT(16, 4);
		repetitiveDiveFeet[15][8] = new RNTABT(14, 2);
		repetitiveDiveFeet[15][9] = new RNTABT(13, 0);	
		repetitiveDiveFeet[15][10] = new RNTABT(0, 0);	

		//Column 17 - J
		repetitiveDiveFeet[16][0] = new RNTABT(52, 153);
		repetitiveDiveFeet[16][1] = new RNTABT(44, 96);
		repetitiveDiveFeet[16][2] = new RNTABT(33, 47);
		repetitiveDiveFeet[16][3] = new RNTABT(27, 28);
		repetitiveDiveFeet[16][4] = new RNTABT(22, 18);
		repetitiveDiveFeet[16][5] = new RNTABT(19, 11);
		repetitiveDiveFeet[16][6] = new RNTABT(17, 8);
		repetitiveDiveFeet[16][7] = new RNTABT(15, 5);
		repetitiveDiveFeet[16][8] = new RNTABT(14, 2);
		repetitiveDiveFeet[16][9] = new RNTABT(12, 0);	
		repetitiveDiveFeet[16][10] = new RNTABT(0, 0);	

		//Column 18 - I
		repetitiveDiveFeet[17][0] = new RNTABT(48, 157);
		repetitiveDiveFeet[17][1] = new RNTABT(40, 100);
		repetitiveDiveFeet[17][2] = new RNTABT(31, 49);
		repetitiveDiveFeet[17][3] = new RNTABT(25, 30);
		repetitiveDiveFeet[17][4] = new RNTABT(21, 19);
		repetitiveDiveFeet[17][5] = new RNTABT(18, 12);
		repetitiveDiveFeet[17][6] = new RNTABT(16, 9);
		repetitiveDiveFeet[17][7] = new RNTABT(14, 5);
		repetitiveDiveFeet[17][8] = new RNTABT(13, 3);
		repetitiveDiveFeet[17][9] = new RNTABT(12, 0);	
		repetitiveDiveFeet[17][10] = new RNTABT(0, 0);	

		//Column 19 - H
		repetitiveDiveFeet[18][0] = new RNTABT(44, 161);
		repetitiveDiveFeet[18][1] = new RNTABT(37, 103);
		repetitiveDiveFeet[18][2] = new RNTABT(28, 52);
		repetitiveDiveFeet[18][3] = new RNTABT(23, 32);
		repetitiveDiveFeet[18][4] = new RNTABT(19, 21);
		repetitiveDiveFeet[18][5] = new RNTABT(17, 13);
		repetitiveDiveFeet[18][6] = new RNTABT(15, 10);
		repetitiveDiveFeet[18][7] = new RNTABT(13, 7);
		repetitiveDiveFeet[18][8] = new RNTABT(12, 4);
		repetitiveDiveFeet[18][9] = new RNTABT(11, 2);	
		repetitiveDiveFeet[18][10] = new RNTABT(10, 0);	

		//Column 20 - G
		repetitiveDiveFeet[19][0] = new RNTABT(40, 165);
		repetitiveDiveFeet[19][1] = new RNTABT(34, 106);
		repetitiveDiveFeet[19][2] = new RNTABT(26, 54);
		repetitiveDiveFeet[19][3] = new RNTABT(21, 34);
		repetitiveDiveFeet[19][4] = new RNTABT(18, 22);
		repetitiveDiveFeet[19][5] = new RNTABT(15, 15);
		repetitiveDiveFeet[19][6] = new RNTABT(13, 12);
		repetitiveDiveFeet[19][7] = new RNTABT(12, 8);
		repetitiveDiveFeet[19][8] = new RNTABT(11, 5);
		repetitiveDiveFeet[19][9] = new RNTABT(10, 3);	
		repetitiveDiveFeet[19][10] = new RNTABT(9, 0);	

		//Column 21 - F
		repetitiveDiveFeet[20][0] = new RNTABT(36, 169);
		repetitiveDiveFeet[20][1] = new RNTABT(31, 109);
		repetitiveDiveFeet[20][2] = new RNTABT(24, 56);
		repetitiveDiveFeet[20][3] = new RNTABT(19, 36);
		repetitiveDiveFeet[20][4] = new RNTABT(16, 24);
		repetitiveDiveFeet[20][5] = new RNTABT(14, 16);
		repetitiveDiveFeet[20][6] = new RNTABT(12, 13);
		repetitiveDiveFeet[20][7] = new RNTABT(11, 9);
		repetitiveDiveFeet[20][8] = new RNTABT(10, 6);
		repetitiveDiveFeet[20][9] = new RNTABT(9, 4);	
		repetitiveDiveFeet[20][10] = new RNTABT(8, 0);	

		//Column 22 - E
		repetitiveDiveFeet[21][0] = new RNTABT(32, 173);
		repetitiveDiveFeet[21][1] = new RNTABT(27, 113);
		repetitiveDiveFeet[21][2] = new RNTABT(21, 59);
		repetitiveDiveFeet[21][3] = new RNTABT(17, 38);
		repetitiveDiveFeet[21][4] = new RNTABT(15, 25);
		repetitiveDiveFeet[21][5] = new RNTABT(13, 17);
		repetitiveDiveFeet[21][6] = new RNTABT(11, 14);
		repetitiveDiveFeet[21][7] = new RNTABT(10, 10);
		repetitiveDiveFeet[21][8] = new RNTABT(9, 7);
		repetitiveDiveFeet[21][9] = new RNTABT(8, 5);	
		repetitiveDiveFeet[21][10] = new RNTABT(8, 0);	

		//Column 23 - D
		repetitiveDiveFeet[22][0] = new RNTABT(29, 176);
		repetitiveDiveFeet[22][1] = new RNTABT(25, 115);
		repetitiveDiveFeet[22][2] = new RNTABT(19, 61);
		repetitiveDiveFeet[22][3] = new RNTABT(16, 39);
		repetitiveDiveFeet[22][4] = new RNTABT(13, 27);
		repetitiveDiveFeet[22][5] = new RNTABT(11, 19);
		repetitiveDiveFeet[22][6] = new RNTABT(10, 15);
		repetitiveDiveFeet[22][7] = new RNTABT(9, 11);
		repetitiveDiveFeet[22][8] = new RNTABT(8, 8);
		repetitiveDiveFeet[22][9] = new RNTABT(7, 6);	
		repetitiveDiveFeet[22][10] = new RNTABT(7, 3);	

		//Column 24 - C
		repetitiveDiveFeet[23][0] = new RNTABT(25, 180);
		repetitiveDiveFeet[23][1] = new RNTABT(22, 118);
		repetitiveDiveFeet[23][2] = new RNTABT(17, 63);
		repetitiveDiveFeet[23][3] = new RNTABT(14, 41);
		repetitiveDiveFeet[23][4] = new RNTABT(12, 28);
		repetitiveDiveFeet[23][5] = new RNTABT(10, 20);
		repetitiveDiveFeet[23][6] = new RNTABT(9, 16);
		repetitiveDiveFeet[23][7] = new RNTABT(8, 12);
		repetitiveDiveFeet[23][8] = new RNTABT(7, 9);
		repetitiveDiveFeet[23][9] = new RNTABT(6, 7);	
		repetitiveDiveFeet[23][10] = new RNTABT(6, 4);	

		//Column 25 - B
		repetitiveDiveFeet[24][0] = new RNTABT(19, 186);
		repetitiveDiveFeet[24][1] = new RNTABT(16, 124);
		repetitiveDiveFeet[24][2] = new RNTABT(13, 67);
		repetitiveDiveFeet[24][3] = new RNTABT(11, 44);
		repetitiveDiveFeet[24][4] = new RNTABT(9, 31);
		repetitiveDiveFeet[24][5] = new RNTABT(8, 22);
		repetitiveDiveFeet[24][6] = new RNTABT(7, 18);
		repetitiveDiveFeet[24][7] = new RNTABT(6, 14);
		repetitiveDiveFeet[24][8] = new RNTABT(6, 10);
		repetitiveDiveFeet[24][9] = new RNTABT(5, 8);	
		repetitiveDiveFeet[24][10] = new RNTABT(5, 5);	

		//Column 26 - A
		repetitiveDiveFeet[25][0] = new RNTABT(10, 195);
		repetitiveDiveFeet[25][1] = new RNTABT(9, 131);
		repetitiveDiveFeet[25][2] = new RNTABT(7, 73);
		repetitiveDiveFeet[25][3] = new RNTABT(6, 49);
		repetitiveDiveFeet[25][4] = new RNTABT(5, 35);
		repetitiveDiveFeet[25][5] = new RNTABT(4, 26);
		repetitiveDiveFeet[25][6] = new RNTABT(4, 21);
		repetitiveDiveFeet[25][7] = new RNTABT(3, 17);
		repetitiveDiveFeet[25][8] = new RNTABT(3, 13);
		repetitiveDiveFeet[25][9] = new RNTABT(3, 10);	
		repetitiveDiveFeet[25][10] = new RNTABT(3, 7);	
	}

	private void intializeRepetitiveDiveMeters () {
		//Table 3
		//Column 1 - Z
		repetitiveDiveMeters[0][0] = new RNTABT(219, 0);
		repetitiveDiveMeters[0][1] = new RNTABT(147, 0);
		for (int i = 2; i < 11; i++)
			repetitiveDiveMeters[0][i] = new RNTABT(0, 0);

		//Column 2 - Y
		repetitiveDiveMeters[1][0] = new RNTABT(199, 20);
		repetitiveDiveMeters[1][1] = new RNTABT(134, 13);
		repetitiveDiveMeters[1][2] = new RNTABT(98, 0);
		for (int i = 3; i < 11; i++)
			repetitiveDiveMeters[1][i] = new RNTABT(0, 0);

		//Column 3 - X
		repetitiveDiveMeters[2][0] = new RNTABT(178, 41);
		repetitiveDiveMeters[2][1] = new RNTABT(125, 22);
		repetitiveDiveMeters[2][2] = new RNTABT(92, 6);
		repetitiveDiveMeters[2][3] = new RNTABT(72, 0);
		for (int i = 4; i < 11; i++)
			repetitiveDiveMeters[2][i] = new RNTABT(0, 0);
		
		//Column 4 - W
		repetitiveDiveMeters[3][0] = new RNTABT(160, 59);
		repetitiveDiveMeters[3][1] = new RNTABT(116, 31);
		repetitiveDiveMeters[3][2] = new RNTABT(87, 11);
		repetitiveDiveMeters[3][3] = new RNTABT(70, 2);
		repetitiveDiveMeters[3][4] = new RNTABT(56, 0);
		for (int i = 5; i < 11; i++)
			repetitiveDiveMeters[3][i] = new RNTABT(0, 0);

		//Column 5 - V
		repetitiveDiveMeters[4][0] = new RNTABT(145, 74);
		repetitiveDiveMeters[4][1] = new RNTABT(108, 39);
		repetitiveDiveMeters[4][2] = new RNTABT(82, 16);
		repetitiveDiveMeters[4][3] = new RNTABT(67, 5);
		repetitiveDiveMeters[4][4] = new RNTABT(55, 0);
		for (int i = 5; i < 11; i++)
			repetitiveDiveMeters[4][i] = new RNTABT(0, 0);

		//Column 6 - U
		repetitiveDiveMeters[5][0] = new RNTABT(133, 86);
		repetitiveDiveMeters[5][1] = new RNTABT(101, 46);
		repetitiveDiveMeters[5][2] = new RNTABT(77, 21);
		repetitiveDiveMeters[5][3] = new RNTABT(63, 9);
		repetitiveDiveMeters[5][4] = new RNTABT(53, 3);
		repetitiveDiveMeters[5][5] = new RNTABT(45, 0);
		for (int i = 6; i < 11; i++)
			repetitiveDiveMeters[5][i] = new RNTABT(0, 0);

		//Column 7 - T
		repetitiveDiveMeters[6][0] = new RNTABT(122, 97);
		repetitiveDiveMeters[6][1] = new RNTABT(94, 53);
		repetitiveDiveMeters[6][2] = new RNTABT(73, 25);
		repetitiveDiveMeters[6][3] = new RNTABT(60, 12);
		repetitiveDiveMeters[6][4] = new RNTABT(51, 5);
		repetitiveDiveMeters[6][5] = new RNTABT(44, 0);
		for (int i = 6; i < 11; i++)
			repetitiveDiveMeters[6][i] = new RNTABT(0, 0);
		
		//Column 8 - S
		repetitiveDiveMeters[7][0] = new RNTABT(112, 107);
		repetitiveDiveMeters[7][1] = new RNTABT(88, 59);
		repetitiveDiveMeters[7][2] = new RNTABT(68, 30);
		repetitiveDiveMeters[7][3] = new RNTABT(56, 16);
		repetitiveDiveMeters[7][4] = new RNTABT(48, 8);
		repetitiveDiveMeters[7][5] = new RNTABT(42, 3);
		repetitiveDiveMeters[7][6] = new RNTABT(37, 0);
		for (int i = 7; i < 11; i++)
			repetitiveDiveMeters[7][i] = new RNTABT(0, 0);

		//Column 9 - R
		repetitiveDiveMeters[8][0] = new RNTABT(104, 115);
		repetitiveDiveMeters[8][1] = new RNTABT(82, 65);
		repetitiveDiveMeters[8][2] = new RNTABT(64, 34);
		repetitiveDiveMeters[8][3] = new RNTABT(53, 19);
		repetitiveDiveMeters[8][4] = new RNTABT(46, 10);
		repetitiveDiveMeters[8][5] = new RNTABT(40, 5);
		repetitiveDiveMeters[8][6] = new RNTABT(36, 0);
		for (int i = 7; i < 11; i++)
			repetitiveDiveMeters[8][i] = new RNTABT(0, 0);	
		
		//Column 10 - Q
		repetitiveDiveMeters[9][0] = new RNTABT(95, 124);
		repetitiveDiveMeters[9][1] = new RNTABT(76, 71);
		repetitiveDiveMeters[9][2] = new RNTABT(61, 37);
		repetitiveDiveMeters[9][3] = new RNTABT(50, 22);
		repetitiveDiveMeters[9][4] = new RNTABT(43, 13);
		repetitiveDiveMeters[9][5] = new RNTABT(38, 7);
		repetitiveDiveMeters[9][6] = new RNTABT(34, 3);
		repetitiveDiveMeters[9][7] = new RNTABT(29, 0);
		for (int i = 8; i < 11; i++)
			repetitiveDiveMeters[9][i] = new RNTABT(0, 0);	
		
		//Column 11 - P
		repetitiveDiveMeters[10][0] = new RNTABT(88, 131);
		repetitiveDiveMeters[10][1] = new RNTABT(71, 76);
		repetitiveDiveMeters[10][2] = new RNTABT(57, 41);
		repetitiveDiveMeters[10][3] = new RNTABT(48, 24);
		repetitiveDiveMeters[10][4] = new RNTABT(41, 15);
		repetitiveDiveMeters[10][5] = new RNTABT(36, 9);
		repetitiveDiveMeters[10][6] = new RNTABT(32, 5);
		repetitiveDiveMeters[10][7] = new RNTABT(28, 0);
		for (int i = 8; i < 11; i++)
			repetitiveDiveMeters[10][i] = new RNTABT(0, 0);	

		//Column 12 - O
		repetitiveDiveMeters[11][0] = new RNTABT(82, 137);
		repetitiveDiveMeters[11][1] = new RNTABT(66, 81);
		repetitiveDiveMeters[11][2] = new RNTABT(53, 45);
		repetitiveDiveMeters[11][3] = new RNTABT(45, 27);
		repetitiveDiveMeters[11][4] = new RNTABT(39, 17);
		repetitiveDiveMeters[11][5] = new RNTABT(34, 11);
		repetitiveDiveMeters[11][6] = new RNTABT(30, 7);
		repetitiveDiveMeters[11][7] = new RNTABT(26, 3);
		for (int i = 8; i < 11; i++)
			repetitiveDiveMeters[11][i] = new RNTABT(0, 0);	

		//Column 13 - N
		repetitiveDiveMeters[12][0] = new RNTABT(75, 144);
		repetitiveDiveMeters[12][1] = new RNTABT(62, 85);
		repetitiveDiveMeters[12][2] = new RNTABT(50, 48);
		repetitiveDiveMeters[12][3] = new RNTABT(42, 30);
		repetitiveDiveMeters[12][4] = new RNTABT(36, 20);
		repetitiveDiveMeters[12][5] = new RNTABT(32, 13);
		repetitiveDiveMeters[12][6] = new RNTABT(29, 8);
		repetitiveDiveMeters[12][7] = new RNTABT(25, 4);
		repetitiveDiveMeters[12][8] = new RNTABT(20, 0);
		for (int i = 9; i < 11; i++)
			repetitiveDiveMeters[12][i] = new RNTABT(0, 0);	

		//Column 14 - M
		repetitiveDiveMeters[13][0] = new RNTABT(70, 149);
		repetitiveDiveMeters[13][1] = new RNTABT(57, 90);
		repetitiveDiveMeters[13][2] = new RNTABT(47, 51);
		repetitiveDiveMeters[13][3] = new RNTABT(39, 33);
		repetitiveDiveMeters[13][4] = new RNTABT(34, 22);
		repetitiveDiveMeters[13][5] = new RNTABT(30, 15);
		repetitiveDiveMeters[13][6] = new RNTABT(27, 10);
		repetitiveDiveMeters[13][7] = new RNTABT(23, 6);
		repetitiveDiveMeters[13][8] = new RNTABT(19, 0);
		repetitiveDiveMeters[13][9] = new RNTABT(0, 0);	
		repetitiveDiveMeters[13][10] = new RNTABT(0, 0);	

		//Column 15 - L
		repetitiveDiveMeters[14][0] = new RNTABT(64, 155);
		repetitiveDiveMeters[14][1] = new RNTABT(53, 94);
		repetitiveDiveMeters[14][2] = new RNTABT(43, 55);
		repetitiveDiveMeters[14][3] = new RNTABT(37, 35);
		repetitiveDiveMeters[14][4] = new RNTABT(32, 24);
		repetitiveDiveMeters[14][5] = new RNTABT(28, 17);
		repetitiveDiveMeters[14][6] = new RNTABT(25, 12);
		repetitiveDiveMeters[14][7] = new RNTABT(22, 7);
		repetitiveDiveMeters[14][8] = new RNTABT(17, 3);
		repetitiveDiveMeters[14][9] = new RNTABT(0, 0);	
		repetitiveDiveMeters[14][10] = new RNTABT(0, 0);	

		//Column 16 - K
		repetitiveDiveMeters[15][0] = new RNTABT(59, 160);
		repetitiveDiveMeters[15][1] = new RNTABT(49, 98);
		repetitiveDiveMeters[15][2] = new RNTABT(40, 58);
		repetitiveDiveMeters[15][3] = new RNTABT(34, 38);
		repetitiveDiveMeters[15][4] = new RNTABT(30, 26);
		repetitiveDiveMeters[15][5] = new RNTABT(26, 19);
		repetitiveDiveMeters[15][6] = new RNTABT(24, 1);
		repetitiveDiveMeters[15][7] = new RNTABT(21, 8);
		repetitiveDiveMeters[15][8] = new RNTABT(16, 4);
		repetitiveDiveMeters[15][9] = new RNTABT(14, 0);	
		repetitiveDiveMeters[15][10] = new RNTABT(0, 0);	

		//Column 17 - J
		repetitiveDiveMeters[16][0] = new RNTABT(54, 165);
		repetitiveDiveMeters[16][1] = new RNTABT(45, 102);
		repetitiveDiveMeters[16][2] = new RNTABT(37, 61);
		repetitiveDiveMeters[16][3] = new RNTABT(32, 40);
		repetitiveDiveMeters[16][4] = new RNTABT(28, 28);
		repetitiveDiveMeters[16][5] = new RNTABT(25, 20);
		repetitiveDiveMeters[16][6] = new RNTABT(22, 15);
		repetitiveDiveMeters[16][7] = new RNTABT(19, 10);
		repetitiveDiveMeters[16][8] = new RNTABT(15, 5);
		repetitiveDiveMeters[16][9] = new RNTABT(13, 0);	
		repetitiveDiveMeters[16][10] = new RNTABT(0, 0);	

		//Column 18 - I
		repetitiveDiveMeters[17][0] = new RNTABT(50, 169);
		repetitiveDiveMeters[17][1] = new RNTABT(42, 105);
		repetitiveDiveMeters[17][2] = new RNTABT(35, 63);
		repetitiveDiveMeters[17][3] = new RNTABT(29, 43);
		repetitiveDiveMeters[17][4] = new RNTABT(26, 30);
		repetitiveDiveMeters[17][5] = new RNTABT(23, 22);
		repetitiveDiveMeters[17][6] = new RNTABT(21, 16);
		repetitiveDiveMeters[17][7] = new RNTABT(18, 11);
		repetitiveDiveMeters[17][8] = new RNTABT(14, 6);
		repetitiveDiveMeters[17][9] = new RNTABT(12, 0);	
		repetitiveDiveMeters[17][10] = new RNTABT(0, 0);	

		//Column 19 - H
		repetitiveDiveMeters[18][0] = new RNTABT(45, 174);
		repetitiveDiveMeters[18][1] = new RNTABT(38, 109);
		repetitiveDiveMeters[18][2] = new RNTABT(32, 66);
		repetitiveDiveMeters[18][3] = new RNTABT(27, 45);
		repetitiveDiveMeters[18][4] = new RNTABT(24, 32);
		repetitiveDiveMeters[18][5] = new RNTABT(21, 24);
		repetitiveDiveMeters[18][6] = new RNTABT(19, 18);
		repetitiveDiveMeters[18][7] = new RNTABT(17, 12);
		repetitiveDiveMeters[18][8] = new RNTABT(13, 7);
		repetitiveDiveMeters[18][9] = new RNTABT(11, 3);	
		repetitiveDiveMeters[18][10] = new RNTABT(0, 0);	

		//Column 20 - G
		repetitiveDiveMeters[19][0] = new RNTABT(41, 178);
		repetitiveDiveMeters[19][1] = new RNTABT(35, 112);
		repetitiveDiveMeters[19][2] = new RNTABT(29, 69);
		repetitiveDiveMeters[19][3] = new RNTABT(25, 47);
		repetitiveDiveMeters[19][4] = new RNTABT(22, 34);
		repetitiveDiveMeters[19][5] = new RNTABT(20, 25);
		repetitiveDiveMeters[19][6] = new RNTABT(18, 19);
		repetitiveDiveMeters[19][7] = new RNTABT(15, 14);
		repetitiveDiveMeters[19][8] = new RNTABT(12, 8);
		repetitiveDiveMeters[19][9] = new RNTABT(10, 4);	
		repetitiveDiveMeters[19][10] = new RNTABT(9, 0);	

		//Column 21 - F
		repetitiveDiveMeters[20][0] = new RNTABT(37, 182);
		repetitiveDiveMeters[20][1] = new RNTABT(32, 115);
		repetitiveDiveMeters[20][2] = new RNTABT(27, 71);
		repetitiveDiveMeters[20][3] = new RNTABT(23, 49);
		repetitiveDiveMeters[20][4] = new RNTABT(20, 36);
		repetitiveDiveMeters[20][5] = new RNTABT(18, 27);
		repetitiveDiveMeters[20][6] = new RNTABT(16, 21);
		repetitiveDiveMeters[20][7] = new RNTABT(14, 15);
		repetitiveDiveMeters[20][8] = new RNTABT(11, 9);
		repetitiveDiveMeters[20][9] = new RNTABT(9, 5);	
		repetitiveDiveMeters[20][10] = new RNTABT(8, 0);	

		//Column 22 - E
		repetitiveDiveMeters[21][0] = new RNTABT(34, 185);
		repetitiveDiveMeters[21][1] = new RNTABT(29, 118);
		repetitiveDiveMeters[21][2] = new RNTABT(24, 74);
		repetitiveDiveMeters[21][3] = new RNTABT(21, 51);
		repetitiveDiveMeters[21][4] = new RNTABT(18, 38);
		repetitiveDiveMeters[21][5] = new RNTABT(16, 29);
		repetitiveDiveMeters[21][6] = new RNTABT(15, 22);
		repetitiveDiveMeters[21][7] = new RNTABT(13, 16);
		repetitiveDiveMeters[21][8] = new RNTABT(10, 10);
		repetitiveDiveMeters[21][9] = new RNTABT(9, 5);	
		repetitiveDiveMeters[21][10] = new RNTABT(7, 0);	

		//Column 23 - D
		repetitiveDiveMeters[22][0] = new RNTABT(30, 189);
		repetitiveDiveMeters[22][1] = new RNTABT(26, 121);
		repetitiveDiveMeters[22][2] = new RNTABT(22, 76);
		repetitiveDiveMeters[22][3] = new RNTABT(19, 53);
		repetitiveDiveMeters[22][4] = new RNTABT(16, 40);
		repetitiveDiveMeters[22][5] = new RNTABT(15, 30);
		repetitiveDiveMeters[22][6] = new RNTABT(13, 24);
		repetitiveDiveMeters[22][7] = new RNTABT(11, 18);
		repetitiveDiveMeters[22][8] = new RNTABT(9, 11);
		repetitiveDiveMeters[22][9] = new RNTABT(8, 6);	
		repetitiveDiveMeters[22][10] = new RNTABT(7, 0);	

		//Column 24 - C
		repetitiveDiveMeters[23][0] = new RNTABT(26, 193);
		repetitiveDiveMeters[23][1] = new RNTABT(23, 124);
		repetitiveDiveMeters[23][2] = new RNTABT(19, 79);
		repetitiveDiveMeters[23][3] = new RNTABT(17, 55);
		repetitiveDiveMeters[23][4] = new RNTABT(15, 41);
		repetitiveDiveMeters[23][5] = new RNTABT(13, 32);
		repetitiveDiveMeters[23][6] = new RNTABT(12, 25);
		repetitiveDiveMeters[23][7] = new RNTABT(10, 19);
		repetitiveDiveMeters[23][8] = new RNTABT(8, 12);
		repetitiveDiveMeters[23][9] = new RNTABT(7, 7);	
		repetitiveDiveMeters[23][10] = new RNTABT(6, 0);	

		//Column 25 - B
		repetitiveDiveMeters[24][0] = new RNTABT(20, 199);
		repetitiveDiveMeters[24][1] = new RNTABT(17, 130);
		repetitiveDiveMeters[24][2] = new RNTABT(15, 83);
		repetitiveDiveMeters[24][3] = new RNTABT(13, 59);
		repetitiveDiveMeters[24][4] = new RNTABT(11, 45);
		repetitiveDiveMeters[24][5] = new RNTABT(10, 35);
		repetitiveDiveMeters[24][6] = new RNTABT(9, 28);
		repetitiveDiveMeters[24][7] = new RNTABT(8, 21);
		repetitiveDiveMeters[24][8] = new RNTABT(6, 14);
		repetitiveDiveMeters[24][9] = new RNTABT(5, 9);	
		repetitiveDiveMeters[24][10] = new RNTABT(5, 4);	

		//Column 26 - A
		repetitiveDiveMeters[25][0] = new RNTABT(10, 209);
		repetitiveDiveMeters[25][1] = new RNTABT(9, 138);
		repetitiveDiveMeters[25][2] = new RNTABT(8, 90);
		repetitiveDiveMeters[25][3] = new RNTABT(7, 65);
		repetitiveDiveMeters[25][4] = new RNTABT(6, 50);
		repetitiveDiveMeters[25][5] = new RNTABT(6, 39);
		repetitiveDiveMeters[25][6] = new RNTABT(5, 32);
		repetitiveDiveMeters[25][7] = new RNTABT(4, 25);
		repetitiveDiveMeters[25][8] = new RNTABT(3, 17);
		repetitiveDiveMeters[25][9] = new RNTABT(3, 11);	
		repetitiveDiveMeters[25][10] = new RNTABT(2, 7);	
	}

	public int getIndexDepthFeet (int depth) {
		int index;
		boolean valid = false;
		for (index = 0; index < 12; index++) {
			if (depth <= depthFeet[index]) {
				valid = true;
				break; //get column of table 1
			}
		}
		if (!valid) {
			return -1; //error - out of range
		}
		return index;
	}

	public int getIndexDepthMeters (int depth) {
		int index;
		boolean valid = false;
		for (index = 0; index < 12; index++) {
			if (depth <= depthMeters[index]) {
				valid = true;
				break; //get column of table 1
			}
		}
		if (!valid) {
			return -1; //error - out of range
		}
		return index;
	}

	//returns the index in letterGroup of a given letter
	//letter must be A - L
	public int getLetterNumber (char letter) {
		int index;
		boolean valid = false;
		for (index = 0; index < 26; index++) { //replace loop with direct mapping to numbers? Switch statement?
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
		int ind = getLetterNumber(group);
		if (ind == -1) {
			return '1'; //error - out of range
		}
		int col = 25 - ind;
		int row = getIndexDepthFeet (depth);
		if (row == -1) {
			return '1'; //error - depth out of range
		}
		int rnt = repetitiveDiveFeet[col][row].getRNT();
		int abt = repetitiveDiveFeet[col][row].getABT();
		if (minutes > abt) {
			return '1'; //error - minutes out of range
		}
		return rnt + minutes;
	}
	
	public int getTotalDiveTimeMeters (char group, int depth, int minutes){
		int ind = getLetterNumber(group);
		if (ind == -1) {
			return '1'; //error - out of range
		}
		int col = 25 - ind;
		int row = getIndexDepthMeters (depth);
		if (row == -1) {
			return '1'; //error - depth out of range
		}
		int rnt = repetitiveDiveMeters[col][row].getRNT();
		int abt = repetitiveDiveMeters[col][row].getABT();
		if (minutes > abt) {
			return '1'; //error - minutes out of range
		}
		return rnt + minutes;
	}
	
	/*
	 * End of helper functions
	 */
	
	//get letter group after first dive, given depth of dive in feet and minutes of bottom time
	//depth must be one of the values in Table 1 exactly. minutes will round up
	public char getLetterGroupFirstDiveFeet (int depth, int minutes) {
		int col = getIndexDepthFeet (depth);
		if (col == -1) {
			return '1'; //error - depth out of range
		}
		
		int row;
		boolean valid = false;
		for (row = 0; row < 26; row++) {
			if (firstDiveFeet[row][col] >= minutes) {
				valid = true;
				break; //get row of table 1
			}
		}
		
		if (!valid) {
			return '1'; //error - out of range
		}
		
		return letterGroup[row]; //return letter group
	}
	
	//get letter group after first dive, given depth of dive in feet and minutes of bottom time
	//depth must be one of the values in Table 1 exactly. minutes will round up
	public char getLetterGroupFirstDiveMeters (int depth, int minutes) {
		int col = getIndexDepthMeters (depth);
		if (col == -1) {
			return '1'; //error - depth out of range
		}
		
		int row;
		boolean valid = false;
		for (row = 0; row < 26; row++) {
			if (firstDiveMeters[row][col] >= minutes) {
				valid = true;
				break; //get row of table 1
			}
		}
		
		if (!valid) {
			return '1'; //error - out of range
		}
		
		return letterGroup[row]; //return letter group
	}
	
	
	//gets the letter group after being in a given letter group and being on the surface for this many minutes
	//minutes must be >= 10, letter must be A - L
	public char getLetterGroupSurfaceIntervalTime (char letter, int minutes) {
		int row = getLetterNumber (letter); //get column of Table 2
		if (row == -1) {
			return '1'; //error - out of range
		}
		
		int col;
		boolean valid = false;
		for (col = 0; col < 26; col++) {
			if (minutes < surfaceIntervalTime[col][row].getMax()) {
				valid = true;
				break; //get row of Table 2
			}
		}
		if (!valid) {
			return '2'; //error - minutes out of range - pressure group is now 'none'
		}
		
		return letterGroup[25-col];
	}

	//get the pressure group after a repetitive dive given the starting pressure group,
	//the depth in feet, and the bottom time in minutes
	public char getLetterGroupRepetitiveDiveFeet (char group, int depth, int minutes) {
		int totalDiveTime = getTotalDiveTimeFeet(group, depth, minutes);
		if (totalDiveTime == -1) {
			return '1'; //error
		}
		return getLetterGroupFirstDiveFeet(depth, totalDiveTime);
	}
	
	//get the pressure group after a repetitive dive given the starting pressure group,
	//the depth in meters, and the bottom time in minutes
	public char getLetterGroupRepetitiveDiveMeters (char group, int depth, int minutes) {
		int totalDiveTime = getTotalDiveTimeMeters(group, depth, minutes);
		if (totalDiveTime == -1) {
			return '1'; //error
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
	
	//grey boxes in table 1
	//for all cases where a safety stop is required, the safety stop is at 15 feet for 3 minutes
	public boolean safetyStopRequiredFeet (int depth, int minutes) {
		return (depth >= 100) ||
			(depth <= 35 && minutes >= 139) ||
			(depth > 35 && depth <= 40 && minutes >= 104) ||
			(depth > 40 && depth <= 50 && minutes >= 63) ||
			(depth > 50 && depth <= 60 && minutes >= 47) ||
			(depth > 60 && depth <= 70 && minutes >= 33) ||
			(depth > 70 && depth <= 80 && minutes >= 25) ||
			(depth > 80 && depth <= 90 && minutes >= 21);
	}

	//grey boxes in table 1
	//for all cases where a safety stop is required, the safety stop is at 15 feet for 3 minutes
	public boolean safetyStopRequiredMeters (int depth, int minutes) {
		return (depth >= 30) ||
			(depth <= 10 && minutes >= 145) ||
			(depth >= 10 && depth <= 12 && minutes >= 108) ||
			(depth >= 12 && depth <= 14 && minutes >= 77) ||
			(depth >= 14 && depth <= 16 && minutes >= 60) ||
			(depth >= 16 && depth <= 18 && minutes >= 48) ||
			(depth >= 18 && depth <= 20 && minutes >= 38) ||
			(depth >= 20 && depth <= 22 && minutes >= 30) ||
			(depth >= 22 && depth <= 25 && minutes >= 23);
	}
}
