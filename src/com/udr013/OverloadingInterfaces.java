package com.udr013;

public class OverloadingInterfaces {

	interface Bal {
		static int bla = 20; // implicit static

		void ballable(Object o); // implicitly public

		String doing();
	}

	interface Kick {
		void ballable();

		int doing();
	}

	class Blabla implements Bal, Kick {

		@Override
		public void ballable() {

		}

		@Override
		public void ballable(Object o) { // correct overloading

		}

		@Override
		public String doing() { // won't compile
			return "This is not an Int or is it?"; // not overloading Kick doing()
		}
	}
}
