package com.udr013;

public interface MyInterface {

	private int number = 20; // Won't compile , not default or public
	protected void Method ();  //idem
	interface otherInterface {} // implicitly public

	public interface  anOtherInterface { //public, no problem

		int minimum; // must be initialized won't compile! public static by default
		int members = 100; // variables are public static by default
		public static int moreMembers = 200;

		int getMembers();  //methods are public abstract by default
		public abstract int getMoreMembers();



	}

}


interface Bal {
	static int bla = 20; //implicit static

	void ballable (); // implicitly public
}

interface Kick {
	void ballable();
}

class Blabla implements Bal, Kick {
	int bla = 10;

	Blabla (){
		System.out.println(bla);
		System.out.println(Bal.bla);
	}

	@Override
	public void ballable(){

	}
}

class Blabal implements Bal, Kick {

	@Override
	void ballable(){  // won't compile using weaker access modifier

	}
}