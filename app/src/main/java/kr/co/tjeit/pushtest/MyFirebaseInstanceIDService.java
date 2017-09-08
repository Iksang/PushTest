package kr.co.tjeit.pushtest;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by tjoeun on 2017-09-08.
 */


// InstanceId Service

//    1. Service? 백그라운드. (이전과 동일)

//    2. InstanceID? => 기기의 고유 번호

//    ※ 구글서버로부터, 기기 ID를 발급 받아오는 이벤트를 감지.
//    앱이 설치/ 실행되고 나면 발급요청. => 완료시 실행

public class MyFirebaseInstanceIDService extends FirebaseInstanceIdService{
    @Override
    public void onTokenRefresh() {

//        토큰값을 받아오면 실행되는 메쏘드.
        Log.d("받아온토큰값", FirebaseInstanceId.getInstance().getToken());

    }
}
