package bogdanski_e5c1s1.odrobienie_projektu;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;


public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {

    private List<Numbers> lista;

    public ListAdapter(List<Numbers> lista) {this.lista = lista;}

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        View rowView = inflater.inflate(R.layout.recycler_element, parent, false);
        ListAdapter.ViewHolder viewHolder = new ListAdapter.ViewHolder(rowView);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ListAdapter.ViewHolder holder, final int position) {

        holder.count.setText(lista.get(position).getCounter());
        holder.randomnumber.setText(lista.get(position).getRandom());

    }

    public int getItemCount(){return 10;}

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView count;
        public TextView randomnumber;


        public ViewHolder(View itemView) {
            super(itemView);

            count = itemView.findViewById(R.id.l_porz);
            randomnumber = itemView.findViewById(R.id.l_rand);

        }
    }
}