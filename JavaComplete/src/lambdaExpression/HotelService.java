package lambdaExpression;

import java.util.*;

public class HotelService {
    List<Hotel> getHotels(FilterFunction filterFunction,List<Hotel> hotels){
        List<Hotel>ans=new ArrayList<>();
        for(Hotel hotel: hotels){
            if(filterFunction.test(hotel)){
                ans.add(hotel);
            }
        }
        return ans;
    }
}
