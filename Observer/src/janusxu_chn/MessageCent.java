package janusxu_chn;

import java.util.ArrayList;

public class MessageCent implements Subjects {

	private ArrayList<Observors> observors;
	private String message;
	
	public MessageCent() {
		// TODO Auto-generated constructor stub
		this.observors=new ArrayList<Observors>();
		this.message="我是消息";
	}
	
	@Override
	public void addObservor(Observors obs) {
		// TODO Auto-generated method stub
		observors.add(obs);
	}

	@Override
	public void deleteObservor(Observors obs) {
		// TODO Auto-generated method stub
		int i=observors.indexOf(obs);
		if(i>=0)
			observors.remove(i);
	}

	@Override
	public void noticeObservor() {
		// TODO Auto-generated method stub
		for (Observors obs : observors) {
			obs.update(this.message);
		}
		
	}

	public void changed(String mes) {
		// TODO Auto-generated method stub
		this.message=mes;
		this.noticeObservor();
	}

}
