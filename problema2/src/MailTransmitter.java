import java.util.ArrayList;
public class MailTransmitter implements Transmitter {
	
	final static String TYPE = "MAIL";
	ArrayList<Message> buffer = new ArrayList<Message>();
	private int max = 15;
	
	public MailTransmitter(int max) {
		this.max = max;
	}
	
	public String getType() {
		return MailTransmitter.TYPE;
	}
	
	public void store(Message message) {
		if(buffer.size() + 1 < max) {
			buffer.add(message);
		}else {
			buffer.add(message);
			for(Message obj : buffer) {
				obj.getReceiver().receive(obj);
			}
			buffer.clear();
		}
	}

	public Message retrieve(Person receiver) {
		for(Message message : buffer) {
			if(message.getReceiver().getName().equals(receiver.getName())) {
				Message personalMessage = message;
				buffer.remove(message);
				return personalMessage;
			}
		}
		return new Message(new Person("Mail"), receiver, "No messages for you in the inbox", this.getType());
	}

}
