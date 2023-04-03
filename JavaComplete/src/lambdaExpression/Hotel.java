package lambdaExpression;

public class Hotel {
    private Integer perNightPrice;
    private HotelType hotelType;
    private String hotelName;

    @Override
    public String toString() {
        return "Hotel{" +
                "perNightPrice=" + perNightPrice +
                ", hotelType=" + hotelType +
                ", hotelName='" + hotelName + '\'' +
                '}';
    }

    public Hotel(Integer perNightPrice, HotelType hotelType, String hotelName) {
        this.perNightPrice = perNightPrice;
        this.hotelType = hotelType;
        this.hotelName = hotelName;
    }

    public Integer getPerNightPrice() {
        return perNightPrice;
    }

    public void setPerNightPrice(Integer perNightPrice) {
        this.perNightPrice = perNightPrice;
    }

    public HotelType getHotelType() {
        return hotelType;
    }

    public void setHotelType(HotelType hotelType) {
        this.hotelType = hotelType;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }
}
