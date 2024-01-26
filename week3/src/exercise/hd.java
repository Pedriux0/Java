package exercise;


/**
 * This class defines the range and limits
 *
 * @author Juan Naranjo
 */



public class hd {

    private int channels = 1000;
    private String VGA = "VGA" ;
    private String HDMI = "HDMI";
    private String Cable = "Cable";
    private int volume = 1 ;

    boolean on = false;

    public void turnOn() {on = true;}

    public void turnOff() {on = false;}

    public double getChannels(){
        return channels;
    }



    /**
     * IT get VGA
     * @return VGA
     */
    public String getVGA(){
        return VGA;
    }
    /**
     * IT get HDMI
     * @return HDMI
     */
    public String getHDMI(){
        return HDMI;
    }
    /**
     * IT get Cable
     * @return cable
     */
    public String getCable(){
        return Cable;
    }

    /**
     * Get the volume
     * @return volume
     */
    public double getVolume(){
        return volume;
    }

    /**
     * It get On
     * @return On
     */
    public String getOn(){
        return On;
    }

    /**
     * It gets off
     * @return off
     */
    public String getOff(){
        return Off;
    }
    public String getFinal(){
        return "Tv is in channel " + getChannels() + "Mode " + getHDMI() + "and is" + getOn();
    }

}
