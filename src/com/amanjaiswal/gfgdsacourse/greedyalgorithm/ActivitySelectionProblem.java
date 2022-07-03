package com.amanjaiswal.gfgdsacourse.greedyalgorithm;

import java.util.*;

class Activity {

//	Activity class, defining the start and end time.
	int start;
	int end;

	Activity(int start, int end) {
//		Activity class constructor, takes the start and end time as the input.
		this.start = start;
		this.end = end;
	}
}

public class ActivitySelectionProblem {

//	Sort the activities based on their end time. => By implementing Comparator interface
	class sortActivity implements Comparator<Activity> {

		@Override
		public int compare(Activity a, Activity b) {
			return a.end - b.end;
		}

	}

	int maxActivity(Activity arr[]) {

		Arrays.sort(arr, new sortActivity());
		int res = 1;
		int prev = 0;

//		Iterate over the activity to find,
//		if the start and end timing of two different activities are overlapping or not.
//		If overlapping ignore the later one and if not overlapping,
//		increment the res by 1 and assign the i(Current activity) to the previous.
//		Finally return the res.

		for (int i = 1; i < arr.length; i++) {
			System.out.println(arr[i].start + " == " + arr[prev].end);
			if (arr[i].start >= arr[prev].end) {
				res++;
				prev = i;
			}
		}
		return res;

	}

	public static void main(String[] args) {

		Activity arr[] = { new Activity(12, 25), new Activity(10, 20), new Activity(20, 30), new Activity(45, 60),
				new Activity(18, 35) };

		ActivitySelectionProblem asp = new ActivitySelectionProblem();
		int activity = asp.maxActivity(arr);

		System.out.println("Maximum activity :---> " + activity);

	}

}
