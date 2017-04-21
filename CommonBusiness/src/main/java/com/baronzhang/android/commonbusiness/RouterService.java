package com.baronzhang.android.commonbusiness;

import com.baronzhang.android.router.annotations.router.CombinationUri;
import com.baronzhang.android.router.annotations.router.FullUri;
import com.baronzhang.android.router.annotations.router.IntentExtrasParam;
import com.baronzhang.android.router.annotations.router.UriParam;

import java.util.ArrayList;

/**
 * @author baronzhang (baron[dot]zhanglei[at]gmail[dot]com ==>> baronzhang.com)
 *         2017/3/6
 */
public interface RouterService {

//    @RouterUri(fullUri = "openAnjukeApp://com.baronzhang.android.newhouse")
//    void startNewHouseActivity(@UriParam("cityId") String cityId);
//
//    @RouterUri(fullUri = "openAnjukeApp://com.baronzhang.android.secondhouse")
//    void startSecondHouseActivity(@UriParam("cityId") String cityId);
//
//    @RouterUri(fullUri = "openAnjukeApp://com.baronzhang.android.im")
//    void startIMActivity(@UriParam("cityId") String cityId);


    @FullUri("router://com.baronzhang.android.newhouse")
    void startNewHouseActivity(@UriParam("cityId") String cityId, @IntentExtrasParam("HouseDetail") HouseDetail houseDetail);

    @CombinationUri(scheme = "router", host = "com.baronzhang.android.secondhouse")
    void startSecondHouseActivity(@UriParam("cityId") String cityId, @IntentExtrasParam("communityId") int communityId);

    @CombinationUri(scheme = "router", host = "com.baronzhang.android.im", port = "6666", path = "/im/home")
    void startIMActivity(@UriParam("cityId") String cityId, @IntentExtrasParam("array") ArrayList<Integer> array);
}
