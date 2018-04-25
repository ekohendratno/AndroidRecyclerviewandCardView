package id.kopas.berkarya.androidrecyclerviewandcardview;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class HorizontalListAdapter extends RecyclerView.Adapter<HorizontalListAdapter.ViewHolder> {

    int[] images = {R.drawable.a, R.drawable.a, R.drawable.a,
            R.drawable.a, R.drawable.a, R.drawable.a, R.drawable.a};
    String[] food_items = {"prawan", "awadhi_lucknow_biryani", "eggwraps", "chips", "mayonnaise", "companin", "mixvegwrap"};
    private Activity activity;


    public HorizontalListAdapter(Activity activity) {
        this.activity = activity;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        LayoutInflater inflater = activity.getLayoutInflater();
        View view = inflater.inflate(R.layout.item_horizontal_list, viewGroup, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(HorizontalListAdapter.ViewHolder viewHolder, final int position) {
        viewHolder.imageView.setImageResource(images[position]);
        viewHolder.txtview.setText(food_items[position].toUpperCase());

        viewHolder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(activity, "Position clicked: " + position, Toast.LENGTH_SHORT).show();
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

        private LinearLayout linearLayout;
        private ImageView imageView;
        private TextView txtview;


        public ViewHolder(View view) {
            super(view);
            imageView = view.findViewById(R.id.imageview);
            txtview = view.findViewById(R.id.txtview);
            linearLayout = view.findViewById(R.id.layout);
        }
    }
}
