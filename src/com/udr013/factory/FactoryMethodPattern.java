package com.udr013.factory;

/* we use the the interface, wordProcessor and TextEditor from the SimpleFactory
* to safe some code for this example */

//Abstract factory class
abstract class SomeAppFactory {
	public App getAppInstance() {
		App app = getApp();
		return app;
	}
	public abstract App getApp();  //factory method
}

//Implement factory Method to return a specific app object
class WordAppFactory extends SomeAppFactory {
	@Override
	public App getApp() {   // <-----
		return new WordProcessor();
	}
}

//Implement factory Method to return a specific app object
class TextEditorAppFactory extends SomeAppFactory {
	@Override
	public App getApp() {   // <-----
		return new TextEditor();
	}
}

//Client uses variable of abstract class to refer to a concrete factory object
class SomeClient {

	public static void main(String[] args) {
		SomeAppFactory appfactory = new WordAppFactory();
		App app = appfactory.getAppInstance(); // because it refers to WordAppFactory object getAppInstance will return WordAppfactory
		app.open("hello.doc");
		//a bit shorter
		App app2 = new TextEditorAppFactory().getAppInstance();
		app2.open("hello.xml");
	}
}