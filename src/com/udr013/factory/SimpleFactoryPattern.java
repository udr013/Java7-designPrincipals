package com.udr013.factory;

interface App {
	void open(String fileName);

}
//Inteface app implemented by class
class WordProcessor implements App {

	@Override
	public void open(String fileName) {
		System.out.println("Launch WordProcessor  using " + fileName);
	}
}
//Inteface app implemented by class
class TextEditor implements App {

	@Override
	public void open(String fileName) {
		System.out.println("Launch TextEditor  using " + fileName);
	}
}
//Implement Simple Factory pattern by returning app object according to parameter value
 class AppFactory {
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
//Client is decoupled from classes word- and textEditor It calls AppFactory.getAppInstance() to get an app
class Client {
	public static void main(String[] args) {
		// we get some program based on extention, not knowing the implementation behind, an app is an app
		App app = AppFactory.getAppInstance(".doc");
		app.open("Hello.doc");

		App app2 = AppFactory.getAppInstance(".txt");
		app2.open("hello.xml");
	}
}
