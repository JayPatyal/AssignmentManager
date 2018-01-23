package jaypatyal.assignmentmanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.function.Function;

public class assignmentaddition extends AppCompatActivity {

    EditText AssignmentDescription, AssignmentName;
    TextView NotifyTime;
    TimePicker AssignmentTime;
    DatePicker AssignmentDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assignmentaddition);
        AssignmentDate = findViewById(R.id.datePicker);
        AssignmentTime = findViewById(R.id.timePicker);
        AssignmentName = findViewById(R.id.editText);
        AssignmentDescription = findViewById(R.id.editText2);
        AssignmentDate.setMinDate(System.currentTimeMillis());
        AssignmentTime.setHour(21);
        AssignmentTime.setMinute(0);
        AssignmentTime.setIs24HourView(true);
        NotifyTime = findViewById(R.id.editText3);

    }

    void UpdateNotification(){
        
            }
}
