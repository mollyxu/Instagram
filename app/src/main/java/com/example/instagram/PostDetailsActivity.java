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
    ImageView ivDetailedImage;
    TextView tvTimestamp;
    TextView tvCaption;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_details);

        ivDetailedImage = (ImageView) findViewById(R.id.iv_detailed_image);
        tvTimestamp = (TextView) findViewById(R.id.tv_timestamp);
        tvCaption = (TextView) findViewById(R.id.tv_caption);

        post = Parcels.unwrap(getIntent().getParcelableExtra(Post.class.getSimpleName()));

        Date createdAt = post.getCreatedAt();
        String timeAgo = Post.calculateTimeAgo(createdAt);
        tvTimestamp.setText(timeAgo);

        tvCaption.setText(post.getDescription());
    }
}