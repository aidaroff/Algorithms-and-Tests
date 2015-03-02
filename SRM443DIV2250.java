// see problem statement below code
public class SRM443DIV2250 {

	public int[] points(String[] matches) {
		int length = matches[0].length();
		int[] result = new int[length];
		int points = 0;
		char L = 'L';
		char W = 'W';
		char D = 'D';
		//home games
		for(int i = 0; i < length; i++) {
			for(int k = 0; k < length; k++) {
				if(matches[i].charAt(k) == W)
					points += 3;
				else if(matches[i].charAt(k) == D)
					points += 1;
				result[i] += points;
				points = 0;
			}
		}
		//away games
		for(int i = 0; i < length; i++) {
			for(int k = 0; k < length; k++) {
				if(matches[i].charAt(k) == (L))
					points += 3;
				else if(matches[i].charAt(k) == (D))
					points += 1; 
				result[k] += points;
				points = 0;
			}
		}
		return result;
	}

}
// Problem Statement
//     	In soccer, all the major national leagues are conducted in the following way: 



// A league consists of several teams. Over the course of a year, each team must play exactly two matches against each of the other teams - one at its own stadium and one at the opponent's stadium. When a team plays at its own stadium, it is called the "home team" and its opponent is called the "away team". Each match ends in one of three possible results: a home team victory, a draw, or an away team victory. Each time a team wins, it is awarded 3 points. When there's a draw, both teams are awarded 1 point. No points are awarded for a loss. The overall ranking of the teams is based on the total number of points received by each team. 



// You are given a String[] matches. The j-th character of the i-th element of matches denotes the result of the match between team i and team j at team i's stadium. 'W' represents a home team victory, 'D' represents a draw, and 'L' represents an away team victory. All characters on the main diagonal of matches will be '-' because a team never plays against itself. Return a int[] where the i-th element is the total number of points received by the i-th team.
 
// Definition
    	
// Class:	SoccerLeagues
// Method:	points
// Parameters:	String[]
// Returns:	int[]
// Method signature:	int[] points(String[] matches)
// (be sure your method is public)
    
 
// Constraints
// -	matches will contain exactly n elements, where n is between 2 and 50, inclusive.
// -	Each element of matches will contain exactly n characters.
// -	matches will contain only '-','W','D' and 'L' characters.
// -	For all i, the i-th character of the i-th element of matches will be '-', and no other characters will be '-'.
 
// Examples
// 0)	
    	
// {"-WW",
//  "W-W",
//  "WW-"}
// Returns: {6, 6, 6 }
// There are 3 teams in the league, and in all matches the home team has won.
// 1)	
    	
// {"-DD",
//  "L-L",
//  "WD-"}
// Returns: {5, 2, 8 }
// This time, the first team has 1 win and 2 draws, the second one has 2 draws and the third has 2 wins and 2 draws.
// 2)	
    	
// {"-DWWD",
//  "L-WLL",
//  "DD-WD",
//  "DDL-L",
//  "DDLL-"}
// Returns: {14, 7, 12, 8, 10 }
// 3)	
    	
// {"-LWWLWDLDWWWWWWDDWDW",
//  "D-WWLDDWDWDLWDDWLWDD",
//  "LL-DLDWDLDLDWWWLWDDW",
//  "LDD-LLLDLWLWWWWDWDWL",
//  "LWWW-DWDLWDWDWWWDWDW",
//  "DLLWD-WWLLDDDLWWDWWW",
//  "WWLWDL-LLDWWWWWDWWLW",
//  "LLLLLDW-LDLWDDLLLDWL",
//  "DWWWWDDD-DWWWWDWWWDW",
//  "WWWWLLLWL-LWWWWWLWWW",
//  "DWWWWWWWLW-WDWWWWWWW",
//  "DDDLLLDWWWL-DDWDWLDD",
//  "LWLWLDLLLDLW-DDDWWDD",
//  "LLWWLWDDLWLWL-WWWDLL",
//  "WWWWLLDDDWLWDD-WWWLW",
//  "DLDLLLWWLLLWWLW-DWLL",
//  "DLWWWLDLWWDWWDWL-WWD",
//  "LLDDLLWLLWLWLDLWW-WW",
//  "LLWLLLWWLWLWWDWWLD-W",
//  "LLWDLWDWDWLLWWDDWWL-"}
// Returns: 
// {72, 62, 41, 41, 83, 63, 53, 35, 86, 50, 90, 32, 34, 41, 45, 36, 51, 32, 51, 45 }
// This is the actual table for the latest season's Barclaycard Premiership with the teams sorted alphabetically.
// This problem statement is the exclusive and proprietary property of TopCoder, Inc. Any unauthorized use or reproduction of this information without the prior written consent of TopCoder, Inc. is strictly prohibited. (c)2010, TopCoder, Inc. All rights reserved.




// This problem was used for: 
//        Single Round Match 443 Round 1 - Division II, Level One