package com.udr013;

abstract class SomeAppFactory {
	public App getAppInstance() {
		App app = getApp();
		return app;
	}

	public abstract App getApp();
}

class WordAppFactory extends SomeAppFactory {

	@Override
	public App getApp() {
		return new WordProcessor();
	}
}

class TextEditorAppFactory extends SomeAppFactory {

	@Override
	public App getApp() {
		return new TextEditor();
	}
}

class SomeClient {
	public static void main(String[] args) {
		// we get some program based on extention, not knowing the implementation behind, an app is an app
		SomeAppFactory appfactory = new WordAppFactory();
		App app = appfactory.getAppInstance();
		app.open("hello.doc");

		App app2 = new TextEditorAppFactory().getAppInstance();
		app2.open("hello.xml");
	}
}
