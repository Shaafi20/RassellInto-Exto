package com.russellintoexto.Data.InteriorSectorClass;

import com.russellintoexto.Data.ServiceDetailsPhotoData;
import com.russellintoexto.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Shaafi on 01-Mar-16, 2016.
 */
public class IntoKitchen {
    public static List<ServiceDetailsPhotoData> IntoKitchenList = new ArrayList<>();

    public static List<ServiceDetailsPhotoData> getIntoKitchenList() {
        return IntoKitchenList;
    }

    static {
        IntoKitchenList.add(new ServiceDetailsPhotoData(R.drawable.background));
    }
}
