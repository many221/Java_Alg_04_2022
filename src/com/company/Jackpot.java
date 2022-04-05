package com.company;

import java.util.Arrays;
import java.util.Iterator;

public class Jackpot {

    public static boolean testJackpot(String[] result) {

        String firstIndex = result[0];

        int count = 0;

        for (int i = 0; i < result.length; i++) {

            String element = result[i];

            if (element == firstIndex){

                count ++;

            }

        }

        if (count == result.length){

            return true;

        }else return false;

        /*

        The Cool part of this solution is the index starts at 1 and it checks based off of the last element which is [i-1] going to start at 0
        therefore its always within the boundries of the array

        for (int i = 1 ; i < result.length ; i++) {
			if (result[i] != result[i-1]) {
				return false;
			}
		}
		return true;
	    }
	*/

    }
}
