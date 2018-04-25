package id.kopas.berkarya.androidrecyclerviewandcardview;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class VerticalListAdapter extends RecyclerView.Adapter<VerticalListAdapter.ViewHolder> {

    int[] images = {R.drawable.a, R.drawable.a, R.drawable.a,
            R.drawable.a, R.drawable.a, R.drawable.a, R.drawable.a};
    String[] food_items = {"prawan", "awadhi_lucknow_biryani", "eggwraps", "chips", "mayonnaise", "companin", "mixvegwrap"};
    String[] cost = {"Rs 200", "Rs 300", "Rs 150", "R 320", "Rs 450", "Rs 120", "Rs 380"};
    private Activity activity;

    public VerticalListAdapter(Activity activity) {
        this.activity = activity;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = activity.getLayoutInflater();
        View view = inflater.inflate(R.layout.item_vertical_list, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {
        // if ((position + 1) % 2 == 0) {
        viewHolder.imageView.setImageResource(images[position]);
        viewHolder.txtview.setText(food_items[position].toUpperCase());
        viewHolder.txtCost.setText("Cost Per Person " + cost[position]);
        // } else {
        //  viewHolder.imageView.setImageResource(R.drawable.awadhi_lucknow_biryani);
        //}
        viewHolder.container.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(activity, "Position: " + position, Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    /**
     * View holder to display each RecylerView item
     */
    protected class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageView;
        private TextView txtview;
        private TextView txtCost;
        private RelativeLayout container;

        public ViewHolder(View view) {
            super(view);
            imageView = view.findViewById(R.id.image);
            txtview = view.findViewById(R.id.text);
            txtCost = view.findViewById(R.id.textView);
            container = view.findViewById(R.id.container);
        }

    }
}

