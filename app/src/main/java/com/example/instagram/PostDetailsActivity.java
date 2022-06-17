package com.example.instagram;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.parceler.Parcels;

import java.util.Date;

public class PostDetailsActivity extends AppCompatActivity {
    // the post to display
    Post post;

    // the view objects
    TextView tvDetailedUsername;
    ImageView ivDetailedImage;
    TextView tvCaption;
    TextView tvTimestamp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_details);

        tvDetailedUsername = (TextView) findViewById(R.id.tv_detailed_username);
        ivDetailedImage = (ImageView) findViewById(R.id.iv_detailed_image);
        tvCaption = (TextView) findViewById(R.id.tv_caption);
        tvTimestamp = (TextView) findViewById(R.id.tv_timestamp);

        post = Parcels.unwrap(getIntent().getParcelableExtra(Post.class.getSimpleName()));

        Date createdAt = post.getCreatedAt();
        String timeAgo = Post.calculateTimeAgo(createdAt);
        tvTimestamp.setText(timeAgo + " ago");

        tvCaption.setText(post.getDescription());

        tvDetailedUsername.setText(post.getUser().getUsername());
    }
}