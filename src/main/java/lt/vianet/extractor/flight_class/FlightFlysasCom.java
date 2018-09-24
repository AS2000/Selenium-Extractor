package lt.vianet.extractor.flight_class;

import java.util.Date;

public class FlightFlysasCom extends Flight implements IFlightFlysasCom {
    private String departureAirport;
    private String arrivalAirport;
    private Date departureDate;
    private Date arrivalDate;
    private String flightNumber;
    private double cheapestPrice;
    private double tax;
    private double priceWitoutTax;
    private double fee;

    public FlightFlysasCom() {
    }

    public FlightFlysasCom(String departureAirport, String arrivalAirport, Date departureDate, Date arrivalDate, double cheapestPrice, double tax, double priceWitoutTax, double fee) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.departureDate = departureDate;
        this.arrivalDate = arrivalDate;
        this.cheapestPrice = cheapestPrice;
        this.tax = tax;
        this.priceWitoutTax = priceWitoutTax;
        this.fee = fee;
    }

    public FlightFlysasCom(String departureAirport, String arrivalAirport, Date departureDate, String flightNumber) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.departureDate = departureDate;
        this.flightNumber = flightNumber;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public void setArrivalAirport(String arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }


    public Date getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(Date arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double getPriceWithoutTax() {
        return priceWitoutTax;
    }

    public void setPriceWithoutTax(double priceWitoutTax) {
        this.priceWitoutTax = priceWitoutTax;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public double getCheapestPrice() {
        return cheapestPrice;
    }
}
