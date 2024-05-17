
public class Message {
	private Person sender, receiver;
	private String message, transmitterType;
	
	public Message(Person sender, Person receiver, String message, String transmitterType) {
		this.sender = sender;
		this.receiver = receiver;
		this.message = message;
		this.transmitterType = transmitterType;
	}

	public Person getSender() {
		return sender;
	}

	public Person getReceiver() {
		return receiver;
	}

	public String getMessage() {
		return message;
	}

	public String getTransmitterType() {
		return transmitterType;
	}
	
}
