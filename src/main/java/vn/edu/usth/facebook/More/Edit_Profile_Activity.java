package vn.edu.usth.facebook.More;

import android.app.ProgressDialog;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import vn.edu.usth.facebook.R;

public class Edit_Profile_Activity extends AppCompatActivity {

    private EditText etURL;
    private ImageView avatarImage;
    private Button fetchButton, saveButton;
    private Handler mainHandler = new Handler();
    private ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);
//
        // Initializing views
        etURL = findViewById(R.id.etURL);
        avatarImage = findViewById(R.id.cover_image);
        fetchButton = findViewById(R.id.fetchbtn);
        saveButton = findViewById(R.id.savebutton);

        // Set up fetch button click listener
        fetchButton.setOnClickListener(view -> {
            String url = etURL.getText().toString();
            if (!url.isEmpty()) {
                new FetchImage(url).start();
            } else {
                Toast.makeText(this, "Please enter a URL", Toast.LENGTH_SHORT).show();
            }
        });

        // Set up save button click listener to save URL
        saveButton.setOnClickListener(view -> {
            String imageUrl = etURL.getText().toString();
            if (!imageUrl.isEmpty()) {
                // Save the URL to SharedPreferences
                SharedPreferences sharedPreferences = getSharedPreferences("ProfilePrefs", MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("imageUrl", imageUrl);
                editor.apply();

                // Go back to the previous screen
                onBackPressed();
            } else {
                Toast.makeText(this, "Please enter a URL", Toast.LENGTH_SHORT).show();
            }
        });
    }

    // Class to fetch image from URL
    class FetchImage extends Thread {
        private String url;
        private Bitmap bitmap;

        public FetchImage(String url) {
            this.url = url;
        }

        @Override
        public void run() {
            mainHandler.post(() -> {
                progressDialog = new ProgressDialog(Edit_Profile_Activity.this);
                progressDialog.setMessage("Fetching image...");
                progressDialog.setCancelable(false);
                progressDialog.show();
            });

            try {
                URL imageUrl = new URL(url);
                HttpURLConnection connection = (HttpURLConnection) imageUrl.openConnection();
                connection.setDoInput(true);
                connection.connect();
                InputStream inputStream = connection.getInputStream();
                bitmap = BitmapFactory.decodeStream(inputStream);
            } catch (Exception e) {
                e.printStackTrace();
            }

            mainHandler.post(() -> {
                if (progressDialog.isShowing()) {
                    progressDialog.dismiss();
                }
                if (bitmap != null) {
                    avatarImage.setImageBitmap(bitmap);
                } else {
                    Toast.makeText(Edit_Profile_Activity.this, "Failed to load image", Toast.LENGTH_SHORT).show();
                }
            });
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
