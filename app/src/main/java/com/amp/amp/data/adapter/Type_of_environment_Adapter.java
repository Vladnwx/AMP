package com.amp.amp.data.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SortedList;

import com.amp.amp.R;
import com.amp.amp.data.App;
import com.amp.amp.data.entity.Type_of_environment;

import java.util.ArrayList;
import java.util.List;

public class Type_of_environment_Adapter extends RecyclerView.Adapter<Type_of_environment_Adapter.Type_of_environment_ViewHolder> {

     private SortedList<Type_of_environment> sortedList;


    public Type_of_environment_Adapter() {
        sortedList= new SortedList<>(Type_of_environment.class, new SortedList.Callback<Type_of_environment>() {
            @Override
            public int compare(Type_of_environment o1, Type_of_environment o2) {
                return 0;
            }

            @Override
            public void onChanged(int position, int count) {
                notifyItemRangeChanged(position, count);
            }

            @Override
            public boolean areContentsTheSame(Type_of_environment oldItem, Type_of_environment newItem) {
                return oldItem.equals(newItem);
            }

            @Override
            public boolean areItemsTheSame(Type_of_environment item1, Type_of_environment item2) {
                return false;
            }

            @Override
            public void onInserted(int position, int count) {
                notifyItemRangeInserted(position, count);
            }

            @Override
            public void onRemoved(int position, int count) {
                notifyItemRangeRemoved(position, count);
            }

            @Override
            public void onMoved(int fromPosition, int toPosition) {
                notifyItemMoved(fromPosition, toPosition);
            }
        });
    }
    @NonNull
    @Override
    public Type_of_environment_ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new Type_of_environment_ViewHolder(LayoutInflater.from
                (parent.getContext()).inflate(R.layout.recyclerview_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull Type_of_environment_ViewHolder holder, int position) {
        holder.bind(sortedList.get(position));
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public  void setItems (List<Type_of_environment> type_of_environments){
        sortedList.replaceAll(type_of_environments);
    }


    static class Type_of_environment_ViewHolder extends RecyclerView.ViewHolder {

        TextView type_of_environment_text;
        Spinner type_of_environment_spinner;

        Type_of_environment type_of_environment;

        public Type_of_environment_ViewHolder(@NonNull View itemView) {
            super(itemView);

            type_of_environment_text = itemView.findViewById(R.id.textView);
            type_of_environment_spinner = (Spinner) itemView.findViewById(R.id.spinner);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    App.getInstance().getType_of_environment_Dao().getAllLiveData();
                    ArrayList<String> type_of_environment_list = new ArrayList<String>();
                    type_of_environment_list.add(type_of_environment.toString());
                    ArrayAdapter<String> adapter = new ArrayAdapter<String>(App.getInstance(),
                            android.R.layout.simple_spinner_item, type_of_environment_list);
                    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    type_of_environment_spinner.setAdapter(adapter);
                }
            });

        }

        public  void  bind(Type_of_environment type_of_environment){
            this.type_of_environment = type_of_environment;
            type_of_environment_text.setText("Окружающая среда");


                    }

    }


}
