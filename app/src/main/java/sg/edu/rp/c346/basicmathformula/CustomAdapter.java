package sg.edu.rp.c346.basicmathformula;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by 16033265 on 7/16/2018.
 */

public class CustomAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    ArrayList<Math> mathList;

    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Math> objects) {
        super(context,resource,objects);
        parent_context = context;
        layout_id = resource;
        mathList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @NonNull View convertView, @NonNull ViewGroup parent){
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id, parent,false);
        TextView tvTitle = rowView.findViewById(R.id.textViewTitle);
        TextView tvFormula = rowView.findViewById(R.id.textViewFormula);
        TextView tvtype = rowView.findViewById(R.id.textViewType);

        Math currentItem = mathList.get(position);
        String formula = currentItem.getFormula();
        String title = currentItem.getTitle();
        String type = currentItem.getType();

        tvTitle.setText(title);
        tvFormula.setText(formula);
        tvtype.setText(type);

        return rowView;
    }
}
