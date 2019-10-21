package com.example.hmwk2.adapter;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hmwk2.PersonDetailActivity;
import com.example.hmwk2.R;
import com.example.hmwk2.Student;
import com.example.hmwk2.StudentDB;

public class SummaryListAdapter extends BaseAdapter {
    @Override
    public int getCount() {
        return StudentDB.getInstance().getPersonList().size();
    }
    @Override
    public Object getItem(int position) {
        return StudentDB.getInstance().getPersonList().get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int i, View view, ViewGroup viewGroup) {

        final View row_view;

        if(view == null) {
            LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
            row_view = inflater.inflate(R.layout.person_row, viewGroup, false);
        }else row_view = view;

        //
        Student p = StudentDB.getInstance().getPersonList().get(i);
        //
        ((TextView) row_view.findViewById(R.id.first_name)).setText(p.getFirstName());
        ((TextView) row_view.findViewById(R.id.last_name)).setText(p.getLastName());

        row_view.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View view){
                        //
                        Toast.makeText(view.getContext(), "View Object was touched by user.", Toast.LENGTH_SHORT).show();
                        //
                        Intent intent = new Intent(view.getContext(), PersonDetailActivity.class);
                        intent.putExtra("PersonIndex", i);
                        view.getContext().startActivity(intent);
                    }
                }
        );
        return row_view;
    }
}
