package edu.handong.csee.java.lab13.prob1;

public class InstanceOf_main{		//public modifier class InstanceOf_main

	public static void main(String[] args) {	//public modifier main method (static)
		// TODO Auto-generated method stub
		Friend friend1 = new Friend();	//instantiate Friend class to friend1
		SchoolFriend friend2 = new SchoolFriend();	//instantiate SchoolFriend class to friend2 & inherits the Friend Class
		ClassFriend friend3 = new ClassFriend();	//instantiate ClassFriend class to friend3 & inherits the Friend Class

		InstanceOf.WhatFriend(friend1);		//call the WhatFriend method to send the friend1
		InstanceOf.WhatFriend(friend2);		//call the WhatFriend method to send the friend2
		InstanceOf.WhatFriend(friend3);		//call the WhatFriend method to send the friend3
	}
}