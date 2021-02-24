package org.phone;

public class Phone {
private void phoneInfo(int ver, short year) {
	System.out.println("phone version is "+ver+"\n manufactored year is "+year);
}
public void phoneInfo(String name, String model) {
	System.out.println("phone name is "+name+"\n  Model is "+model);
}
private void phoneInfo(int var, int gar) {
	System.out.println("phone varendy is "+var+"\n phone garandy is "+gar);
}
public void phoneInfo(String display, long phno) {
	System.out.println("phone display is "+display+"\n phone number is "+phno);
}
public static void main(String[] args) {
	Phone p=new Phone();
	p.phoneInfo(45, 2020);
	p.phoneInfo("Samsung", "Galaxe");
	p.phoneInfo(040, 03);
	p.phoneInfo("Ashok", 9943424947l);
	
}
}
