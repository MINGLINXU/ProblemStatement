package sg.edu.rp.c346.problemstatement;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    DatePicker dp;
    TimePicker tp;
    Button btnconfirm;
    Button btnreset;
    TextView custname;
    TextView cusphone;
    TextView cusSize;
    RadioGroup btnsmokGroup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dp = findViewById(R.id.datePicker);
        tp = findViewById(R.id.timePicker);
        btnconfirm = findViewById(R.id.Confirm);
        btnreset = findViewById(R.id.Reset);
        custname = findViewById(R.id.enterName);
        cusphone = findViewById(R.id.phoneNum);
        cusSize = findViewById(R.id.sizeNum);
        btnsmokGroup = findViewById(R.id.smokGroup);

        dp.updateDate(2019,07,01);
        tp.setCurrentHour(19);
        tp.setCurrentMinute(30);

        btnconfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String Sname = custname.getText().toString();
                final String Sphone = cusphone.getText().toString();
                final String Ssize = cusSize.getText().toString();


                switch(btnsmokGroup.getCheckedRadioButtonId())
                {
                    case R.id.smokingTable:
                        Toast.makeText(MainActivity.this,"Name"+Sname+"\n"+"Phone Number"+Sphone+"\n"+"Size of Group"+Ssize+"\n"+dp.getDayOfMonth()+"/"+dp.getMonth()+"/"+dp.getYear()+"\n"+tp.getCurrentHour()+":"+tp.getCurrentHour()+"\n"+"You had choose a smoking table!",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.NonSmokingTable:
                        Toast.makeText(MainActivity.this,"Name"+Sname+"\n"+"Phone Number"+Sphone+"\n"+"Size of Group"+Ssize+"\n"+dp.getDayOfMonth()+"/"+dp.getMonth()+"/"+dp.getYear()+"\n"+tp.getCurrentHour()+":"+tp.getCurrentHour()+"\n"+"You had choose an non-smoking table!",Toast.LENGTH_SHORT).show();
                        break;
                }



            }
        });

        btnreset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dp.updateDate(2019,07,01);
                tp.setCurrentHour(19);
                tp.setCurrentMinute(30);

                custname.setText("");
                cusphone.setText("");
                cusSize.setText("");
            }
        });


    }
}
