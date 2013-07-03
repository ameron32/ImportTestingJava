package com.ameron32.importtesting;

import java.util.ArrayList;
import java.util.List;

import com.ameron32.libgurps.tools.DieRoll;
import com.ameron32.libgurps.tools.DieRollManager;

public class RandomTester {

	public static void main(String[] args) {
		System.out.println(drm.allCache(20) + "\n" + "\n");
		
		int count = 30;
		for (int i = 0; i < count; i++) {
			roll();
		}

		for (DieRoll dr : myRolls) {
			String dieValues = "";
			for (int i = 0; i < dr.getDieValues().length; i++) {
				dieValues = dieValues + 
						((i != 0) ? ", " : "")
						+ dr.getDieValues()[i];
			}
			System.out.println("V:[" + dieValues + "]" 
					+ "    S:" + dr.getNumOfDieSides()
					+ "    T:" + dr.getDieTotal());
		}
		System.out.println(drm.allCache(20) + "\n" + "\n");
	}
	
	private static final DieRollManager drm = new DieRollManager();
	private static final List<DieRoll> myRolls = new ArrayList<DieRoll>();
	public static void roll() {
		myRolls.add(drm.generateDieRoll(3, 20));
	}
}
