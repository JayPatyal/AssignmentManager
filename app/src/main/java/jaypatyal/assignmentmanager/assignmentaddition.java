package jaypatyal.assignmentmanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Calendar;
import java.util.Date;

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
    public void Saving(View view) {
        String Name = AssignmentName.getText().toString();
        String description = AssignmentDescription.getText().toString();

        Calendar calendar = Calendar.getInstance();
        calendar.set(AssignmentDate.getYear(), AssignmentDate.getMonth(), AssignmentDate.getDayOfMonth(),
                AssignmentTime.getCurrentHour(), AssignmentTime.getCurrentMinute(), 0);
        long notitytTimeinMillis = calendar.getTimeInMillis();
        assignmentModel NewAssignment = new assignmentModel();
        NewAssignment.setName(Name);
        NewAssignment.setNotifyTime(notitytTimeinMillis);
        NewAssignment.setDescription(description);
        final FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference ref = database.getReference();
        String key = ref.push().getKey();
        DatabaseReference assignmentRef = ref.child("Assignment");
        assignmentRef = assignmentRef.child(key);
        assignmentRef.setValue(NewAssignment);
        finish();
    }
}



