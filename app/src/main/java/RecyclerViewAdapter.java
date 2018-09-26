import android.content.Context;
import android.nfc.Tag;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.theman.beerappnew.R;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private ArrayList<String> mImage = new ArrayList<>();
    private ArrayList<String> mName = new ArrayList<>();
    private ArrayList<String> mTagline = new ArrayList<>();
    private ArrayList<String> mFirstbrewed = new ArrayList<>();
    private ArrayList<String> mDescription = new ArrayList<>();
    private Context mContext;

    public RecyclerViewAdapter(Context mContext, ArrayList<String> mImage, ArrayList<String> mName, ArrayList<String> mTagline, ArrayList<String> mFirstbrewed, ArrayList<String> mDescription) {
        this.mImage = mImage;
        this.mName = mName;
        this.mTagline = mTagline;
        this.mFirstbrewed = mFirstbrewed;
        this.mDescription = mDescription;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_listitem,parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Glide.with(mContext)
                .asBitmap()
                .load(mImage.get(position))
                .into(holder.image);
        holder.name.setText(mName.get(position));
                holder.description.setText(mDescription.get(position));
                holder.firstbrewed.setText(mFirstbrewed.get(position));
                holder.tagline.setText(mTagline.get(position));

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView image;
        TextView name;
        TextView tagline;
        TextView firstbrewed;
        TextView description;


        public ViewHolder(View itemView) {
            super(itemView);
            image=itemView.findViewById(R.id.image);
            name=itemView.findViewById(R.id.name);
            tagline=itemView.findViewById(R.id.tagline);
            firstbrewed=itemView.findViewById(R.id.firstbrewed);
            description=itemView.findViewById(R.id.description);
        }
    }
}
