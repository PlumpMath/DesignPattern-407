package janusxu_chn;

public class MessageRecv implements Display, Observors {

	private Subjects messageCent;
	private String messRecv;
	
	public MessageRecv(Subjects messCent) {
		// TODO Auto-generated constructor stub
		this.messageCent=messCent;
		this.messageCent.addObservor(this);
		this.messRecv="none";
	}
	
	@Override
	public void update(String message) {
		// TODO Auto-generated method stub
		this.messRecv=message;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(this.messRecv);
	}

}
