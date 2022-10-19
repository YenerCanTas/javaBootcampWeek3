package overriding;

public class OgrenciKrediManager extends BaseKrediManager{

	public double hesapla(double tutar) { //hem burada hem base de "hesapla" var. overriding olayı bu kısımda
		return tutar * 1.10;
		
	}
	
}
