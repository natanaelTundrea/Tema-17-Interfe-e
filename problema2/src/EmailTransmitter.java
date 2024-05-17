
public class EmailTransmitter implements Transmitter {

	final static String TYPE = "EMAIL";
	private Message message;

	public String getType() {
		return EmailTransmitter.TYPE;
	}
	public void store(Message message) {
		this.message  = message;
		message.getReceiver().receive(message);
	}

	public Message retrieve(Person receiver) {
		if(receiver.getName().equals(message.getReceiver().getName()))
			return message;
		else
			return new Message(new Person("EMail"), receiver, "This message is not for you", this.getType());
	}

}
