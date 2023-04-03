package lambdaExpression;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
//        RUNNABLE CLASS IS ALSO FUNCTIONAL INTERFACE
        Thread thread=new Thread(()->{
            System.out.println("running....");
        });
        thread.start();



        List<Hotel>hotels=new ArrayList<>();
        hotels.add(new Hotel(250,HotelType.THREE_STAR,"MARRIOTT"));
        hotels.add(new Hotel(10,HotelType.THREE_STAR,"TAJ"));
        hotels.add(new Hotel(200,HotelType.ONE_STAR,"OYO"));
        hotels.add(new Hotel(600,HotelType.TWO_STAR,"AIRBNB"));
        HotelService hotelService=new HotelService();
        List<Hotel>filterThreeHotel=hotelService.getHotels(new FilterFunction() {
            @Override
            public boolean test(Hotel hotel) {
                return hotel.getHotelType()==HotelType.THREE_STAR;
            }
        },hotels );
        List<Hotel>filterPriceHotel=hotelService.getHotels((hotel) -> {
            return hotel.getPerNightPrice()>=250;
        },hotels);
        FilterFunction lambdaExp=(hotel)->hotel.getPerNightPrice()<250;
        List<Hotel>filterlowPricedHotel=hotelService.getHotels(lambdaExp,hotels);

        System.out.println(filterThreeHotel);
        System.out.println(filterPriceHotel);
        System.out.println(filterlowPricedHotel);
    }
}
