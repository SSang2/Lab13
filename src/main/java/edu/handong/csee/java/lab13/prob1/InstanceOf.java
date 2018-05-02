package edu.handong.csee.java.lab13.prob1;

public class InstanceOf {		//public modifier class InstanceOf
	public static void WhatFriend(Friend friend)		//public modifier method WhatFriend, returns nothing
	{
		if(friend instanceof ClassFriend)			//if friend is instance of ClassFriend
			((ClassFriend) friend).classFriend();	//call ClassFriend of classFriend method
		else if(friend instanceof SchoolFriend)		//if friend is instance of SchoolFriend
			((SchoolFriend) friend).schoolFriend();	//call SchoolFriend of schoolFriend method
		else
			friend.JustFriend();	//call friend class of JustFriend method
	}

}
