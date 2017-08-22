package com.cbcho.android.remoteservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.annotation.Nullable;
import android.widget.Toast;

/**
 * Created by cbcho on 2017-08-22.
 */

public class RemoteService extends Service {

    @Override
    public void onCreate() {
        super.onCreate();

        Toast.makeText(this, "[RemoteService] onCreate() 함수 호출", Toast.LENGTH_SHORT).show();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {

        Toast.makeText(this, "[RemoteService] onBind() 함수 호출", Toast.LENGTH_SHORT).show();

        return mBinder;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        Toast.makeText(this, "[RemoteService] onDestroy() 함수 호출", Toast.LENGTH_SHORT).show();
    }

    RemoteStub.Stub mBinder = new RemoteStub.Stub() {
        @Override
        public String getServerPackageName() throws RemoteException {
            return RemoteService.this.getPackageName();
        }
    };
}
