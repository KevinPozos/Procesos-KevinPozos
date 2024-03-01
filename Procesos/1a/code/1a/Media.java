

/**
 * @author Kevin Pozos
 */
public class Media {

    /**
     * Default constructor
     */
    public Media() {
    }

    /**
     * 
     */
    private double media;

    /**
     * @param datalist 
     * @param n
     */
    public double getMedia(String[] datalist, int n) {
        
        double [] arrData = new double[n];
        for(int i=0;i<n;i++){
            arrData[i]=Double.parseDouble(datalist[i]);
        }
        for(int j=0;j<n;j++){
            media+=arrData[j];
        }
        media/=n;
	return media;
    }

}
