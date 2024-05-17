
public class Person {
	
	private String name;
	private Transmitter transmitter;
	
	//constructor
	public Person(String name) {
		this.name = name;
	}
	
	//methods
	public String getName() {
		return name;
	}
	public void setTransmitter(Transmitter transmitter) {
		this.transmitter = transmitter;
	}
	public void send(Person receiver, String messageString) {
		transmitter.store(new Message(this, receiver, messageString, transmitter.getType()));
	}
	public void receive(Message message) {
		System.out.println(message.getSender().getName() + " said to " + message.getReceiver().getName() + " (" + message.getTransmitterType() + "): \"" + message.getMessage() + "\"");
	}
}
