package janusxu_chn;

public class Exec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Subjects sub=new MessageCent();
		Observors obs=new MessageRecv(sub);
		
		MessageCent cent=(MessageCent)sub;
		MessageRecv recv=(MessageRecv)obs;
		
		recv.display();
		cent.changed("������");
		recv.display();
		
		cent.deleteObservor(recv);
		cent.changed("������");
		recv.display();
	}

}
