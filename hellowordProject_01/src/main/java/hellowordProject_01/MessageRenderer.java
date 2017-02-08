package hellowordProject_01;

public interface MessageRenderer {
	void render();

	void setMessageProvider(MessageProvider provider);

	MessageProvider getMessageProvider();

}
