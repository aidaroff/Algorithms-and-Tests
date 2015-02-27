/*
	Author of problem solution: Alibek Aidarov
	See problem statement after line 53.
	Disclaimer: This problem statement is the exclusive and proprietary property of TopCoder, Inc.
	No copyright infringement intended. 
	Links:
	http://community.topcoder.com/stat?c=problem_statement&pm=8743&rd=12169
	topcoder.com
*/

public class BreakingTheCode {

	public String decodingEncoding(String code, String message) {
		String result = ""; 
		int[] array_of_ints = new int[message.length()/2];
		String[] array_of_strings = new String[message.length()/2];
		
		//check if message contains digits
		//if yes, decode
		if(Character.isDigit(message.charAt(0))) {

			int y = 0;
			int k = 0;
			char[] c = new char[2];
			for(int i = 0; i < message.length(); i++) {
				 c[y] = message.charAt(i);
				 if(i%2 == 0) y++;
				 else {
					 String s = new String(c);
					 array_of_strings[k++] = s;
					 c = new char[2];
					 y = 0;
				 }
					 
			}
			for(int i = 0; i < array_of_strings.length; i++) {
				array_of_ints[i] = Integer.parseInt(array_of_strings[i]);
			}
			for(int i = 0; i < array_of_ints.length; i++) {
				result += Character.toString(code.charAt(array_of_ints[i] - 1));
			}
			
		} 
		// if not, encode
		else {
			for(int i = 0; i < message.length(); i++) {
				int int_result = code.indexOf(message.charAt(i)) + 1;
				if(int_result >= 0 && int_result < 10) {
					result += "0" + Integer.toString(int_result);
				}
				else
					result += Integer.toString(int_result);
			}
		}
		return result;
	}
	
}

/*
Problem Statement
    	
You have been given a secret mission where you must break the enemy's code. You have already figured out that they encode messages using the following method. Each letter between 'a' and 'z', inclusive, is assigned a distinct two-digit number between 01 and 26, inclusive. A message is encoded by simply replacing each letter with its assigned number. For example, if 't' is assigned 20, 'e' is assigned 05 and 's' is assigned 19, then the message "test" is encoded as "20051920". All original messages contain only lowercase letters.



You are given a String code containing the assignment of numbers to letters. The first letter of code is assigned 01, the second is assigned 02 and so on. You are also given a String message which is either an original unencoded message or an encoded message. If you are given an unencoded message, return the encoded version of that message, and if you are given an encoded message, return the original unencoded message.

 
Definition
    	
Class:	BreakingTheCode
Method:	decodingEncoding
Parameters:	String, String
Returns:	String
Method signature:	String decodingEncoding(String code, String message)
(be sure your method is public)
    
 
Constraints
-	code will contain exactly 26 characters.
-	Each lowercase letter between 'a' and 'z', inclusive, will occur exactly once in code.
-	message will contain between 1 and 50 characters, inclusive.
-	message will either contain only lowercase letters ('a'-'z') or only digits ('0'-'9').
-	If message contains only digits, it will be a concatenation of two-digit numbers, each between 01 and 26, inclusive.
 
Examples
0)	
    	
"abcdefghijklmnopqrstuvwxyz"
"test"
Returns: "20051920"
Example from the problem statement. Here, the letters are coded in an alphabetical order.
1)	
    	
"abcdefghijklmnopqrstuvwxyz"
"20051920"
Returns: "test"
Now, we're decoding it.
2)	
    	
"qesdfvujrockgpthzymbnxawli"
"mwiizkelza"
Returns: "19242626171202251723"
3)	
    	
"faxmswrpnqdbygcthuvkojizle"
"02170308060416192402"
Returns: "ahxpwmtvza"
This problem statement is the exclusive and proprietary property of TopCoder, Inc. Any unauthorized use or reproduction of this information without the prior written consent of TopCoder, Inc. is strictly prohibited. (c)2010, TopCoder, Inc. All rights reserved.




This problem was used for: 
       Single Round Match 397 Round 1 - Division II, Level One
*/
