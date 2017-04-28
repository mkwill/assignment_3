package lwtech.itad230.micahwilliams.assignment_three;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onTimer(View view){
        Intent intent = new Intent(this, TimerActivity.class);
        startActivity(intent);
    }
    public void onAlarm(View view){
        Intent intent = new Intent(this, AlarmActivity.class);
        startActivity(intent);
    }
    public void onOther(View view){
        Intent intent = new Intent(this, NoteActivity.class);
        startActivity(intent);
    }
}
