package nyc.c4q.myapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "Running on Create");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "Running onStart: ");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, " Running onResume: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, " Runing onPause: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, " Runngin onStop: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, " Running onDestroy: ");
    }
}
