
public class Chair
{
	private String model;
	private String manufacturer;
	private int productionYear;
	
	Chair (String model, String manufacturer, int productionYear ) {
		this.model = model;
		this.manufacturer = manufacturer;
		this.productionYear = productionYear;
	}
	
	   public String getModel() {
        return model;
    }   
 
    public String getManufacturer() {
        return manufacturer;
    }   
 
    public int getProductionYear() {
        return productionYear;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {	//Metoda equals powinna zwr�ci� false przy por�waniu z null
            return false;
        }
        
        if (obj instanceof Chair) {
            Chair otherChair = (Chair) obj;
            return model.equals(otherChair.model) &&
                    manufacturer.equals(otherChair.manufacturer) &&
                    productionYear == otherChair.productionYear;
        }
        return false;
    }
 
    @Override
    public int hashCode() {
        return model.hashCode() + manufacturer.hashCode() + productionYear;
    }
}   
