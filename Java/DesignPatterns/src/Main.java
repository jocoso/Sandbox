import com.factory.abstractFactory.Box;
import com.factory.concreteFactory.BlueBoxFactory;
import com.factory.concreteFactory.RedBoxFactory;
import com.factory.implementFactory.GeneralBoxFactory;

public class Main {

	public static void main(String[] args) {
		RedBoxFactory rbf = new RedBoxFactory();
		BlueBoxFactory bbf = new BlueBoxFactory();
		
		GeneralBoxFactory boxFact = new GeneralBoxFactory();
		
		Box teddy_rb = boxFact.createBox(rbf, "teddy bear");
		Box teddy_bb = boxFact.createBox(bbf, "teddy bear");
		
		boxFact.openBox(teddy_rb);
		boxFact.openBox(teddy_bb);

	}

}
