package my.exer_02cgsss;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class ReviewViewHolder extends RecyclerView.ViewHolder {
    private TextView reviewTextView;

    public ReviewViewHolder(View itemView) {
        super(itemView);
        reviewTextView = itemView.findViewById(R.id.reviewTextView2);
    }

    public void bind(String review) {
        reviewTextView.setText(review);
    }
}