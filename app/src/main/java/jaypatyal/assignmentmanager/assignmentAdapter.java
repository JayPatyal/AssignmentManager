package jaypatyal.assignmentmanager;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Hp-pc on 10-02-2018.
 */

public class assignmentAdapter extends ArrayAdapter<assignmentModel>{
    private final Context context;
    private final assignmentModel[] values;

public assignmentAdapter(Context context, assignmentModel[] values){
    super(context, -1, values);
    this.context = context;
    this.values = values;
}

@Override
    public View getView(int position, View convertView, ViewGroup parent){
    LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    View rowView = inflater.inflate(R.layout.item_assignment, parent, false);
    TextView name = rowView.findViewById(R.id.textViewName);
    name.setText(values[position].getName());
    TextView description = rowView.findViewById(R.id.textViewDescription);
    description.setText(values[position].getDescription());
    TextView time = rowView.findViewById(R.id.textViewTime);
    time.setText(String.valueOf(values[position].getNotifyTime()));
    return rowView;
}
}
