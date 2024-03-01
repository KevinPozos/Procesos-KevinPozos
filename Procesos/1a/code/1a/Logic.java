

/**
 * @author Kevin Pozos
 */
public class Logic {

    /**
     * Default constructor
     */
    public Logic() {
    }

    /**
     * 
     */
    private int n;

    /**
     * 
     */
    private String data;

    /**
     * 
     */
    private String[] arrData;

    /**
     * 
     */
    private double media;

    /**
     * 
     */
    private double desv;

    /**
     * 
     */
    public void logicla() {
        
	Input myInput = new Input();
	Data myData = new Data();
	Media myMedia = new Media();
	DesvEst myDesv = new DesvEst();
	OutPut myOut = new OutPut();
	System.out.println("Ejecución");
        
        data = myInput.readData("C:\\Users\\kevin\\Desktop\\4°UV\\Procesos\\1a\\Code\\1a\\in.txt");
	System.out.println(data);
	arrData = myData.saveData(data);
	System.out.println(arrData);
	
	n=arrData.length;
        media=myMedia.getMedia(arrData, n);
	System.out.println("Media: "+media);

	desv = myDesv.getDesvEst(media, arrData, n);
	System.out.println("Desviación Estandar: "+desv);


    myOut.writeData("Media&DesviacionEstandar", "Media: " + media + "\nDesviación Estandar: " + desv);
	//myOut.writeData("Media","" + media);
	//myOut.writeData("DesviacionEstandar","" +desv);
    }

}
