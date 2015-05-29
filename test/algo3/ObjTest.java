package algo3;

import org.junit.Assert;
import org.junit.Test;

public class ObjTest {

	@Test
	public void testeando() {
		
	    Obj obj = new Obj();
		obj.hacer();
		Assert.assertEquals("hola", obj.mostrar());
	   }
    @Test
    public void testing(){
    	
    	Obj obj = new Obj();
		obj.hacer();
		Assert.assertEquals("hola", obj.mostrar());
    	//ds
    }
}
