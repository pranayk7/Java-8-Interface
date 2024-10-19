package com.pk.service.impl;

import com.pk.service.InterfaceA;
import com.pk.service.InterfaceB;

// If we implement two interface, both which has same default method i,e- show() then this class also needs to implement its own show() method
public class InterfaceABImpl implements InterfaceA, InterfaceB {

//	This method is override because two implemented interfaces has same show() method (To avoid diamond problem)
	@Override
	public void show() {
		InterfaceA.super.show();
		InterfaceB.super.show();
		System.out.println("Interface A B Impl class show method");
	}

}
