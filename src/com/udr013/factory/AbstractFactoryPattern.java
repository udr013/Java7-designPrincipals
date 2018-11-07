package com.udr013.factory;

interface App { /*some code*/ }
class WordProcessor implements App {/*some code*/ }

interface Font { /*some code*/ }
class RichFont implements Font {/*some code*/ }

//Abstract factory class
abstract class AppFactory {

	protected abstract App getApp();
	protected abstract Font getFont();

	public App getAppInstance() {
		App app = getApp();
		return app;
	}

	public Font getFontInstance() {
		Font font = getFont();
		return font;
	}
}

class WordAppFactory extends AppFactory {

	@Override
	protected App getApp(){
		return new WordProcessor();
	}

	@Override
	protected Font getFont(){
		return new RichFont();
	}
}

//Client is decoupled from classes word- and textEditor It calls AppFactory.getAppInstance() to get an app
class ClientAbstractFactoryMethod {
		public static void main(String[] args) {
		//we get Font and App from the same factory
		AppFactory factory1 = new WordAppFactory();
		App app1 = factory1.getAppInstance();
		Font font1 = factory1.getFontInstance();

	}
}
