package lwtech.itad230.micahwilliams.assignment_three;

import android.content.Intent;
import android.os.Parcelable;
import android.provider.AlarmClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class AlarmActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm);
    }
    public void onClickAlarm(View view){
        String hours = findViewById(R.id.Hours).toString();
        Integer i = Integer.valueOf(hours);
        String minutes = findViewById(R.id.minutes).toString();
        Integer j = Integer.valueOf(minutes);
        Intent intent = new Intent(AlarmClock.ACTION_SET_ALARM)
                .putExtra(AlarmClock.EXTRA_HOUR, i)
                .putExtra(AlarmClock.EXTRA_MINUTES, j)
                .putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        if(intent.resolveActivity(getPackageManager()) != null){
            startActivity(intent);
        }
    }




}
