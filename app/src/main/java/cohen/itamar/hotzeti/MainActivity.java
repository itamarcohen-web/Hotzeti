package cohen.itamar.hotzeti;

import android.content.res.ColorStateList;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    private MaterialButton toLoginButton;
    private MaterialButton toRegistrationButton;

    private int bluePrimary;
    private int grayColor;
    private int whiteColor;
    private int blueTextColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        toLoginButton = findViewById(R.id.toLoginButton);
        toRegistrationButton = findViewById(R.id.toRegistrationButton);

        bluePrimary = ContextCompat.getColor(this, R.color.bluePrimary);
        grayColor = ContextCompat.getColor(this, R.color.gray);
        whiteColor = ContextCompat.getColor(this, R.color.white);
        blueTextColor = ContextCompat.getColor(this, R.color.blueText);

        if (savedInstanceState == null) {
            showLoginFragment();
        }

        toLoginButton.setOnClickListener(v -> showLoginFragment());
        toRegistrationButton.setOnClickListener(v -> showRegistrationFragment());
    }

    private void showLoginFragment() {
        replaceFragment(new LoginFragment());

        toLoginButton.setBackgroundTintList(ColorStateList.valueOf(bluePrimary));
        toLoginButton.setTextColor(whiteColor);

        toRegistrationButton.setBackgroundTintList(ColorStateList.valueOf(grayColor));
        toRegistrationButton.setTextColor(blueTextColor);
    }

    private void showRegistrationFragment() {
        replaceFragment(new RegisterFragment());

        toRegistrationButton.setBackgroundTintList(ColorStateList.valueOf(bluePrimary));
        toRegistrationButton.setTextColor(whiteColor);

        toLoginButton.setBackgroundTintList(ColorStateList.valueOf(grayColor));
        toLoginButton.setTextColor(blueTextColor);
    }

    private void replaceFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragmentContainerView, fragment)
                .commit();
    }
}