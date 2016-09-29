package datalayerora;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.bo.ISappentidadBo;
import com.model.bo.StockBo;
import com.modelo.Sappentidad;
import com.modelo.Stock;



// TODO: Auto-generated Javadoc
/**
 * The Class Main.
 */
public class Main {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext appContext = 
	    		new ClassPathXmlApplicationContext("spring/config/BeanLocations.xml");
		
	    	StockBo stockBo = (StockBo)appContext.getBean("stockBo");
	    	ISappentidadBo sappentidadBo = (ISappentidadBo)appContext.getBean("sappentidadBo");
	    	
	    	/** insert **/
	    	/*
	    	Stock stock = new Stock();
	    	stock.setStockCode("7668");
	    	stock.setStockName("HAIO");
	    	stockBo.save(stock);
	    	*/

	    	String dateString = "2011-09-09";
	    	DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
	    	Date myDate = null;
	    	try {
				 myDate = formatter.parse(dateString);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	
	    	Sappentidad sappentidad = new Sappentidad();
	    	sappentidad.setSappnombres("William");
	    	sappentidad.setSaapapellidos("Huera");
	    	sappentidad.setSapptipodocumento("cedula");
	    	sappentidad.setSappnumerodocumento("1712740644");
	    	sappentidad.setSappciudadania("EC");
	    	sappentidad.setSappfechanacimiento(myDate);
	    	sappentidad.setSappentidadestatus("ACTIVO");
	    	sappentidadBo.save(sappentidad);
	    	
	    	/** select **/
	    	Stock stock2 = stockBo.findByStockCode("7668");
	    	System.out.println(stock2);
	    	
	    	/** update **/
	    	/*
	    	stock2.setStockName("HAIO-1");
	    	stockBo.update(stock2);
	    	*/
	    	/** delete **/
	    	//stockBo.delete(stock2);
	    	
	    	System.out.println("Done");

	}

}
