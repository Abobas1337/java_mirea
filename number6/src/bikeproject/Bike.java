package bikeproject;

public class Bike implements BikeParts
{
    private String handleBars;
    private String frame;
    private String tyres;
    private String seatType;
    private int numGears;
    private final String make;

    public Bike()
    {
        this.make = COMPANY_NAME;
    }

    public Bike(String handleBars, String frame, String tyres, String seatType, int numGears)
    {
        this.handleBars = handleBars;
        this.frame = frame;
        this.tyres = tyres;
        this.seatType = seatType;
        this.numGears = numGears;
        this.make = COMPANY_NAME;
    }

    public void setHandleBars(String newValue)
    {
        this.handleBars = newValue;
    }

    public String getHandleBars()
    {
        return this.handleBars;
    }

    public void setFrame(String newValue)
    {
        this.frame = newValue;
    }

    public String getFrame()
    {
        return this.frame;
    }

    public void setTyres(String newValue)
    {
        this.tyres = newValue;
    }
    public String getTyres()
    {
        return this.tyres;
    }
    public void setSeatType(String newValue)
    {
        this.seatType = newValue;
    }

    public String getSeatType()
    {
        return this.seatType;
    }

    protected void printDescription()
    {
        System.out.println("\n" + this.make + "\n" + "This bike has " + this.handleBars + " handlebars on a " + this.frame + " frame with " + this.numGears + " gears." + "\nIt has a " + this.seatType + " seat with " + this.tyres + " tyres.");
    }
}
