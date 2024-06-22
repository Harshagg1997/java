package com.dsa.arrays;

import java.util.Arrays;
//Aggarwal
//[1,1,2,2,1]----1 is in majority
//[1,1,2,2,3,3]---No majority
//harsh
public class MajorityArray {
	
	//Time Complexity O(N**2)
	//Space Complexity O(1)
	public static int BruteForce(int a[]) {
		int majority=a.length/2+1;
		int currCandidatecount=0;
		for(int i=0;i<a.length;i++ ) {
			currCandidatecount=0;
			for(int j=0;j<a.length;j++ ) {
				if(a[j]==a[i]) {
					currCandidatecount++;
				}
			}
			if(currCandidatecount==majority) {
				return a[i];
			}
		}
		return -1;
	}
	//As order is not important so can Use Sorting
	//Time Complexity O(Nlog(N)+N) =O(Nlog(N))
	//Space Complexity O(1)
	public static int MajorityUsingSort(int a[]) {
		int majority=a.length/2+1;
		Arrays.sort(a);
		int currCandidatecount=1;
		for(int i=0;i<a.length-1;i++) {
			if(a[i+1]==a[i]) {
			currCandidatecount++;	
			}else {
				if(currCandidatecount==majority) {
					return a[i];
				}else {
					currCandidatecount=0;
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,1,2,2,1,1};
		int Majorityelement=BruteForce(a);
		System.out.println(Majorityelement);
		int MajorityUsingSort=MajorityUsingSort(a);
		System.out.println("ds"+MajorityUsingSort+"D");
	
		

	}

}
