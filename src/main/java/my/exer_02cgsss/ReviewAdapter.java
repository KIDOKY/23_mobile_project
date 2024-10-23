package my.exer_02cgsss;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ReviewAdapter extends RecyclerView.Adapter<ReviewAdapter.ReviewViewHolder> {
    private List<String> reviewList;

    public ReviewAdapter(List<String> reviewList) {
        this.reviewList = reviewList;
    }

    @NonNull
    @Override
    public ReviewViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_review2, parent, false);
        return new ReviewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ReviewViewHolder holder, int position) {
        String review = reviewList.get(position);
        holder.bind(review);
    }

    @Override
    public int getItemCount() {
        return reviewList.size();
    }

    public static class ReviewViewHolder extends RecyclerView.ViewHolder {
        private TextView reviewTextView;

        public ReviewViewHolder(@NonNull View itemView) {
            super(itemView);
            reviewTextView = itemView.findViewById(R.id.reviewTextView2);
        }

        public void bind(String review) {
            reviewTextView.setText(review);
        }
    }
}