package com.pk.main;

import com.pk.service.InterfaceA;
import com.pk.service.InterfaceB;
import com.pk.service.impl.InterfaceABImpl;

// Here we have extended the InterfaceABImpl class and also implemented InterfaceA and InterfaceB which all has show() method
// In this scenario we do not need to write show() method because class InterfaceABImpl show() method will have high priority
public class MainClass extends InterfaceABImpl implements InterfaceA, InterfaceB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceABImpl ab = new InterfaceABImpl();
		ab.show();
	}

}
