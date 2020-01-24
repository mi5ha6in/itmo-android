package spb.mishagin.lab5_mishagin;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class AndroidVersionAdapter extends RecyclerView.Adapter<AndroidVersionAdapter.AndroidVersionHolder> {
    private final List<AndroidVersion> androidVersions;

    public AndroidVersionAdapter(List<AndroidVersion> androidVersions) {
        this.androidVersions = androidVersions;

    }

    static class AndroidVersionHolder extends RecyclerView.ViewHolder {
        public final ImageView image;
        public final TextView name;

        public AndroidVersionHolder(View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.item_image);
            name = itemView.findViewById(R.id.item_name);
        }

    }

    @NonNull
    @Override
    public AndroidVersionHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.fragment_current_version, parent, false);
        return new AndroidVersionHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull AndroidVersionHolder holder, int position) {
        AndroidVersion androidVersion = androidVersions.get(position);

        Picasso.get().load(androidVersion.getImage()).into(holder.image);
        holder.name.setText(androidVersion.getName());

    }

    public int getItemCount() {
        return androidVersions.size();
    }
}