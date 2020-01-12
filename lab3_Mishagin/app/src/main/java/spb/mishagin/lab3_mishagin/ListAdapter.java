package spb.mishagin.lab3_mishagin;

import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ImageHolder> {
    private List<ImageItem> imageItems;


    public ListAdapter(List<ImageItem> imageItems) {
        this.imageItems = imageItems;
    }

    static class ImageHolder extends RecyclerView.ViewHolder {
        public final ImageView image_url;

        public ImageHolder(@NonNull View itemView) {
            super(itemView);
            image_url = itemView.findViewById(R.id.item_image);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    MediaPlayer mediaPlayer = MediaPlayer.create(v.getContext(), R.raw.sound);
                    mediaPlayer.setLooping(false);
                    mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener()
                    {
                        public void onPrepared(MediaPlayer mp)
                        {
                            mp.start();
                        }
                    });

                    mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                    {
                        public void onCompletion(MediaPlayer mp)
                        {
                            mp.release();
                        }
                    });
                }
            });
        }
    }

    @NonNull
    @Override
    public ImageHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.item_image, parent, false);
        return new ImageHolder(itemView);

    }

    @Override
    public void onBindViewHolder(@NonNull ImageHolder holder, int position) {
        ImageItem imageItem = imageItems.get(position);

        Picasso.get().load(imageItem.getImage_url()).into(holder.image_url);
    }

    @Override
    public int getItemCount() {
        return imageItems.size();
    }
}



