package com.example.viktorjava;

import io.flutter.embedding.android.FlutterActivity;
import com.microsoft.appcenter.AppCenter;
import com.microsoft.appcenter.analytics.Analytics;
import com.microsoft.appcenter.crashes.Crashes;
import com.microsoft.appcenter.distribute.Distribute;
import android.os.Bundle;

public class MainActivity extends FlutterActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        AppCenter.start(getApplication(), "e9ee2a8e-1c51-4744-a08e-8a7f2e63bda8", Distribute.class);

        AppCenter.setEnabled(true);

        super.onCreate(savedInstanceState);
    }

}
