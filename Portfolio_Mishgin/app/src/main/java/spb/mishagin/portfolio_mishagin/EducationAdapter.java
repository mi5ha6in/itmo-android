package spb.mishagin.portfolio_mishagin;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class EducationAdapter extends RecyclerView.Adapter<EducationAdapter.AndroidVersionHolder> {
    private final List<Education> educations;

    public EducationAdapter(List<Education> educations) {
        this.educations = educations;

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
        View itemView = inflater.inflate(R.layout.fragment_education_item, parent, false);
        return new AndroidVersionHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull AndroidVersionHolder holder, int position) {
        Education education = educations.get(position);

        Picasso.get().load(education.getImage()).into(holder.image);
        holder.name.setText(education.getName());

    }

    public int getItemCount() {
        return educations.size();
    }
}