package com.udr013;

interface App {
	void open(String fileName);

}

class WordProcessor implements App {

	@Override
	public void open(String fileName) {
		System.out.println("Launch WordProcessor  using " + fileName);
	}
}

class TextEditor implements App {

	@Override
	public void open(String fileName) {
		System.out.println("Launch TextEditor  using " + fileName);
	}
}

abstract class AppFactory {
	public static App getAppInstance(String fileExt) {
		App app = null;
		if (fileExt.equals(".doc")) {
			app = new WordProcessor();
		} else if (fileExt.equals(".txt") || fileExt.equals(".xml")) {
			app = new TextEditor();
		}
		return app;
	}
}

class Client {
	public static void main(String[] args) {
		// we get some program based on extention, not knowing the implementation behind, an app is an app
		App app = AppFactory.getAppInstance(".doc");
		app.open("Hello.doc");

		App app2 = AppFactory.getAppInstance(".txt");
		app2.open("hello.xml");
	}
}
